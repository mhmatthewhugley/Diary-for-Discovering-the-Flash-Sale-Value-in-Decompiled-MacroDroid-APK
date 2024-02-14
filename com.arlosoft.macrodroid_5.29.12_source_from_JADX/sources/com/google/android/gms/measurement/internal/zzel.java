package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

@WorkerThread
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzel implements Runnable {

    /* renamed from: a */
    private final zzej f46694a;

    /* renamed from: c */
    private final int f46695c;

    /* renamed from: d */
    private final Throwable f46696d;

    /* renamed from: f */
    private final byte[] f46697f;

    /* renamed from: g */
    private final String f46698g;

    /* renamed from: o */
    private final Map f46699o;

    /* synthetic */ zzel(String str, zzej zzej, int i, Throwable th, byte[] bArr, Map map, zzek zzek) {
        Preconditions.m4488k(zzej);
        this.f46694a = zzej;
        this.f46695c = i;
        this.f46696d = th;
        this.f46697f = bArr;
        this.f46698g = str;
        this.f46699o = map;
    }

    public final void run() {
        this.f46694a.mo55108a(this.f46698g, this.f46695c, this.f46696d, this.f46697f, this.f46699o);
    }
}
