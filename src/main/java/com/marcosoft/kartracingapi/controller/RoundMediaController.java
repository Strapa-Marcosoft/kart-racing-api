package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.entity.RoundMediaEntity;
import com.marcosoft.kartracingapi.model.ResponseObject;
import com.marcosoft.kartracingapi.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("round-media")
public class RoundMediaController {
    @Autowired
    CrudService crudService;

    @GetMapping()
    public ResponseEntity<List<RoundMediaEntity>> getRoundMediaList(){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.getRoundMediaList());
    }

    @GetMapping("{roundMediaId}")
    public ResponseEntity<RoundMediaEntity> getSingleRoundMedia(@PathVariable Integer roundMediaId){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.getSingleRoundMedia(roundMediaId));
    }

    @PostMapping
    public ResponseEntity<ResponseObject> addRoundMedia(@RequestBody RoundMediaEntity roundMedia){
        RoundMediaEntity newRoundMedia = crudService.addRoundMedia(roundMedia);
        ResponseObject response = ResponseObject.builder()
                .result(true)
                .message(newRoundMedia.getId().toString())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("{roundMediaId}")
    public ResponseEntity<String> updateRoundMedia(@PathVariable Integer roundMediaId, @RequestBody RoundMediaEntity roundMedia){
        roundMedia.setId(roundMediaId);
        crudService.updateRoundMedia(roundMedia);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }

    @DeleteMapping("{roundMediaId}")
    public ResponseEntity<String> deleteRoundMedia(@PathVariable Integer roundMediaId){
        RoundMediaEntity roundMedia = new RoundMediaEntity();
        roundMedia.setId(roundMediaId);
        crudService.deleteRoundMedia(roundMedia);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }
}
