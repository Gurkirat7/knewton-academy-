package com.knewton.academy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login,String>{
	List<Login> findByTypeId(int typeid);
}
