package com.mvc.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeContro {
	@RequestMapping("/udata/{uid}/{uname}")
	@ResponseBody
	public String getDataofUser(@PathVariable("uid") int id,
			@PathVariable("uname") String name) {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		return "data is accepted";
	}
}
