package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: androidx.concurrent.futures.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0320a {
    /* renamed from: a */
    public static /* synthetic */ boolean m383a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}