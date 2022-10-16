package com.example.retail_app.controller;

import com.example.retail_app.model.StorageDto;
import com.example.retail_app.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
public class StorageController {
    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping
    public void add(@RequestBody StorageDto storageDto){
        storageService.add(storageDto);

    }


}
