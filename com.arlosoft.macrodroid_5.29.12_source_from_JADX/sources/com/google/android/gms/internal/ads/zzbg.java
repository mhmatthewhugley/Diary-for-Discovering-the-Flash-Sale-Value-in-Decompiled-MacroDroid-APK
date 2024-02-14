package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbg {

    /* renamed from: i */
    public static final zzbg f26756i = new zzaj().mo41525c();

    /* renamed from: j */
    public static final zzn f26757j = zzah.f24510a;

    /* renamed from: a */
    public final String f26758a;
    @Nullable

    /* renamed from: b */
    public final zzay f26759b;
    @Deprecated
    @Nullable

    /* renamed from: c */
    public final zzba f26760c;

    /* renamed from: d */
    public final zzaw f26761d;

    /* renamed from: e */
    public final zzbm f26762e;

    /* renamed from: f */
    public final zzan f26763f;
    @Deprecated

    /* renamed from: g */
    public final zzap f26764g;

    /* renamed from: h */
    public final zzbd f26765h;

    /* synthetic */ zzbg(String str, zzap zzap, zzba zzba, zzaw zzaw, zzbm zzbm, zzbd zzbd, zzbf zzbf) {
        this.f26758a = str;
        this.f26759b = zzba;
        this.f26760c = zzba;
        this.f26761d = zzaw;
        this.f26762e = zzbm;
        this.f26763f = zzap;
        this.f26764g = zzap;
        this.f26765h = zzbd;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbg)) {
            return false;
        }
        zzbg zzbg = (zzbg) obj;
        return zzen.m49181t(this.f26758a, zzbg.f26758a) && this.f26763f.equals(zzbg.f26763f) && zzen.m49181t(this.f26759b, zzbg.f26759b) && zzen.m49181t(this.f26761d, zzbg.f26761d) && zzen.m49181t(this.f26762e, zzbg.f26762e) && zzen.m49181t(this.f26765h, zzbg.f26765h);
    }

    public final int hashCode() {
        int hashCode = this.f26758a.hashCode() * 31;
        zzay zzay = this.f26759b;
        return (((((((hashCode + (zzay != null ? zzay.hashCode() : 0)) * 31) + this.f26761d.hashCode()) * 31) + this.f26763f.hashCode()) * 31) + this.f26762e.hashCode()) * 31;
    }
}
