package com.rebeccasullivan;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class MainController {

	@RequestMapping(path={"/", "/home"}, method=RequestMethod.GET)
	public String displayHome() {
		return "home";
	}
	
	@RequestMapping(path="/portfolio", method=RequestMethod.GET)
	public String displayPortfolio() {
		return "portfolio";
	}
	
	@RequestMapping(path="/teaching-resume", method=RequestMethod.GET)
	public String displayTeachingResume() {
		return "teaching-resume";
	}
	
	@RequestMapping(path="/tech-resume", method=RequestMethod.GET)
	public String displayTechResume() {
		return "tech-resume";
	}
	
	@RequestMapping(path="/etc", method=RequestMethod.GET)
	public String displayEtc() {
		return "etc";
	}
	
}
