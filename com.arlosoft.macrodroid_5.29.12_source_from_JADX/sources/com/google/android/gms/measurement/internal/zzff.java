package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzff extends LruCache {

    /* renamed from: a */
    final /* synthetic */ zzfi f46773a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzff(zzfi zzfi, int i) {
        super(20);
        this.f46773a = zzfi;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.m4484g(str);
        return zzfi.m65628q(this.f46773a, str);
    }
}
