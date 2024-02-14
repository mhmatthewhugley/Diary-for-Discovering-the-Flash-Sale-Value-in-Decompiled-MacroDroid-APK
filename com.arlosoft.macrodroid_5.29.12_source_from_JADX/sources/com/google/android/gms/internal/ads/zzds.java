package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzds {

    /* renamed from: a */
    public final Object f32938a;

    /* renamed from: b */
    private zzy f32939b = new zzy();

    /* renamed from: c */
    private boolean f32940c;

    /* renamed from: d */
    private boolean f32941d;

    public zzds(Object obj) {
        this.f32938a = obj;
    }

    /* renamed from: a */
    public final void mo44946a(int i, zzdq zzdq) {
        if (!this.f32941d) {
            if (i != -1) {
                this.f32939b.mo48419a(i);
            }
            this.f32940c = true;
            zzdq.mo44909a(this.f32938a);
        }
    }

    /* renamed from: b */
    public final void mo44947b(zzdr zzdr) {
        if (!this.f32941d && this.f32940c) {
            zzaa b = this.f32939b.mo48420b();
            this.f32939b = new zzy();
            this.f32940c = false;
            zzdr.mo44930a(this.f32938a, b);
        }
    }

    /* renamed from: c */
    public final void mo44948c(zzdr zzdr) {
        this.f32941d = true;
        if (this.f32940c) {
            zzdr.mo44930a(this.f32938a, this.f32939b.mo48420b());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzds.class != obj.getClass()) {
            return false;
        }
        return this.f32938a.equals(((zzds) obj).f32938a);
    }

    public final int hashCode() {
        return this.f32938a.hashCode();
    }
}
