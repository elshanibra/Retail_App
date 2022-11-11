package com.example.retail_app.dao.repository;

import com.example.retail_app.dao.entity.BranchEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BranchRepository extends CrudRepository<BranchEntity, Long> {
    List<BranchEntity> findAllById(List<Long> longs);
}
