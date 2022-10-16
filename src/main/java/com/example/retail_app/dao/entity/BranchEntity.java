package com.example.retail_app.dao.entity;

import com.example.retail_app.model.AcceptPayment;
import com.example.retail_app.model.SaleType;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
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

    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "timestamp default now()",nullable = false)
    private LocalDateTime createdAt= LocalDateTime.now();

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "timestamp default now()", nullable = false)
    private LocalDateTime updatedAt=LocalDateTime.now();

    @ManyToOne
    private BrandEntity brand;

}
