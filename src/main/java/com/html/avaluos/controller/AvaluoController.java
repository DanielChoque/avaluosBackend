package com.html.avaluos.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.html.avaluos.dao.AvaluoDao;
import com.html.avaluos.dao.AvaluoImageDao;
import com.html.avaluos.dao.ImageDao;
import com.html.avaluos.model.Ava_Avaluo;
import com.html.avaluos.model.Ava_AvaluoImage;
import com.html.avaluos.model.Ava_Image;

@RestController
@RequestMapping("/avaluo")
public class AvaluoController {
	@Autowired
	AvaluoDao avaluoDao;
	@Autowired
	AvaluoImageDao avaluoImageDao;
	@Autowired
	ImageDao imageDao;
	@RequestMapping(value="/create",method =RequestMethod.POST)
	@ResponseBody
	public Ava_Avaluo create(@Valid @RequestBody Ava_Avaluo avaluo) {
		System.out.println("daniek:"+avaluo.toString());
		Ava_Avaluo avaluoTemp=new Ava_Avaluo();
		avaluoTemp=avaluo;
		avaluoTemp.setLetter(null);
		avaluoTemp.setCompany(null);
		List<Ava_AvaluoImage> avaluoImages = avaluo.getAvaluoImages();
		avaluoTemp.setAvaluoImages(null);
		avaluoTemp=avaluoDao.save(avaluoTemp);		
		Ava_Image imageTemp;		
		Ava_AvaluoImage avaluoImage;
		for (Ava_AvaluoImage  avaluoImage2 : avaluoImages) {
			imageTemp=new Ava_Image();
			imageTemp=imageDao.save(avaluoImage2.getImage());
			Date date=new Date();
			imageTemp.setDate(date);
			avaluoImage=new Ava_AvaluoImage();
			avaluoImage.setAvaluo(avaluoTemp);
			avaluoImage.setImage(imageTemp);
			avaluoImageDao.save(avaluoImage);			
		}	
		System.out.println(""+avaluo.toString());
		return avaluoTemp;
	}
}
