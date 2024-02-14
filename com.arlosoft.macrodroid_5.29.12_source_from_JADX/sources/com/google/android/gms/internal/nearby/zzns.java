package com.google.android.gms.internal.nearby;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzns {

    /* renamed from: a */
    private final Map f44977a = new WeakHashMap();

    /* renamed from: a */
    public final Object mo53034a(Object obj) {
        WeakReference weakReference = (WeakReference) this.f44977a.get(obj);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: b */
    public final void mo53035b() {
        this.f44977a.clear();
    }

    /* renamed from: c */
    public final void mo53036c(Object obj, Object obj2) {
        this.f44977a.put(obj, new WeakReference(obj2));
    }

    /* renamed from: d */
    public final void mo53037d(Object obj) {
        this.f44977a.remove(obj);
    }

    /* renamed from: e */
    public final boolean mo53038e(Object obj) {
        return mo53034a(obj) != null;
    }
}
