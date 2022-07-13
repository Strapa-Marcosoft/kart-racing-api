package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.entity.SeasonScoreEntity;
import com.marcosoft.kartracingapi.model.ResponseObject;
import com.marcosoft.kartracingapi.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("season-score")
public class SeasonScoreController {

    @Autowired
    CrudService crudService;

    @GetMapping
    public ResponseEntity<List<SeasonScoreEntity>> getSeasonScoreList(){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.getSeasonScoreList());
    }

    @GetMapping("{seasonScoreId}")
    public ResponseEntity<SeasonScoreEntity> getSingleSeasonScore(@PathVariable Integer seasonScoreId){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.getSingleSeasonScore(seasonScoreId));
    }

    @PostMapping
    public ResponseEntity<ResponseObject> addSeasonScore(@RequestBody SeasonScoreEntity seasonScore){
        SeasonScoreEntity newSeasonScore = crudService.addSeasonScore(seasonScore);
        ResponseObject response = ResponseObject.builder()
                .result(true)
                .message(newSeasonScore.getId().toString())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("{seasonScoreId}")
    public ResponseEntity<String> updateSeasonScore(@PathVariable Integer seasonScoreId, @RequestBody SeasonScoreEntity seasonScore){
        seasonScore.setId(seasonScoreId);
        crudService.updateSeasonScore(seasonScore);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }

    @DeleteMapping("{seasonScoreId}")
    public ResponseEntity<String> deleteSeasonScore(@PathVariable Integer seasonScoreId){
        SeasonScoreEntity seasonScore = new SeasonScoreEntity();
        seasonScore.setId(seasonScoreId);
        crudService.deleteSeasonScore(seasonScore);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }
}
