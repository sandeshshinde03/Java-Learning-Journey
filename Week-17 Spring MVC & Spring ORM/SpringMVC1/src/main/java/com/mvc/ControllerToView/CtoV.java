package com.mvc.ControllerToView;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CtoV {
	//using Model interface
	@RequestMapping("/form")
	public String gotoform(Model model) {
		model.addAttribute("name","Sandesh Shinde");
		return "StudentData";
	}
	
	//using ModelAndView class
	//we can also provide multiple url for one method using value
	@RequestMapping(value = {"/data","/transfer"})
	public ModelAndView second() {
		List<String> list1=Arrays.asList("mango","orange","grapes");
		ModelAndView m1=new ModelAndView();
		m1.addObject("age",22);
		m1.addObject("list",list1);
		m1.setViewName("StudentData");
		return m1;
	}
}
