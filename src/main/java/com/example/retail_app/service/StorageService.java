package com.example.retail_app.service;

import com.example.retail_app.dao.entity.StorageEntity;
import com.example.retail_app.dao.repository.BranchRepository;
import com.example.retail_app.dao.repository.StorageRepository;
import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.StorageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StorageService  {
    private final StorageRepository storageRepository;
    private final BranchRepository branchRepository;


    public StorageDto add(StorageDto storageDto) {
        StorageEntity storageEntity = new StorageEntity();
        storageEntity.setAddress(storageDto.getAddress());
        storageEntity.setProductCount(storageDto.getProductCount());
        if (storageDto.getBranches() != null) {
            List<Long> ids = storageDto.getBranches().stream().map(BranchDto::getId).collect(Collectors.toList());
            storageEntity.setBranches(branchRepository.findAllById(ids));
        }
        StorageEntity save = storageRepository.save(storageEntity);
        storageDto.setId(storageEntity.getId());
        return storageDto;
    }
}
