package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzejd implements zzdmp {

    /* renamed from: a */
    private final Context f34162a;

    /* renamed from: b */
    private final zzcgv f34163b;

    /* renamed from: c */
    private final zzfzp f34164c;

    /* renamed from: d */
    private final zzfdk f34165d;

    /* renamed from: e */
    private final zzcmp f34166e;

    /* renamed from: f */
    private final zzfef f34167f;

    /* renamed from: g */
    private final zzbpx f34168g;

    /* renamed from: h */
    private final boolean f34169h;

    zzejd(Context context, zzcgv zzcgv, zzfzp zzfzp, zzfdk zzfdk, zzcmp zzcmp, zzfef zzfef, boolean z, zzbpx zzbpx) {
        this.f34162a = context;
        this.f34163b = zzcgv;
        this.f34164c = zzfzp;
        this.f34165d = zzfdk;
        this.f34166e = zzcmp;
        this.f34167f = zzfef;
        this.f34168g = zzbpx;
        this.f34169h = z;
    }

    /* renamed from: a */
    public final void mo44707a(boolean z, Context context, zzddn zzddn) {
        zzdlh zzdlh = (zzdlh) zzfzg.m51422q(this.f34164c);
        this.f34166e.mo44030S0(true);
        boolean e = this.f34169h ? this.f34168g.mo42874e(false) : false;
        zzt.m2905r();
        boolean e2 = zzs.m2754e(this.f34162a);
        boolean z2 = this.f34169h;
        zzj zzj = new zzj(e, e2, z2 ? this.f34168g.mo42873d() : false, z2 ? this.f34168g.mo42870a() : 0.0f, -1, z, this.f34165d.f35508P, false);
        if (zzddn != null) {
            zzddn.mo44579c();
        }
        zzt.m2898k();
        zzdme j = zzdlh.mo44327j();
        zzcmp zzcmp = this.f34166e;
        zzfdk zzfdk = this.f34165d;
        int i = zzfdk.f35510R;
        zzcgv zzcgv = this.f34163b;
        String str = zzfdk.f35495C;
        zzfdp zzfdp = zzfdk.f35554t;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) j, (zzz) null, zzcmp, i, zzcgv, str, zzj, zzfdp.f35578b, zzfdp.f35577a, this.f34167f.f35631f, zzddn);
        zzm.m2466a(context, adOverlayInfoParcel, true);
    }
}
