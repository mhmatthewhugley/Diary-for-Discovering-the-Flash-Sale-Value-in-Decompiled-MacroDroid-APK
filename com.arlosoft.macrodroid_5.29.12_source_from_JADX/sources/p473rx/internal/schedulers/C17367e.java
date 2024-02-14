package p473rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import p459ef.C17158f;

/* renamed from: rx.internal.schedulers.e */
/* compiled from: NewThreadScheduler */
public final class C17367e extends C17158f {

    /* renamed from: b */
    private final ThreadFactory f69109b;

    public C17367e(ThreadFactory threadFactory) {
        this.f69109b = threadFactory;
    }

    /* renamed from: a */
    public C17158f.C17159a mo80445a() {
        return new C17368f(this.f69109b);
    }
}
