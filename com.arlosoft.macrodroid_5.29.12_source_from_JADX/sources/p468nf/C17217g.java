package p468nf;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import p459ef.C17158f;
import p464jf.C17176a;
import p473rx.internal.schedulers.C17352a;
import p473rx.internal.schedulers.C17359b;
import p473rx.internal.schedulers.C17367e;
import p473rx.internal.util.C17383e;

/* renamed from: nf.g */
/* compiled from: RxJavaSchedulersHook */
public class C17217g {

    /* renamed from: a */
    private static final C17217g f68775a = new C17217g();

    /* renamed from: a */
    public static C17158f m100776a() {
        return m100777b(new C17383e("RxComputationScheduler-"));
    }

    /* renamed from: b */
    public static C17158f m100777b(ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory == null");
        return new C17359b(threadFactory);
    }

    /* renamed from: c */
    public static C17158f m100778c() {
        return m100779d(new C17383e("RxIoScheduler-"));
    }

    /* renamed from: d */
    public static C17158f m100779d(ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory == null");
        return new C17352a(threadFactory);
    }

    /* renamed from: e */
    public static C17158f m100780e() {
        return m100781f(new C17383e("RxNewThreadScheduler-"));
    }

    /* renamed from: f */
    public static C17158f m100781f(ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory == null");
        return new C17367e(threadFactory);
    }

    /* renamed from: h */
    public static C17217g m100782h() {
        return f68775a;
    }

    /* renamed from: g */
    public C17158f mo80511g() {
        return null;
    }

    /* renamed from: i */
    public C17158f mo80512i() {
        return null;
    }

    /* renamed from: j */
    public C17158f mo80513j() {
        return null;
    }

    @Deprecated
    /* renamed from: k */
    public C17176a mo80514k(C17176a aVar) {
        return aVar;
    }
}
