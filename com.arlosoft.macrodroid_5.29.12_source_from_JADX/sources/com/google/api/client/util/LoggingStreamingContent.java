package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class LoggingStreamingContent implements StreamingContent {

    /* renamed from: a */
    private final StreamingContent f52820a;

    /* renamed from: b */
    private final int f52821b;

    /* renamed from: c */
    private final Level f52822c;

    /* renamed from: d */
    private final Logger f52823d;

    public LoggingStreamingContent(StreamingContent streamingContent, Logger logger, Level level, int i) {
        this.f52820a = streamingContent;
        this.f52823d = logger;
        this.f52822c = level;
        this.f52821b = i;
    }

    /* JADX INFO: finally extract failed */
    public void writeTo(OutputStream outputStream) throws IOException {
        LoggingOutputStream loggingOutputStream = new LoggingOutputStream(outputStream, this.f52823d, this.f52822c, this.f52821b);
        try {
            this.f52820a.writeTo(loggingOutputStream);
            loggingOutputStream.mo60773b().close();
            outputStream.flush();
        } catch (Throwable th) {
            loggingOutputStream.mo60773b().close();
            throw th;
        }
    }
}
