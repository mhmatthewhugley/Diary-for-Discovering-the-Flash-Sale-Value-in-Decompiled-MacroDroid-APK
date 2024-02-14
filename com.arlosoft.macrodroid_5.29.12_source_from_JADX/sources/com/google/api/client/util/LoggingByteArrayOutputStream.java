package com.google.api.client.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingByteArrayOutputStream extends ByteArrayOutputStream {

    /* renamed from: a */
    private int f52813a;

    /* renamed from: c */
    private final int f52814c;

    /* renamed from: d */
    private boolean f52815d;

    /* renamed from: f */
    private final Level f52816f;

    /* renamed from: g */
    private final Logger f52817g;

    public LoggingByteArrayOutputStream(Logger logger, Level level, int i) {
        this.f52817g = (Logger) Preconditions.m72716d(logger);
        this.f52816f = (Level) Preconditions.m72716d(level);
        Preconditions.m72713a(i >= 0);
        this.f52814c = i;
    }

    /* renamed from: b */
    private static void m72702b(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format((long) i));
        sb.append(" bytes");
    }

    public synchronized void close() throws IOException {
        if (!this.f52815d) {
            if (this.f52813a != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Total: ");
                m72702b(sb, this.f52813a);
                int i = this.count;
                if (i != 0 && i < this.f52813a) {
                    sb.append(" (logging first ");
                    m72702b(sb, this.count);
                    sb.append(")");
                }
                this.f52817g.config(sb.toString());
                if (this.count != 0) {
                    this.f52817g.log(this.f52816f, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.f52815d = true;
        }
    }

    public synchronized void write(int i) {
        Preconditions.m72713a(!this.f52815d);
        this.f52813a++;
        if (this.count < this.f52814c) {
            super.write(i);
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        Preconditions.m72713a(!this.f52815d);
        this.f52813a += i2;
        int i3 = this.count;
        int i4 = this.f52814c;
        if (i3 < i4) {
            int i5 = i3 + i2;
            if (i5 > i4) {
                i2 += i4 - i5;
            }
            super.write(bArr, i, i2);
        }
    }
}
