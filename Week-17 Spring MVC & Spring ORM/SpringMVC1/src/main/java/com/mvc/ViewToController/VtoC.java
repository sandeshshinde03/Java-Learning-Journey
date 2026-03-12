package com.mvc.ViewToController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VtoC {
	
	@RequestMapping("/gotoform")
	public String gotoForm() {
		return "empForm";
	}
	
//@ResponseBody is use to return the msg of the method on browser.(there is no need to make .jsp page for this)
	@RequestMapping("/empdata")
	@ResponseBody
	public String empData(@RequestParam("ename") String n, 
			@RequestParam("esalary") double sal, 
			@RequestParam("eexp") double ex) {//using @RequestParam transferring data from view to controller.
		System.out.println("Name: "+n);
		System.out.println("Salary: "+sal);
		System.out.println("Experience: "+ex);
		return "Employee data is transfer successfully..";
	}
	
	@RequestMapping("/empdetails")
	@ResponseBody
	public String empDetails(@ModelAttribute Employee e1) {
		//using @ModelAttribute transferring data from view to controller.(for that we need to create Employee class)
		System.out.println("Name: "+e1.getEname());
		System.out.println("Salary: "+e1.getEsalary());
		System.out.println("Experience: "+e1.getEexp());
		return "Employee details transfer successfully..";
	}
	
//	@RequestMapping("/empdetails")
//	public String empDetail(@ModelAttribute Employee e1, Model model) {
//		System.out.println("Name: "+e1.getEname());
//		System.out.println("Salary: "+e1.getEsalary());
//		System.out.println("Experience: "+e1.getEexp());
//		//transferring data from view to controller and again display that data on browser.
//		model.addAttribute("data",e1);
//		return "success";
//	}
}
