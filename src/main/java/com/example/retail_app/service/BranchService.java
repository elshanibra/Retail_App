package com.example.retail_app.service;

import com.example.retail_app.dao.entity.BranchEntity;
import com.example.retail_app.dao.entity.BrandEntity;
import com.example.retail_app.dao.repository.BranchRepository;
import com.example.retail_app.model.BranchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BranchService {
    private final BranchRepository branchRepository;


    public BranchDto add(BranchDto branchDto) {
        BranchEntity branchEntity = new BranchEntity();
        branchEntity.setName(branchDto.getName());
        branchEntity.setAddress(branchDto.getBranchAddress());
        branchEntity.setSaleType(branchDto.getTypeOfSale());
        branchEntity.setAcceptPayment(branchDto.getAcceptPayment());
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setId(branchDto.getBrandId());
        branchEntity.setBrand(brandEntity);
        BranchEntity save = branchRepository.save(branchEntity);
        branchDto.setId(save.getId());
        return branchDto;
    }

    public BranchDto findById(Long id) {
        return null;
    }
}
