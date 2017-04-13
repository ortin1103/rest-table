package com.nitro.controller;


import com.nitro.service.NewTableServise;
import com.nitro.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ControllerUser {

    @Autowired
    TableService tableService;
    @Autowired
    NewTableServise newTableServise;


    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/form",method = RequestMethod.GET)

    public String getForm(Model model) {

        model.addAttribute("allUsers",newTableServise.getAllUser());
        model.addAttribute("allpermission", newTableServise.getPermissForTable());


        return "form";

    }



}
