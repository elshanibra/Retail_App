package com.example.retail_app.service.impl;

import com.example.retail_app.dao.entity.BranchEntity;
import com.example.retail_app.dao.entity.BrandEntity;
import com.example.retail_app.dao.repository.BrandRepository;
import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.BrandDto;
import com.example.retail_app.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;


    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void add(BrandDto brandDto) {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName(brandDto.getName());
        brandEntity.setBranchList((List<BranchEntity>) brandDto.getBranch());
        brandRepository.save(brandEntity);

    }

    @Override
    public List<BranchDto> findById(Long id) {
        return null;
    }

    @Override
    public List<BrandDto> getAll() {
        List<BrandEntity> brands =  (List<BrandEntity>) brandRepository.findAll();
                return (List<BrandDto>) brands.stream()
                        .map(brandEntity -> new BrandDto(brandEntity.getId(),brandEntity.getName(), (BranchDto) brandEntity.getBranchList()))
                        .collect(Collectors.toList());
            }

                ;
    }

