package com.example.retail_app.controller;

import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.BrandDto;
import com.example.retail_app.service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public void add(@RequestBody BrandDto brandDto){
        brandService.add(brandDto);

    }
    @GetMapping("{id}")
    public List<BranchDto> findById(@PathVariable Long id){
        return brandService.findById(id) ;
    }
    @GetMapping
    public List<BrandDto> getAll(){
        return brandService.getAll();
    }



}
