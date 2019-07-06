package com.knewton.academy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.TestSeriesLogin;

@Repository
public interface TestSeriesLoginRepository extends CrudRepository<TestSeriesLogin,Integer>{

}
