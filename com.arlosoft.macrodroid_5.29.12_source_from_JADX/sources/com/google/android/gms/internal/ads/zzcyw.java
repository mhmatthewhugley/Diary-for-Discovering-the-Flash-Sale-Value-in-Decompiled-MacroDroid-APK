package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcyw {

    /* renamed from: a */
    private final zzdfp f31879a;
    @Nullable

    /* renamed from: b */
    private final zzdhv f31880b;

    public zzcyw(zzdfp zzdfp, @Nullable zzdhv zzdhv) {
        this.f31879a = zzdfp;
        this.f31880b = zzdhv;
    }

    /* renamed from: a */
    public final zzdfp mo44491a() {
        return this.f31879a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final zzdhv mo44492b() {
        return this.f31880b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzdkg mo44493c() {
        zzdhv zzdhv = this.f31880b;
        if (zzdhv != null) {
            return new zzdkg(zzdhv, zzchc.f28461f);
        }
        return new zzdkg(new zzcyv(this), zzchc.f28461f);
    }
}
