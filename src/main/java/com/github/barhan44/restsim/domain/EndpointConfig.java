package com.github.barhan44.restsim.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endpoint_config")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EndpointConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
