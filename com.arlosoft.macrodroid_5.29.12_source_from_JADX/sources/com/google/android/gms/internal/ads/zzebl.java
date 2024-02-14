package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzebl {

    /* renamed from: a */
    private final zzfzq f33639a;

    /* renamed from: b */
    private final zzfzq f33640b;

    /* renamed from: c */
    private final zzecs f33641c;

    /* renamed from: d */
    private final zzgxc f33642d;

    public zzebl(zzfzq zzfzq, zzfzq zzfzq2, zzecs zzecs, zzgxc zzgxc) {
        this.f33639a = zzfzq;
        this.f33640b = zzfzq2;
        this.f33641c = zzecs;
        this.f33642d = zzgxc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzfzp mo45154a(zzcbc zzcbc, int i, zzedj zzedj) throws Exception {
        return ((zzeek) this.f33642d.zzb()).mo45212Kb(zzcbc, i);
    }

    /* renamed from: b */
    public final zzfzp mo45155b(zzcbc zzcbc) {
        zzfzp zzfzp;
        String str = zzcbc.f28125f;
        zzt.m2905r();
        if (zzs.m2748V(str)) {
            zzfzp = zzfzg.m51413h(new zzedj(1));
        } else {
            zzfzp = zzfzg.m51412g(this.f33639a.mo46579F(new zzebi(this, zzcbc)), ExecutionException.class, zzebj.f33635a, this.f33640b);
        }
        return zzfzg.m51412g(zzfzp, zzedj.class, new zzebk(this, zzcbc, Binder.getCallingUid()), this.f33640b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ InputStream mo45156c(zzcbc zzcbc) throws Exception {
        zzchh zzchh;
        zzecs zzecs = this.f33641c;
        synchronized (zzecs.f33722c) {
            if (zzecs.f33723d) {
                zzchh = zzecs.f33721a;
            } else {
                zzecs.f33723d = true;
                zzecs.f33725g = zzcbc;
                zzecs.f33726o.mo21655v();
                zzecs.f33721a.mo43580q(new zzecr(zzecs), zzchc.f28461f);
                zzchh = zzecs.f33721a;
            }
        }
        return (InputStream) zzchh.get((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26851E4)).intValue(), TimeUnit.SECONDS);
    }
}
