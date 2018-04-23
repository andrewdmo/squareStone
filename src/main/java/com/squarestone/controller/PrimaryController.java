package com.squarestone.controller;

import com.squarestone.entities.Mapping;
import com.squarestone.entities.PurchaseForm;
import com.squarestone.services.MapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@Controller
public class PrimaryController {

    //Security for individual session??
    private static MapService mapService = new MapService();
    private static Mapping mapping = new Mapping();
    private static PurchaseForm purchaseForm = new PurchaseForm();

    @ModelAttribute
    public void modelAttributes(Model model) {
        model.addAttribute("mapService", mapService);
        model.addAttribute("mapping", mapping);
        model.addAttribute("purchaseForm", purchaseForm);
    }

    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public String index(@RequestParam(value = "param", required = false, defaultValue = "null") String param, Model model) {
        System.out.println("gaddy@index:" + mapping.getGaddy());
        System.out.println("mapId: " + mapService.gId());

        return "index";
    }

    @GetMapping("/purchase")
    public String purchase(Model model) {
        System.out.println("totalCost: " + purchaseForm.getCostSum());
        return "purchase";
    }

    @PostMapping("/purchase")
    public String purchaseForm(PurchaseForm purchaseForm) {
        System.out.println("appraisal:" + purchaseForm.getAppraisal());
        System.out.println("addtCostSum:" + purchaseForm.getAddtCostSum());
        System.out.println("totalCost: " + purchaseForm.getCostSum());
        return "purchase";
    }

    @RequestMapping("/googSample")
    public String googSample() {
        return "googSample";
    }

    @RequestMapping("/googSample2")
    public String googSample2() {
        return "googSample2";
    }

    @RequestMapping("/comingSoon")
    public String comingSoon() {
        return "comingSoon";
    }


    @GetMapping(value = "/mapping")
    public String mapping(Model model) {
        System.out.println("gLibReq: " + MapService.gLibReq());
        System.out.println("gAutoReq: " + MapService.gAutoReq());
        System.out.println("getGaddy@map: " + mapping.getGaddy());
        System.out.println("defaultGaddy: " + mapping.getDefaultGaddy());
        return "mapping";
    }

    @PostMapping(value = "/mapping")
    public String mapping(@ModelAttribute Mapping mapping) {
//        mapping.setGaddy(mapping);
        System.out.println("postGaddy:" + mapping.getGaddy());
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