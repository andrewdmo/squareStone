package com.squarestone.controller;

import com.squarestone.entities.Mapping;
import com.squarestone.entities.PurchaseForm;
import com.squarestone.entities.SpaceForm;
import com.squarestone.services.MapService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@Scope("session")
@ControllerAdvice
@Controller
public class PrimaryController implements Serializable {

    //individual session??
    private static MapService mapService = new MapService();
    private static Mapping mapping = new Mapping();
    private static PurchaseForm purchaseForm = new PurchaseForm();
    private static SpaceForm spaceForm = new SpaceForm();

    @ModelAttribute
    public void modelAttributes(Model model) {

        model.addAttribute("mapService", mapService);
        model.addAttribute("mapping", mapping);
        model.addAttribute("purchaseForm", purchaseForm);
        model.addAttribute("spaceForm", spaceForm);
    }


    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public String index(@RequestParam(value = "param", required = false, defaultValue = "null") String param, Model model) {
        System.out.println("gaddy@index:" + mapping.getGaddy());
        System.out.println("mapId: " + MapService.gId());
        return "index";
    }

    @GetMapping("/purchase")
    public String purchase(Model model) {
        System.out.println("totalCostGET: " + purchaseForm.getPurchaseTotal());
        return "purchase";
    }

    @PostMapping("/purchase")
    public String purchaseForm(PurchaseForm purchaseForm) {
//        System.out.println("appraisal:" + purchaseForm.getAppraisal());
//        System.out.println("addtCostSum:" + purchaseForm.getAddtCostSum());
        System.out.println("totalCostPOST: " + purchaseForm.getPurchaseTotal());
        return "purchase";
    }

    @RequestMapping("/react")
    public String react(Model model) {
        return "react";
    }

    @GetMapping("/spacedims")
    public String spaceDimensions(Model model) {
        System.out.println("GET spacedims");
        return "spacedims";
    }

    @PostMapping("/spacedims")
    public String spaceDimensionsForm(SpaceForm spaceForm) {
        System.out.println("C1%total:" + spaceForm.getCommonPercentofTotal1());
        return "spacedims";
    }

    @RequestMapping("/comingSoon")
    public String comingSoon() {
        return "comingSoon";
    }


    @GetMapping(value = "/map*")
    public String mapping(Model model) {
        System.out.println("gLibReq: " + MapService.gLibReq());
        System.out.println("gAutoReq: " + MapService.gAutoReq());
        System.out.println("getGaddy@map: " + mapping.getGaddy());
        System.out.println("defaultGaddy: " + mapping.getDefaultGaddy());
        return "mapping";
    }

    @PostMapping(value = "/map*")
    public String mapping(@ModelAttribute Mapping mapping) {
//        mapping.setGaddy(mapping);
        System.out.println("postGaddy:" + mapping.getGaddy());
        return "mapping";
    }

    @RequestMapping("/about**")
    public String about() {
        return "about";
    }

    @RequestMapping("/webStorageTest**")
    public String webStorageTest() {
        return "webStorageTest";
    }

    @GetMapping(value = {"/sv", "/spartan", "/svindex"})
    public String spartanValet() {
        return "svindex";
    }

    @GetMapping(value = {"/svmap", "/svmapping"})
    public String spartanMapping(Model model) {
        return "svmapping";
    }

    //finish:
    @ExceptionHandler
    public String error(Exception e, Model model) throws Exception {
        model.addAttribute("exception", e.toString());
        return "error";
    }

}