package kr.co.multi.teamfinder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/index")
	public String main() {
		return "index";
	}
}
