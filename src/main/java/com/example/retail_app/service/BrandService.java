package com.example.retail_app.service;

import com.example.retail_app.dao.entity.BrandEntity;
import com.example.retail_app.dao.repository.BrandRepository;
import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.BrandDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandDto add(BrandDto brandDto) {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName(brandDto.getName());
        BrandEntity save = brandRepository.save(brandEntity);
        brandDto.setId(save.getId());
        return brandDto;
    }

    public BrandDto findById(Long id) {
        Optional<BrandEntity> optionalBrand = brandRepository.findById(id);
        BrandEntity brandEntity = optionalBrand.orElseThrow(() -> new RuntimeException("Brand not found"));
        return new BrandDto(brandEntity.getId(), brandEntity.getName());
    }

    public List<BrandDto> getAll() {
        List<BrandEntity> brands = (List<BrandEntity>) brandRepository.findAll();
        return brands.stream()
                .map(brandEntity -> new BrandDto(brandEntity.getId(), brandEntity.getName()))
                .collect(Collectors.toList());
    }

    public List<BranchDto> findBranchesById(Long brandId) {
        Optional<BrandEntity> optionalBrand = brandRepository.findById(brandId);
        BrandEntity brandEntity = optionalBrand.orElseThrow(() -> new RuntimeException("Brand not found"));
        return brandEntity.getBranchList().stream().map(branchEntity -> {
            BranchDto dto = new BranchDto();
            dto.setId(branchEntity.getId());
            dto.setName(branchEntity.getName());
            dto.setAcceptPayment(branchEntity.getAcceptPayment());
            dto.setTypeOfSale(branchEntity.getSaleType());
            branchEntity.setBrand(brandEntity);
            return dto;
        }).toList();
    }
}
