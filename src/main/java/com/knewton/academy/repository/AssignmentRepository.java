package com.knewton.academy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.Assignment;

@Repository
public interface AssignmentRepository extends CrudRepository<Assignment,Integer> {
}
