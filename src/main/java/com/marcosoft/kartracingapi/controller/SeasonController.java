package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.entity.SeasonEntity;
import com.marcosoft.kartracingapi.model.ResponseObject;
import com.marcosoft.kartracingapi.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("season")
public class SeasonController {

    @Autowired
    CrudService crudService;

    @PostMapping
    public ResponseEntity<ResponseObject> addSeason(@RequestBody SeasonEntity season){
        SeasonEntity newSeason = crudService.addSeason(season);
        ResponseObject response = ResponseObject.builder()
                .result(true)
                .message(newSeason.getId().toString())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("{seasonId}")
    public ResponseEntity<String> updateSeason(@PathVariable Integer seasonId, @RequestBody SeasonEntity season){
        season.setId(seasonId);
        crudService.updateSeason(season);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }

    @DeleteMapping("{seasonId}")
    public ResponseEntity<String> deleteSeason(@PathVariable Integer seasonId){
        SeasonEntity season = new SeasonEntity();
        season.setId(seasonId);
        crudService.deleteSeason(season);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }
}
