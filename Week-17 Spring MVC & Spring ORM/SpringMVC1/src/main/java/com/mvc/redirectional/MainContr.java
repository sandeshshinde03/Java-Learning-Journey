package com.mvc.redirectional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainContr {
	// redirecting from /f url to /s 
	// first way
	@RequestMapping("/f")
	public String first() {
		return "redirect:/s";
	}
	
	@RequestMapping("/s")
	@ResponseBody
	public String second() {
		
		return "in second method";
	}
	// redirecting from /f url to /s 
	//Second way
	@RequestMapping("/t")
	public RedirectView third() {
		RedirectView rv=new RedirectView();
		rv.setUrl("fth");
		return rv;
	}
	
	@RequestMapping("/fth")
	@ResponseBody
	public String fourth() {
		return "in fourth method";
	}
}
