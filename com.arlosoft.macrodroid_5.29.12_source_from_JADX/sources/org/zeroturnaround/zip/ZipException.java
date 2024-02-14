package org.zeroturnaround.zip;

public class ZipException extends RuntimeException {
    public ZipException(String str) {
        super(str);
    }

    public ZipException(Exception exc) {
        super(exc);
    }

    public ZipException(String str, Throwable th) {
        super(str, th);
    }
}
