package co.in.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import co.in.bean.User;

@Controller
public class TeacherController {

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView sayHello(){
		return new ModelAndView("hello");
	}
	
	@RequestMapping(value = "/getUser/{userName}/{address}", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public String getUser(@PathVariable String userName, @PathVariable String address,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		return "Hello";
	}
	
	@RequestMapping(value = "/getUser/{userName}/{address}", method = RequestMethod.GET)
	@ResponseBody
	public User getUser2(@PathVariable String userName, @PathVariable String address,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		User user = new User(userName, address);
		return user;
	}
	
}
