package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.nearby.zzth;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class UwbAddress {

    /* renamed from: b */
    private static final zzth f47845b = zzth.m63061d().mo53297c(":", 2);

    /* renamed from: a */
    private final byte[] f47846a;

    public UwbAddress(@NonNull byte[] bArr) {
        this.f47846a = bArr;
    }

    @NonNull
    /* renamed from: a */
    public byte[] mo56046a() {
        return this.f47846a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbAddress)) {
            return false;
        }
        return Arrays.equals(this.f47846a, ((UwbAddress) obj).f47846a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f47846a);
    }

    @NonNull
    public String toString() {
        zzth zzth = f47845b;
        byte[] bArr = this.f47846a;
        return zzth.mo53303e(bArr, 0, bArr.length);
    }
}
