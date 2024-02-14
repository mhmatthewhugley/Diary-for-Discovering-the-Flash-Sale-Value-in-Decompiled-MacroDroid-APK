package p473rx.exceptions;

/* renamed from: rx.exceptions.AssemblyStackTraceException */
public final class AssemblyStackTraceException extends RuntimeException {
    private static final long serialVersionUID = 2038859767182585852L;

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
