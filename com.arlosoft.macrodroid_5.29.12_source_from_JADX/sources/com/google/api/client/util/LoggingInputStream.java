package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingInputStream extends FilterInputStream {

    /* renamed from: a */
    private final LoggingByteArrayOutputStream f52818a;

    public LoggingInputStream(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.f52818a = new LoggingByteArrayOutputStream(logger, level, i);
    }

    public void close() throws IOException {
        this.f52818a.close();
        super.close();
    }

    public int read() throws IOException {
        int read = super.read();
        this.f52818a.write(read);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f52818a.write(bArr, i, read);
        }
        return read;
    }
}
