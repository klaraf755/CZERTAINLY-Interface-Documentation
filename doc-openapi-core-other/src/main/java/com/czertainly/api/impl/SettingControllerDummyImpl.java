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
import java.util.Map;

@RestController
public class SettingControllerDummyImpl implements SettingController {

    @Override
    public List<SectionDto> getSections() {
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
    public List<SectionSettingsDto> updateSettings(Map<Section, List<RequestAttributeDto>> attributes) {
        return null;
    }
}
