package p442yb;

import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.C13695i;
import p297ja.C13339u;
import p370qa.C16265l;

/* renamed from: yb.k */
/* compiled from: locks.kt */
public interface C17008k {

    /* renamed from: a */
    public static final C17009a f68391a = C17009a.f68392a;

    /* renamed from: yb.k$a */
    /* compiled from: locks.kt */
    public static final class C17009a {

        /* renamed from: a */
        static final /* synthetic */ C17009a f68392a = new C17009a();

        private C17009a() {
        }

        /* renamed from: a */
        public final C16984d mo80243a(Runnable runnable, C16265l<? super InterruptedException, C13339u> lVar) {
            if (runnable == null || lVar == null) {
                return new C16984d((Lock) null, 1, (C13695i) null);
            }
            return new C16983c(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
