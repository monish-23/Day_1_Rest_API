package com.monish.restapi.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	@Value("${student.Name}")
    private String name;
    @GetMapping("name")
    public String getName() {
    	
		return "Welcome "+name+"!";
    }

}
