package com.marcosoft.kartracingapi.service;

import com.marcosoft.kartracingapi.exception.BusinessException;
import com.marcosoft.kartracingapi.repository.RoundPilotEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoundService {

    final RoundPilotEntityRepository roundPilotEntityRepository;
    final CalculationService calculationService;

    public void calculate(Integer roundId) {
        var roundPilots = roundPilotEntityRepository.findAllByRound(roundId);
        if(roundPilots.isEmpty()) {
            throw new BusinessException(String.format("Round [%s] not ready to be calculated. No Pilots were found.", roundId));
        }
        var roundPilotsWithScore = calculationService.calculate(roundPilots);
        roundPilotEntityRepository.saveAll(roundPilotsWithScore);
    }
}
