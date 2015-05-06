package demo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.domain.User;
import demo.repositories.UserRepository;

@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	private UserRepository repo;

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(HttpServletRequest request) {
		return "pages/create";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String get(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("user", user);
			return "pages/error";
		}
		
		User saved = this.repo.save(user);
		if (saved == null) return "pages/error";
		return "pages/finish";
	}
}