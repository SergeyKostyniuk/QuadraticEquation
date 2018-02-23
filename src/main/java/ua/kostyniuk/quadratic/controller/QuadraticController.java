package ua.kostyniuk.quadratic.controller;

import ua.kostyniuk.quadratic.model.QuadraticModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.kostyniuk.quadratic.servise.QuadraticService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class QuadraticController {

	private final QuadraticService quadraticService;

	@Autowired
	public QuadraticController(QuadraticService quadraticService) {
		this.quadraticService = quadraticService;
	}

	@GetMapping("/")
	public String start(Model model) {

		model.addAttribute("name", "Serhii Kostyniuk");

		return "welcome";
	}

	@GetMapping("/result")
	public String result(Model model, HttpServletRequest request, HttpServletResponse response) {
		String a, b, c;
		a = request.getParameter("a");
		b = request.getParameter("b");
		c = request.getParameter("c");

		QuadraticModel quadraticModel = quadraticService.getResult(a, b, c);
		model.addAttribute("model", quadraticModel);
		return "result";
	}
}
