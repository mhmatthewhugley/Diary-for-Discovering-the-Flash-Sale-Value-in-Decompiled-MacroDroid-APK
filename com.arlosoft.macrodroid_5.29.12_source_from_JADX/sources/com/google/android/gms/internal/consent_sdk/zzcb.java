package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class zzcb implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ zzcc f39407a;

    /* renamed from: c */
    public final /* synthetic */ String f39408c = "Google consent worker";

    public /* synthetic */ zzcb(zzcc zzcc, String str) {
        this.f39407a = zzcc;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f39407a.mo48714a(this.f39408c, runnable);
    }
}
