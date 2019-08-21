package com.jjh.xml;

/**
 * A RuntimeException that can be thrown when errors occur in data access<br />
 * These are often serious and unresolvable and therefore result in system
 * shutdown.
 * <p>
 * <B>Status: </b> Release
 * <p>
 * 
 * @author John Hunt
 * @version 1.0
 */

public class DataAccessManagerException extends java.lang.RuntimeException {

    private Exception nestedException = null;

    /**
     * Creates a new Exception which displays a standard message when thrown.
     */
    public DataAccessManagerException() {
        super("DataAccessManagerException");
    }

    public DataAccessManagerException(Exception e) {
        super(e);
        nestedException = e;
    }

    /**
     * Creates an exception with both a message and the originating exception
     * linked.
     * 
     * @param msg
     *                A textual message to be displayed with the exception.
     * @param exception
     *                An exception that has previously been caught.
     */
    public DataAccessManagerException(String msg, Throwable exception) {
        super(msg, exception);
    }

    /**
     * Creates Exception with supplied message.
     * 
     * @param message
     *                The message displayed when exception is thrown
     */
    public DataAccessManagerException(String message) {
        super(message);
    }

    public Exception getNestedException() {
        return nestedException;
    }

}