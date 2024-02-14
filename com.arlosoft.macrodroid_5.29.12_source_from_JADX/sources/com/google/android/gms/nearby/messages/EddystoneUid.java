package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.nearby.messages.internal.zzg;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class EddystoneUid {

    /* renamed from: a */
    private final zzg f47621a;

    @NonNull
    /* renamed from: a */
    public String mo55871a() {
        return this.f47621a.mo55983a();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EddystoneUid)) {
            return false;
        }
        return Objects.m4470a(this.f47621a, ((EddystoneUid) obj).f47621a);
    }

    public int hashCode() {
        return Objects.m4471b(this.f47621a);
    }

    @NonNull
    public String toString() {
        String a = mo55871a();
        return "EddystoneUid{id=" + a + "}";
    }
}
