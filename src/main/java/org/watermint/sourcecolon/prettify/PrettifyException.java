package org.watermint.sourcecolon.prettify;

/**
 * Exception.
 */
public class PrettifyException extends Exception {
    public PrettifyException() {
        super();
    }

    public PrettifyException(String message) {
        super(message);
    }

    public PrettifyException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrettifyException(Throwable cause) {
        super(cause);
    }
}
