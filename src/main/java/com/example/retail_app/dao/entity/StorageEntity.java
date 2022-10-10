package com.example.retail_app.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class StorageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany(mappedBy = "storage", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<BranchEntity> branches;

    private String address;

    private int productCount;


}
