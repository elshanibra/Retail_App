package com.example.retail_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchDto {
    private Long id;
    private Long brandId;
    private String name;
    private String branchAddress;
    private SaleType typeOfSale;
    private StorageDto storage;
    private AcceptPayment acceptPayment;

}
