//package com.fusemachine.inventory.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.fusemachine.inventory.domain.User;
//import com.fusemachine.inventory.service.SecurityService;
//import com.fusemachine.inventory.service.UserService;
//import com.fusemachine.inventory.vallidator.UserValidator;
//
//@Controller
//public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private SecurityService securityService;
//
//    @Autowired
//    private UserValidator userValidator;
//
//    @RequestMapping(value = "/registration", method = RequestMethod.GET)
//    public String registration(Model model) {
//        model.addAttribute("userForm", new User());
//
//        return "registration";
//    }
//
//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
//        userValidator.validate(userForm, bindingResult);
//
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//
//        userService.save(userForm);
//
//        securityService.autologin(userForm.getUserName(), userForm.getPassword());
//
//        return "home";
//    }
//
// 
//
//    
//}
