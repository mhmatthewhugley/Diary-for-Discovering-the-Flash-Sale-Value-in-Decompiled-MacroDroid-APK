package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdps implements zzbpu {

    /* renamed from: a */
    public final /* synthetic */ zzdpt f32753a;

    /* renamed from: b */
    public final /* synthetic */ zzbny f32754b;

    public /* synthetic */ zzdps(zzdpt zzdpt, zzbny zzbny) {
        this.f32753a = zzdpt;
        this.f32754b = zzbny;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzdpt zzdpt = this.f32753a;
        zzbny zzbny = this.f32754b;
        try {
            zzdpt.f32760o = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zzcgp.m45226d("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzdpt.f32759g = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzbny == null) {
            zzcgp.m45224b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbny.mo42827W(str);
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }
}
