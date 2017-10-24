package com.techelevator.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClockrController {
	
	@Autowired
	TimeCardDAO tcDao;
	
	// GET: /
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}
	
	@RequestMapping(path="/view", method=RequestMethod.GET)
	public String getView(@RequestParam String username, HttpSession session) {
		List<TimeCard> allTimeCards = tcDao.getAllTimeCards(username);
		session.setAttribute("allTimeCards", allTimeCards);
		TimeCard userTC = new TimeCard();
		userTC.setUsername(username);
		session.setAttribute("userTC", userTC);
		return "view";	
	}
	
	@RequestMapping(path="/clockIn", method=RequestMethod.POST)
	public String clockIn(HttpSession session) {
		Long clockInId = tcDao.makeClockIn( ((TimeCard)session.getAttribute("usernameTC")).getUsername());
		TimeCard userTC2 = new TimeCard();
		userTC2=((TimeCard)session.getAttribute("userTC"));
		userTC2.setId(clockInId);
		session.setAttribute("userTC", userTC2);
		return "redirect:clockInConfirm";
	}
	@RequestMapping(path="/clockInConfirm", method=RequestMethod.GET)
	public String getClockInConfirm(HttpSession session, ModelMap modelHolder) {
		TimeCard tempTC = (TimeCard)session.getAttribute("userTC");
		modelHolder.put("tempTC", tempTC);
		return "clockInConfirm";
	}

}
