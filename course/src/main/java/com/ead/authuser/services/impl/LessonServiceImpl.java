package com.ead.authuser.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.authuser.services.LessonService;
import com.ead.course.repository.LessonRepository;

@Service
public class LessonServiceImpl implements LessonService {

	@Autowired
	LessonRepository lessonRepository;

}
