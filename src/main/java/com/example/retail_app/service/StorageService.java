package com.example.retail_app.service;

import com.example.retail_app.model.StorageDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface StorageService {

    void add(StorageDto storageDto);
}
