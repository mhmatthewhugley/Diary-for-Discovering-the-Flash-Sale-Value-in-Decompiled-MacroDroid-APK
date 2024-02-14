package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzfl implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f46788a;

    /* renamed from: c */
    final /* synthetic */ zzfo f46789c;

    public zzfl(zzfo zzfo, String str) {
        this.f46789c = zzfo;
        Preconditions.m4488k(str);
        this.f46788a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f46789c.f46899a.mo55221z().mo55098p().mo55092b(this.f46788a, th);
    }
}
