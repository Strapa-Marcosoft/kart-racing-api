package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.entity.LocationEntity;
import com.marcosoft.kartracingapi.model.ResponseObject;
import com.marcosoft.kartracingapi.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("location")
public class LocationController {

    @Autowired
    CrudService crudService;

    @PostMapping
    public ResponseEntity<ResponseObject> addLocation(@RequestBody LocationEntity location){
        LocationEntity newLocation = crudService.addLocation(location);
        ResponseObject response = ResponseObject.builder()
                .result(true)
                .message(newLocation.getId().toString())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("{locationId}")
    public ResponseEntity<String> updateLocation(@PathVariable Integer locationId, @RequestBody LocationEntity location){
        location.setId(locationId);
        crudService.updateLocation(location);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }

    @DeleteMapping("{locationId}")
    public ResponseEntity<String> deleteLocation(@PathVariable Integer locationId){
        LocationEntity location = new LocationEntity();
        location.setId(locationId);
        crudService.deleteLocation(location);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }
}
