package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.util.Log;
import com.google.android.play.core.splitinstall.zzx;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f51785a;

    public /* synthetic */ zzn(Context context) {
        this.f51785a = context;
    }

    public final void run() {
        Context context = this.f51785a;
        int i = SplitCompat.f51758f;
        try {
            zzx.m71229g(context).mo59912c(true);
        } catch (SecurityException unused) {
            Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
        }
    }
}
