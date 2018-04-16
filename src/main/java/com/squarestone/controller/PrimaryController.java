package com.squarestone.controller;

import com.squarestone.entities.Mapping;
import com.squarestone.entities.Purchase;
import com.squarestone.services.GMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@Controller
public class PrimaryController {

//    final private Purchase purchase = new Purchase();

    //
//    @Autowired
//    GMap gMap = new GMap();


    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public String index(@RequestParam(value = "param", required = false, defaultValue = "null") String param, Model model) {
        return "index";
    }

//    @ModelAttribute("gMap")
//    public GMap gMap() {
//        return new GMap();
//    }

    private String gMap = GMap.gMap();
    private Mapping mapping = new Mapping();
    private Purchase purchase = new Purchase();

//    @RequestMapping("/static/**")


    @ModelAttribute
    public void modelAttributes(Model model) {
        model.addAttribute("gMap", gMap);
        model.addAttribute("gaddy", mapping);
        model.addAttribute("purchase", purchase);
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

    @RequestMapping("/googSample")
    public String googSample() {
        return "googSample";
    }

    @RequestMapping("/comingSoon")
    public String comingSoon() {
        return "comingSoon";
    }

    @GetMapping("/map*")
    public String mapping(GMap gMap, Mapping mapping) {
        System.out.println("gmap: " + gMap);
        System.out.println("mapping: " + mapping.getDefaultGaddy());
        return "mapping";
    }

    @PostMapping("/map*")
    public String mappingForm(GMap gMap, Mapping mapping) {
        System.out.println(mapping.getGaddy());
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