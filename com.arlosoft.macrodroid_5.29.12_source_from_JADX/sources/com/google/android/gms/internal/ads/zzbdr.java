package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbdr {

    /* renamed from: a */
    private zzbs f26656a;

    /* renamed from: b */
    private final Context f26657b;

    /* renamed from: c */
    private final String f26658c;

    /* renamed from: d */
    private final zzdr f26659d;
    @AppOpenAd.AppOpenAdOrientation

    /* renamed from: e */
    private final int f26660e;

    /* renamed from: f */
    private final AppOpenAd.AppOpenAdLoadCallback f26661f;

    /* renamed from: g */
    private final zzbvh f26662g = new zzbvh();

    /* renamed from: h */
    private final zzp f26663h;

    public zzbdr(Context context, String str, zzdr zzdr, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f26657b = context;
        this.f26658c = str;
        this.f26659d = zzdr;
        this.f26660e = i;
        this.f26661f = appOpenAdLoadCallback;
        this.f26663h = zzp.f2018a;
    }

    /* renamed from: a */
    public final void mo42512a() {
        try {
            this.f26656a = zzaw.m1916a().mo19876d(this.f26657b, zzq.m2418m2(), this.f26658c, this.f26662g);
            zzw zzw = new zzw(this.f26660e);
            zzbs zzbs = this.f26656a;
            if (zzbs != null) {
                zzbs.mo19925M4(zzw);
                this.f26656a.mo19941q9(new zzbde(this.f26661f, this.f26658c));
                this.f26656a.mo19932h6(this.f26663h.mo20160a(this.f26657b, this.f26659d));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }
}
