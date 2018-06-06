/*
 * Copyright (c) 2015-2017, Takuya Murakami.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.squarestone.repos;

import com.squarestone.entities.MongoSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.session.SessionRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;

/**
 * MongoSession Repository
 */
@Service
public class MongoSessionRepo implements SessionRepository<MongoSession> {
    @Autowired
    private MongoTemplate mongoTemplate;

    /*package*/ Instant lastFlushTime = Instant.EPOCH;

    public static long FLUSH_INTERVAL_SECONDS = 600;

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoSession createSession() {
        MongoSession session = new MongoSession();
        session.serializeAttributes();
        mongoTemplate.save(session);

        Instant now = Instant.now();
        if (lastFlushTime.plusSeconds(FLUSH_INTERVAL_SECONDS).isBefore(now)) {
            lastFlushTime = now;
            flushExpiredSessions();
        }

        return session;
    }

    /**
     * {@inheritDoc}
     */
    public MongoSession findById(String id) {
        MongoSession session = _getSession(id);
        if (session == null) return null;

        if (session.isExpired()) {
            deleteById(session.getId());
            return null;
        }

        session.setLastAccessedTime(Instant.now());
        return session;
    }

    /*package*/ MongoSession _getSession(String id) {
        MongoSession session = mongoTemplate.findOne(createQueryById(id), MongoSession.class);
        if (session == null) return null;

        session.deserializeAttributes();
        return session;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(MongoSession session) {
        session.serializeAttributes();
        mongoTemplate.save(session);
    }

    @Override
    public MongoSession getSession(String s) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    /**
     * {@inheritDoc}
     */
    public void deleteById(String id) {
        mongoTemplate.remove(createQueryById(id), MongoSession.class);
    }

    private Query createQueryById(String id) {
        return new Query(Criteria.where(MongoSession.KEY_SESSION_ID).is(id));
    }

    /**
     * Flush all expired sessions
     */
    /*package*/ void flushExpiredSessions() {
        long now = System.currentTimeMillis();
        Criteria criteria = Criteria.where(MongoSession.KEY_EXPIRE_TIME).lte(now);
        mongoTemplate.remove(new Query(criteria), MongoSession.class);
    }
}