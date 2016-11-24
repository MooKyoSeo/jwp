package kr.co.treasurehunter.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.treasurehunter.model.Question;

@Controller
public class QnaController {
	
	private List<Question> questions = new ArrayList<Question>();

	@PostMapping("/questions")
	public String questions(Question question) {
		System.out.println("question :" + question);
		questions.add(question);
		
		return "redirect:/";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("questions", questions);
		return "index";
	}
}
