package com.mtakaki.dropwizard.circuitbreaker.jersey;

import com.mtakaki.dropwizard.circuitbreaker.CircuitBreakerManager;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CircuitBreakerConfiguration {
    private double threshold;
    private CircuitBreakerManager.RateType rateType;
}