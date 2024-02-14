package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzcom implements zzctt {

    /* renamed from: a */
    private static zzcom f29156a;

    /* renamed from: d */
    private static synchronized zzcom m46232d(Context context, zzbvk zzbvk, int i, boolean z, int i2, zzcpo zzcpo) {
        synchronized (zzcom.class) {
            zzcom zzcom = f29156a;
            if (zzcom != null) {
                return zzcom;
            }
            zzbjc.m43542c(context);
            zzfey d = zzfey.m50037d(context);
            zzcgv c = d.mo45634c(223104000, false, i2);
            d.mo45635e(zzbvk);
            zzcqy zzcqy = new zzcqy((zzcqx) null);
            zzcon zzcon = new zzcon();
            zzcon.mo44218d(c);
            zzcon.mo44217c(context);
            zzcqy.mo44303b(new zzcop(zzcon, (zzcoo) null));
            zzcqy.mo44304c(new zzcsl(zzcpo, (byte[]) null));
            zzcom a = zzcqy.mo44302a();
            zzt.m2904q().mo43501r(context, c);
            zzt.m2892e().mo42517i(context);
            zzt.m2905r().mo20409G(context);
            zzt.m2905r().mo20408F(context);
            zzd.m2644a(context);
            zzt.m2891d().mo42463d(context);
            zzt.m2911x().mo20344b(context);
            zzcev.m45054d(context);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27187m5)).booleanValue()) {
                if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27242s0)).booleanValue()) {
                    zzbep zzbep = new zzbep(new zzbev(context));
                    zzefk zzefk = new zzefk(new zzefg(context), a.mo44192C());
                    zzt.m2905r();
                    new zzegg(context, c, zzbep, zzefk, UUID.randomUUID().toString(), a.mo44190A()).mo45274b(zzt.m2904q().mo43494h().mo20366e0());
                }
            }
            f29156a = a;
            return a;
        }
    }

    /* renamed from: e */
    public static zzcom m46233e(Context context, zzbvk zzbvk, int i) {
        return m46232d(context, zzbvk, 223104000, false, i, new zzcpo());
    }

    /* renamed from: A */
    public abstract zzfir mo44190A();

    /* renamed from: B */
    public abstract zzfjw mo44191B();

    /* renamed from: C */
    public abstract zzfzq mo44192C();

    /* renamed from: a */
    public final zzevw mo44193a(zzcbc zzcbc, int i) {
        return mo44210t(new zzexi(zzcbc, i));
    }

    /* renamed from: b */
    public abstract Executor mo44194b();

    /* renamed from: c */
    public abstract ScheduledExecutorService mo44195c();

    /* renamed from: f */
    public abstract zzcsw mo44196f();

    /* renamed from: g */
    public abstract zzcwe mo44197g();

    /* renamed from: h */
    public abstract zzcwp mo44198h();

    /* renamed from: i */
    public abstract zzcxy mo44199i();

    /* renamed from: j */
    public abstract zzdfp mo44200j();

    /* renamed from: k */
    public abstract zzdmg mo44201k();

    /* renamed from: l */
    public abstract zzdnc mo44202l();

    /* renamed from: m */
    public abstract zzdug mo44203m();

    /* renamed from: n */
    public abstract zzdyy mo44204n();

    /* renamed from: o */
    public abstract zzeak mo44205o();

    /* renamed from: p */
    public abstract zzegw mo44206p();

    /* renamed from: q */
    public abstract zzc mo44207q();

    /* renamed from: r */
    public abstract zzg mo44208r();

    /* renamed from: s */
    public abstract zzaa mo44209s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract zzevw mo44210t(zzexi zzexi);

    /* renamed from: u */
    public abstract zzeyi mo44211u();

    /* renamed from: v */
    public abstract zzezw mo44212v();

    /* renamed from: w */
    public abstract zzfbp mo44213w();

    /* renamed from: x */
    public abstract zzfdd mo44214x();

    /* renamed from: y */
    public abstract zzfer mo44215y();

    /* renamed from: z */
    public abstract zzffb mo44216z();
}
