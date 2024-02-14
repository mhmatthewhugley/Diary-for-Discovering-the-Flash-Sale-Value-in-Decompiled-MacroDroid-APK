package com.google.android.play.core.internal;

import android.util.Log;
import com.google.android.play.core.splitinstall.zzf;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzav implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f51686a;

    /* renamed from: c */
    final /* synthetic */ zzf f51687c;

    /* renamed from: d */
    final /* synthetic */ zzaw f51688d;

    zzav(zzaw zzaw, List list, zzf zzf) {
        this.f51688d = zzaw;
        this.f51686a = list;
        this.f51687c = zzf;
    }

    public final void run() {
        try {
            if (this.f51688d.f51691c.mo59828b(this.f51686a)) {
                zzaw.m70831d(this.f51688d, this.f51687c);
            } else {
                zzaw.m70830c(this.f51688d, this.f51686a, this.f51687c);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Error checking verified files.", e);
            this.f51687c.mo59995B(-11);
        }
    }
}
