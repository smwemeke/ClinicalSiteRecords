package com.clinical.doctor.repository;

import com.clinical.doctor.model.TreatmentData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentDataRepository extends JpaRepository<TreatmentData, Long> {
}
