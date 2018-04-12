package com.squarestone.controller;

import com.squarestone.entities.DotBeta;
import com.squarestone.entities.GMap;
import com.squarestone.entities.Purchase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PrimaryController {

//    final private Purchase purchase = new Purchase();

//

    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public String index(@RequestParam(value = "param", required = false, defaultValue = "null") String param, Model model) {
        return "index";
    }

    @ModelAttribute("purchase")
    public Purchase purchase() {
        return new Purchase();
    }

    @ModelAttribute("dotBeta")
    public DotBeta dotBeta() {
        return new DotBeta();
    }

    @ModelAttribute("gMap")
    public GMap gMap() {
        return new GMap();
    }


    @GetMapping("/purchase")
    public String purchase(@ModelAttribute Purchase purchase) {
//        model.addAttribute("purchase", new Purchase());
        System.out.println("totalCost: " + purchase.getTotalCost());
        return "purchase";
    }

    @PostMapping("/purchase")
    public String purchaseForm(@ModelAttribute Purchase purchase) {
        System.out.println("Appraisal:" + purchase.getAppraisal());
        System.out.println("AddtCostSum:" + purchase.getAddtCostSum());
        System.out.println("totalCost: " + purchase.getTotalCost());
        return "purchase";
    }

    @RequestMapping("/comingSoon")
    public String comingSoon() {
        return "comingSoon";
    }

    @GetMapping("/map*")
    public String mapping(@ModelAttribute DotBeta dotBeta) {
        System.out.println(dotBeta.getAddy());
        return "mapping";
    }

    @PostMapping("/map*")
    public String mappingForm(@ModelAttribute DotBeta dotBeta) {
        System.out.println(dotBeta.getAddy());
        return "mapping";
    }

    @RequestMapping("/about**")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact**")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/links**")
    public String links() {
        return "links";
    }

    //finish:
    @ExceptionHandler
    public String error(Exception e) throws Exception {
        return "error";
    }


}