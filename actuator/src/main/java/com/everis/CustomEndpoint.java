package com.everis;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id="CustomEndpoint")
public class CustomEndpoint {

@GetMapping("/random")
public ResponseEntity<String> CustomEndpoint(){
	
	return new ResponseEntity<>("hola"),HttpStatus.Ok);
}
}

},
"customenpoint":{
	"href": "http://localhost:8080/actuator/customEndpoint",
	"templated: false"
}