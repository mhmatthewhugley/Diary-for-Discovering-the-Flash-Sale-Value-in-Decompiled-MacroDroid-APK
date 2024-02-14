package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class UwbComplexChannel {

    /* renamed from: a */
    private final int f47847a;

    /* renamed from: b */
    private final int f47848b;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Builder {

        /* renamed from: a */
        private int f47849a;

        /* renamed from: b */
        private int f47850b;

        @NonNull
        /* renamed from: a */
        public UwbComplexChannel mo56055a() {
            return new UwbComplexChannel(this.f47849a, this.f47850b, (zzb) null);
        }

        @NonNull
        /* renamed from: b */
        public Builder mo56056b(int i) {
            this.f47849a = i;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder mo56057c(int i) {
            this.f47850b = i;
            return this;
        }
    }

    /* synthetic */ UwbComplexChannel(int i, int i2, zzb zzb) {
        this.f47847a = i;
        this.f47848b = i2;
    }

    /* renamed from: a */
    public int mo56050a() {
        return this.f47847a;
    }

    /* renamed from: b */
    public int mo56051b() {
        return this.f47848b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbComplexChannel)) {
            return false;
        }
        UwbComplexChannel uwbComplexChannel = (UwbComplexChannel) obj;
        return this.f47847a == uwbComplexChannel.f47847a && this.f47848b == uwbComplexChannel.f47848b;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47847a), Integer.valueOf(this.f47848b));
    }

    @NonNull
    public String toString() {
        int i = this.f47847a;
        int i2 = this.f47848b;
        return "UwbComplexChannel{channel=" + i + ", preambleIndex=" + i2 + "}";
    }
}
