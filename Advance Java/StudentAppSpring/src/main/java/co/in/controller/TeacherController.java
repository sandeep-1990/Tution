package co.in.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import co.in.bean.User;

@Controller
public class TeacherController {

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView sayHello(){
		return new ModelAndView("hello");
	}
	
	@RequestMapping(value = "/getUser/{userName}/{address}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getUser(@PathVariable String userName, @PathVariable String address){
		JsonArray jsonArray = new JsonArray();
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", userName);
		jsonObject.addProperty("address", address);
		jsonArray.add(jsonObject);
		return jsonArray.toString();
	}
	
	@RequestMapping(value = "/registeruser", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String saveUser(@RequestBody User user){
		System.out.println(user.getName());
		
		JsonArray jsonArray = new JsonArray();
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", user.getName());
		jsonObject.addProperty("address", user.getAddress());
		jsonArray.add(jsonObject);
		return jsonArray.toString();
	}
	
}
