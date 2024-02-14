package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class UwbDevice {

    /* renamed from: a */
    private final UwbAddress f47851a;

    private UwbDevice(UwbAddress uwbAddress) {
        this.f47851a = uwbAddress;
    }

    @NonNull
    /* renamed from: a */
    public static UwbDevice m66556a(@NonNull byte[] bArr) {
        return new UwbDevice(new UwbAddress(bArr));
    }

    @NonNull
    /* renamed from: b */
    public UwbAddress mo56058b() {
        return this.f47851a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbDevice)) {
            return false;
        }
        UwbAddress uwbAddress = this.f47851a;
        UwbAddress uwbAddress2 = ((UwbDevice) obj).f47851a;
        return uwbAddress == uwbAddress2 || uwbAddress.equals(uwbAddress2);
    }

    public int hashCode() {
        return this.f47851a.hashCode();
    }

    @NonNull
    public String toString() {
        return String.format("UwbDevice {%s}", new Object[]{this.f47851a});
    }
}
