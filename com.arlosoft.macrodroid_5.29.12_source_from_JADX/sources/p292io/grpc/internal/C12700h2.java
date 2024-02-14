package p292io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.h2 */
/* compiled from: TimeProvider */
public interface C12700h2 {

    /* renamed from: a */
    public static final C12700h2 f59928a = new C12701a();

    /* renamed from: io.grpc.internal.h2$a */
    /* compiled from: TimeProvider */
    class C12701a implements C12700h2 {
        C12701a() {
        }

        /* renamed from: a */
        public long mo69418a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    long mo69418a();
}
