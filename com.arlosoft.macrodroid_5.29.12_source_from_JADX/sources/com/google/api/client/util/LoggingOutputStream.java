package com.google.api.client.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingOutputStream extends FilterOutputStream {

    /* renamed from: a */
    private final LoggingByteArrayOutputStream f52819a;

    public LoggingOutputStream(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.f52819a = new LoggingByteArrayOutputStream(logger, level, i);
    }

    /* renamed from: b */
    public final LoggingByteArrayOutputStream mo60773b() {
        return this.f52819a;
    }

    public void close() throws IOException {
        this.f52819a.close();
        super.close();
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        this.f52819a.write(i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f52819a.write(bArr, i, i2);
    }
}
