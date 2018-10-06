package com.html.avaluos.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.html.avaluos.dao.LetterDao;
import com.html.avaluos.dao.MunicipalityDao;
import com.html.avaluos.dao.PhoneDao;
import com.html.avaluos.dao.Tabla0Dao;
import com.html.avaluos.dao.UbicationDao;
import com.html.avaluos.dao.UserDao;
import com.html.avaluos.model.Ava_Letter;
import com.html.avaluos.model.Ava_Municipality;
import com.html.avaluos.model.Ava_Phone;
import com.html.avaluos.model.Ava_Ubication;
import com.html.avaluos.model.Ava_User;
import com.html.avaluos.model.Tabla0;

@RestController
public class IndexController {
	@Autowired
	Tabla0Dao tabla0Dao;
	@Autowired
	UserDao userDao;
	@Autowired
	PhoneDao phoneDao;
	@Autowired
	MunicipalityDao municipalityDao;
	@Autowired
	UbicationDao ubicationDao;
	
	@RequestMapping("/c")
	public String city() {
		Tabla0 tabla0=new Tabla0();
		tabla0.setAnos_Vida("20");
		tabla0.setFactor_Comerciabilidad("anime");
		tabla0.setFactor_Forma("factor_Forma");
		tabla0.setFactor_Inclinacion("factor_Inclinacion");
		Date fecha = new Date();
		tabla0.setFecha(fecha);
		tabla0Dao.save(tabla0);
		return  "anime";
	}
	@RequestMapping("/u")
	public Ava_User user() {
		Ava_User user=new Ava_User();
		user.setCi("10036027");
		user.setLastName("canaviri");
		user.setName("federyco");
		user.setTypeUser("Dueño");
		user.setPhones(null);
		Ava_User userTemp=userDao.save(user);
		
		Ava_Phone phone=new Ava_Phone();
		phone.setNumber("75203696");
		phone.setTypePhone("Movil");
		phone.setUser(userTemp);
		phoneDao.save(phone);
		Ava_Phone phone2=new Ava_Phone();
		phone2.setNumber("222266565");
		phone2.setTypePhone("Home");
		phone2.setUser(userTemp);
		phoneDao.save(phone2);
		List<Ava_Phone> phones=new ArrayList<>();
		phones.add(phone);
		phones.add(phone2);
		userTemp.setPhones(phones);
		userTemp=userDao.save(userTemp);
		return userTemp;
	}
	@RequestMapping("/p")
	public Ava_Phone phone() {
		Ava_Phone phone=new Ava_Phone();
		phone=phoneDao.findOne((long) 7);
		return phone;
	}
	@RequestMapping("/r")
	public Ava_User userR() {
		Ava_User user=userDao.findOne((long) 1);
		return user;
	}
	@RequestMapping("/uc/{itemId}")
	public Ava_Municipality uc(@PathVariable("itemId") Long itemId) {
		 Ava_Municipality mu=municipalityDao.findOne(itemId);
		return mu;
	}
	@RequestMapping("/ub")
	public Ava_Ubication userub() {
		Ava_Ubication ubi=new Ava_Ubication();
		ubi.setAdicionales("");
		ubi.setAva_Municipality(municipalityDao.findOne((long) 6));
		ubi.setDireccion("Hermogenes Aguirre");
		ubi.setLote("15");
		ubi.setManzana("B");
		ubi.setNumero("9234");
		ubi.setTipoDireccion("Av");
		ubi.setUrbanizacion("San Salvador");
		ubi.setZona("");
		ubi=ubicationDao.save(ubi);
		return ubi;
	}
	@Autowired 
	LetterDao letterDao; 
	@RequestMapping("/le/{itemId}")
	public Ava_Letter letter(@PathVariable("itemId") Long itemId) {
		 Ava_Letter mu=letterDao.findOne(itemId);
		return mu;
	}
}
