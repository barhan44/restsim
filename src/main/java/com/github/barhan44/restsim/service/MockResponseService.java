package com.github.barhan44.restsim.service;

import com.github.barhan44.restsim.domain.EndpointConfig;
import com.github.barhan44.restsim.domain.MockRequest;
import com.github.barhan44.restsim.domain.MockResponse;

import java.util.List;

public interface MockResponseService {

    MockResponse generateResponse(MockRequest request);

    List<EndpointConfig> getAllActiveConfigs();
}
