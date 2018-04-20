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

    private MapService mapService = new MapService();
    private Mapping mapping = new Mapping();
    private PurchaseForm purchaseForm = new PurchaseForm();

    @ModelAttribute
    public void modelAttributes(Model model) {
        model.addAttribute("mapService", mapService);
        model.addAttribute("mapping", mapping);
        model.addAttribute("purchaseForm", purchaseForm);
    }

    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public String index(@RequestParam(value = "param", required = false, defaultValue = "null") String param, Model model) {
        return "index";
    }

    @GetMapping("/purchase")
    public String purchase() {
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

    @GetMapping("/map*")
    public String mapping() {
        System.out.println("gLibReq: " + MapService.gLibReq());
        System.out.println("gAutoReq: " + MapService.gAutoReq());
        System.out.println("gaddy: " + mapping.getGaddy());
        System.out.println("defaultGaddy: " + mapping.getDefaultGaddy());

        return "mapping";
    }

    @PostMapping("/map*")
    public String mappingForm(MapService mapService, Mapping mapping) {
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