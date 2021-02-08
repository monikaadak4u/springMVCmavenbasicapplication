package com.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ApplicationController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(ModelMap modelMap) {
		modelMap.addAttribute("message", "WELCOME TO CSI PUNE");
		return "welcome";
	}

	@RequestMapping(value = "/csiservices", method = RequestMethod.GET)
	public String sayCSIServices(ModelMap modelMap) {
		modelMap.addAttribute("message",
				"APPLICATION SOFTWARE DEVELOPMENT | PAYMENY GATEWAY INTEGRATION | DIGITAL MARKETING SERVICES");
		return "welcome";
	}

	@RequestMapping(value = "/csiaddress", method = RequestMethod.GET)
	public String sayCSIAddress(ModelMap modelMap) {
		modelMap.addAttribute("message", "INSPIRIA MALL | PCMC | MH | INDIA");
		return "welcome";
	}
}
