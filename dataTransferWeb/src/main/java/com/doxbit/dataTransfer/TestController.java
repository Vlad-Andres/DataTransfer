package com.doxbit.dataTransfer;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TestController {
	
	String message = "Welcome to Spring MVC AND FROM WA WA <h1>WAR</h1>!";
	
	@RequestMapping("/test")
	public ModelAndView helloWorld(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name ) 
	{
	
		ModelAndView mv = new ModelAndView("test");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}
