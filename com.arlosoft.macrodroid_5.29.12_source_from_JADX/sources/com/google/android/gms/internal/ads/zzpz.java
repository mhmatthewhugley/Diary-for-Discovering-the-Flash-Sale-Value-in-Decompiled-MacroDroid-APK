package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzpz {
    /* renamed from: a */
    public static /* synthetic */ boolean m54581a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet((Object) null, obj2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
