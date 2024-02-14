package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfyj extends zzfyi {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f36588a;

    /* renamed from: b */
    final AtomicIntegerFieldUpdater f36589b;

    zzfyj(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((zzfyh) null);
        this.f36588a = atomicReferenceFieldUpdater;
        this.f36589b = atomicIntegerFieldUpdater;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo46598a(zzfyl zzfyl) {
        return this.f36589b.decrementAndGet(zzfyl);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP:0: B:1:0x0002->B:4:0x000e, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46599b(com.google.android.gms.internal.ads.zzfyl r2, java.util.Set r3, java.util.Set r4) {
        /*
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = r1.f36588a
        L_0x0002:
            r0 = 0
            boolean r0 = androidx.concurrent.futures.C0320a.m383a(r3, r2, r0, r4)
            if (r0 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            java.lang.Object r0 = r3.get(r2)
            if (r0 == 0) goto L_0x0002
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfyj.mo46599b(com.google.android.gms.internal.ads.zzfyl, java.util.Set, java.util.Set):void");
    }
}
