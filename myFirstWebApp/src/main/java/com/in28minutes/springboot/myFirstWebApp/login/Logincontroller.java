package com.in28minutes.springboot.myFirstWebApp.login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class Logincontroller {
	private AuthenticationService authentication;
	
	public Logincontroller(AuthenticationService authentication) {
		super();
		this.authentication = authentication;
	}

	@RequestMapping(value="login" ,method=RequestMethod.GET)
	public String gotoLoginpage() {
		return "login";
	}
	
	@RequestMapping(value="login" ,method=RequestMethod.POST)
	public String gotowelcomepage(@RequestParam String name ,@RequestParam String password ,ModelMap model) {
		if(authentication.Authenticate(name, password)) {
			model.put("username",name);
			model.put("password", password);
		return "welcome";
	}
		model.put("errormessage", "invalid credentials!please try again");
		return "login";
	}

}
