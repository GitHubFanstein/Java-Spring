package com.example.demo3.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo3.model.Leave;
import com.example.demo3.service.LeaveService;

@Controller
@RequestMapping("leave")
public class LeaveController {
   @Autowired
   private LeaveService leaveService;

   private static final Map<Integer, Integer> LEAVE_TYPES = new LinkedHashMap<>();

    static {
        // Simulating a list of leave types with IDs and names
        LEAVE_TYPES.put(1, 1);
        LEAVE_TYPES.put(2, 2);
        LEAVE_TYPES.put(3, 3);
        LEAVE_TYPES.put(4, 4);
    }
   
   @GetMapping("Test")
   public String index(Model model){
    model.addAttribute("leaves", leaveService.findAll());
    return "leave/index";
   }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("leave", new Leave());
        model.addAttribute("leaveTypes", LEAVE_TYPES);
        return "leave/leaveForm";
    }

    @PostMapping("save")
    public String save(@ModelAttribute Leave leave) {   
        leaveService.save(leave);
        return "redirect:/leave";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Leave leave = leaveService.findById(id);
        if (leave == null) {
            return "redirect:/leave";
        }
        model.addAttribute("leave", leave);
        model.addAttribute("leaveTypes", LEAVE_TYPES);
        return "leave/leaveForm";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        leaveService.delete(id);
        return "redirect:/leave";
    }

}
