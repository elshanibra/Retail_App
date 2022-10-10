package com.example.retail_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageDto {
    private long id;
    private BranchDto branch;
    private String address;
    private int productCount;
}
