package com.fasterxml.jackson.core.p072io;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.io.g */
/* compiled from: MergedStream */
public final class C6814g extends InputStream {

    /* renamed from: a */
    protected final C6811d f15836a;

    /* renamed from: c */
    final InputStream f15837c;

    /* renamed from: d */
    byte[] f15838d;

    /* renamed from: f */
    int f15839f;

    /* renamed from: g */
    final int f15840g;

    public C6814g(C6811d dVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f15836a = dVar;
        this.f15837c = inputStream;
        this.f15838d = bArr;
        this.f15839f = i;
        this.f15840g = i2;
    }

    /* renamed from: b */
    private void m25614b() {
        byte[] bArr = this.f15838d;
        if (bArr != null) {
            this.f15838d = null;
            C6811d dVar = this.f15836a;
            if (dVar != null) {
                dVar.mo33910k(bArr);
            }
        }
    }

    public int available() throws IOException {
        if (this.f15838d != null) {
            return this.f15840g - this.f15839f;
        }
        return this.f15837c.available();
    }

    public void close() throws IOException {
        m25614b();
        this.f15837c.close();
    }

    public void mark(int i) {
        if (this.f15838d == null) {
            this.f15837c.mark(i);
        }
    }

    public boolean markSupported() {
        return this.f15838d == null && this.f15837c.markSupported();
    }

    public int read() throws IOException {
        byte[] bArr = this.f15838d;
        if (bArr == null) {
            return this.f15837c.read();
        }
        int i = this.f15839f;
        int i2 = i + 1;
        this.f15839f = i2;
        byte b = bArr[i] & 255;
        if (i2 >= this.f15840g) {
            m25614b();
        }
        return b;
    }

    public void reset() throws IOException {
        if (this.f15838d == null) {
            this.f15837c.reset();
        }
    }

    public long skip(long j) throws IOException {
        long j2;
        if (this.f15838d != null) {
            int i = this.f15840g;
            int i2 = this.f15839f;
            long j3 = (long) (i - i2);
            if (j3 > j) {
                this.f15839f = i2 + ((int) j);
                return j;
            }
            m25614b();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.f15837c.skip(j) : j2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f15838d;
        if (bArr2 == null) {
            return this.f15837c.read(bArr, i, i2);
        }
        int i3 = this.f15840g;
        int i4 = this.f15839f;
        int i5 = i3 - i4;
        if (i2 > i5) {
            i2 = i5;
        }
        System.arraycopy(bArr2, i4, bArr, i, i2);
        int i6 = this.f15839f + i2;
        this.f15839f = i6;
        if (i6 >= this.f15840g) {
            m25614b();
        }
        return i2;
    }
}
