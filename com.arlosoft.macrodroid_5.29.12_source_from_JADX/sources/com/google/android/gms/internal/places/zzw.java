package com.google.android.gms.internal.places;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzw implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    public static final zzw f45474a = new zzag(zzbd.f45278c);

    /* renamed from: c */
    private static final zzac f45475c = (zzp.m63835b() ? new zzaf((zzv) null) : new zzaa((zzv) null));

    /* renamed from: d */
    private static final Comparator<zzw> f45476d = new zzy();
    private int zzei = 0;

    zzw() {
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m63864h(byte b) {
        return b & 255;
    }

    /* renamed from: n */
    static int m63866n(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: p */
    public static zzw m63867p(byte[] bArr, int i, int i2) {
        m63866n(i, i + i2, bArr.length);
        return new zzag(f45475c.mo53304a(bArr, i, i2));
    }

    /* renamed from: t */
    public static zzw m63868t(String str) {
        return new zzag(str.getBytes(zzbd.f45276a));
    }

    /* renamed from: w */
    static zzae m63869w(int i) {
        return new zzae(i, (zzv) null);
    }

    /* renamed from: c */
    public final String mo53671c() {
        return size() == 0 ? "" : mo53314k(zzbd.f45276a);
    }

    /* renamed from: d */
    public abstract boolean mo53310d();

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo53672f() {
        return this.zzei;
    }

    public final int hashCode() {
        int i = this.zzei;
        if (i == 0) {
            int size = size();
            i = mo53312i(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzei = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo53312i(int i, int i2, int i3);

    public /* synthetic */ Iterator iterator() {
        return new zzv(this);
    }

    /* renamed from: j */
    public abstract zzw mo53313j(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo53314k(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract void mo53315l(zzt zzt) throws IOException;

    /* renamed from: q */
    public abstract byte mo53316q(int i);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public abstract byte mo53318u(int i);
}
