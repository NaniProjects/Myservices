package com.accountingservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value="/wish", method= RequestMethod.GET)
	public @ResponseBody String welcome(@RequestParam("name") String name) {
		return "Hello " + name;
	}
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public @ResponseBody String defaultApp() {
		return "Hello";
	}
}
