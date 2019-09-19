package com.PlantPlaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantPlacesController {
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}

	@RequestMapping("/")
	public String index() {
		return "start";
	}

	@RequestMapping("/go")
	public String go() {
		return "go";
	}
}
