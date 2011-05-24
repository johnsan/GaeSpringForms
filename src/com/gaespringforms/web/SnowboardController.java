package com.gaespringforms.web;

import com.gaespringforms.domain.Snowboard;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/snowboard")
public class SnowboardController {

	@RequestMapping(value = "/processCreateSnowboard", method = RequestMethod.POST)
	public String processCreateSnowboard(@ModelAttribute("snowboard")
							Snowboard snowboard, BindingResult result) {
		
		System.out.println("Brand:" + snowboard.getBrand() + " " +
					"Model:" + snowboard.getModel());
		
		return "redirect:createSnowboard";
	}
	
	@RequestMapping("/createSnowboard")
	public ModelAndView showSnowboards() {
		return new ModelAndView("snowboard/createSnowboard", "command", new Snowboard());
	}
}
