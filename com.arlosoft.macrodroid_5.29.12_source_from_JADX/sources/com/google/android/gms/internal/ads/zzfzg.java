package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfzg extends zzfzi {
    /* renamed from: a */
    public static zzfzf m51406a(Iterable iterable) {
        return new zzfzf(false, zzfvn.m51132q(iterable), (zzfzd) null);
    }

    @SafeVarargs
    /* renamed from: b */
    public static zzfzf m51407b(zzfzp... zzfzpArr) {
        return new zzfzf(false, zzfvn.m51134u(zzfzpArr), (zzfzd) null);
    }

    /* renamed from: c */
    public static zzfzf m51408c(Iterable iterable) {
        return new zzfzf(true, zzfvn.m51132q(iterable), (zzfzd) null);
    }

    @SafeVarargs
    /* renamed from: d */
    public static zzfzf m51409d(zzfzp... zzfzpArr) {
        return new zzfzf(true, zzfvn.m51134u(zzfzpArr), (zzfzd) null);
    }

    /* renamed from: e */
    public static zzfzp m51410e(Iterable iterable) {
        return new zzfyo(zzfvn.m51132q(iterable), true);
    }

    /* renamed from: f */
    public static zzfzp m51411f(zzfzp zzfzp, Class cls, zzfsm zzfsm, Executor executor) {
        zzfxv zzfxv = new zzfxv(zzfzp, cls, zzfsm);
        zzfzp.mo43580q(zzfxv, zzfzw.m51439c(executor, zzfxv));
        return zzfxv;
    }

    /* renamed from: g */
    public static zzfzp m51412g(zzfzp zzfzp, Class cls, zzfyn zzfyn, Executor executor) {
        zzfxu zzfxu = new zzfxu(zzfzp, cls, zzfyn);
        zzfzp.mo43580q(zzfxu, zzfzw.m51439c(executor, zzfxu));
        return zzfxu;
    }

    /* renamed from: h */
    public static zzfzp m51413h(Throwable th) {
        Objects.requireNonNull(th);
        return new zzfzj(th);
    }

    /* renamed from: i */
    public static zzfzp m51414i(Object obj) {
        if (obj == null) {
            return zzfzk.f36605c;
        }
        return new zzfzk(obj);
    }

    /* renamed from: j */
    public static zzfzp m51415j() {
        return zzfzk.f36605c;
    }

    /* renamed from: k */
    public static zzfzp m51416k(Callable callable, Executor executor) {
        zzgaf zzgaf = new zzgaf(callable);
        executor.execute(zzgaf);
        return zzgaf;
    }

    /* renamed from: l */
    public static zzfzp m51417l(zzfym zzfym, Executor executor) {
        zzgaf zzgaf = new zzgaf(zzfym);
        executor.execute(zzgaf);
        return zzgaf;
    }

    /* renamed from: m */
    public static zzfzp m51418m(zzfzp zzfzp, zzfsm zzfsm, Executor executor) {
        int i = zzfyd.f36576A;
        Objects.requireNonNull(zzfsm);
        zzfyc zzfyc = new zzfyc(zzfzp, zzfsm);
        zzfzp.mo43580q(zzfyc, zzfzw.m51439c(executor, zzfyc));
        return zzfyc;
    }

    /* renamed from: n */
    public static zzfzp m51419n(zzfzp zzfzp, zzfyn zzfyn, Executor executor) {
        int i = zzfyd.f36576A;
        Objects.requireNonNull(executor);
        zzfyb zzfyb = new zzfyb(zzfzp, zzfyn);
        zzfzp.mo43580q(zzfyb, zzfzw.m51439c(executor, zzfyb));
        return zzfyb;
    }

    /* renamed from: o */
    public static zzfzp m51420o(zzfzp zzfzp, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzfzp.isDone()) {
            return zzfzp;
        }
        return zzgac.m51446E(zzfzp, j, timeUnit, scheduledExecutorService);
    }

    /* renamed from: p */
    public static Object m51421p(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgah.m51464a(future);
        }
        throw new IllegalStateException(zzftm.m50971b("Future was expected to be done: %s", future));
    }

    /* renamed from: q */
    public static Object m51422q(Future future) {
        try {
            return zzgah.m51464a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfyv((Error) cause);
            }
            throw new zzgag(cause);
        }
    }

    /* renamed from: r */
    public static void m51423r(zzfzp zzfzp, zzfzc zzfzc, Executor executor) {
        Objects.requireNonNull(zzfzc);
        zzfzp.mo43580q(new zzfze(zzfzp, zzfzc), executor);
    }
}
