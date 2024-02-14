package com.google.mlkit.p229nl.translate.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.DownloadConditions;

/* renamed from: com.google.mlkit.nl.translate.internal.zzao */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzao implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ TranslatorImpl f56495a;

    /* renamed from: b */
    public final /* synthetic */ DownloadConditions f56496b;

    public /* synthetic */ zzao(TranslatorImpl translatorImpl, DownloadConditions downloadConditions) {
        this.f56495a = translatorImpl;
        this.f56496b = downloadConditions;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f56495a.mo64649b(this.f56496b, task);
    }
}
