package p292io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import p414v9.C16742o;

/* renamed from: io.reactivex.internal.schedulers.e */
/* compiled from: NewThreadScheduler */
public final class C13189e extends C16742o {

    /* renamed from: c */
    private static final C13191g f61066c = new C13191g("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f61067b;

    public C13189e() {
        this(f61066c);
    }

    /* renamed from: a */
    public C16742o.C16745c mo69992a() {
        return new C13190f(this.f61067b);
    }

    public C13189e(ThreadFactory threadFactory) {
        this.f61067b = threadFactory;
    }
}
