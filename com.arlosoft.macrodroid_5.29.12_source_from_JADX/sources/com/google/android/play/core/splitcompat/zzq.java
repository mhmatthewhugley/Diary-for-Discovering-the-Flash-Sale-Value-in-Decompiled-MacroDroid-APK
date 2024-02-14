package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Set f51788a;

    /* renamed from: c */
    final /* synthetic */ SplitCompat f51789c;

    zzq(SplitCompat splitCompat, Set set) {
        this.f51789c = splitCompat;
        this.f51788a = set;
    }

    public final void run() {
        try {
            this.f51789c.m71060f(this.f51788a);
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
        }
    }
}
