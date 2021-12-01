package com.mindtree.app.service;

import org.springframework.stereotype.Service;

import com.mindtree.app.entity.QuarantineCenter;

@Service
public interface QuarantineService {

	void save(QuarantineCenter quarantine);

}
