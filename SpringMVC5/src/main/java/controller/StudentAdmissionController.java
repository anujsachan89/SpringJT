package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


		//@ModelAttribute
@Controller
public class StudentAdmissionController 
{
	@RequestMapping(value ="admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() 
	{
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	//Always make call first for this method-spring mvc//
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage","California Institute of Technology, U.S.A");
		
	}
	@RequestMapping(value = "submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1)
	{		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;
	}
}