package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class UserController {
	// GET: /
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view
	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String getRegisterView(ModelMap modelHolder) {
		if(! modelHolder.containsAttribute("register")) {
			modelHolder.put("register", new Register());
		}
		return "register";
	}
	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String processRegistration(@Valid @ModelAttribute Register register, BindingResult result,
			RedirectAttributes flash) {
		
		flash.addFlashAttribute("register", register);
		if( !(register.getEmail() == register.getEmailConfirm()) || !(register.getPassword() == register.getPasswordConfirm()) ) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "register", result);
			return "redirect:/register";
		}
		
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "register", result);
			return "redirect:/register";
			
		
		}
		return "redirect:/thanks";
	}

	// GET: /login
	// Return the empty login view
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String getLoginView(ModelMap modelHolder) {
		if(! modelHolder.containsAttribute("login")) {
			modelHolder.put("login", new Login());
		}
		return "login";
	}
	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails) (named thanks instead)
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String processLogin(@Valid @ModelAttribute Login login, BindingResult result,
			RedirectAttributes flash) {
		
		flash.addFlashAttribute("login", login);
		
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "login", result);
			return "redirect:/login";
		}
		return "redirect:/thanks";
	}
	// GET: /confirmation (named thanks instead)
	// Return the confirmation view
	@RequestMapping(path="/thanks", method=RequestMethod.GET)
	public String getConfirmation() {
		return "thanks";
	}
}
