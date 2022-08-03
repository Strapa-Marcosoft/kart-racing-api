package com.marcosoft.kartracingapi.service;

import com.marcosoft.kartracingapi.entity.RoundPilotEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalculationService {

    public List<RoundPilotEntity> calculate(List<RoundPilotEntity> roundPilotEntityList){

        return roundPilotEntityList.stream()
                .map(pilot -> {
                    if(pilot.getBestLap()) {
                        pilot.incrementScore();
                    }

                    if(pilot.getPolePosition()) {
                        pilot.incrementScore();
                    }

                    pilot.incrementScore(roundPilotEntityList.size() -  (pilot.getFinalPosition() -1));

                    return pilot;
                })
                .collect(Collectors.toList());
    }

}
