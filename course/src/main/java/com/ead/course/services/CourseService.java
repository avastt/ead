package com.ead.course.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ead.course.models.CourseModel;
import com.ead.course.specifications.SpecificationTemplate;

public interface CourseService {

	void delete(CourseModel courseModel);

	CourseModel save(CourseModel courseModel);

	Optional<CourseModel> findById(UUID courseId);

	Page<CourseModel> findAll(SpecificationTemplate.CourseSpec spec, Pageable pageable);
}