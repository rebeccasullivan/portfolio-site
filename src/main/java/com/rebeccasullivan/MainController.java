package com.rebeccasullivan;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class MainController {

	@RequestMapping("/greeting")
	public String displayGreeting() {
		
		return "greeting";
	}
}
