package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeg implements zzde {
    protected zzeg() {
    }

    /* renamed from: a */
    public final zzdn mo44586a(Looper looper, @Nullable Handler.Callback callback) {
        return new zzej(new Handler(looper, callback));
    }

    public final long zza() {
        return SystemClock.elapsedRealtime();
    }
}
