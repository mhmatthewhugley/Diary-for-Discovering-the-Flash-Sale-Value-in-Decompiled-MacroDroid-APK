package com.google.mlkit.p229nl.translate.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.p229nl.translate.TranslateRemoteModel;

/* renamed from: com.google.mlkit.nl.translate.internal.zzal */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzal implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ zzan f56489a;

    /* renamed from: b */
    public final /* synthetic */ TranslateRemoteModel f56490b;

    public /* synthetic */ zzal(zzan zzan, TranslateRemoteModel translateRemoteModel) {
        this.f56489a = zzan;
        this.f56490b = translateRemoteModel;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f56489a.mo64665d(this.f56490b, task);
    }
}
