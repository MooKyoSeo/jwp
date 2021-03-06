package kr.co.treasurehunter.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.treasurehunter.model.User;

@Controller
public class UserController {
	
	private List<User> users = new ArrayList<User>();
	
	@PostMapping("/user/create")
	public String create(User user) {
		
		System.out.println("user :" + user);
		users.add(user);
		
		return "redirect:/users";
	}
	
	@GetMapping("/users")
	public String list(Model model) {
		model.addAttribute("users", users);
		return "/user/list"; // mustache template engine default *.html <-- resources/templates/user/list.html
	}
}
