package web.karima.springsecuritywithjwt.Exceptions;

public class ActivationTokenException extends RuntimeException {
    public ActivationTokenException(String message) {
        super(message);
    }
}