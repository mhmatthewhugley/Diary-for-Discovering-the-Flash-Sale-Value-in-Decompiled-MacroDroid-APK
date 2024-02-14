package com.google.api.client.repackaged.org.apache.commons.codec.binary;

import com.google.api.client.repackaged.org.apache.commons.codec.BinaryDecoder;
import com.google.api.client.repackaged.org.apache.commons.codec.BinaryEncoder;

public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {

    /* renamed from: a */
    protected final byte f52667a = 61;

    /* renamed from: b */
    private final int f52668b;

    /* renamed from: c */
    private final int f52669c;

    /* renamed from: d */
    protected final int f52670d;

    /* renamed from: e */
    private final int f52671e;

    /* renamed from: f */
    protected byte[] f52672f;

    /* renamed from: g */
    protected int f52673g;

    /* renamed from: h */
    private int f52674h;

    /* renamed from: i */
    protected boolean f52675i;

    /* renamed from: j */
    protected int f52676j;

    /* renamed from: k */
    protected int f52677k;

    protected BaseNCodec(int i, int i2, int i3, int i4) {
        this.f52668b = i;
        this.f52669c = i2;
        this.f52670d = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.f52671e = i4;
    }

    /* renamed from: m */
    private void m72527m() {
        this.f52672f = null;
        this.f52673g = 0;
        this.f52674h = 0;
        this.f52676j = 0;
        this.f52677k = 0;
        this.f52675i = false;
    }

    /* renamed from: n */
    private void m72528n() {
        byte[] bArr = this.f52672f;
        if (bArr == null) {
            this.f52672f = new byte[mo60634i()];
            this.f52673g = 0;
            this.f52674h = 0;
            return;
        }
        byte[] bArr2 = new byte[(bArr.length * 2)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f52672f = bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo60628a() {
        if (this.f52672f != null) {
            return this.f52673g - this.f52674h;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo60629b(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || mo60627k(b)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo60625c(byte[] bArr, int i, int i2);

    /* renamed from: d */
    public byte[] mo60630d(String str) {
        return mo60631e(StringUtils.m72542b(str));
    }

    /* renamed from: e */
    public byte[] mo60631e(byte[] bArr) {
        m72527m();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        mo60625c(bArr, 0, bArr.length);
        mo60625c(bArr, 0, -1);
        int i = this.f52673g;
        byte[] bArr2 = new byte[i];
        mo60636l(bArr2, 0, i);
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo60626f(byte[] bArr, int i, int i2);

    /* renamed from: g */
    public byte[] mo60632g(byte[] bArr) {
        m72527m();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        mo60626f(bArr, 0, bArr.length);
        mo60626f(bArr, 0, -1);
        int i = this.f52673g - this.f52674h;
        byte[] bArr2 = new byte[i];
        mo60636l(bArr2, 0, i);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo60633h(int i) {
        byte[] bArr = this.f52672f;
        if (bArr == null || bArr.length < this.f52673g + i) {
            m72528n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo60634i() {
        return 8192;
    }

    /* renamed from: j */
    public long mo60635j(byte[] bArr) {
        int length = bArr.length;
        int i = this.f52668b;
        long j = ((long) (((length + i) - 1) / i)) * ((long) this.f52669c);
        int i2 = this.f52670d;
        return i2 > 0 ? j + ((((((long) i2) + j) - 1) / ((long) i2)) * ((long) this.f52671e)) : j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo60627k(byte b);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo60636l(byte[] bArr, int i, int i2) {
        if (this.f52672f == null) {
            return this.f52675i ? -1 : 0;
        }
        int min = Math.min(mo60628a(), i2);
        System.arraycopy(this.f52672f, this.f52674h, bArr, i, min);
        int i3 = this.f52674h + min;
        this.f52674h = i3;
        if (i3 >= this.f52673g) {
            this.f52672f = null;
        }
        return min;
    }
}
