package com.example.learnspringboot.controller;

import com.example.learnspringboot.model.SocialMedia;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialMediaController {
    @GetMapping(path = "/demo/socialMedia")
    public SocialMedia getSocialInfo(){

         return new SocialMedia(1,"Vidya","19/04/1992");
    }
}
