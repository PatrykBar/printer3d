package pl.patrykbartnicki.printersoft.printer3d.exceptions;

public class NotFoundException extends RuntimeException{

    public NotFoundException() { super();}

    public NotFoundException(String message) {super(message);}

    public NotFoundException(String message, Throwable cause){super(message, cause);}

}
