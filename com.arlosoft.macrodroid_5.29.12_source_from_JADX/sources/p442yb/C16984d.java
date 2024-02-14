package p442yb;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: yb.d */
/* compiled from: locks.kt */
public class C16984d implements C17008k {

    /* renamed from: b */
    private final Lock f68363b;

    public C16984d(Lock lock) {
        C13706o.m87929f(lock, "lock");
        this.f68363b = lock;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Lock mo80214a() {
        return this.f68363b;
    }

    public void lock() {
        this.f68363b.lock();
    }

    public void unlock() {
        this.f68363b.unlock();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16984d(Lock lock, int i, C13695i iVar) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }
}
