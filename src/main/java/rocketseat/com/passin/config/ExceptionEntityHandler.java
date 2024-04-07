package rocketseat.com.passin.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import rocketseat.com.passin.domain.event.exceptions.EventNotfoundException;

@ControllerAdvice
public class ExceptionEntityHandler {
    @ExceptionHandler(EventNotfoundException.class)
    public ResponseEntity handleEventNotFound(EventNotfoundException exception){
        return ResponseEntity.ok().build();
    }
}
