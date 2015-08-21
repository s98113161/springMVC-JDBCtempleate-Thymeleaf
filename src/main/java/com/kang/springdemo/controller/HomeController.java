package com.kang.springdemo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kang.springdemo.dao.StudentDAO;
import com.kang.springdemo.model.Student;

@Controller
public class HomeController {
	private static final Logger logger = Logger.getLogger(HomeController.class);
	@Autowired
	private StudentDAO studentDAO;

	@RequestMapping(value = "/")
	public ModelAndView test(ModelAndView model) throws IOException {
		List<Student> students = studentDAO.list();
		model.addObject("students", students);
		model.setViewName("index");
		return model;
	}

	// @RequestMapping(value="/home")
	// public ModelAndView test2(ModelAndView model) throws IOException{
	// model.addObject("title", "Hello world!");
	//
	// return "";
	// }
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView printWelcome(ModelAndView model) {
	
		
		 HashMap<String, String> map =new HashMap<String, String>();
		 map.put("firstName","YuHao");
		 map.put("lastName","Kang");
		
		 model.addObject("map", map);
		model.addObject("title", "Yu Hao Kang");

		return model;
	}

}
