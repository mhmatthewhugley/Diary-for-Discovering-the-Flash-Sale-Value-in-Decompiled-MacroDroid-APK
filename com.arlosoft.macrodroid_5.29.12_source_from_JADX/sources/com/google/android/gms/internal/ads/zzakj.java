package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzakj {
    @Nullable

    /* renamed from: a */
    public final Object f24898a;
    @Nullable

    /* renamed from: b */
    public final zzajm f24899b;
    @Nullable

    /* renamed from: c */
    public final zzakm f24900c;

    /* renamed from: d */
    public boolean f24901d;

    private zzakj(zzakm zzakm) {
        this.f24901d = false;
        this.f24898a = null;
        this.f24899b = null;
        this.f24900c = zzakm;
    }

    private zzakj(@Nullable Object obj, @Nullable zzajm zzajm) {
        this.f24901d = false;
        this.f24898a = obj;
        this.f24899b = zzajm;
        this.f24900c = null;
    }

    /* renamed from: a */
    public static zzakj m41655a(zzakm zzakm) {
        return new zzakj(zzakm);
    }

    /* renamed from: b */
    public static zzakj m41656b(@Nullable Object obj, @Nullable zzajm zzajm) {
        return new zzakj(obj, zzajm);
    }

    /* renamed from: c */
    public final boolean mo41607c() {
        return this.f24900c == null;
    }
}
