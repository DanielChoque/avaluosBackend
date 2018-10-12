package com.html.avaluos.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.html.avaluos.dao.ImageDao;
import com.html.avaluos.dao.UserAdminDao;
import com.html.avaluos.model.Ava_Image;

@RestController
public class ImageController {
	@Autowired 
	UserAdminDao userAdminDao;
	@Autowired
	ImageDao imageDao;
	
	@RequestMapping(value="/image",method =RequestMethod.POST)
	@ResponseBody
	public String login(@Valid @RequestBody Ava_Image image) {
		Ava_Image imageTemp=new Ava_Image();
		
		Date date = new Date();
		imageTemp.setDate(date);
		imageTemp.setName("aniem.jpg");
		imageTemp.setObservation(image.getObservation());
		imageTemp.setType(image.getType());
		imageDao.save(imageTemp);
		return "exito";		 
	}
}
