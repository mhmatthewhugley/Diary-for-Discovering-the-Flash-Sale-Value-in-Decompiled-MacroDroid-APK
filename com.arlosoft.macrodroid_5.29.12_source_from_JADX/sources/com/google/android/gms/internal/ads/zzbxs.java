package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbxs implements zzo {

    /* renamed from: a */
    final /* synthetic */ zzbxu f27930a;

    zzbxs(zzbxu zzbxu) {
        this.f27930a = zzbxu;
    }

    /* renamed from: Z8 */
    public final void mo20216Z8() {
        zzcgp.m45224b("AdMobCustomTabsAdapter overlay is paused.");
    }

    /* renamed from: b */
    public final void mo20217b() {
    }

    /* renamed from: sb */
    public final void mo20218sb() {
        zzcgp.m45224b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    /* renamed from: t1 */
    public final void mo20219t1() {
        zzcgp.m45224b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    /* renamed from: y */
    public final void mo20220y(int i) {
        zzcgp.m45224b("AdMobCustomTabsAdapter overlay is closed.");
        zzbxu zzbxu = this.f27930a;
        zzbxu.f27934b.mo20501q(zzbxu);
    }

    public final void zzb() {
        zzcgp.m45224b("Opening AdMobCustomTabsAdapter overlay.");
        zzbxu zzbxu = this.f27930a;
        zzbxu.f27934b.mo20502s(zzbxu);
    }
}
