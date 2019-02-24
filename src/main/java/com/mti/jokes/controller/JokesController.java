package com.mti.jokes.controller;

import com.mti.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController  {

    JokeService mJokeService;

    @Autowired
    public JokesController(JokeService mJokeService) {
        this.mJokeService = mJokeService;
    }

    @RequestMapping({"/", ""})
    public String showJokes(Model model){
        model.addAttribute("joke", mJokeService.getJokes());

        return "checknorris"; //this value is important for the template it should be same as template html name
    }


}
