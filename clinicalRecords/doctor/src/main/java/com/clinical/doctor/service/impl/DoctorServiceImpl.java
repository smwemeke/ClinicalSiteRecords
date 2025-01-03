package com.clinical.doctor.service.impl;

import com.clinical.doctor.dto.MedicalHistoryDTO;
import com.clinical.doctor.model.Diagnosis;
import com.clinical.doctor.model.TreatmentData;
import com.clinical.doctor.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Override
    public Diagnosis createDiagnosis(Diagnosis diagnosis) {
        return null;
    }

    @Override
    public TreatmentData registerTreatmentData(TreatmentData treatmentData) {
        return null;
    }

    @Override
    public List<MedicalHistoryDTO> getAllHistory() {
        return List.of();
    }

    @Override
    public MedicalHistoryDTO updateHistory(MedicalHistoryDTO medicalHistoryDTO, Long histroyId) {
        return null;
    }
}
