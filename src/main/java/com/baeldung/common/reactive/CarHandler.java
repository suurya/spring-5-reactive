package com.baeldung.common.reactive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.baeldung.common.reactive.model.Vehicle;
import com.baeldung.common.reactive.repository.CarTraffic;

import reactor.core.publisher.Mono;

@Component
public class CarHandler {
    
    @Autowired
    CarTraffic carTraffic;
    
    public Mono<ServerResponse> vehicleDetected(ServerRequest request) {
        return ServerResponse.ok()
            .contentType(MediaType.APPLICATION_STREAM_JSON)
            .body(carTraffic.flowTraffic(),Vehicle.class);
        
    }

}
