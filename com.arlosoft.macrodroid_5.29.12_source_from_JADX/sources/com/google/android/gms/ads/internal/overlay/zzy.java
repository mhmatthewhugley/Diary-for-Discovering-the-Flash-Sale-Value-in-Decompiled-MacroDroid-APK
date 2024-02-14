package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzdkn;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzy extends zzbzb {

    /* renamed from: a */
    private final AdOverlayInfoParcel f2136a;

    /* renamed from: c */
    private final Activity f2137c;

    /* renamed from: d */
    private boolean f2138d = false;

    /* renamed from: f */
    private boolean f2139f = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f2136a = adOverlayInfoParcel;
        this.f2137c = activity;
    }

    private final synchronized void zzb() {
        if (!this.f2139f) {
            zzo zzo = this.f2136a.f2070d;
            if (zzo != null) {
                zzo.mo20220y(4);
            }
            this.f2139f = true;
        }
    }

    /* renamed from: P */
    public final boolean mo20189P() throws RemoteException {
        return false;
    }

    /* renamed from: T0 */
    public final void mo20193T0(@Nullable Bundle bundle) {
        zzo zzo;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26834C7)).booleanValue()) {
            this.f2137c.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2136a;
        if (adOverlayInfoParcel == null) {
            this.f2137c.finish();
        } else if (z) {
            this.f2137c.finish();
        } else {
            if (bundle == null) {
                zza zza = adOverlayInfoParcel.f2069c;
                if (zza != null) {
                    zza.onAdClicked();
                }
                zzdkn zzdkn = this.f2136a.f2067P;
                if (zzdkn != null) {
                    zzdkn.mo44113s();
                }
                if (!(this.f2137c.getIntent() == null || !this.f2137c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (zzo = this.f2136a.f2070d) == null)) {
                    zzo.zzb();
                }
            }
            zzt.m2897j();
            Activity activity = this.f2137c;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2136a;
            zzc zzc = adOverlayInfoParcel2.f2068a;
            if (!zza.m2430b(activity, zzc, adOverlayInfoParcel2.f2076z, zzc.f2086z)) {
                this.f2137c.finish();
            }
        }
    }

    /* renamed from: V8 */
    public final void mo20194V8(int i, int i2, Intent intent) throws RemoteException {
    }

    /* renamed from: e */
    public final void mo20199e() throws RemoteException {
    }

    /* renamed from: i0 */
    public final void mo20200i0(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    /* renamed from: j */
    public final void mo20201j() throws RemoteException {
        if (this.f2137c.isFinishing()) {
            zzb();
        }
    }

    /* renamed from: k0 */
    public final void mo20204k0(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2138d);
    }

    /* renamed from: l */
    public final void mo20205l() throws RemoteException {
    }

    /* renamed from: m */
    public final void mo20206m() throws RemoteException {
        if (this.f2138d) {
            this.f2137c.finish();
            return;
        }
        this.f2138d = true;
        zzo zzo = this.f2136a.f2070d;
        if (zzo != null) {
            zzo.mo20219t1();
        }
    }

    /* renamed from: n */
    public final void mo20207n() throws RemoteException {
        zzo zzo = this.f2136a.f2070d;
        if (zzo != null) {
            zzo.mo20216Z8();
        }
        if (this.f2137c.isFinishing()) {
            zzb();
        }
    }

    /* renamed from: p */
    public final void mo20208p() throws RemoteException {
        if (this.f2137c.isFinishing()) {
            zzb();
        }
    }

    /* renamed from: q */
    public final void mo20210q() throws RemoteException {
    }

    /* renamed from: r */
    public final void mo20211r() throws RemoteException {
        zzo zzo = this.f2136a.f2070d;
        if (zzo != null) {
            zzo.mo20217b();
        }
    }

    /* renamed from: w */
    public final void mo20212w() throws RemoteException {
    }
}
