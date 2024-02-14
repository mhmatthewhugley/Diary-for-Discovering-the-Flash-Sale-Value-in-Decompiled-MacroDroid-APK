package com.fasterxml.jackson.core.p072io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: com.fasterxml.jackson.core.io.a */
/* compiled from: BaseReader */
abstract class C6808a extends Reader {

    /* renamed from: a */
    protected final C6811d f15806a;

    /* renamed from: c */
    protected InputStream f15807c;

    /* renamed from: d */
    protected byte[] f15808d;

    /* renamed from: f */
    protected int f15809f;

    /* renamed from: g */
    protected int f15810g;

    /* renamed from: o */
    protected char[] f15811o = null;

    protected C6808a(C6811d dVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f15806a = dVar;
        this.f15807c = inputStream;
        this.f15808d = bArr;
        this.f15809f = i;
        this.f15810g = i2;
    }

    /* renamed from: b */
    public final void mo33895b() {
        byte[] bArr = this.f15808d;
        if (bArr != null) {
            this.f15808d = null;
            this.f15806a.mo33910k(bArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo33896c(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
    }

    public void close() throws IOException {
        InputStream inputStream = this.f15807c;
        if (inputStream != null) {
            this.f15807c = null;
            mo33895b();
            inputStream.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo33898e() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    public int read() throws IOException {
        if (this.f15811o == null) {
            this.f15811o = new char[1];
        }
        if (read(this.f15811o, 0, 1) < 1) {
            return -1;
        }
        return this.f15811o[0];
    }
}
