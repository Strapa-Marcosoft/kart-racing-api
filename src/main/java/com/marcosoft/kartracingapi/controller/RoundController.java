package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.exception.BusinessException;
import com.marcosoft.kartracingapi.service.RoundService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/round")
@RestController
@RequiredArgsConstructor
public class RoundController {

    private final RoundService roundService;

    @PostMapping("{id}/calculate")
    public ResponseEntity calculateRound(@PathVariable Integer id) {
        roundService.calculate(id);
        return ResponseEntity.ok().build();
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity except(Exception ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
