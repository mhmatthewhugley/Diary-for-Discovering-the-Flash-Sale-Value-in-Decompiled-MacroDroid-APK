package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public abstract class zzcf implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    public static final zzcf f40792a = new zzcd(zzdh.f40880c);

    /* renamed from: c */
    private static final Comparator<zzcf> f40793c = new zzby();

    /* renamed from: d */
    private static final zzce f40794d = new zzce((zzbx) null);
    private int zza = 0;

    static {
        int i = zzbu.f40784a;
    }

    zzcf() {
    }

    /* renamed from: m */
    public static zzcf m58667m(String str) {
        return new zzcd(str.getBytes(zzdh.f40878a));
    }

    /* renamed from: q */
    static int m58668q(int i, int i2, int i3) {
        if (((i3 - i2) | i2) >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("End index: ");
        sb.append(i2);
        sb.append(" >= ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public abstract byte mo50212c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract byte mo50213d(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo50214f();

    /* renamed from: h */
    public abstract zzcf mo50217h(int i, int i2);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int f = mo50214f();
            i = mo50221l(f, 0, f);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo50218i(zzbw zzbw) throws IOException;

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new zzbx(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract String mo50219j(Charset charset);

    /* renamed from: k */
    public abstract boolean mo50220k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo50221l(int i, int i2, int i3);

    /* renamed from: n */
    public final String mo50224n(Charset charset) {
        return mo50214f() == 0 ? "" : mo50219j(charset);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo50225p() {
        return this.zza;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo50214f());
        objArr[2] = mo50214f() <= 50 ? zzfb.m59009a(this) : String.valueOf(zzfb.m59009a(mo50217h(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
