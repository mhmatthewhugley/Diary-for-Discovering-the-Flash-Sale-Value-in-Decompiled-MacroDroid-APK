package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgmk extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgmk zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgrn zzf = zzgre.m52995v();

    static {
        zzgmk zzgmk = new zzgmk();
        zzb = zzgmk;
        zzgre.m52983A(zzgmk.class, zzgmk);
    }

    private zzgmk() {
    }

    /* renamed from: H */
    public static zzgmh m52335H() {
        return (zzgmh) zzb.mo47345C();
    }

    /* renamed from: J */
    public static zzgmk m52337J(InputStream inputStream, zzgqq zzgqq) throws IOException {
        return (zzgmk) zzgre.m52990l(zzb, inputStream, zzgqq);
    }

    /* renamed from: K */
    public static zzgmk m52338K(byte[] bArr, zzgqq zzgqq) throws zzgrq {
        return (zzgmk) zzgre.m52991m(zzb, bArr, zzgqq);
    }

    /* renamed from: N */
    static /* synthetic */ void m52340N(zzgmk zzgmk, zzgmj zzgmj) {
        zzgmj.getClass();
        zzgrn zzgrn = zzgmk.zzf;
        if (!zzgrn.mo47052a()) {
            zzgmk.zzf = zzgre.m52996w(zzgrn);
        }
        zzgmk.zzf.add(zzgmj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgmj.class});
        } else if (i2 == 3) {
            return new zzgmk();
        } else {
            if (i2 == 4) {
                return new zzgmh((zzgmg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo46997F() {
        return this.zzf.size();
    }

    /* renamed from: G */
    public final int mo46998G() {
        return this.zze;
    }

    /* renamed from: L */
    public final List mo46999L() {
        return this.zzf;
    }
}
