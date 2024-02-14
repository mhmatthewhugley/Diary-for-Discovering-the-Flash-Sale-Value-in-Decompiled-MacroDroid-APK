package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzfm extends FutureTask implements Comparable {

    /* renamed from: a */
    private final long f46790a;

    /* renamed from: c */
    final boolean f46791c;

    /* renamed from: d */
    private final String f46792d;

    /* renamed from: f */
    final /* synthetic */ zzfo f46793f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfm(zzfo zzfo, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f46793f = zzfo;
        Preconditions.m4488k(str);
        long andIncrement = zzfo.f46798l.getAndIncrement();
        this.f46790a = andIncrement;
        this.f46792d = str;
        this.f46791c = z;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            zzfo.f46899a.mo55221z().mo55098p().mo55091a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        zzfm zzfm = (zzfm) obj;
        boolean z = this.f46791c;
        if (z != zzfm.f46791c) {
            return !z ? 1 : -1;
        }
        int i = (this.f46790a > zzfm.f46790a ? 1 : (this.f46790a == zzfm.f46790a ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.f46793f.f46899a.mo55221z().mo55100r().mo55092b("Two tasks share the same index. index", Long.valueOf(this.f46790a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f46793f.f46899a.mo55221z().mo55098p().mo55092b(this.f46792d, th);
        if ((th instanceof zzfk) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfm(zzfo zzfo, Callable callable, boolean z, String str) {
        super(callable);
        this.f46793f = zzfo;
        Preconditions.m4488k("Task exception on worker thread");
        long andIncrement = zzfo.f46798l.getAndIncrement();
        this.f46790a = andIncrement;
        this.f46792d = "Task exception on worker thread";
        this.f46791c = z;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            zzfo.f46899a.mo55221z().mo55098p().mo55091a("Tasks index overflow");
        }
    }
}
