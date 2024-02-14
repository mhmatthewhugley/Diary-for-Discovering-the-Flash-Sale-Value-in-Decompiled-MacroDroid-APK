package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class HashAccumulator {
    @VisibleForTesting

    /* renamed from: b */
    static int f2914b = 31;

    /* renamed from: a */
    private int f2915a = 1;

    @NonNull
    @KeepForSdk
    @CanIgnoreReturnValue
    /* renamed from: a */
    public HashAccumulator mo21005a(@Nullable Object obj) {
        this.f2915a = (f2914b * this.f2915a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    /* renamed from: b */
    public int mo21006b() {
        return this.f2915a;
    }

    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: c */
    public final HashAccumulator mo21007c(boolean z) {
        this.f2915a = (f2914b * this.f2915a) + (z ? 1 : 0);
        return this;
    }
}
