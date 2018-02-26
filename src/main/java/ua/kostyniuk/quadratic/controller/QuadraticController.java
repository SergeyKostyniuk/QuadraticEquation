package ua.kostyniuk.quadratic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import ua.kostyniuk.quadratic.error.NotRootException;
import ua.kostyniuk.quadratic.model.QuadraticModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.kostyniuk.quadratic.servise.QuadraticService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/")
public class QuadraticController {

	@Autowired
	QuadraticService service;

	@RequestMapping("/")
	public String start(Model model) {

		return "welcome";
	}

	@GetMapping("/result")
	public String result(Model model, HttpServletRequest request, HttpServletResponse response) {
		String a, b, c;
		a = request.getParameter("a");
		b = request.getParameter("b");
		c = request.getParameter("c");

		try {
			QuadraticModel quadraticModel = service.calcQuadratic(a, b, c);

		model.addAttribute("model", quadraticModel);
		return "result";
		} catch (NotRootException e) {
			return "notRoot";
		}
	}
}
