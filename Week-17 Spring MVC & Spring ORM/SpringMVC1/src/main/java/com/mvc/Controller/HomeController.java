package com.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/welcome")     //we can also use @RequestMapping annotation at class level.
	public String home() {
		return "index";
	}
}
