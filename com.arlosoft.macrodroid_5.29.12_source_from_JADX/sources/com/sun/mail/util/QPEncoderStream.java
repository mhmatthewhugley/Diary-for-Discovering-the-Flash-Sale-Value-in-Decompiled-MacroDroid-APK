package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class QPEncoderStream extends FilterOutputStream {
    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private int bytesPerLine;
    private int count;
    private boolean gotCR;
    private boolean gotSpace;

    public QPEncoderStream(OutputStream outputStream, int i) {
        super(outputStream);
        this.count = 0;
        this.gotSpace = false;
        this.gotCR = false;
        this.bytesPerLine = i - 1;
    }

    private void outputCRLF() throws IOException {
        this.out.write(13);
        this.out.write(10);
        this.count = 0;
    }

    public void close() throws IOException {
        flush();
        this.out.close();
    }

    public void flush() throws IOException {
        if (this.gotSpace) {
            output(32, true);
            this.gotSpace = false;
        }
        this.out.flush();
    }

    /* access modifiers changed from: protected */
    public void output(int i, boolean z) throws IOException {
        if (z) {
            int i2 = this.count + 3;
            this.count = i2;
            if (i2 > this.bytesPerLine) {
                this.out.write(61);
                this.out.write(13);
                this.out.write(10);
                this.count = 3;
            }
            this.out.write(61);
            OutputStream outputStream = this.out;
            char[] cArr = hex;
            outputStream.write(cArr[i >> 4]);
            this.out.write(cArr[i & 15]);
            return;
        }
        int i3 = this.count + 1;
        this.count = i3;
        if (i3 > this.bytesPerLine) {
            this.out.write(61);
            this.out.write(13);
            this.out.write(10);
            this.count = 1;
        }
        this.out.write(i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            write((int) bArr[i + i3]);
        }
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) throws IOException {
        int i2 = i & 255;
        if (this.gotSpace) {
            if (i2 == 13 || i2 == 10) {
                output(32, true);
            } else {
                output(32, false);
            }
            this.gotSpace = false;
        }
        if (i2 == 13) {
            this.gotCR = true;
            outputCRLF();
            return;
        }
        if (i2 == 10) {
            if (!this.gotCR) {
                outputCRLF();
            }
        } else if (i2 == 32) {
            this.gotSpace = true;
        } else if (i2 < 32 || i2 >= 127 || i2 == 61) {
            output(i2, true);
        } else {
            output(i2, false);
        }
        this.gotCR = false;
    }

    public QPEncoderStream(OutputStream outputStream) {
        this(outputStream, 76);
    }
}
