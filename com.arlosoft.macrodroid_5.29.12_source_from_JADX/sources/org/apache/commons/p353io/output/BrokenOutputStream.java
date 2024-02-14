package org.apache.commons.p353io.output;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: org.apache.commons.io.output.BrokenOutputStream */
public class BrokenOutputStream extends OutputStream {
    private final IOException exception;

    public BrokenOutputStream(IOException iOException) {
        this.exception = iOException;
    }

    public void close() throws IOException {
        throw this.exception;
    }

    public void flush() throws IOException {
        throw this.exception;
    }

    public void write(int i) throws IOException {
        throw this.exception;
    }

    public BrokenOutputStream() {
        this(new IOException("Broken output stream"));
    }
}
