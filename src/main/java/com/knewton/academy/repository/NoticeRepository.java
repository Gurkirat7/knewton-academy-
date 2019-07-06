package com.knewton.academy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.Notice;

@Repository
public interface NoticeRepository extends CrudRepository<Notice,Integer> {

}
