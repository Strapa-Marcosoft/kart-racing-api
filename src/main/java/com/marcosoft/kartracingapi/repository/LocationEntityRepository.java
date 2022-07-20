package com.marcosoft.kartracingapi.repository;

import com.marcosoft.kartracingapi.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationEntityRepository extends JpaRepository<LocationEntity,Integer> {
}
