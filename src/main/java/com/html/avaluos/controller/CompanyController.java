package com.html.avaluos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.html.avaluos.dao.CompanyDao;
import com.html.avaluos.dao.CompanyUserDao;
import com.html.avaluos.dao.UserDao;
import com.html.avaluos.model.Ava_Company;
import com.html.avaluos.model.Ava_CompanyUser;
import com.html.avaluos.model.Ava_User;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	CompanyDao companyDao;
	@Autowired
	UserDao userDao;
	@Autowired
	CompanyUserDao companyUserDao;
	@RequestMapping("/search/{Id}")
	public Ava_Company uc(@PathVariable("Id") Long Id) {
		 Ava_Company company=companyDao.findOne(Id);
		return company;
	}
	@RequestMapping("/all")
	public List<Ava_Company> allCompany() {
		List<Ava_Company> company=(List<Ava_Company>) companyDao.findAll();
		return company;
	}
	@RequestMapping(value="/create",method =RequestMethod.POST)
	@ResponseBody
	public List<Ava_Company> saveCompany(@Valid @RequestBody Ava_Company company) {
		Ava_Company companytemp=company;
		//companytemp.setUbicationCompany(null);
		companyDao.save(companytemp);
		List<Ava_Company> companys=(List<Ava_Company>) companyDao.findAll();
		return companys;
	}
	@RequestMapping(value="/create/companyuser",method =RequestMethod.POST)
	@ResponseBody
	public List<Ava_Company> saveCompanyUser(@Valid @RequestBody Ava_Company company) {
		Ava_Company companytemp=company;
		List<Ava_CompanyUser> companyUsers=new ArrayList<>();
		companyUsers=companytemp.getCompanyUser();
		Ava_User user;
		for (Ava_CompanyUser companyUser : companyUsers) {
			user=new Ava_User();
			user=companyUser.getUser();
			user=userDao.save(user);
			companyUser.setCompany(companytemp);
			companyUser.setUser(user);
			companyUserDao.save(companyUser);
		}
		List<Ava_Company> companys=(List<Ava_Company>) companyDao.findAll();
		return companys;
	}
}
