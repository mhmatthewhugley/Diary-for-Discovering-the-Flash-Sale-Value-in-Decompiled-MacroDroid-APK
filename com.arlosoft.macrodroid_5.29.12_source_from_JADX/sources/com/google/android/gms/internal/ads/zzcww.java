package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcww extends zzbdi {

    /* renamed from: a */
    private final zzcwv f31755a;

    /* renamed from: c */
    private final zzbs f31756c;

    /* renamed from: d */
    private final zzezg f31757d;

    /* renamed from: f */
    private boolean f31758f = false;

    public zzcww(zzcwv zzcwv, zzbs zzbs, zzezg zzezg) {
        this.f31755a = zzcwv;
        this.f31756c = zzbs;
        this.f31757d = zzezg;
    }

    /* renamed from: I4 */
    public final void mo42507I4(zzde zzde) {
        Preconditions.m4483f("setOnPaidEventListener must be called on the main UI thread.");
        zzezg zzezg = this.f31757d;
        if (zzezg != null) {
            zzezg.mo45529q(zzde);
        }
    }

    /* renamed from: L8 */
    public final void mo42508L8(zzbdn zzbdn) {
    }

    /* renamed from: M8 */
    public final void mo42505M8(IObjectWrapper iObjectWrapper, zzbdq zzbdq) {
        try {
            this.f31757d.mo45531x(zzbdq);
            this.f31755a.mo44442j((Activity) ObjectWrapper.m5050A1(iObjectWrapper), zzbdq, this.f31758f);
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final zzbs mo42509b() {
        return this.f31756c;
    }

    @Nullable
    /* renamed from: c */
    public final zzdh mo42506c() {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26972Q5)).booleanValue()) {
            return null;
        }
        return this.f31755a.mo44496c();
    }

    /* renamed from: o6 */
    public final void mo42510o6(boolean z) {
        this.f31758f = z;
    }
}
