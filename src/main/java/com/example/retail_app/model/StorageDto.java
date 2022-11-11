package com.example.retail_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageDto {
    private long id;
    private List<BranchDto> branches;
    private List<BrandDto> brands;
    private String address;
    private int productCount;
}
