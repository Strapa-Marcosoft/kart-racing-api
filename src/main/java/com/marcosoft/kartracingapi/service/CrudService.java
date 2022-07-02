package com.marcosoft.kartracingapi.service;

import com.marcosoft.kartracingapi.entity.*;
import com.marcosoft.kartracingapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {
    @Autowired
    PilotEntityRepository pilotEntityRepository;

    @Autowired
    LocationEntityRepository locationEntityRepository;

    @Autowired
    SeasonEntityRepository seasonEntityRepository;

    @Autowired
    SeasonScoreEntityRepository seasonScoreEntityRepository;

    @Autowired
    RoundEntityRepository roundEntityRepository;

    @Autowired
    RoundPilotEntityRepository roundPilotEntityRepository;

    @Autowired
    RoundMediaEntityRepository roundMediaEntityRepository;

    public PilotEntity addPilot(PilotEntity pilot){
        return pilotEntityRepository.save(pilot);
    }

    public void updatePilot(PilotEntity pilot){
        pilotEntityRepository.save(pilot);
    }

    public void deletePilot(PilotEntity pilot){
        pilotEntityRepository.delete(pilot);
    }

    public LocationEntity addLocation(LocationEntity location){
        return locationEntityRepository.save(location);
    }

    public void updateLocation(LocationEntity location){
        locationEntityRepository.save(location);
    }

    public void deleteLocation(LocationEntity location){
        locationEntityRepository.delete(location);
    }

    public SeasonEntity addSeason(SeasonEntity season){
        return seasonEntityRepository.save(season);
    }

    public void updateSeason(SeasonEntity season){
        seasonEntityRepository.save(season);
    }

    public void deleteSeason(SeasonEntity season){
        seasonEntityRepository.delete(season);
    }

    public SeasonScoreEntity addSeasonScore(SeasonScoreEntity seasonScore){
        return seasonScoreEntityRepository.save(seasonScore);
    }

    public void updateSeasonScore(SeasonScoreEntity seasonScore){
        seasonScoreEntityRepository.save(seasonScore);
    }

    public void deleteSeasonScore(SeasonScoreEntity seasonScore){
        seasonScoreEntityRepository.delete(seasonScore);
    }

    public RoundEntity addRound(RoundEntity round){
        return roundEntityRepository.save(round);
    }

    public void updateRound(RoundEntity round){
        roundEntityRepository.save(round);
    }

    public void deleteRound(RoundEntity round) {
        roundEntityRepository.delete(round);
    }

    public RoundPilotEntity addRoundPilot(RoundPilotEntity roundPilot){
        return roundPilotEntityRepository.save(roundPilot);
    }

    public void updateRoundPilot(RoundPilotEntity roundPilot){
        roundPilotEntityRepository.save(roundPilot);
    }

    public void deleteRoundPilot(RoundPilotEntity roundPilot){
        roundPilotEntityRepository.delete(roundPilot);
    }

    public RoundMediaEntity addRoundMedia(RoundMediaEntity roundMedia){
        return roundMediaEntityRepository.save(roundMedia);
    }

    public void updateRoundMedia(RoundMediaEntity roundMedia){
        roundMediaEntityRepository.save(roundMedia);
    }

    public void deleteRoundMedia(RoundMediaEntity roundMedia){
        roundMediaEntityRepository.delete(roundMedia);
    }
}
