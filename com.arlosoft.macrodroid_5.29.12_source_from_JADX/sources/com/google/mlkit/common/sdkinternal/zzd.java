package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.Cleaner;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzd extends PhantomReference implements Cleaner.Cleanable {

    /* renamed from: a */
    private final Set f56398a;

    /* renamed from: c */
    private final Runnable f56399c;

    /* synthetic */ zzd(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, zzc zzc) {
        super(obj, referenceQueue);
        this.f56398a = set;
        this.f56399c = runnable;
    }

    /* renamed from: a */
    public final void mo64543a() {
        if (this.f56398a.remove(this)) {
            clear();
            this.f56399c.run();
        }
    }
}
