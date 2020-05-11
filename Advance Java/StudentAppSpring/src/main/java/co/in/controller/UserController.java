package co.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import co.in.bean.User;
import co.in.bean.UserVo;
import co.in.business.UserBusiness;

@Controller
public class UserController {

	@Autowired
	UserBusiness userBusiness;

	@RequestMapping(value = "/saveuser/{name}/{phone}/{address}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String saveUser(@PathVariable String name, @PathVariable String phone, @PathVariable String address) {
		JsonArray array = new JsonArray();
		JsonObject jsonObject = new JsonObject();
		try {
			User user = new User(name, address, phone);
			userBusiness.saveUser(user);
			jsonObject.addProperty("msg", "Successfully saved");
			array.add(jsonObject);
		} catch (Exception e) {
			jsonObject.addProperty("msg", "exception : " + e);
			array.add(jsonObject);
		}
		return array.toString();
	}
	
	@RequestMapping(value = "/registeruser", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String registerUser(@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("phone") String phone) {
		JsonArray array = new JsonArray();
		JsonObject jsonObject = new JsonObject();
		try {
			System.out.println("inside register method");
			jsonObject.addProperty("msg", name);
			array.add(jsonObject);
		} catch (Exception e) {
			jsonObject.addProperty("msg", "exception : " + e);
			array.add(jsonObject);
		}
		return array.toString();
	}

	@RequestMapping(value = "/registeruser2", method = RequestMethod.POST)
	@ResponseBody
	public String registerUser2(@RequestBody UserVo userVo) {
		JsonArray array = new JsonArray();
		JsonObject jsonObject = new JsonObject();
		try {
			System.out.println("inside register method");
			jsonObject.addProperty("msg", userVo.getName());
			array.add(jsonObject);
		} catch (Exception e) {
			jsonObject.addProperty("msg", "exception : " + e);
			array.add(jsonObject);
		}
		return array.toString();
	}
}
