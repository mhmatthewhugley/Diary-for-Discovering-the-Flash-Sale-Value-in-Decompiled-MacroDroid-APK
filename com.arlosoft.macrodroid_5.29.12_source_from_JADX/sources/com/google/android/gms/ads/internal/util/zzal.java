package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzal implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ zzas f2154a;

    /* renamed from: c */
    public final /* synthetic */ AtomicInteger f2155c;

    /* renamed from: d */
    public final /* synthetic */ int f2156d;

    /* renamed from: f */
    public final /* synthetic */ int f2157f;

    /* renamed from: g */
    public final /* synthetic */ int f2158g;

    public /* synthetic */ zzal(zzas zzas, AtomicInteger atomicInteger, int i, int i2, int i3) {
        this.f2154a = zzas;
        this.f2155c = atomicInteger;
        this.f2156d = i;
        this.f2157f = i2;
        this.f2158g = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2154a.mo20283h(this.f2155c, this.f2156d, this.f2157f, this.f2158g, dialogInterface, i);
    }
}
