package ua.kostyniuk.quadratic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuadraticController {

	@GetMapping("/")
	public String start(Model model) {

		model.addAttribute("name", "Serhii Kostyniuk");

		return "welcome";
	}
}
