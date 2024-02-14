package p431x8;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: x8.d */
/* compiled from: EventBusBuilder */
public class C16861d {

    /* renamed from: i */
    private static final ExecutorService f68082i = Executors.newCachedThreadPool();

    /* renamed from: a */
    boolean f68083a = true;

    /* renamed from: b */
    boolean f68084b = true;

    /* renamed from: c */
    boolean f68085c = true;

    /* renamed from: d */
    boolean f68086d = true;

    /* renamed from: e */
    boolean f68087e;

    /* renamed from: f */
    boolean f68088f = true;

    /* renamed from: g */
    ExecutorService f68089g = f68082i;

    /* renamed from: h */
    List<Class<?>> f68090h;

    C16861d() {
    }

    /* renamed from: a */
    public C16857c mo80023a() {
        return new C16857c(this);
    }

    /* renamed from: b */
    public C16861d mo80024b(boolean z) {
        this.f68084b = z;
        return this;
    }

    /* renamed from: c */
    public C16861d mo80025c(boolean z) {
        this.f68083a = z;
        return this;
    }
}
