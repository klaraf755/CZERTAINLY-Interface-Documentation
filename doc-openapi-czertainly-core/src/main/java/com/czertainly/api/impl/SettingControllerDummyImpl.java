package com.czertainly.api.impl;

import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.core.web.SettingController;
import com.czertainly.api.model.client.attribute.RequestAttributeDto;
import com.czertainly.api.model.common.attribute.v2.BaseAttribute;
import com.czertainly.api.model.core.setting.AllSettingsDto;
import com.czertainly.api.model.core.setting.Section;
import com.czertainly.api.model.core.setting.SectionDto;
import com.czertainly.api.model.core.setting.SectionSettingsDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SettingControllerDummyImpl implements SettingController {
    @Override
    public List<SectionDto> getSettingsSections() {
        return null;
    }

    @Override
    public AllSettingsDto getAllSettings() {
        return null;
    }

    @Override
    public List<SectionSettingsDto> getSettings() {
        return null;
    }

    @Override
    public List<BaseAttribute> getSectionSettingsAttributes(Section section) throws NotFoundException {
        return null;
    }

    @Override
    public SectionSettingsDto getSectionSettings(Section section) throws NotFoundException {
        return null;
    }

    @Override
    public SectionSettingsDto updateSectionSettings(Section section, List<RequestAttributeDto> attributes) {
        return null;
    }
}
