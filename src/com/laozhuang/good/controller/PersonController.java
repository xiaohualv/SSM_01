package com.laozhuang.good.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laozhuang.good.model.Person;
import com.laozhuang.good.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Resource
	private PersonService personService;
	
	@RequestMapping("/good")
	public String toPerson(){
		return "success";
	}
	
	@RequestMapping("/user")
	public void getPerson(){
		Person person = personService.getPerson(1);
		System.out.println("姓名:"+person.getName()+"电话:"+person.getPhone());
	}
}
