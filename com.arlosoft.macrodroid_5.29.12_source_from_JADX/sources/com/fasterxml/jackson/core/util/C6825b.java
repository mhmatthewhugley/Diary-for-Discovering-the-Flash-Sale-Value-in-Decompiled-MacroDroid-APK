package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.C6822a;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.fasterxml.jackson.core.util.b */
/* compiled from: ByteArrayBuilder */
public final class C6825b extends OutputStream {

    /* renamed from: o */
    private static final byte[] f15879o = new byte[0];

    /* renamed from: a */
    private final C6822a f15880a;

    /* renamed from: c */
    private final LinkedList<byte[]> f15881c;

    /* renamed from: d */
    private int f15882d;

    /* renamed from: f */
    private byte[] f15883f;

    /* renamed from: g */
    private int f15884g;

    public C6825b(C6822a aVar) {
        this(aVar, 500);
    }

    /* renamed from: b */
    private void m25642b() {
        int length = this.f15882d + this.f15883f.length;
        this.f15882d = length;
        int max = Math.max(length >> 1, 1000);
        if (max > 262144) {
            max = 262144;
        }
        this.f15881c.add(this.f15883f);
        this.f15883f = new byte[max];
        this.f15884g = 0;
    }

    /* renamed from: c */
    public void mo33944c(int i) {
        if (this.f15884g >= this.f15883f.length) {
            m25642b();
        }
        byte[] bArr = this.f15883f;
        int i2 = this.f15884g;
        this.f15884g = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void close() {
    }

    /* renamed from: e */
    public byte[] mo33946e(int i) {
        this.f15884g = i;
        return mo33951i();
    }

    /* renamed from: f */
    public byte[] mo33947f() {
        m25642b();
        return this.f15883f;
    }

    public void flush() {
    }

    /* renamed from: g */
    public void mo33949g() {
        this.f15882d = 0;
        this.f15884g = 0;
        if (!this.f15881c.isEmpty()) {
            this.f15881c.clear();
        }
    }

    /* renamed from: h */
    public byte[] mo33950h() {
        mo33949g();
        return this.f15883f;
    }

    /* renamed from: i */
    public byte[] mo33951i() {
        int i = this.f15882d + this.f15884g;
        if (i == 0) {
            return f15879o;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.f15881c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f15883f, 0, bArr, i2, this.f15884g);
        int i3 = i2 + this.f15884g;
        if (i3 == i) {
            if (!this.f15881c.isEmpty()) {
                mo33949g();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public C6825b(C6822a aVar, int i) {
        this.f15881c = new LinkedList<>();
        this.f15880a = aVar;
        if (aVar == null) {
            this.f15883f = new byte[i];
        } else {
            this.f15883f = aVar.mo33939a(C6822a.C6823a.WRITE_CONCAT_BUFFER);
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.f15883f.length - this.f15884g, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f15883f, this.f15884g, min);
                i += min;
                this.f15884g += min;
                i2 -= min;
            }
            if (i2 > 0) {
                m25642b();
            } else {
                return;
            }
        }
    }

    public void write(int i) {
        mo33944c(i);
    }
}
