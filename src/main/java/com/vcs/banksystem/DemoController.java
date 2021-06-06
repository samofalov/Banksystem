package com.vcs.banksystem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/sayhello")
	public String greeting() {

		return "Hello!";
	}
	
	@RequestMapping("/saygoodbye")
	public String sayGoodbye() {
		return "Goodbye!";
	}
}
