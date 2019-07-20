package com.knewton.academy.service;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.ResultTest;
import com.knewton.academy.repository.ResultTestRepository;
@Service
public class resultServiceImpl implements resultService {
    ResultTestRepository resultTestRepository;
	/*public resultServiceImpl() {
		// TODO Auto-generated constructor stub
	} 
	*/

	@Override
	public void addResultMarks(ResultTest test) {
	
		 resultTestRepository.save(test);
	}

}
