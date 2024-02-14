package p401te;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: te.g */
/* compiled from: ZoneRulesInitializer */
public abstract class C16633g {

    /* renamed from: a */
    public static final C16633g f67489a = new C16634a();

    /* renamed from: b */
    private static final AtomicBoolean f67490b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final AtomicReference<C16633g> f67491c = new AtomicReference<>();

    /* renamed from: te.g$a */
    /* compiled from: ZoneRulesInitializer */
    static class C16634a extends C16633g {
        C16634a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo75090b() {
        }
    }

    /* renamed from: te.g$b */
    /* compiled from: ZoneRulesInitializer */
    static class C16635b extends C16633g {
        C16635b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo75090b() {
            Class<C16636h> cls = C16636h.class;
            Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    C16636h.m99053e((C16636h) it.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static void m99046a() {
        if (!f67490b.getAndSet(true)) {
            AtomicReference<C16633g> atomicReference = f67491c;
            atomicReference.compareAndSet((Object) null, new C16635b());
            atomicReference.get().mo75090b();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    /* renamed from: c */
    public static void m99047c(C16633g gVar) {
        if (f67490b.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!f67491c.compareAndSet((Object) null, gVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo75090b();
}
