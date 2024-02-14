package com.google.android.play.core.splitcompat;

import android.util.Log;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplitCompat f51787a;

    zzp(SplitCompat splitCompat) {
        this.f51787a = splitCompat;
    }

    public final void run() {
        try {
            this.f51787a.f51759a.mo59951k();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
