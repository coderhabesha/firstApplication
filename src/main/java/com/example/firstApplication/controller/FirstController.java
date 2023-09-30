package com.example.firstApplication.controller;

import com.example.firstApplication.model.FirstModel;
import com.example.firstApplication.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {

    @Autowired
    FirstService firstService;

    @GetMapping("/")
    public FirstModel getFirstModel(Long id) {
        return firstService.getFirstModel(id);
    }

    @GetMapping("/all")
    public List<FirstModel> getAllFirstModel() {
        return firstService.getAllFirstModel();
    }

    @PostMapping("/")
    public void createFirstModel(@RequestParam Long id, @RequestParam String value) {
        firstService.createFirstModel(id, value);
    }
}
