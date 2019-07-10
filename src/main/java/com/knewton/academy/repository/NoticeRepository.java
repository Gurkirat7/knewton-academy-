package com.knewton.academy.repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.knewton.academy.model.Notice;

@Repository
public interface NoticeRepository extends CrudRepository<Notice,String> {

	default Object findOne(String title) {
		return findById(title);
	}

}
