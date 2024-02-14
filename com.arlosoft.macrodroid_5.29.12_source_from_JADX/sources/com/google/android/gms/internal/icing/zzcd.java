package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
class zzcd extends zzcc {
    protected final byte[] zza;

    zzcd(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    /* renamed from: c */
    public byte mo50212c(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public byte mo50213d(int i) {
        return this.zza[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcf) || mo50214f() != ((zzcf) obj).mo50214f()) {
            return false;
        }
        if (mo50214f() == 0) {
            return true;
        }
        if (!(obj instanceof zzcd)) {
            return obj.equals(this);
        }
        zzcd zzcd = (zzcd) obj;
        int p = mo50225p();
        int p2 = zzcd.mo50225p();
        if (p != 0 && p2 != 0 && p != p2) {
            return false;
        }
        int f = mo50214f();
        if (f > zzcd.mo50214f()) {
            int f2 = mo50214f();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(f);
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        } else if (f <= zzcd.mo50214f()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzcd.zza;
            zzcd.mo50215t();
            int i = 0;
            int i2 = 0;
            while (i < f) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int f3 = zzcd.mo50214f();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(f);
            sb2.append(", ");
            sb2.append(f3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: f */
    public int mo50214f() {
        return this.zza.length;
    }

    /* renamed from: h */
    public final zzcf mo50217h(int i, int i2) {
        zzcf.m58668q(0, i2, mo50214f());
        if (i2 == 0) {
            return zzcf.f40792a;
        }
        return new zzca(this.zza, 0, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo50218i(zzbw zzbw) throws IOException {
        ((zzck) zzbw).mo50228E(this.zza, 0, mo50214f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo50219j(Charset charset) {
        return new String(this.zza, 0, mo50214f(), charset);
    }

    /* renamed from: k */
    public final boolean mo50220k() {
        return zzfr.m59099b(this.zza, 0, mo50214f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo50221l(int i, int i2, int i3) {
        return zzdh.m58823h(i, this.zza, 0, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo50215t() {
        return 0;
    }
}
