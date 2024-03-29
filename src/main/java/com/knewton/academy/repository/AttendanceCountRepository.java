package com.knewton.academy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.AttendanceCount;
import com.knewton.academy.model.AttendanceCountId;

@Repository
public interface AttendanceCountRepository extends CrudRepository<AttendanceCount,AttendanceCountId>  {

}
