package com.clinical.patient.controller;

import com.clinical.patient.dto.request.PatientRequestDTO;
import com.clinical.patient.dto.response.PatientResponseDTO;
import com.clinical.patient.service.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/api/v1/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

   @PostMapping
    public ResponseEntity<PatientResponseDTO> registerPatient(
            @Valid
            @RequestBody PatientRequestDTO patientRequestDTO
            ){
       log.info("new patient registration {}", patientRequestDTO);

       Optional<PatientResponseDTO> responseDTO = patientService.registerPatient(patientRequestDTO);

       if(responseDTO.isPresent()){
           return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO.get());
       }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
