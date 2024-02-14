package com.google.mlkit.common.sdkinternal;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzr implements OnFailureListener {

    /* renamed from: a */
    public static final /* synthetic */ zzr f56424a = new zzr();

    private /* synthetic */ zzr() {
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }
}
