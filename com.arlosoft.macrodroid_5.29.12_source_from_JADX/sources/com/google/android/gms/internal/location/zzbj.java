package com.google.android.gms.internal.location;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbj {
    /* renamed from: a */
    public static Looper m59262a(@Nullable Looper looper) {
        return looper != null ? looper : m59263b();
    }

    /* renamed from: b */
    public static Looper m59263b() {
        Preconditions.m4494q(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
