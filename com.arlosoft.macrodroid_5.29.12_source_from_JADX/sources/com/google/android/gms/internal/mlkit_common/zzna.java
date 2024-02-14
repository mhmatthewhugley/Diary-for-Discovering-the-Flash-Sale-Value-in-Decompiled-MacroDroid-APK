package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzna extends LazyInstanceMap {
    private zzna() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52014a(Object obj) {
        zzmj zzmj = (zzmj) obj;
        MlKitContext c = MlKitContext.m79040c();
        return new zzmq(c.mo64554b(), (SharedPrefManager) c.mo64553a(SharedPrefManager.class), new zzmk(MlKitContext.m79040c().mo64554b(), zzmj), zzmj.mo51974b());
    }

    /* synthetic */ zzna(zzmz zzmz) {
    }
}
