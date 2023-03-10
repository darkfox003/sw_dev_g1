package com.example.accessingdatamysql.service.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.service.repo.entity.StudentEntity;

public interface CourseRepository extends CrudRepository<StudentEntity, Integer> {
    
}
