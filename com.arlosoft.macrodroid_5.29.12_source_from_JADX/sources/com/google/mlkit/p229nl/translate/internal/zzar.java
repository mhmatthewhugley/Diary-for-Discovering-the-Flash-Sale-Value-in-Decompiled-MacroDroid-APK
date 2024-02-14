package com.google.mlkit.p229nl.translate.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.mlkit.nl.translate.internal.zzar */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzar implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ TranslatorImpl f56500a;

    /* renamed from: c */
    public final /* synthetic */ String f56501c;

    /* renamed from: d */
    public final /* synthetic */ boolean f56502d;

    /* renamed from: f */
    public final /* synthetic */ long f56503f;

    public /* synthetic */ zzar(TranslatorImpl translatorImpl, String str, boolean z, long j) {
        this.f56500a = translatorImpl;
        this.f56501c = str;
        this.f56502d = z;
        this.f56503f = j;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        this.f56500a.mo64651f(this.f56501c, this.f56502d, this.f56503f, task);
    }
}
