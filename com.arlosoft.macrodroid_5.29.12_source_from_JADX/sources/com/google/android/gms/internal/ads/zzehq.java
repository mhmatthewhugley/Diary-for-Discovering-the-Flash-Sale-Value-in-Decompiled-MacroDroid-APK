package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzehq implements zzdmp {

    /* renamed from: a */
    private final zzcgv f34050a;

    /* renamed from: b */
    private final zzfzp f34051b;

    /* renamed from: c */
    private final zzfdk f34052c;

    /* renamed from: d */
    private final zzcmp f34053d;

    /* renamed from: e */
    private final zzfef f34054e;

    /* renamed from: f */
    private final zzbpx f34055f;

    /* renamed from: g */
    private final boolean f34056g;

    zzehq(zzcgv zzcgv, zzfzp zzfzp, zzfdk zzfdk, zzcmp zzcmp, zzfef zzfef, boolean z, zzbpx zzbpx) {
        this.f34050a = zzcgv;
        this.f34051b = zzfzp;
        this.f34052c = zzfdk;
        this.f34053d = zzcmp;
        this.f34054e = zzfef;
        this.f34056g = z;
        this.f34055f = zzbpx;
    }

    /* renamed from: a */
    public final void mo44707a(boolean z, Context context, zzddn zzddn) {
        int i;
        zzcwn zzcwn = (zzcwn) zzfzg.m51422q(this.f34051b);
        this.f34053d.mo44030S0(true);
        boolean e = this.f34056g ? this.f34055f.mo42874e(true) : true;
        boolean z2 = this.f34056g;
        zzj zzj = new zzj(e, true, z2 ? this.f34055f.mo42873d() : false, z2 ? this.f34055f.mo42870a() : 0.0f, -1, z, this.f34052c.f35508P, false);
        if (zzddn != null) {
            zzddn.mo44579c();
        }
        zzt.m2898k();
        zzdme i2 = zzcwn.mo44259i();
        zzcmp zzcmp = this.f34053d;
        int i3 = this.f34052c.f35510R;
        if (i3 == -1) {
            zzw zzw = this.f34054e.f35635j;
            if (zzw != null) {
                int i4 = zzw.f2046a;
                if (i4 == 1) {
                    i = 7;
                } else if (i4 == 2) {
                    i = 6;
                }
                zzcgv zzcgv = this.f34050a;
                zzfdk zzfdk = this.f34052c;
                String str = zzfdk.f35495C;
                zzfdp zzfdp = zzfdk.f35554t;
                AdOverlayInfoParcel adOverlayInfoParcel = r4;
                AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) i2, (zzz) null, zzcmp, i, zzcgv, str, zzj, zzfdp.f35578b, zzfdp.f35577a, this.f34054e.f35631f, zzddn);
                zzm.m2466a(context, adOverlayInfoParcel, true);
            }
            zzcgp.m45224b("Error setting app open orientation; no targeting orientation available.");
            i3 = this.f34052c.f35510R;
        }
        i = i3;
        zzcgv zzcgv2 = this.f34050a;
        zzfdk zzfdk2 = this.f34052c;
        String str2 = zzfdk2.f35495C;
        zzfdp zzfdp2 = zzfdk2.f35554t;
        AdOverlayInfoParcel adOverlayInfoParcel3 = adOverlayInfoParcel2;
        AdOverlayInfoParcel adOverlayInfoParcel22 = new AdOverlayInfoParcel((zza) null, (zzo) i2, (zzz) null, zzcmp, i, zzcgv2, str2, zzj, zzfdp2.f35578b, zzfdp2.f35577a, this.f34054e.f35631f, zzddn);
        zzm.m2466a(context, adOverlayInfoParcel3, true);
    }
}
