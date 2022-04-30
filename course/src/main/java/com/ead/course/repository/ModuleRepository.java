package com.ead.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ead.course.models.LessonModel;

public interface ModuleRepository extends JpaRepository<LessonModel, UUID>{

	
}
