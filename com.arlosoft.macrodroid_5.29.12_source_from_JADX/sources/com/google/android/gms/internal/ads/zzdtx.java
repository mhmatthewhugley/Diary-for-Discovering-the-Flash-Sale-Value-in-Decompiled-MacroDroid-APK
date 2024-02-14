package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdn;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdtx extends VideoController.VideoLifecycleCallbacks {

    /* renamed from: a */
    private final zzdoq f33115a;

    public zzdtx(zzdoq zzdoq) {
        this.f33115a = zzdoq;
    }

    @Nullable
    /* renamed from: f */
    private static zzdn m48176f(zzdoq zzdoq) {
        zzdk R = zzdoq.mo44805R();
        if (R == null) {
            return null;
        }
        try {
            return R.mo20002g();
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo19755a() {
        zzdn f = m48176f(this.f33115a);
        if (f != null) {
            try {
                f.mo20012b();
            } catch (RemoteException e) {
                zzcgp.m45230h("Unable to call onVideoEnd()", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo19757c() {
        zzdn f = m48176f(this.f33115a);
        if (f != null) {
            try {
                f.mo20014f();
            } catch (RemoteException e) {
                zzcgp.m45230h("Unable to call onVideoEnd()", e);
            }
        }
    }

    /* renamed from: e */
    public final void mo19759e() {
        zzdn f = m48176f(this.f33115a);
        if (f != null) {
            try {
                f.mo20015g();
            } catch (RemoteException e) {
                zzcgp.m45230h("Unable to call onVideoEnd()", e);
            }
        }
    }
}
