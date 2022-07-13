package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.entity.RoundPilotEntity;
import com.marcosoft.kartracingapi.model.ResponseObject;
import com.marcosoft.kartracingapi.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("round-pilot")
public class RoundPilotController {
    @Autowired
    CrudService crudService;

    @GetMapping
    public ResponseEntity<List<RoundPilotEntity>> getRoundPilotList(){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.getRoundPilotList());
    }

    @GetMapping("{roundPilotId}")
    public ResponseEntity<RoundPilotEntity> getSingleRoundPilot(@PathVariable Integer roundPilotId){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.getSingleRoundPilot(roundPilotId));
    }

    @PostMapping
    public ResponseEntity<ResponseObject> addRoundPilot(@RequestBody RoundPilotEntity roundPilot){
        RoundPilotEntity newRoundPilot = crudService.addRoundPilot(roundPilot);
        ResponseObject response = ResponseObject.builder()
                .result(true)
                .message(newRoundPilot.getId().toString())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("{roundPilotId}")
    public ResponseEntity<String> updateRoundPilot(@PathVariable Integer roundPilotId, @RequestBody RoundPilotEntity roundPilot){
        roundPilot.setId(roundPilotId);
        crudService.updateRoundPilot(roundPilot);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }

    @DeleteMapping("{roundPilotId}")
    public ResponseEntity<String> deleteRoundPilot(@PathVariable Integer roundPilotId){
        RoundPilotEntity roundPilot = new RoundPilotEntity();
        roundPilot.setId(roundPilotId);
        crudService.deleteRoundPilot(roundPilot);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }
}
