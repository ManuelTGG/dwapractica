package com.dwa.practica;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {


	@GetMapping("/Portada")
	public String Portada(){
		return "/Portada";
	}
}
