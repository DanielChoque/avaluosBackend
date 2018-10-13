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
	public String login(@Valid @RequestBody Ava_Avaluo avaluo) {
		avaluoDao.save(avaluo);
		return "exito";
	}
}
