package com.marcosoft.kartracingapi.repository;

import com.marcosoft.kartracingapi.entity.PilotEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.annotation.Resource;

public interface PilotEntityRepository extends CrudRepository<PilotEntity,Integer> {
}
