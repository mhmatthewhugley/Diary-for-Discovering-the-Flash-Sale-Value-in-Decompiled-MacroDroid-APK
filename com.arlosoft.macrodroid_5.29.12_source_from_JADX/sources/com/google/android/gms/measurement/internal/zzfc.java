package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class zzfc implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzfi f46768a;

    /* renamed from: c */
    public final /* synthetic */ String f46769c;

    public /* synthetic */ zzfc(zzfi zzfi, String str) {
        this.f46768a = zzfi;
        this.f46769c = str;
    }

    public final Object call() {
        return new zzn("internal.remoteConfig", new zzfh(this.f46768a, this.f46769c));
    }
}
