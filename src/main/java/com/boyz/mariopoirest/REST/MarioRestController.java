package com.boyz.mariopoirest.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mario")
public class MarioRestController {

    @GetMapping("/poirest")
    public String getPicture(){
        return "Insert Pic here";
    }
}