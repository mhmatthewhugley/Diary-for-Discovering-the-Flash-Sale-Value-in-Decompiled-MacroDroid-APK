package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;

public class LogOutputStream extends OutputStream {
    private byte[] buf = new byte[80];
    private int lastb = -1;
    protected Level level;
    protected MailLogger logger;
    private int pos = 0;

    public LogOutputStream(MailLogger mailLogger) {
        this.logger = mailLogger;
        this.level = Level.FINEST;
    }

    private void expandCapacity(int i) {
        while (true) {
            int i2 = this.pos;
            int i3 = i2 + i;
            byte[] bArr = this.buf;
            if (i3 > bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                this.buf = bArr2;
            } else {
                return;
            }
        }
    }

    private void logBuf() {
        String str = new String(this.buf, 0, this.pos);
        this.pos = 0;
        log(str);
    }

    /* access modifiers changed from: protected */
    public void log(String str) {
        this.logger.log(this.level, str);
    }

    public void write(int i) throws IOException {
        if (this.logger.isLoggable(this.level)) {
            if (i == 13) {
                logBuf();
            } else if (i != 10) {
                expandCapacity(1);
                byte[] bArr = this.buf;
                int i2 = this.pos;
                this.pos = i2 + 1;
                bArr[i2] = (byte) i;
            } else if (this.lastb != 13) {
                logBuf();
            }
            this.lastb = i;
        }
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.logger.isLoggable(this.level)) {
            int i3 = i2 + i;
            int i4 = i;
            while (i < i3) {
                if (bArr[i] == 13) {
                    int i5 = i - i4;
                    expandCapacity(i5);
                    System.arraycopy(bArr, i4, this.buf, this.pos, i5);
                    this.pos += i5;
                    logBuf();
                } else if (bArr[i] != 10) {
                    this.lastb = bArr[i];
                    i++;
                } else if (this.lastb != 13) {
                    int i6 = i - i4;
                    expandCapacity(i6);
                    System.arraycopy(bArr, i4, this.buf, this.pos, i6);
                    this.pos += i6;
                    logBuf();
                }
                i4 = i + 1;
                this.lastb = bArr[i];
                i++;
            }
            int i7 = i3 - i4;
            if (i7 > 0) {
                expandCapacity(i7);
                System.arraycopy(bArr, i4, this.buf, this.pos, i7);
                this.pos += i7;
            }
        }
    }
}
