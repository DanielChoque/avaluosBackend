package com.html.avaluos.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.html.avaluos.dao.UserAdminDao;
import com.html.avaluos.model.Ava_Image;

@RestController
public class ImageController {
	@Autowired 
	UserAdminDao userAdminDao;
	@RequestMapping(value="/image",method =RequestMethod.POST)
	@ResponseBody
	public String login(@Valid @RequestBody Ava_Image image) {
		
		return "exito";		 
	}
	@RequestMapping("/ima")
	public Ava_Image city() {
		Ava_Image image=new Ava_Image();
		image.setIdImage(1);
		image.setName("nombre.jpg");
		image.setObservation("obserbacion");		
		image.setType("Principal");
		Date date=new Date();
		image.setDate(date);
		return image;
	}
}
