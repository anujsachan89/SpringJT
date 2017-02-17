package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


		//Auto-DataBinding
@Controller
public class StudentAdmissionController 
{
	@RequestMapping(value ="admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() 
	{
		ModelAndView model1 = new ModelAndView("AdmissionForm");
		return model1;
	}
	//Always make call first for this method-spring mvc//
	@ModelAttribute
	public void addingCommonObjects(Model model1){
		model1.addAttribute("headerMessage","California Institute of Technology, U.S.A");
		
	}
	//Auto Data Binding //
	@RequestMapping(value ="submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student, BindingResult result)
	{		
		if(result.hasErrors()){
			ModelAndView model1 = new ModelAndView("AdmissionForm");
			return model1;
		}
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		return model1;
	}
}