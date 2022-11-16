package com.signup.practise.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.signup.practise.Entities.Numbers;
import com.signup.practise.Entities.UserInfo;

@Controller
public class AuthController {
	
	
	@GetMapping("/")
	public String signup(Model model) {
		model.addAttribute("numbers", new Numbers());
	    return "Created";
	}
}
