package p292io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.grpc.internal.h */
/* compiled from: AtomicLongCounter */
final class C12692h implements C12611b1 {

    /* renamed from: a */
    private final AtomicLong f59898a = new AtomicLong();

    C12692h() {
    }

    /* renamed from: a */
    public void mo69232a(long j) {
        this.f59898a.getAndAdd(j);
    }
}
