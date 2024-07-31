package com.example.demo3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo3.model.Departement;
import com.example.demo3.service.DepartementService;

@Controller
@RequestMapping("departemen")
public class DepartemenController {
    
    @Autowired
    private DepartementService departementService;

    @GetMapping("Test")
    public String index(Model model){
        List<Departement>departemen = departementService.get();
        model.addAttribute("departemens", departemen);
        return "departemen/departemenIndex";
    }

    // endpoint untuk halaman form
    @GetMapping("form2")
    public String form(Model model){
        model.addAttribute("departemens", new Departement());
        return "departemen/form";
    }

    // controller post method
    @PostMapping("save")
    public String save(Departement departement){
        return departementService.save(departement) ? "redirect:/departemen/Test" : "errorPage";
        
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        boolean isDeleted = departementService.delete(id);
        return isDeleted ? "redirect:/departemen/Test" : "errorPage";
    }

    
    @GetMapping("edit/{id}")
    public String editForm(@PathVariable("id") Integer id, Model model) {
        Departement departement = departementService.get(id);
        if (departement != null) {
            model.addAttribute("departement", departement);
            return "departemen/formEdit";
        } else {
            model.addAttribute("message", "Department not found");
            return "redirect:/departemen";
        }
    }

    @PostMapping("edit")
    public String edit(Departement departement, Model model) {
        boolean isSaved = departementService.save(departement);
        if (isSaved) {
            model.addAttribute("message", "Department updated successfully");
        } else {
            model.addAttribute("message", "Department update failed");
        }
        List<Departement> departemen = departementService.get();
        model.addAttribute("departemens", departemen);
        return "departemen/departemenIndex";
    }

    
}
