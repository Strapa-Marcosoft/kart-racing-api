package com.marcosoft.kartracingapi.service;

import com.marcosoft.kartracingapi.entity.*;
import com.marcosoft.kartracingapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<PilotEntity> getPilotList(){
        return (List<PilotEntity>) pilotEntityRepository.findAll();
    }

    public PilotEntity getSinglePilot(Integer pilotId){
        Optional<PilotEntity> pilot = pilotEntityRepository.findById(pilotId);
        return pilot.orElse(null);
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

    public List<LocationEntity> getLocationList(){
        return (List<LocationEntity>) locationEntityRepository.findAll();
    }

    public LocationEntity getSingleLocation(Integer locationId){
        Optional<LocationEntity> location = locationEntityRepository.findById(locationId);
        return location.orElse(null);
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

    public List<SeasonEntity> getSeasonList(){
        return (List<SeasonEntity>)  seasonEntityRepository.findAll();
    }

    public SeasonEntity getSingleSeason(Integer seasonId){
        Optional<SeasonEntity> season = seasonEntityRepository.findById(seasonId);
        return season.orElse(null);
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

    public List<SeasonScoreEntity> getSeasonScoreList(){
        return (List<SeasonScoreEntity>) seasonScoreEntityRepository.findAll();
    }

    public SeasonScoreEntity getSingleSeasonScore(Integer seasonScoreId){
        Optional<SeasonScoreEntity> seasonScore = seasonScoreEntityRepository.findById(seasonScoreId);
        return seasonScore.orElse(null);
    }

    public List<RoundEntity> getRoundList(){
        return (List<RoundEntity>) roundEntityRepository.findAll();
    }

    public RoundEntity getSingleRound(Integer roundId){
        Optional<RoundEntity> round = roundEntityRepository.findById(roundId);
        return round.orElse(null);
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

    public List<RoundPilotEntity> getRoundPilotList(){
        return (List<RoundPilotEntity>) roundPilotEntityRepository.findAll();
    }

    public RoundPilotEntity getSingleRoundPilot(Integer roundPilotId){
        Optional<RoundPilotEntity> roundPilot = roundPilotEntityRepository.findById(roundPilotId);
        return roundPilot.orElse(null);
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

    public List<RoundMediaEntity> getRoundMediaList(){
        return (List<RoundMediaEntity>) roundMediaEntityRepository.findAll();
    }

    public RoundMediaEntity getSingleRoundMedia(Integer roundMediaId){
        Optional<RoundMediaEntity> roundMedia = roundMediaEntityRepository.findById(roundMediaId);
        return roundMedia.orElse(null);
    }
}
