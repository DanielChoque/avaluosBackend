package com.html.avaluos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.html.avaluos.dao.DepartmentDao;
import com.html.avaluos.dao.MunicipalityDao;
import com.html.avaluos.dao.ProvinceDao;
import com.html.avaluos.model.Ava_Department;
import com.html.avaluos.model.Ava_Municipality;
import com.html.avaluos.model.Ava_Province;


@RestController
@RequestMapping("/ubication")
public class UbicationController {
	@Autowired
	MunicipalityDao municipalityDao;
	@Autowired
	DepartmentDao departmentDao;
	@Autowired
	ProvinceDao provinceDao;
	@RequestMapping("/municipality")
	public List<Ava_Municipality>  cityM() {
		List<Ava_Municipality> municipalities=new ArrayList<>();
		municipalities=(List<Ava_Municipality>) municipalityDao.findAll();
		return  municipalities;
	}
	@RequestMapping("/department")
	public List<Ava_Department>  citydD() {
		List<Ava_Department> departments=new ArrayList<>();
		departments=(List<Ava_Department>) departmentDao.findAll();
		return  departments;
	}
	@RequestMapping("/province")
	public List<Ava_Province>  cityP() {
		List<Ava_Province> provinces=new ArrayList<>();
		provinces=(List<Ava_Province>) provinceDao.findAll();
		return  provinces;
	}
}
