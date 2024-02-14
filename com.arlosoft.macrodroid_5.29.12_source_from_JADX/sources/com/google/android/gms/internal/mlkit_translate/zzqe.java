package com.google.android.gms.internal.mlkit_translate;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzqe extends LazyInstanceMap {
    private zzqe() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52014a(Object obj) {
        zzpl zzpl = (zzpl) obj;
        MlKitContext c = MlKitContext.m79040c();
        return new zzps(c.mo64554b(), (SharedPrefManager) c.mo64553a(SharedPrefManager.class), new zzpm(MlKitContext.m79040c().mo64554b(), zzpl), zzpl.mo52408b());
    }

    /* synthetic */ zzqe(zzqd zzqd) {
    }
}
