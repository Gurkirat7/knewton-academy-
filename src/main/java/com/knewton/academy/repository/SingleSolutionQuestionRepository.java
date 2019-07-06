package com.knewton.academy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.SingleSolutionQuestion;

@Repository
public interface SingleSolutionQuestionRepository extends CrudRepository<SingleSolutionQuestion,Integer>{

}
