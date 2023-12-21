package com.example.maintanencerequestserver.domain.maintenceRequest.repos;

import com.example.maintanencerequestserver.domain.maintenceRequest.models.MaintenceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MaintenceRequestRepo extends JpaRepository<MaintenceRequest, Long> {
    Optional<MaintenceRequest> findByEmail(String email);
}


