package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzdlk {

    /* renamed from: a */
    private final zzdmp f32416a;
    @Nullable

    /* renamed from: b */
    private final zzcmp f32417b;

    public zzdlk(zzdmp zzdmp, @Nullable zzcmp zzcmp) {
        this.f32416a = zzdmp;
        this.f32417b = zzcmp;
    }

    /* renamed from: h */
    public static final zzdkg m47527h(zzfjg zzfjg) {
        return new zzdkg(zzfjg, zzchc.f28461f);
    }

    /* renamed from: i */
    public static final zzdkg m47528i(zzdmu zzdmu) {
        return new zzdkg(zzdmu, zzchc.f28461f);
    }

    @Nullable
    /* renamed from: a */
    public final View mo44696a() {
        zzcmp zzcmp = this.f32417b;
        if (zzcmp == null) {
            return null;
        }
        return zzcmp.mo44029S();
    }

    @Nullable
    /* renamed from: b */
    public final View mo44697b() {
        zzcmp zzcmp = this.f32417b;
        if (zzcmp != null) {
            return zzcmp.mo44029S();
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public final zzcmp mo44698c() {
        return this.f32417b;
    }

    /* renamed from: d */
    public final zzdkg mo44699d(Executor executor) {
        return new zzdkg(new zzdli(this.f32417b), executor);
    }

    /* renamed from: e */
    public final zzdmp mo44700e() {
        return this.f32416a;
    }

    /* renamed from: f */
    public Set mo44701f(zzdca zzdca) {
        return Collections.singleton(new zzdkg(zzdca, zzchc.f28461f));
    }

    /* renamed from: g */
    public Set mo44702g(zzdca zzdca) {
        return Collections.singleton(new zzdkg(zzdca, zzchc.f28461f));
    }
}
