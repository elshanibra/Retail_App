package com.example.retail_app.dao.entity;

import com.example.retail_app.model.AcceptPayment;
import com.example.retail_app.model.SaleType;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "branches")
@Entity
public class BranchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Enumerated(EnumType.STRING)
    private SaleType saleType;

    @Enumerated(EnumType.STRING)
    @Column(name = "accept_payment", nullable = false)
    private AcceptPayment acceptPayment;

    @ManyToMany
    @ToString.Exclude
    private List<StorageEntity> storage;

    @ManyToOne
    private BrandEntity brand;

}
