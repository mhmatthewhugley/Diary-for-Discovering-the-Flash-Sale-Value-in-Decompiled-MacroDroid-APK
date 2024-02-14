package com.google.android.gms.internal.mlkit_translate;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Date;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzqp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzqt f44475a;

    /* renamed from: c */
    public final /* synthetic */ Date f44476c;

    /* renamed from: d */
    public final /* synthetic */ long f44477d;

    /* renamed from: f */
    public final /* synthetic */ zzox f44478f;

    /* renamed from: g */
    public final /* synthetic */ TaskCompletionSource f44479g;

    public /* synthetic */ zzqp(zzqt zzqt, Date date, long j, zzox zzox, boolean z, TaskCompletionSource taskCompletionSource) {
        this.f44475a = zzqt;
        this.f44476c = date;
        this.f44477d = j;
        this.f44478f = zzox;
        this.f44479g = taskCompletionSource;
    }

    public final void run() {
        this.f44475a.mo52466h(this.f44476c, this.f44477d, this.f44478f, true, this.f44479g);
    }
}
