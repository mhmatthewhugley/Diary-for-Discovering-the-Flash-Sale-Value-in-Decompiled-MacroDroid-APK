package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbdf extends AppOpenAd {

    /* renamed from: a */
    private final zzbdj f26652a;
    @NonNull

    /* renamed from: b */
    private final String f26653b;

    /* renamed from: c */
    private final zzbdg f26654c = new zzbdg();

    public zzbdf(zzbdj zzbdj, String str) {
        this.f26652a = zzbdj;
        this.f26653b = str;
    }

    @NonNull
    /* renamed from: a */
    public final ResponseInfo mo19777a() {
        zzdh zzdh;
        try {
            zzdh = this.f26652a.mo42506c();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            zzdh = null;
        }
        return ResponseInfo.m1739e(zzdh);
    }

    /* renamed from: c */
    public final void mo19778c(@NonNull Activity activity) {
        try {
            this.f26652a.mo42505M8(ObjectWrapper.m5051g8(activity), this.f26654c);
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }
}
