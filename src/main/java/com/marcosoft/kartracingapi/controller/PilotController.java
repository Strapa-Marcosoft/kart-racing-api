package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.entity.PilotEntity;
import com.marcosoft.kartracingapi.model.ResponseObject;
import com.marcosoft.kartracingapi.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pilot")
public class PilotController {

    @Autowired
    CrudService crudService;

    @PostMapping
    public ResponseEntity<ResponseObject> addPilot(@RequestBody PilotEntity pilot){
        PilotEntity newPilot = crudService.addPilot(pilot);
        ResponseObject response = ResponseObject.builder()
                .result(true)
                .message(newPilot.getId().toString())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("{pilotId}")
    public ResponseEntity<String> updatePilot(@PathVariable Integer pilotId, @RequestBody PilotEntity pilot){
        pilot.setId(pilotId);
        crudService.updatePilot(pilot);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }

    @DeleteMapping("{pilotId}")
    public ResponseEntity<String> deletePilot(@PathVariable Integer pilotId){
        PilotEntity pilot = new PilotEntity();
        pilot.setId(pilotId);
        crudService.deletePilot(pilot);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }

}
