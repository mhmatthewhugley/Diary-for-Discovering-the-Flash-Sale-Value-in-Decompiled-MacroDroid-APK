package p459ef;

import java.util.concurrent.TimeUnit;
import p464jf.C17176a;

/* renamed from: ef.f */
/* compiled from: Scheduler */
public abstract class C17158f {

    /* renamed from: a */
    static final long f68708a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: ef.f$a */
    /* compiled from: Scheduler */
    public static abstract class C17159a implements C17163i {
        /* renamed from: a */
        public abstract C17163i mo80446a(C17176a aVar);

        /* renamed from: c */
        public abstract C17163i mo80447c(C17176a aVar, long j, TimeUnit timeUnit);
    }

    /* renamed from: a */
    public abstract C17159a mo80445a();
}
