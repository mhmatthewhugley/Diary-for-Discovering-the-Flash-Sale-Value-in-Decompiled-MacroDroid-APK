package p132m4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p090f5.C7315j;

/* renamed from: m4.c */
/* compiled from: DiskCacheWriteLocker */
final class C7914c {

    /* renamed from: a */
    private final Map<String, C7915a> f19016a = new HashMap();

    /* renamed from: b */
    private final C7916b f19017b = new C7916b();

    /* renamed from: m4.c$a */
    /* compiled from: DiskCacheWriteLocker */
    private static class C7915a {

        /* renamed from: a */
        final Lock f19018a = new ReentrantLock();

        /* renamed from: b */
        int f19019b;

        C7915a() {
        }
    }

    /* renamed from: m4.c$b */
    /* compiled from: DiskCacheWriteLocker */
    private static class C7916b {

        /* renamed from: a */
        private final Queue<C7915a> f19020a = new ArrayDeque();

        C7916b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C7915a mo37811a() {
            C7915a poll;
            synchronized (this.f19020a) {
                poll = this.f19020a.poll();
            }
            return poll == null ? new C7915a() : poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37812b(C7915a aVar) {
            synchronized (this.f19020a) {
                if (this.f19020a.size() < 10) {
                    this.f19020a.offer(aVar);
                }
            }
        }
    }

    C7914c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37809a(String str) {
        C7915a aVar;
        synchronized (this) {
            aVar = this.f19016a.get(str);
            if (aVar == null) {
                aVar = this.f19017b.mo37811a();
                this.f19016a.put(str, aVar);
            }
            aVar.f19019b++;
        }
        aVar.f19018a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37810b(String str) {
        C7915a aVar;
        synchronized (this) {
            aVar = (C7915a) C7315j.m30204d(this.f19016a.get(str));
            int i = aVar.f19019b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f19019b = i2;
                if (i2 == 0) {
                    C7915a remove = this.f19016a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f19017b.mo37812b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f19019b);
            }
        }
        aVar.f19018a.unlock();
    }
}
