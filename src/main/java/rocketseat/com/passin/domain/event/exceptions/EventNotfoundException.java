package rocketseat.com.passin.domain.event.exceptions;

public class EventNotfoundException extends RuntimeException {

    public EventNotfoundException(String message){
        super(message);
    }
}
