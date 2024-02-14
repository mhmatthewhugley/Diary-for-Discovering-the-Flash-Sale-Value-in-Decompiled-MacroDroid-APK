package kotlinx.coroutines;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kotlinx.coroutines.w2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15564w2 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f64810a;

    /* renamed from: c */
    public final /* synthetic */ String f64811c;

    /* renamed from: d */
    public final /* synthetic */ AtomicInteger f64812d;

    public /* synthetic */ C15564w2(int i, String str, AtomicInteger atomicInteger) {
        this.f64810a = i;
        this.f64811c = str;
        this.f64812d = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return C15568x2.m94740c(this.f64810a, this.f64811c, this.f64812d, runnable);
    }
}
