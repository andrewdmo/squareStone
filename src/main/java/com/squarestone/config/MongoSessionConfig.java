//package com.squarestone.config;
//
//import com.squarestone.entities.MongoSession;
//import com.squarestone.repos.MongoSessionRepo;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.session.web.http.SessionRepositoryFilter;
//
//import javax.servlet.ServletContext;
//
///**
// * MongoSession Configuration
// */
//@Configuration
//public class MongoSessionConfig {
//    @Bean
//    public SessionRepositoryFilter<MongoSession> springSessionRepositoryFilter(MongoSessionRepo repository, ServletContext servletContext) {
//        SessionRepositoryFilter<MongoSession> filter = new SessionRepositoryFilter<>(repository);
//        filter.setServletContext(servletContext);
//        return filter;
//    }
//
//    @Bean
//    public MongoSessionRepo mongoSessionRepo() {
//        return new MongoSessionRepo();
//    }
//}