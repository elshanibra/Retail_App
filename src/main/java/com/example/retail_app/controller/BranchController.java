package com.example.retail_app.controller;

import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.StorageDto;
import com.example.retail_app.service.BranchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchController {
    private final BranchService branchService;

    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }


    @PostMapping
    public void add(@RequestBody BranchDto branchDto) {
        branchService.add(branchDto);

    }

    @GetMapping("{id}")
    public List<StorageDto> findById(@PathVariable Long id) {
        return branchService.findById(id);
    }


}