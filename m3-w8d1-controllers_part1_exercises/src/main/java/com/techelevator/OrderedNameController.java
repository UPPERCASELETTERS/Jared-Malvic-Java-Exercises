package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderedNameController {
	
	@RequestMapping(path="/orderedName", method=RequestMethod.GET)
	public String showFrom() {
		return "orderedNameForm";
	}
	
	@RequestMapping(path="/orderedResult", method=RequestMethod.GET)
	public String printOrderedName (@RequestParam String order, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String middle ) {
		return "orderedResult";
	}

}
