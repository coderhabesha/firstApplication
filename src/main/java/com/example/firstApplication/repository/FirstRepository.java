package com.example.firstApplication.repository;

import com.example.firstApplication.model.FirstModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstRepository extends CrudRepository<FirstModel, Long> {
}
