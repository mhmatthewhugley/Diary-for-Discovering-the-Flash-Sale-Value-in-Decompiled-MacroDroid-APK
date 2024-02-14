package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzcmx implements zzftn {

    /* renamed from: A */
    public final /* synthetic */ zza f29041A;

    /* renamed from: B */
    public final /* synthetic */ zzbep f29042B;

    /* renamed from: C */
    public final /* synthetic */ zzfdk f29043C;

    /* renamed from: D */
    public final /* synthetic */ zzfdn f29044D;

    /* renamed from: a */
    public final /* synthetic */ Context f29045a;

    /* renamed from: c */
    public final /* synthetic */ zzcoe f29046c;

    /* renamed from: d */
    public final /* synthetic */ String f29047d;

    /* renamed from: f */
    public final /* synthetic */ boolean f29048f;

    /* renamed from: g */
    public final /* synthetic */ boolean f29049g;

    /* renamed from: o */
    public final /* synthetic */ zzape f29050o;

    /* renamed from: p */
    public final /* synthetic */ zzbkb f29051p;

    /* renamed from: s */
    public final /* synthetic */ zzcgv f29052s;

    /* renamed from: z */
    public final /* synthetic */ zzl f29053z;

    public /* synthetic */ zzcmx(Context context, zzcoe zzcoe, String str, boolean z, boolean z2, zzape zzape, zzbkb zzbkb, zzcgv zzcgv, zzbjr zzbjr, zzl zzl, zza zza, zzbep zzbep, zzfdk zzfdk, zzfdn zzfdn) {
        this.f29045a = context;
        this.f29046c = zzcoe;
        this.f29047d = str;
        this.f29048f = z;
        this.f29049g = z2;
        this.f29050o = zzape;
        this.f29051p = zzbkb;
        this.f29052s = zzcgv;
        this.f29053z = zzl;
        this.f29041A = zza;
        this.f29042B = zzbep;
        this.f29043C = zzfdk;
        this.f29044D = zzfdn;
    }

    public final Object zza() {
        Context context = this.f29045a;
        zzcoe zzcoe = this.f29046c;
        String str = this.f29047d;
        boolean z = this.f29048f;
        boolean z2 = this.f29049g;
        zzape zzape = this.f29050o;
        zzbkb zzbkb = this.f29051p;
        zzcgv zzcgv = this.f29052s;
        zzl zzl = this.f29053z;
        zza zza = this.f29041A;
        zzbep zzbep = this.f29042B;
        zzfdk zzfdk = this.f29043C;
        zzfdn zzfdn = this.f29044D;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = zzcni.f29071r0;
            zzcne zzcne = new zzcne(new zzcni(new zzcod(context), zzcoe, str, z, z2, zzape, zzbkb, zzcgv, (zzbjr) null, zzl, zza, zzbep, zzfdk, zzfdn));
            zzcne.setWebViewClient(zzt.m2906s().mo20249d(zzcne, zzbep, z2));
            zzcne.setWebChromeClient(new zzcmo(zzcne));
            return zzcne;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
