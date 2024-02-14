package p292io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p241da.C11984b;
import p262fa.C12251a;
import p292io.reactivex.exceptions.ProtocolViolationException;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.util.e */
/* compiled from: EndConsumerHelper */
public final class C13219e {
    /* renamed from: a */
    public static String m85544a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: b */
    public static void m85545b(Class<?> cls) {
        C12251a.m82985p(new ProtocolViolationException(m85544a(cls.getName())));
    }

    /* renamed from: c */
    public static boolean m85546c(AtomicReference<C17071b> atomicReference, C17071b bVar, Class<?> cls) {
        C11984b.m82367d(bVar, "next is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == C11163b.DISPOSED) {
            return false;
        }
        m85545b(cls);
        return false;
    }
}
