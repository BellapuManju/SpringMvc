package com.ciq.Controllet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.Pojo.Persons;
import com.ciq.dao.PeDao;
import com.ciq.service.PersonService;

@Controller
public class EsController {

	@Autowired
	PersonService da;

	@RequestMapping(value = "/log", method = RequestMethod.GET)
	public ModelAndView haii() {
		List<Persons> all = da.getAll();
		return new ModelAndView("welcome", "ref", all);

	}
	

	@GetMapping("/reg")
	public String Regform() {
		return "Regform";
	}

	@PostMapping("/save")
	public String save(Persons persons) {
		 da.save(persons);
		//return "Redirect:log"; 
		return "All";
	}
	
	



	
}
