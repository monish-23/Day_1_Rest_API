package com.monish.restapi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("color")
	   public String welcome() {
		return "Welcome";
	}

}
