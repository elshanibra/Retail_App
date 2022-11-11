package com.example.retail_app.dao.repository;

import com.example.retail_app.dao.entity.StorageEntity;
import org.springframework.data.repository.CrudRepository;

public interface StorageRepository extends CrudRepository<StorageEntity, Long> {
}
