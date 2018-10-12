package com.html.avaluos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.html.avaluos.dao.UserAdminDao;
import com.html.avaluos.model.Ava_UserAdmin;

@RestController
public class LoginController {
	@Autowired 
	UserAdminDao userAdminDao;
	@RequestMapping(value="/login",method =RequestMethod.POST)
	@ResponseBody
	public String login(@Valid @RequestBody Ava_UserAdmin user) {

		 Ava_UserAdmin mu=userAdminDao.findByNameAdmin(user.getNameAdmin());
		 if(mu==null) {			 
			 return "error user";			 
		 }
		 else {
			 if(mu.getPassword().equals(user.getPassword())) {
				 return "login";
			 }
			 else {

				 System.out.println(mu.toString());
				 return "error password";
			 }
		 }		 
	}
}
