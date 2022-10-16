package com.example.retail_app.service.impl;

import com.example.retail_app.dao.entity.BranchEntity;
import com.example.retail_app.dao.entity.StorageEntity;
import com.example.retail_app.dao.repository.StorageRepository;
import com.example.retail_app.model.StorageDto;
import com.example.retail_app.service.StorageService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StorageServiceImpl implements StorageService {
    private final StorageRepository storageRepository;

    public StorageServiceImpl(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    @Override
    public void add(StorageDto storageDto) {
        StorageEntity storageEntity = new StorageEntity();
        storageEntity.setAddress(storageDto.getAddress());
        storageEntity.setProductCount(storageDto.getProductCount());
        storageEntity.setBranches((Set<BranchEntity>) storageDto.getBranch());
        storageRepository.save(storageEntity);

    }
}
