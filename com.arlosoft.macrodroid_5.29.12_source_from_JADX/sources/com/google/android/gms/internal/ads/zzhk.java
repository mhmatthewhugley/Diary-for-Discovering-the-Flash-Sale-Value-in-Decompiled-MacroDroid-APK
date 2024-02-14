package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzhk {

    /* renamed from: a */
    final Context f37445a;

    /* renamed from: b */
    zzde f37446b = zzde.f32179a;

    /* renamed from: c */
    zzftn f37447c;

    /* renamed from: d */
    zzftn f37448d;

    /* renamed from: e */
    zzftn f37449e;

    /* renamed from: f */
    zzftn f37450f;

    /* renamed from: g */
    zzftn f37451g;

    /* renamed from: h */
    zzfsm f37452h;

    /* renamed from: i */
    Looper f37453i = zzen.m49160e();

    /* renamed from: j */
    zzk f37454j = zzk.f37728c;

    /* renamed from: k */
    int f37455k = 1;

    /* renamed from: l */
    boolean f37456l = true;

    /* renamed from: m */
    zzkd f37457m = zzkd.f37737g;

    /* renamed from: n */
    long f37458n = 500;

    /* renamed from: o */
    long f37459o = 2000;

    /* renamed from: p */
    boolean f37460p = true;

    /* renamed from: q */
    boolean f37461q;

    /* renamed from: r */
    zzgv f37462r = new zzgv(0.97f, 1.03f, 1000, 1.0E-7f, zzen.m49163f0(20), zzen.m49163f0(500), 0.999f, (zzgu) null);

    public zzhk(Context context, zzcly zzcly, byte[] bArr) {
        Context context2 = context;
        zzhe zzhe = new zzhe(zzcly, (byte[]) null);
        zzhf zzhf = new zzhf(context2);
        zzhg zzhg = new zzhg(context2);
        zzhh zzhh = zzhh.f37442a;
        zzhi zzhi = new zzhi(context2);
        zzhj zzhj = zzhj.f37444a;
        Objects.requireNonNull(context);
        this.f37445a = context2;
        this.f37447c = zzhe;
        this.f37448d = zzhf;
        this.f37449e = zzhg;
        this.f37450f = zzhh;
        this.f37451g = zzhi;
        this.f37452h = zzhj;
    }

    /* renamed from: a */
    static /* synthetic */ zzsh m53680a(Context context) {
        return new zzrv(context, new zzzd());
    }
}
