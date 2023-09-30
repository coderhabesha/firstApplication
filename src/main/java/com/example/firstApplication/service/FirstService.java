package com.example.firstApplication.service;

import com.example.firstApplication.model.FirstModel;
import com.example.firstApplication.repository.FirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstService {

    @Autowired
    FirstRepository firstRepository;

    public List<FirstModel> getAllFirstModel() {
        return (List<FirstModel>) firstRepository.findAll();
    }

    public FirstModel getFirstModel(Long id) {
        return firstRepository.findById(id).get();
    }

    public void createFirstModel(Long id, String value) {
        FirstModel fm;
        fm = new FirstModel();

        fm.setId(id);
        fm.setValue(value);

        firstRepository.save(fm);
    }
}
