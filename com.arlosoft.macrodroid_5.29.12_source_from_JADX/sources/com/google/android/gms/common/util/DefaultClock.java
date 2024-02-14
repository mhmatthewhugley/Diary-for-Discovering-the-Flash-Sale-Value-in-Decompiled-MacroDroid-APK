package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class DefaultClock implements Clock {

    /* renamed from: a */
    private static final DefaultClock f3931a = new DefaultClock();

    private DefaultClock() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public static Clock m4871d() {
        return f3931a;
    }

    /* renamed from: a */
    public final long mo21950a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo21951b() {
        return System.nanoTime();
    }

    /* renamed from: c */
    public final long mo21952c() {
        return SystemClock.elapsedRealtime();
    }
}
