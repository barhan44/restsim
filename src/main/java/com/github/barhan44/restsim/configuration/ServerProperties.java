package com.github.barhan44.restsim.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "server")
public class ServerProperties {

    private long defaultDelay = 0L;

    private long maxDelay = 10000L;

    private boolean enableRequestLogging = true;

    private String configFilePath = "classpath:mock-configs/";

    private boolean enableWildcardMatching = true;
}
