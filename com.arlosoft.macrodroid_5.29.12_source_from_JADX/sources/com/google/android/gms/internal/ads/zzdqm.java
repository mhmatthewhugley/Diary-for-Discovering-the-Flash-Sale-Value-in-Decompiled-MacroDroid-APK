package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdqm implements zzddu {

    /* renamed from: a */
    private final zzdoq f32800a;

    /* renamed from: c */
    private final zzdov f32801c;

    public zzdqm(zzdoq zzdoq, zzdov zzdov) {
        this.f32800a = zzdoq;
        this.f32801c = zzdov;
    }

    /* renamed from: j */
    public final void mo44390j() {
        zzdoq zzdoq = this.f32800a;
        if (zzdoq.mo44818c0() != null) {
            zzcmp Y = zzdoq.mo44812Y();
            zzcmp Z = zzdoq.mo44813Z();
            if (Y == null) {
                Y = Z == null ? null : Z;
            }
            if (this.f32801c.mo44850d() && Y != null) {
                Y.mo42954y("onSdkImpression", new ArrayMap());
            }
        }
    }
}
