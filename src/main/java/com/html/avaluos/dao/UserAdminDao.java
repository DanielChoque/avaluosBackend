package com.html.avaluos.dao;

import org.springframework.data.repository.CrudRepository;

import com.html.avaluos.model.Ava_UserAdmin;

public interface UserAdminDao extends CrudRepository<Ava_UserAdmin, Long>{
	Ava_UserAdmin findByNameAdmin(String name);

}
