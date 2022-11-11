package com.example.retail_app.controller;

import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.BrandDto;
import com.example.retail_app.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
@RequiredArgsConstructor
public class BrandController {
    private final BrandService brandService;


    @PostMapping
    public BrandDto add(@RequestBody BrandDto brandDto) {
       return brandService.add(brandDto);
    }

    @GetMapping("/{id}")
    public BrandDto findById(@PathVariable Long id) {
        return brandService.findById(id);
    }

    @GetMapping("/{brandId}/branches")
    public List<BranchDto> findBranchesById(@PathVariable Long brandId) {
        return brandService.findBranchesById(brandId);
    }

    @GetMapping
    public List<BrandDto> getAll() {
        return brandService.getAll();
    }


}
