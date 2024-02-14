package p442yb;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

/* renamed from: yb.c */
/* compiled from: locks.kt */
public final class C16983c extends C16984d {

    /* renamed from: c */
    private final Runnable f68361c;

    /* renamed from: d */
    private final C16265l<InterruptedException, C13339u> f68362d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16983c(Lock lock, Runnable runnable, C16265l<? super InterruptedException, C13339u> lVar) {
        super(lock);
        C13706o.m87929f(lock, "lock");
        C13706o.m87929f(runnable, "checkCancelled");
        C13706o.m87929f(lVar, "interruptedExceptionHandler");
        this.f68361c = runnable;
        this.f68362d = lVar;
    }

    public void lock() {
        while (!mo80214a().tryLock(50, TimeUnit.MILLISECONDS)) {
            try {
                this.f68361c.run();
            } catch (InterruptedException e) {
                this.f68362d.invoke(e);
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16983c(Runnable runnable, C16265l<? super InterruptedException, C13339u> lVar) {
        this(new ReentrantLock(), runnable, lVar);
        C13706o.m87929f(runnable, "checkCancelled");
        C13706o.m87929f(lVar, "interruptedExceptionHandler");
    }
}
