package com.google.mlkit.common.sdkinternal;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zza implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReferenceQueue f56395a;

    /* renamed from: c */
    public final /* synthetic */ Set f56396c;

    public /* synthetic */ zza(ReferenceQueue referenceQueue, Set set) {
        this.f56395a = referenceQueue;
        this.f56396c = set;
    }

    public final void run() {
        ReferenceQueue referenceQueue = this.f56395a;
        Set set = this.f56396c;
        while (!set.isEmpty()) {
            try {
                ((zzd) referenceQueue.remove()).mo64543a();
            } catch (InterruptedException unused) {
            }
        }
    }
}
