package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzelo implements zzdmp {

    /* renamed from: a */
    public final /* synthetic */ zzehf f34400a;

    public /* synthetic */ zzelo(zzehf zzehf) {
        this.f34400a = zzehf;
    }

    /* renamed from: a */
    public final void mo44707a(boolean z, Context context, zzddn zzddn) {
        zzehf zzehf = this.f34400a;
        try {
            ((zzffa) zzehf.f34016b).mo45668x(z);
            ((zzffa) zzehf.f34016b).mo45643B();
        } catch (zzfek e) {
            zzcgp.m45230h("Cannot show rewarded video.", e);
            throw new zzdmo(e.getCause());
        }
    }
}
