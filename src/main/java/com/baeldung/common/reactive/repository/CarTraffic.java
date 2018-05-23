package com.baeldung.common.reactive.repository;

import com.baeldung.common.reactive.model.Vehicle;

import reactor.core.publisher.Flux;

public interface CarTraffic {
	
	public Flux<Vehicle> flowTraffic();

}
