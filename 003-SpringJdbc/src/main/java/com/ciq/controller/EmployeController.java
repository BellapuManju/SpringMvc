package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.bean.Employe;
import com.ciq.service.EmployeService;
import com.ciq.service.EmployeServiceimpl;
@Controller("empCont")
public class EmployeController {
	@Autowired
    private EmployeService employeService;
	
    public void save(Employe employe) {
    	employeService.save(employe);
  
    }
}
