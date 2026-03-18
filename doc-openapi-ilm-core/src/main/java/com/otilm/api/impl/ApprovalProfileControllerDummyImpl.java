package com.otilm.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.ApprovalProfileController;
import com.czertainly.api.model.client.approvalprofile.*;
import com.czertainly.api.model.core.auth.Resource;
import com.czertainly.api.model.core.other.ResourceObjectDto;
import com.czertainly.api.model.core.scheduler.PaginationRequestDto;
import org.springframework.http.ResponseEntity;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@SecurityRequirements(value = {
        @SecurityRequirement(name = "")
})
public class ApprovalProfileControllerDummyImpl implements ApprovalProfileController {

    @Override
    public ApprovalProfileResponseDto listApprovalProfiles(PaginationRequestDto paginationRequestDto) throws ValidationException {
        return null;
    }

    @Override
    public ApprovalProfileDetailDto getApprovalProfile(String uuid, ApprovalProfileForVersionDto approvalProfileForVersionDto) throws NotFoundException {
        return null;
    }

    @Override
    public void deleteApprovalProfile(String uuid) throws NotFoundException {
    }

    @Override
    public ResponseEntity<?> createApprovalProfile(ApprovalProfileRequestDto approvalProfileRequestDto) throws NotFoundException, AlreadyExistException {
        return null;
    }

    @Override
    public ResponseEntity<?> editApprovalProfile(String uuid, ApprovalProfileUpdateRequestDto approvalProfileUpdateRequestDto) throws NotFoundException {
        return null;
    }

    @Override
    public List<ResourceObjectDto> getAssociations(UUID uuid) throws NotFoundException {
        return List.of();
    }

    @Override
    public void associateApprovalProfile(UUID uuid, Resource resource, UUID associationObjectUuid) throws NotFoundException, AlreadyExistException {

    }

    @Override
    public void disassociateApprovalProfile(UUID uuid, Resource resource, UUID associationObjectUuid) throws NotFoundException {

    }

    @Override
    public List<ApprovalProfileDto> getAssociatedApprovalProfiles(Resource resource, UUID associationObjectUuid) throws NotFoundException {
        return List.of();
    }
}
