package com.fasterxml.jackson.core.util;

/* renamed from: com.fasterxml.jackson.core.util.a */
/* compiled from: BufferRecycler */
public class C6822a {

    /* renamed from: a */
    protected final byte[][] f15867a = new byte[C6823a.values().length][];

    /* renamed from: b */
    protected final char[][] f15868b = new char[C6824b.values().length][];

    /* renamed from: com.fasterxml.jackson.core.util.a$a */
    /* compiled from: BufferRecycler */
    public enum C6823a {
        READ_IO_BUFFER(4000),
        WRITE_ENCODING_BUFFER(4000),
        WRITE_CONCAT_BUFFER(2000),
        BASE64_CODEC_BUFFER(2000);
        
        protected final int size;

        private C6823a(int i) {
            this.size = i;
        }
    }

    /* renamed from: com.fasterxml.jackson.core.util.a$b */
    /* compiled from: BufferRecycler */
    public enum C6824b {
        TOKEN_BUFFER(2000),
        CONCAT_BUFFER(2000),
        TEXT_BUFFER(200),
        NAME_COPY_BUFFER(200);
        
        protected final int size;

        private C6824b(int i) {
            this.size = i;
        }
    }

    /* renamed from: d */
    private byte[] m25635d(int i) {
        return new byte[i];
    }

    /* renamed from: e */
    private char[] m25636e(int i) {
        return new char[i];
    }

    /* renamed from: a */
    public final byte[] mo33939a(C6823a aVar) {
        int ordinal = aVar.ordinal();
        byte[][] bArr = this.f15867a;
        byte[] bArr2 = bArr[ordinal];
        if (bArr2 == null) {
            return m25635d(aVar.size);
        }
        bArr[ordinal] = null;
        return bArr2;
    }

    /* renamed from: b */
    public final char[] mo33940b(C6824b bVar) {
        return mo33941c(bVar, 0);
    }

    /* renamed from: c */
    public final char[] mo33941c(C6824b bVar, int i) {
        int i2 = bVar.size;
        if (i2 > i) {
            i = i2;
        }
        int ordinal = bVar.ordinal();
        char[][] cArr = this.f15868b;
        char[] cArr2 = cArr[ordinal];
        if (cArr2 == null || cArr2.length < i) {
            return m25636e(i);
        }
        cArr[ordinal] = null;
        return cArr2;
    }

    /* renamed from: f */
    public final void mo33942f(C6823a aVar, byte[] bArr) {
        this.f15867a[aVar.ordinal()] = bArr;
    }

    /* renamed from: g */
    public final void mo33943g(C6824b bVar, char[] cArr) {
        this.f15868b[bVar.ordinal()] = cArr;
    }
}
