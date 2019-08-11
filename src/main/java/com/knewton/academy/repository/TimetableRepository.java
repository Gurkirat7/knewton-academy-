package com.knewton.academy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.knewton.academy.model.Timetable;

@Repository
public interface TimetableRepository extends CrudRepository<Timetable,Integer>{

}
