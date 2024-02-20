package edu.fisa.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tmpController {

	@GetMapping("getdata")
	public String get() {
		System.out.println("** This is get.");
		return "something like something.";
	}
}
