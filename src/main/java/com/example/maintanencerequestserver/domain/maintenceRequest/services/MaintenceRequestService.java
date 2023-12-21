package com.example.maintanencerequestserver.domain.maintenceRequest.services;

import com.example.maintanencerequestserver.domain.core.exceptions.ResourceCreationException;
import com.example.maintanencerequestserver.domain.core.exceptions.ResourceNotFoundException;
import com.example.maintanencerequestserver.domain.maintenceRequest.models.MaintenceRequest;

import java.util.List;

public interface MaintenceRequestService {
    MaintenceRequest create(MaintenceRequest maintenceRequest) throws ResourceCreationException;
    MaintenceRequest getById(Long id) throws ResourceNotFoundException;
    MaintenceRequest getByEmail(String email) throws ResourceNotFoundException;
    List<MaintenceRequest> getAll();
    MaintenceRequest update(Long id, MaintenceRequest employeeDetail) throws ResourceNotFoundException;
    void delete(Long id);
}
