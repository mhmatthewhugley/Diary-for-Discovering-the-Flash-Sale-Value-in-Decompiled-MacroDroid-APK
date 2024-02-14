package com.google.android.gms.internal.nearby;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzhl implements OnFailureListener {

    /* renamed from: a */
    public static final /* synthetic */ zzhl f44730a = new zzhl();

    private /* synthetic */ zzhl() {
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        Log.w("NearbyConnections", "Failed to start discovery.", exc);
    }
}
