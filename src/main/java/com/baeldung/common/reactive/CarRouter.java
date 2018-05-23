package com.baeldung.common.reactive;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Component
public class CarRouter {

    @Bean
    public RouterFunction<ServerResponse> route(CarHandler carHandler) {
        return RouterFunctions
        		.route(RequestPredicates.GET("/vehicles")
        				.and(RequestPredicates.accept(MediaType.APPLICATION_STREAM_JSON)), 
        				carHandler::vehicleDetected);
    }

}
