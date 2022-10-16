package com.example.retail_app.dao.repository;

import com.example.retail_app.dao.entity.BrandEntity;
import org.springframework.data.repository.CrudRepository;

public interface BrandRepository extends CrudRepository<BrandEntity,Long> {
}
