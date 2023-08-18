package com.monish.restapi.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ColorController {
	
	@Value("${col}")
    private String color;
    @GetMapping("nam")
    public String color(){
    	
		return "My favorite color is "+color;
    
	}

}
