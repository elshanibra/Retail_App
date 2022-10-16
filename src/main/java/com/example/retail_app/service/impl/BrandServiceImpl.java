package com.example.retail_app.service.impl;

import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.BrandDto;
import com.example.retail_app.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {
    @Override
    public void add(BrandDto brandDto) {

    }

    @Override
    public List<BranchDto> findById(Long id) {
        return null;
    }

    @Override
    public List<BrandDto> getAll() {
        return null;
    }
}
