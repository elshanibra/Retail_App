package com.example.retail_app.dao.repository;

import com.example.retail_app.dao.entity.BranchEntity;
import org.springframework.data.repository.CrudRepository;

public interface BranchRepository extends CrudRepository<BranchEntity,Long> {
}
