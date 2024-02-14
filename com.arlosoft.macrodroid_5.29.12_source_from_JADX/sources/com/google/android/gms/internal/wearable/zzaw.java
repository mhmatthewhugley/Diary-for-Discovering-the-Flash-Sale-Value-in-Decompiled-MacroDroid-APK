package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class zzaw implements Iterable, Serializable {

    /* renamed from: a */
    public static final zzaw f45541a = new zzat(zzcd.f45637d);

    /* renamed from: c */
    private static final Comparator f45542c = new zzao();

    /* renamed from: d */
    private static final zzav f45543d = new zzav((zzau) null);
    private int zzc = 0;

    static {
        int i = zzai.f45533a;
    }

    zzaw() {
    }

    /* renamed from: m */
    static int m64052m(int i, int i2, int i3) {
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
    public static zzaw m64053p(byte[] bArr) {
        return m64054q(bArr, 0, bArr.length);
    }

    /* renamed from: q */
    public static zzaw m64054q(byte[] bArr, int i, int i2) {
        m64052m(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzat(bArr2);
    }

    /* renamed from: t */
    public static zzaw m64055t(String str) {
        return new zzat(str.getBytes(zzcd.f45635b));
    }

    /* renamed from: c */
    public abstract byte mo53829c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract byte mo53830d(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo53831f();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo53834h(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int f = mo53831f();
            i = mo53834h(f, 0, f);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract zzaw mo53835i(int i, int i2);

    public final /* synthetic */ Iterator iterator() {
        return new zzan(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract String mo53836j(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract void mo53837k(zzam zzam) throws IOException;

    /* renamed from: l */
    public abstract boolean mo53838l();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo53841n() {
        return this.zzc;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo53831f());
        objArr[2] = mo53831f() <= 50 ? zzec.m64426a(this) : zzec.m64426a(mo53835i(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public final String mo53843u(Charset charset) {
        return mo53831f() == 0 ? "" : mo53836j(charset);
    }
}
