package com.ead.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ead.course.models.ModuleModel;

public interface LessonRepository extends JpaRepository<ModuleModel, UUID>{

	
}