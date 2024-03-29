package com.knewton.academy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.ResultAssignmentId;

@Repository
public interface ResultAssignmentRepository extends CrudRepository<ResultAssignment,ResultAssignmentId>{

}
