package com.google.mlkit.p229nl.translate.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.DownloadConditions;

/* renamed from: com.google.mlkit.nl.translate.internal.zzw */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzw implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ zzac f56545a;

    /* renamed from: b */
    public final /* synthetic */ DownloadConditions f56546b;

    public /* synthetic */ zzw(zzac zzac, DownloadConditions downloadConditions) {
        this.f56545a = zzac;
        this.f56546b = downloadConditions;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f56545a.mo64654a(this.f56546b, task);
    }
}
