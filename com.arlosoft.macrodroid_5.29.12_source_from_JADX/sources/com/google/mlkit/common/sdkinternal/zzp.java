package com.google.mlkit.common.sdkinternal;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzp implements OnFailureListener {

    /* renamed from: a */
    public static final /* synthetic */ zzp f56423a = new zzp();

    private /* synthetic */ zzp() {
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }
}
