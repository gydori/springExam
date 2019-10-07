package hu.flowacademy.test.foodorder.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

public class ValidationException extends RuntimeException {
    public  ValidationException(String message){
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, message);
    }
}
