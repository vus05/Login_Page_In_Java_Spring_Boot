package com.login.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.entity.UserDtls;
import com.login.repository.UserRepo;

@Controller
public class MyController {

	@Autowired
	private UserRepo repo;

	@PostMapping("/reg")
	public String register(@ModelAttribute UserDtls u, HttpSession session) {
		/* System.out.println(u); */
		repo.save(u);
		session.setAttribute("message", "User Registered successfully...");
		return "redirect:/";
	}

}
