package com.knewton.academy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.StudentBatchMapping;
import com.knewton.academy.model.StudentBatchMappingId;

@Repository
public interface StudentBatchMappingRepository extends CrudRepository<StudentBatchMapping,StudentBatchMappingId>{

}
