package p223ca;

import java.util.concurrent.atomic.AtomicReference;
import p241da.C11984b;
import p262fa.C12251a;
import p292io.reactivex.exceptions.ProtocolViolationException;
import p448z9.C17071b;

/* renamed from: ca.b */
/* compiled from: DisposableHelper */
public enum C11163b implements C17071b {
    DISPOSED;

    /* renamed from: b */
    public static boolean m74926b(AtomicReference<C17071b> atomicReference) {
        C17071b andSet;
        C17071b bVar = atomicReference.get();
        C11163b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    /* renamed from: d */
    public static boolean m74927d(C17071b bVar) {
        return bVar == DISPOSED;
    }

    /* renamed from: e */
    public static boolean m74928e(AtomicReference<C17071b> atomicReference, C17071b bVar) {
        C17071b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    /* renamed from: f */
    public static void m74929f() {
        C12251a.m82985p(new ProtocolViolationException("Disposable already set!"));
    }

    /* renamed from: g */
    public static boolean m74930g(AtomicReference<C17071b> atomicReference, C17071b bVar) {
        C11984b.m82367d(bVar, "d is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m74929f();
        return false;
    }

    /* renamed from: i */
    public static boolean m74931i(AtomicReference<C17071b> atomicReference, C17071b bVar) {
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    /* renamed from: j */
    public static boolean m74932j(C17071b bVar, C17071b bVar2) {
        if (bVar2 == null) {
            C12251a.m82985p(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            m74929f();
            return false;
        }
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
