package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzaj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f2152a;

    public /* synthetic */ zzaj(AtomicInteger atomicInteger) {
        this.f2152a = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2152a.set(i);
    }
}
