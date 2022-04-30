package com.ead.authuser.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.authuser.services.ModuleService;
import com.ead.course.repository.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	ModuleRepository moduleRepository;

}
