package com.google.android.gms.dynamic;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaa implements OnDelegateCreatedListener {

    /* renamed from: a */
    final /* synthetic */ DeferredLifecycleHelper f4024a;

    zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f4024a = deferredLifecycleHelper;
    }

    /* renamed from: a */
    public final void mo22048a(LifecycleDelegate lifecycleDelegate) {
        this.f4024a.f4015a = lifecycleDelegate;
        Iterator it = this.f4024a.f4017c.iterator();
        while (it.hasNext()) {
            ((zah) it.next()).mo22051b(this.f4024a.f4015a);
        }
        this.f4024a.f4017c.clear();
        this.f4024a.f4016b = null;
    }
}
