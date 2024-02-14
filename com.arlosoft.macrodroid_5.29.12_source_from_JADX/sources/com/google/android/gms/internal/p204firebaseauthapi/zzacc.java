package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzacc implements Iterable, Serializable {

    /* renamed from: a */
    public static final zzacc f39635a = new zzabz(zzadl.f39748d);

    /* renamed from: c */
    private static final Comparator f39636c = new zzabu();

    /* renamed from: d */
    private static final zzacb f39637d = new zzacb((zzaca) null);
    private int zzc = 0;

    static {
        int i = zzabo.f39623a;
    }

    zzacc() {
    }

    /* renamed from: p */
    static int m56158p(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: t */
    public static zzacc m56159t(byte[] bArr) {
        return m56160u(bArr, 0, bArr.length);
    }

    /* renamed from: u */
    public static zzacc m56160u(byte[] bArr, int i, int i2) {
        m56158p(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzabz(bArr2);
    }

    /* renamed from: w */
    public static zzacc m56161w(String str) {
        return new zzabz(str.getBytes(zzadl.f39746b));
    }

    /* renamed from: z */
    static zzacc m56162z(byte[] bArr) {
        return new zzabz(bArr);
    }

    /* renamed from: B */
    public final String mo48902B(Charset charset) {
        return mo48893f() == 0 ? "" : mo48899l(charset);
    }

    /* renamed from: D */
    public final boolean mo48903D() {
        return mo48893f() == 0;
    }

    /* renamed from: F */
    public final byte[] mo48904F() {
        int f = mo48893f();
        if (f == 0) {
            return zzadl.f39748d;
        }
        byte[] bArr = new byte[f];
        mo48894h(bArr, 0, 0, f);
        return bArr;
    }

    /* renamed from: c */
    public abstract byte mo48891c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract byte mo48892d(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo48893f();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo48894h(byte[] bArr, int i, int i2, int i3);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int f = mo48893f();
            i = mo48896i(f, 0, f);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo48896i(int i, int i2, int i3);

    public final /* synthetic */ Iterator iterator() {
        return new zzabt(this);
    }

    /* renamed from: j */
    public abstract zzacc mo48897j(int i, int i2);

    /* renamed from: k */
    public abstract zzacg mo48898k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract String mo48899l(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract void mo48900m(zzabs zzabs) throws IOException;

    /* renamed from: n */
    public abstract boolean mo48901n();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo48907q() {
        return this.zzc;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo48893f());
        objArr[2] = mo48893f() <= 50 ? zzafl.m56744a(this) : zzafl.m56744a(mo48897j(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
