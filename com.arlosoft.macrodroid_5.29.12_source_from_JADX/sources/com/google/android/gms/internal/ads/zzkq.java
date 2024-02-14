package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzkq {

    /* renamed from: a */
    private final zzaa f37770a;

    /* renamed from: b */
    private final SparseArray f37771b;

    public zzkq(zzaa zzaa, SparseArray sparseArray) {
        this.f37770a = zzaa;
        SparseArray sparseArray2 = new SparseArray(zzaa.mo41189b());
        for (int i = 0; i < zzaa.mo41189b(); i++) {
            int a = zzaa.mo41188a(i);
            zzkp zzkp = (zzkp) sparseArray.get(a);
            Objects.requireNonNull(zzkp);
            sparseArray2.append(a, zzkp);
        }
        this.f37771b = sparseArray2;
    }

    /* renamed from: a */
    public final int mo47832a(int i) {
        return this.f37770a.mo41188a(i);
    }

    /* renamed from: b */
    public final int mo47833b() {
        return this.f37770a.mo41189b();
    }

    /* renamed from: c */
    public final zzkp mo47834c(int i) {
        zzkp zzkp = (zzkp) this.f37771b.get(i);
        Objects.requireNonNull(zzkp);
        return zzkp;
    }

    /* renamed from: d */
    public final boolean mo47835d(int i) {
        return this.f37770a.mo41190c(i);
    }
}
