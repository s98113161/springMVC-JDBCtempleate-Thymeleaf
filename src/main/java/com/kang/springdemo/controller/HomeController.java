package com.kang.springdemo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kang.springdemo.dao.StudentDAO;
import com.kang.springdemo.model.Student;

@Controller
public class HomeController {
	@Autowired
private StudentDAO studentDAO;
	@RequestMapping(value="/")
	public ModelAndView test(ModelAndView model) throws IOException{
		List<Student> students = studentDAO.list();
		model.addObject("students", students);
		model.setViewName("index");
		return  model;
	}
//	@RequestMapping(value="/home")
//	public ModelAndView test2(ModelAndView model) throws IOException{
//		model.addObject("title", "Hello world!");
//		
//		return  "";
//	}
	 @RequestMapping(value="home",method = RequestMethod.GET)
		public String printWelcome( ModelMap model) {
			model.addAttribute("title", "Hello world!");
			return "main";
		}
	
}