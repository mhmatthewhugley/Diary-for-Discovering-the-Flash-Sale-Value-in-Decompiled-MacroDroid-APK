package p292io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import p262fa.C12251a;
import p329me.C15738c;

/* renamed from: io.reactivex.internal.util.h */
/* compiled from: HalfSerializer */
public final class C13223h {
    /* renamed from: a */
    public static void m85551a(C15738c<?> cVar, AtomicInteger atomicInteger, C13217c cVar2) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b = cVar2.mo70048b();
            if (b != null) {
                cVar.onError(b);
            } else {
                cVar.onComplete();
            }
        }
    }

    /* renamed from: b */
    public static void m85552b(C15738c<?> cVar, Throwable th, AtomicInteger atomicInteger, C13217c cVar2) {
        if (!cVar2.mo70047a(th)) {
            C12251a.m82985p(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            cVar.onError(cVar2.mo70048b());
        }
    }

    /* renamed from: c */
    public static <T> void m85553c(C15738c<? super T> cVar, T t, AtomicInteger atomicInteger, C13217c cVar2) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            cVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b = cVar2.mo70048b();
                if (b != null) {
                    cVar.onError(b);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }
}
