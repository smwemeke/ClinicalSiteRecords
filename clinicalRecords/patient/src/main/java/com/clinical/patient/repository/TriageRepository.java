package com.clinical.patient.repository;

import com.clinical.patient.model.Triage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TriageRepository extends JpaRepository<Triage, Long> {
}
