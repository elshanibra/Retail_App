package com.example.retail_app.service;

import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.StorageDto;



import java.util.List;

public interface BranchService {

    void add(BranchDto branchDto);
    List<StorageDto> findById( Long id);
}
