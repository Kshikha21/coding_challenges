package com.mindtree.app.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mindtree.app.entity.QuarantineCenter;
import com.mindtree.app.repository.PatientRepository;
import com.mindtree.app.repository.QuarantineCenterRepository;
import com.mindtree.app.service.QuarantineService;

@Service
public class QuarantineServiceImpl implements QuarantineService{

	@Autowired
	PatientRepository repoP;
	
	@Autowired
	QuarantineCenterRepository repoQ;
	
	
	
	@Override
	public void save(QuarantineCenter quarantine) {
		// TODO Auto-generated method stub
		try {
			repoQ.save(quarantine);}
		
		catch(DataAccessException e) {
			e.printStackTrace();
		
	}

}
	
	
}
