package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class zzje implements Iterable, Serializable {

    /* renamed from: a */
    public static final zzje f41539a = new zzjb(zzkn.f41637d);

    /* renamed from: c */
    private static final Comparator f41540c = new zziw();

    /* renamed from: d */
    private static final zzjd f41541d = new zzjd((zzjc) null);
    private int zzc = 0;

    static {
        int i = zziq.f41527a;
    }

    zzje() {
    }

    /* renamed from: m */
    static int m60357m(int i, int i2, int i3) {
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

    /* renamed from: p */
    public static zzje m60358p(byte[] bArr, int i, int i2) {
        m60357m(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzjb(bArr2);
    }

    /* renamed from: q */
    public static zzje m60359q(String str) {
        return new zzjb(str.getBytes(zzkn.f41635b));
    }

    /* renamed from: c */
    public abstract byte mo51334c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract byte mo51335d(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo51336f();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo51340h(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int f = mo51336f();
            i = mo51340h(f, 0, f);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract zzje mo51341i(int i, int i2);

    public final /* synthetic */ Iterator iterator() {
        return new zziv(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract String mo51342j(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract void mo51343k(zziu zziu) throws IOException;

    /* renamed from: l */
    public abstract boolean mo51344l();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo51347n() {
        return this.zzc;
    }

    /* renamed from: t */
    public final String mo51348t(Charset charset) {
        return mo51336f() == 0 ? "" : mo51342j(charset);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo51336f());
        objArr[2] = mo51336f() <= 50 ? zzmm.m60774a(this) : zzmm.m60774a(mo51341i(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
