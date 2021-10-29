package com.czertainly.api.impl;

import org.springframework.web.bind.annotation.RestController;

import com.czertainly.api.interfaces.DiscoveryController;
import com.czertainly.api.model.discovery.DiscoveryProviderDto;

@RestController
public class DiscoveryControllerDummyImpl implements DiscoveryController {

	@Override
	public DiscoveryProviderDto discoverCertificate(DiscoveryProviderDto request) {
		return null;
	}
}
