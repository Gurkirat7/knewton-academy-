package com.knewton.academy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.TeacherBatchMapping;
import com.knewton.academy.model.TeacherBatchMappingId;

@Repository
public interface TeacherBatchMappingRepository extends CrudRepository<TeacherBatchMapping,TeacherBatchMappingId>{

}
