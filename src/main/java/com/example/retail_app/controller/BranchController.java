package com.example.retail_app.controller;

import com.example.retail_app.model.BranchDto;
import com.example.retail_app.service.BranchService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branch")
public class BranchController {
    private final BranchService branchService;

    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }


    @PostMapping
    public BranchDto add(@RequestBody BranchDto branchDto) {
        return branchService.add(branchDto);

    }

    @GetMapping("{id}")
    public BranchDto findById(@PathVariable Long id) {
        return branchService.findById(id);
    }
}