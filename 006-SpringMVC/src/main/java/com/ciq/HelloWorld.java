package com.ciq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
@RequestMapping("/hg")
	public String name() {
		return "welcome";
	}
}
