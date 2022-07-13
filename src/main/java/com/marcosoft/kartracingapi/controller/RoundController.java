package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.entity.RoundEntity;
import com.marcosoft.kartracingapi.model.ResponseObject;
import com.marcosoft.kartracingapi.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("round")
public class RoundController {
    @Autowired
    CrudService crudService;

    @GetMapping()
    public ResponseEntity<List<RoundEntity>> getRoundList(){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.getRoundList());
    }

    @GetMapping("{roundId}")
    public ResponseEntity<RoundEntity> getSigleRound(@PathVariable Integer roundId){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.getSingleRound(roundId));
    }

    @PostMapping
    public ResponseEntity<ResponseObject> addRound(@RequestBody RoundEntity round){
        RoundEntity newRound = crudService.addRound(round);
        ResponseObject response = ResponseObject.builder()
                .result(true)
                .message(newRound.getId().toString())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("{roundId}")
    public ResponseEntity<String> updateRound(@PathVariable Integer roundId, @RequestBody RoundEntity round){
        round.setId(roundId);
        crudService.updateRound(round);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }

    @DeleteMapping("{roundId}")
    public ResponseEntity<String> deleteRound(@PathVariable Integer roundId){
        RoundEntity round = new RoundEntity();
        round.setId(roundId);
        crudService.deleteRound(round);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }
}
