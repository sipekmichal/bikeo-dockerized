package cz.sizi.bikeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login")
	public String showLoginPage(){	
		return "login";
	}
	
	@RequestMapping(value = "/loginfailed")
	public String showLoginFailedPage(){	
		return "loginfailed";
	}
}
