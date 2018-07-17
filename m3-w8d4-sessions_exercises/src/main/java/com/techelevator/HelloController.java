package com.techelevator;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class HelloController {

	@RequestMapping("/page1")
	public String displayColor() {
		
		return "page1";
	}
	@RequestMapping("/page2")
	public String displayFood() {
		
		return "page2";
	}
	@RequestMapping("/page3")
	public String displaySeason() {
		
		return "page3";
	}
	@RequestMapping("/summary")
	public String displaySummary() {
		
		return "summary";
	}
}
