package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbol extends zzbno {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final OnAdManagerAdViewLoadedListener f27588a;

    /* renamed from: e3 */
    public final void mo42825e3(zzbs zzbs, IObjectWrapper iObjectWrapper) {
        if (zzbs != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.m5050A1(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzbs.mo19930g() instanceof zzg) {
                    zzg zzg = (zzg) zzbs.mo19930g();
                    adManagerAdView.setAdListener(zzg != null ? zzg.mo20143Jb() : null);
                }
            } catch (RemoteException e) {
                zzcgp.m45227e("", e);
            }
            try {
                if (zzbs.mo19931h() instanceof zzbce) {
                    zzbce zzbce = (zzbce) zzbs.mo19931h();
                    if (zzbce != null) {
                        appEventListener = zzbce.mo42423Kb();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                zzcgp.m45227e("", e2);
            }
            zzcgi.f28421b.post(new zzbok(this, adManagerAdView, zzbs));
        }
    }
}
