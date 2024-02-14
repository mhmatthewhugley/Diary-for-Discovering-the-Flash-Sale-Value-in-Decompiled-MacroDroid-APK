package com.google.api.client.testing.util;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Lists;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

@Beta
public class LogRecordingHandler extends Handler {

    /* renamed from: a */
    private final List<LogRecord> f52717a = Lists.m72701a();

    public void close() throws SecurityException {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        this.f52717a.add(logRecord);
    }
}
