package com.uth.ums.career.controller;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.service.CareerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/careers")
@RequiredArgsConstructor
public class CareerController {
    private final CareerService careerService;

    @GetMapping()
    public ResponseEntity<List<CareerDto>> getAll() {
        return ResponseEntity.ok(careerService.getAll());
    }
}
