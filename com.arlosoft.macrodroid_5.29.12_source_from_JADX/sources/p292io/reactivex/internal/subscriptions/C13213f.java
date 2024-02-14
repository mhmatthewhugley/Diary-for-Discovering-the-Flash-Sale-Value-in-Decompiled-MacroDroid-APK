package p292io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p241da.C11984b;
import p262fa.C12251a;
import p292io.reactivex.exceptions.ProtocolViolationException;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15739d;

/* renamed from: io.reactivex.internal.subscriptions.f */
/* compiled from: SubscriptionHelper */
public enum C13213f implements C15739d {
    CANCELLED;

    /* renamed from: b */
    public static boolean m85523b(AtomicReference<C15739d> atomicReference) {
        C15739d andSet;
        C15739d dVar = atomicReference.get();
        C13213f fVar = CANCELLED;
        if (dVar == fVar || (andSet = atomicReference.getAndSet(fVar)) == fVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    /* renamed from: d */
    public static void m85524d(AtomicReference<C15739d> atomicReference, AtomicLong atomicLong, long j) {
        C15739d dVar = atomicReference.get();
        if (dVar != null) {
            dVar.request(j);
        } else if (m85529j(j)) {
            C13218d.m85541a(atomicLong, j);
            C15739d dVar2 = atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }

    /* renamed from: e */
    public static boolean m85525e(AtomicReference<C15739d> atomicReference, AtomicLong atomicLong, C15739d dVar) {
        if (!m85528i(atomicReference, dVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        dVar.request(andSet);
        return true;
    }

    /* renamed from: f */
    public static void m85526f(long j) {
        C12251a.m82985p(new ProtocolViolationException("More produced than requested: " + j));
    }

    /* renamed from: g */
    public static void m85527g() {
        C12251a.m82985p(new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: i */
    public static boolean m85528i(AtomicReference<C15739d> atomicReference, C15739d dVar) {
        C11984b.m82367d(dVar, "s is null");
        if (atomicReference.compareAndSet((Object) null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        m85527g();
        return false;
    }

    /* renamed from: j */
    public static boolean m85529j(long j) {
        if (j > 0) {
            return true;
        }
        C12251a.m82985p(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    /* renamed from: k */
    public static boolean m85530k(C15739d dVar, C15739d dVar2) {
        if (dVar2 == null) {
            C12251a.m82985p(new NullPointerException("next is null"));
            return false;
        } else if (dVar == null) {
            return true;
        } else {
            dVar2.cancel();
            m85527g();
            return false;
        }
    }

    public void cancel() {
    }

    public void request(long j) {
    }
}
