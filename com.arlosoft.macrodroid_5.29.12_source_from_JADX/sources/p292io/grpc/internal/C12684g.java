package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.g */
/* compiled from: AtomicBackoff */
public final class C12684g {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Logger f59893c = Logger.getLogger(C12684g.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f59894a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicLong f59895b;

    /* renamed from: io.grpc.internal.g$b */
    /* compiled from: AtomicBackoff */
    public final class C12686b {

        /* renamed from: a */
        private final long f59896a;

        /* renamed from: a */
        public void mo69401a() {
            long j = this.f59896a;
            long max = Math.max(2 * j, j);
            if (C12684g.this.f59895b.compareAndSet(this.f59896a, max)) {
                C12684g.f59893c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C12684g.this.f59894a, Long.valueOf(max)});
            }
        }

        /* renamed from: b */
        public long mo69402b() {
            return this.f59896a;
        }

        private C12686b(long j) {
            this.f59896a = j;
        }
    }

    public C12684g(String str, long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.f59895b = atomicLong;
        Preconditions.m5378e(j > 0, "value must be positive");
        this.f59894a = str;
        atomicLong.set(j);
    }

    /* renamed from: d */
    public C12686b mo69400d() {
        return new C12686b(this.f59895b.get());
    }
}
