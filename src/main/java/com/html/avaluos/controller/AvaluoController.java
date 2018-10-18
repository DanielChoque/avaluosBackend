package com.html.avaluos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.html.avaluos.dao.AvaluoDao;
import com.html.avaluos.model.Ava_Avaluo;

@RestController
@RequestMapping("/avaluo")
public class AvaluoController {
	@Autowired
	AvaluoDao avaluoDao;
	@RequestMapping(value="/create",method =RequestMethod.POST)
	@ResponseBody
	public Ava_Avaluo login(@Valid @RequestBody Ava_Avaluo avaluo) {
		Ava_Avaluo avaluoTemp=new Ava_Avaluo();
		avaluoTemp=avaluoDao.save(avaluo);
		System.out.println(""+avaluoTemp.toString());
		return avaluoTemp;
	}
}
