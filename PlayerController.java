package com.spring.controller;

import com.spring.model.Player;
import com.spring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PlayerController {


    @Autowired
    private PlayerService playerService;


    @RequestMapping("/home")

    public String homePage(){
        return "home";
    }
    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }
    @RequestMapping("/save")
    public String savePlayer(Player player){
        playerService.savePlayerDetails(player);
        return "home";
    }

}
