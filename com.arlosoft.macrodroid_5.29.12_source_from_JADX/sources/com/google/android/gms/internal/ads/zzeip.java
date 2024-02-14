package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzeip implements zzdmp {

    /* renamed from: a */
    public final /* synthetic */ zzchh f34119a;

    public /* synthetic */ zzeip(zzchh zzchh) {
        this.f34119a = zzchh;
    }

    /* renamed from: a */
    public final void mo44707a(boolean z, Context context, zzddn zzddn) {
        zzchh zzchh = this.f34119a;
        try {
            zzt.m2898k();
            zzm.m2466a(context, (AdOverlayInfoParcel) zzchh.get(), true);
        } catch (Exception unused) {
        }
    }
}
