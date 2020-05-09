package co.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import co.in.bean.User;
import co.in.business.UserBusiness;

import java.util.List;

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

    @RequestMapping(value = "/search/{name}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String search(@PathVariable String name) {
        JsonArray array = new JsonArray();
        JsonObject jsonObject = null;
        try {
            List<User> users = userBusiness.getUser(name);
            for (User user : users) {
                jsonObject = toJsonObject(user);
                array.add(jsonObject);
            }
        } catch (Exception e) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("msg", "exception : " + e);
            array.add(jsonObject);
        }
        return array.toString();
    }

    @RequestMapping(value = "/getAllNames", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getUserNameList() {
        JsonArray array = new JsonArray();
        JsonObject jsonObject = null;
        try {
            List<String> users = userBusiness.getUserNameList();
            for (String user : users) {
                jsonObject = new JsonObject();
                jsonObject.addProperty("name", user);
                array.add(jsonObject);
            }
        } catch (Exception e) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("msg", "exception : " + e);
            array.add(jsonObject);
        }
        return array.toString();
    }

    public JsonObject toJsonObject(User user) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", user.getId());
        jsonObject.addProperty("name", user.getName());
        jsonObject.addProperty("phone", user.getPhone());
        jsonObject.addProperty("address", user.getAddress());
        return jsonObject;
    }

}