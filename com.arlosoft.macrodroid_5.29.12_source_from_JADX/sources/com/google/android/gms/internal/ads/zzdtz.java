package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdtz implements zzbqk {

    /* renamed from: a */
    private final zzdeh f33117a;
    @Nullable

    /* renamed from: c */
    private final zzcce f33118c;

    /* renamed from: d */
    private final String f33119d;

    /* renamed from: f */
    private final String f33120f;

    public zzdtz(zzdeh zzdeh, zzfdk zzfdk) {
        this.f33117a = zzdeh;
        this.f33118c = zzfdk.f35543m;
        this.f33119d = zzfdk.f35539k;
        this.f33120f = zzfdk.f35541l;
    }

    /* renamed from: a */
    public final void mo42889a() {
        this.f33117a.mo44591c();
    }

    /* renamed from: x */
    public final void mo42890x(zzcce zzcce) {
        int i;
        String str;
        zzcce zzcce2 = this.f33118c;
        if (zzcce2 != null) {
            zzcce = zzcce2;
        }
        if (zzcce != null) {
            str = zzcce.f28207a;
            i = zzcce.f28208c;
        } else {
            i = 1;
            str = "";
        }
        this.f33117a.mo44588M0(new zzcbp(str, i), this.f33119d, this.f33120f);
    }

    public final void zzb() {
        this.f33117a.mo44590b();
    }
}
