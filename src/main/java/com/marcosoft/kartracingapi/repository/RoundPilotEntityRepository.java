package com.marcosoft.kartracingapi.repository;

import com.marcosoft.kartracingapi.entity.RoundPilotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoundPilotEntityRepository extends JpaRepository<RoundPilotEntity,Integer> {

    public List<RoundPilotEntity> getAllByRound(Integer round);

}
