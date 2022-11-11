package com.example.retail_app.controller;

import com.example.retail_app.model.StorageDto;
import com.example.retail_app.service.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
@RequiredArgsConstructor
public class StorageController {
    private final StorageService storageService;


    @PostMapping
    public StorageDto add(@RequestBody StorageDto storageDto) {
        return storageService.add(storageDto);

    }


}
