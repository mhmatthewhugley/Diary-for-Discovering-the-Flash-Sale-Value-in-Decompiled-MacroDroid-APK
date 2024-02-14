package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class UUEncoderStream extends FilterOutputStream {
    private byte[] buffer;
    private int bufsize;
    private int mode;
    private String name;
    private boolean wrotePrefix;
    private boolean wroteSuffix;

    public UUEncoderStream(OutputStream outputStream) {
        this(outputStream, "encoder.buf", 420);
    }

    private void encode() throws IOException {
        byte b;
        int i;
        this.out.write((this.bufsize & 63) + 32);
        int i2 = 0;
        while (true) {
            int i3 = this.bufsize;
            if (i2 < i3) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                byte b3 = 1;
                if (i4 < i3) {
                    int i5 = i4 + 1;
                    byte b4 = bArr[i4];
                    if (i5 < i3) {
                        i = i5 + 1;
                        b = bArr[i5];
                        b3 = b4;
                        int i6 = ((b2 << 4) & 48) | ((b3 >>> 4) & 15);
                        this.out.write(((b2 >>> 2) & 63) + 32);
                        this.out.write(i6 + 32);
                        this.out.write((((b3 << 2) & 60) | ((b >>> 6) & 3)) + 32);
                        this.out.write((b & 63) + 32);
                        i2 = i;
                    } else {
                        b3 = b4;
                        i = i5;
                    }
                } else {
                    i = i4;
                }
                b = 1;
                int i62 = ((b2 << 4) & 48) | ((b3 >>> 4) & 15);
                this.out.write(((b2 >>> 2) & 63) + 32);
                this.out.write(i62 + 32);
                this.out.write((((b3 << 2) & 60) | ((b >>> 6) & 3)) + 32);
                this.out.write((b & 63) + 32);
                i2 = i;
            } else {
                this.out.write(10);
                return;
            }
        }
    }

    private void writePrefix() throws IOException {
        if (!this.wrotePrefix) {
            PrintStream printStream = new PrintStream(this.out, false, "utf-8");
            printStream.format("begin %o %s%n", new Object[]{Integer.valueOf(this.mode), this.name});
            printStream.flush();
            this.wrotePrefix = true;
        }
    }

    private void writeSuffix() throws IOException {
        if (!this.wroteSuffix) {
            PrintStream printStream = new PrintStream(this.out, false, "us-ascii");
            printStream.println(" \nend");
            printStream.flush();
            this.wroteSuffix = true;
        }
    }

    public void close() throws IOException {
        flush();
        this.out.close();
    }

    public void flush() throws IOException {
        if (this.bufsize > 0) {
            writePrefix();
            encode();
            this.bufsize = 0;
        }
        writeSuffix();
        this.out.flush();
    }

    public void setNameMode(String str, int i) {
        this.name = str;
        this.mode = i;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            write((int) bArr[i + i3]);
        }
    }

    public UUEncoderStream(OutputStream outputStream, String str) {
        this(outputStream, str, 420);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public UUEncoderStream(OutputStream outputStream, String str, int i) {
        super(outputStream);
        this.bufsize = 0;
        this.wrotePrefix = false;
        this.wroteSuffix = false;
        this.name = str;
        this.mode = i;
        this.buffer = new byte[45];
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.buffer;
        int i2 = this.bufsize;
        int i3 = i2 + 1;
        this.bufsize = i3;
        bArr[i2] = (byte) i;
        if (i3 == 45) {
            writePrefix();
            encode();
            this.bufsize = 0;
        }
    }
}
