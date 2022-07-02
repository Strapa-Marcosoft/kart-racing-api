package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.model.ResponseObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("system")
public class SystemController {


    @GetMapping("apiStatus")
    public ResponseEntity<ResponseObject> apiStatus(){
        ResponseObject response = ResponseObject.builder()
                .result(true)
                .message("Api UP and running")
                .build();
        return ResponseEntity.ok(response);
    }
}
