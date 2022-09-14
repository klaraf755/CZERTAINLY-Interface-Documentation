package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.ComplianceProfileController;
import com.czertainly.api.model.client.compliance.*;
import com.czertainly.api.model.client.raprofile.SimplifiedRaProfileDto;
import com.czertainly.api.model.common.BulkActionMessageDto;
import com.czertainly.api.model.common.UuidDto;
import com.czertainly.api.model.core.certificate.CertificateType;
import com.czertainly.api.model.core.compliance.ComplianceProfileDto;
import com.czertainly.api.model.core.compliance.ComplianceProfilesListDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComplianceProfileControllerDummyImpl implements ComplianceProfileController {

    @Override
    public List<ComplianceRulesListResponseDto> getComplianceRules(String complianceProviderUuid, String kind, List<CertificateType> certificateType) throws NotFoundException {
        return null;
    }

    @Override
    public List<ComplianceGroupsListResponseDto> getComplianceGroups(String complianceProviderUuid, String kind) throws NotFoundException {
        return null;
    }

    @Override
    public List<ComplianceProfilesListDto> listComplianceProfiles() {
        return null;
    }

    @Override
    public ComplianceProfileDto getComplianceProfile(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public ResponseEntity<UuidDto> createComplianceProfile(ComplianceProfileRequestDto request) throws AlreadyExistException, ConnectorException {
        return null;
    }

    @Override
    public void addRule(String uuid, ComplianceRuleAdditionRequestDto request) throws AlreadyExistException, NotFoundException, ValidationException {

    }

    @Override
    public void removeRule(String uuid, ComplianceRuleDeletionRequestDto request) throws NotFoundException {

    }

    @Override
    public void addGroup(String uuid, ComplianceGroupRequestDto request) throws AlreadyExistException, NotFoundException {

    }

    @Override
    public void removeGroup(String uuid, ComplianceGroupRequestDto request) throws NotFoundException {

    }

    @Override
    public void removeComplianceProfile(String uuid) throws NotFoundException {

    }

    @Override
    public List<SimplifiedRaProfileDto> getAssociatedRAProfiles(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public List<BulkActionMessageDto> bulkRemoveComplianceProfiles(List<String> uuids) throws NotFoundException, ValidationException {
        return null;
    }

    @Override
    public List<BulkActionMessageDto> bulkForceRemoveComplianceProfiles(List<String> uuids) throws NotFoundException, ValidationException {
        return null;
    }

    @Override
    public void associateProfiles(String uuid, RaProfileAssociationRequestDto raProfiles) throws NotFoundException, ConnectorException {

    }

    @Override
    public void disassociateProfiles(String uuid, RaProfileAssociationRequestDto raProfiles) throws NotFoundException, ConnectorException {

    }

    @Override
    public void checkCompliance(ComplianceProfileComplianceCheckDto request) throws NotFoundException {

    }
}
