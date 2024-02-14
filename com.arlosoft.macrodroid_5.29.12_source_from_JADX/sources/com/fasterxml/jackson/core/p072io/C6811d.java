package com.fasterxml.jackson.core.p072io;

import com.fasterxml.jackson.core.C6796a;
import com.fasterxml.jackson.core.util.C6822a;
import com.fasterxml.jackson.core.util.C6831e;

/* renamed from: com.fasterxml.jackson.core.io.d */
/* compiled from: IOContext */
public final class C6811d {

    /* renamed from: a */
    protected final Object f15821a;

    /* renamed from: b */
    protected C6796a f15822b;

    /* renamed from: c */
    protected final boolean f15823c;

    /* renamed from: d */
    protected final C6822a f15824d;

    /* renamed from: e */
    protected byte[] f15825e = null;

    /* renamed from: f */
    protected byte[] f15826f = null;

    /* renamed from: g */
    protected byte[] f15827g = null;

    /* renamed from: h */
    protected char[] f15828h = null;

    /* renamed from: i */
    protected char[] f15829i = null;

    /* renamed from: j */
    protected char[] f15830j = null;

    public C6811d(C6822a aVar, Object obj, boolean z) {
        this.f15824d = aVar;
        this.f15821a = obj;
        this.f15823c = z;
    }

    /* renamed from: a */
    public char[] mo33900a() {
        if (this.f15829i == null) {
            char[] b = this.f15824d.mo33940b(C6822a.C6824b.CONCAT_BUFFER);
            this.f15829i = b;
            return b;
        }
        throw new IllegalStateException("Trying to call allocConcatBuffer() second time");
    }

    /* renamed from: b */
    public byte[] mo33901b() {
        if (this.f15825e == null) {
            byte[] a = this.f15824d.mo33939a(C6822a.C6823a.READ_IO_BUFFER);
            this.f15825e = a;
            return a;
        }
        throw new IllegalStateException("Trying to call allocReadIOBuffer() second time");
    }

    /* renamed from: c */
    public char[] mo33902c() {
        if (this.f15828h == null) {
            char[] b = this.f15824d.mo33940b(C6822a.C6824b.TOKEN_BUFFER);
            this.f15828h = b;
            return b;
        }
        throw new IllegalStateException("Trying to call allocTokenBuffer() second time");
    }

    /* renamed from: d */
    public byte[] mo33903d() {
        if (this.f15826f == null) {
            byte[] a = this.f15824d.mo33939a(C6822a.C6823a.WRITE_ENCODING_BUFFER);
            this.f15826f = a;
            return a;
        }
        throw new IllegalStateException("Trying to call allocWriteEncodingBuffer() second time");
    }

    /* renamed from: e */
    public C6831e mo33904e() {
        return new C6831e(this.f15824d);
    }

    /* renamed from: f */
    public C6796a mo33905f() {
        return this.f15822b;
    }

    /* renamed from: g */
    public Object mo33906g() {
        return this.f15821a;
    }

    /* renamed from: h */
    public boolean mo33907h() {
        return this.f15823c;
    }

    /* renamed from: i */
    public void mo33908i(char[] cArr) {
        if (cArr == null) {
            return;
        }
        if (cArr == this.f15829i) {
            this.f15829i = null;
            this.f15824d.mo33943g(C6822a.C6824b.CONCAT_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: j */
    public void mo33909j(char[] cArr) {
        if (cArr == null) {
            return;
        }
        if (cArr == this.f15830j) {
            this.f15830j = null;
            this.f15824d.mo33943g(C6822a.C6824b.NAME_COPY_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: k */
    public void mo33910k(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (bArr == this.f15825e) {
            this.f15825e = null;
            this.f15824d.mo33942f(C6822a.C6823a.READ_IO_BUFFER, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: l */
    public void mo33911l(char[] cArr) {
        if (cArr == null) {
            return;
        }
        if (cArr == this.f15828h) {
            this.f15828h = null;
            this.f15824d.mo33943g(C6822a.C6824b.TOKEN_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: m */
    public void mo33912m(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (bArr == this.f15826f) {
            this.f15826f = null;
            this.f15824d.mo33942f(C6822a.C6823a.WRITE_ENCODING_BUFFER, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: n */
    public void mo33913n(C6796a aVar) {
        this.f15822b = aVar;
    }
}
