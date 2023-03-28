package com.ciq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class control {
	@RequestMapping("/login")
public String name() {
	return "login";
}
}
