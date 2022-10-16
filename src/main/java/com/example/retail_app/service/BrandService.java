package com.example.retail_app.service;

import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.BrandDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface BrandService {
    void add(BrandDto brandDto);
    List<BranchDto> findById(Long id);
    List<BrandDto> getAll();

}
