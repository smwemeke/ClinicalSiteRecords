package com.clinical.doctor.service;

import com.clinical.doctor.model.Diagnosis;
import com.clinical.doctor.model.MedicalHistory;
import com.clinical.doctor.model.TreatmentData;

public interface DoctorService {
    Diagnosis createDiagnosis(Diagnosis diagnosis);
    TreatmentData registerTreatmwntData(TreatmentData treatmentData);
    List<MedicalHistoryDTO> getAllHistory();

}
