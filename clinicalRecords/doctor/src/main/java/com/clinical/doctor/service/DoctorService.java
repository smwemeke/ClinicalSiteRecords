package com.clinical.doctor.service;

import com.clinical.doctor.dto.MedicalHistoryDTO;
import com.clinical.doctor.model.Diagnosis;
import com.clinical.doctor.model.MedicalHistory;
import com.clinical.doctor.model.TreatmentData;

import java.util.List;

public interface DoctorService {
    Diagnosis createDiagnosis(Diagnosis diagnosis);
//    List<Visit> getAllVisits();
//    LabRequest getLabResults (PatientDTO patientDTO, Long patientId);
    TreatmentData registerTreatmentData(TreatmentData treatmentData);
    List<MedicalHistoryDTO> getAllHistory();
    MedicalHistoryDTO updateHistory(MedicalHistoryDTO medicalHistoryDTO,Long histroyId);
}
