package com.github.barhan44.restsim.service;

import com.github.barhan44.restsim.domain.EndpointConfig;
import com.github.barhan44.restsim.dto.EndpointConfigDto;

import java.util.List;
import java.util.Optional;

public interface ConfigurationService {
    EndpointConfig createConfig(EndpointConfigDto dto);

    EndpointConfig updateConfig(Long id, EndpointConfigDto dto);

    void delete(Long id);

    Optional<EndpointConfig> getConfig(Long id);

    List<EndpointConfig> getALlConfigs();

    EndpointConfig toggleConfig(Long id, boolean enabled);
}
