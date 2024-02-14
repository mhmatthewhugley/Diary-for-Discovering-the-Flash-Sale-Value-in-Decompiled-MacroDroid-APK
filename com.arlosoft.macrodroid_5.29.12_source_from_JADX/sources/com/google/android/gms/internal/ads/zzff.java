package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzff implements zzew {

    /* renamed from: a */
    private final zzft f35671a = new zzft();
    @Nullable

    /* renamed from: b */
    private zzfz f35672b;
    @Nullable

    /* renamed from: c */
    private String f35673c;

    /* renamed from: d */
    private int f35674d = 8000;

    /* renamed from: e */
    private int f35675e = 8000;

    /* renamed from: f */
    private boolean f35676f;

    /* renamed from: a */
    public final zzff mo45636a(boolean z) {
        this.f35676f = true;
        return this;
    }

    /* renamed from: b */
    public final zzff mo45637b(int i) {
        this.f35674d = i;
        return this;
    }

    /* renamed from: c */
    public final zzff mo45638c(int i) {
        this.f35675e = i;
        return this;
    }

    /* renamed from: d */
    public final zzff mo45639d(@Nullable zzfz zzfz) {
        this.f35672b = zzfz;
        return this;
    }

    /* renamed from: e */
    public final zzff mo45640e(@Nullable String str) {
        this.f35673c = str;
        return this;
    }

    /* renamed from: f */
    public final zzfk zza() {
        zzfk zzfk = new zzfk(this.f35673c, this.f35674d, this.f35675e, this.f35676f, this.f35671a, (zzfsy) null, false, (zzfj) null);
        zzfz zzfz = this.f35672b;
        if (zzfz != null) {
            zzfk.mo43952k(zzfz);
        }
        return zzfk;
    }
}
