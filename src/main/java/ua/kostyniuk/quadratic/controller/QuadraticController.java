package ua.kostyniuk.quadratic.controller;

import org.springframework.context.MessageSource;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.kostyniuk.quadratic.model.QuadraticModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.kostyniuk.quadratic.servise.QuadraticService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/")
public class QuadraticController {

	@Autowired
	QuadraticService service;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/1" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

//		List<QuadraticModel> employees = service.findAllQuadratic();
//		model.addAttribute("employees", employees);
		return "result";
	}

//
//
//
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

		QuadraticModel quadraticModel = service.calcQuadratic(a, b, c);
		model.addAttribute("model", quadraticModel);
		return "result";
	}
}
