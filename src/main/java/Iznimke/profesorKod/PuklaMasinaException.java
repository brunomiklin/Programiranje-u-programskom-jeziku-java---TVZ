package Iznimke.profesorKod;

public class PuklaMasinaException extends Exception {
    public PuklaMasinaException() {
    }

    public PuklaMasinaException(String message) {
        super(message);
    }

    public PuklaMasinaException(String message, Throwable cause) {
        super(message, cause);
    }

    public PuklaMasinaException(Throwable cause) {
        super(cause);
    }

    public PuklaMasinaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
