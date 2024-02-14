package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.nearby.messages.internal.zzl;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class IBeaconId {

    /* renamed from: a */
    private final zzl f47622a;

    /* renamed from: a */
    public short mo55875a() {
        return this.f47622a.mo56019d().shortValue();
    }

    /* renamed from: b */
    public short mo55876b() {
        return this.f47622a.mo56020e().shortValue();
    }

    @NonNull
    /* renamed from: c */
    public UUID mo55877c() {
        return this.f47622a.mo56021f();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IBeaconId)) {
            return false;
        }
        return Objects.m4470a(this.f47622a, ((IBeaconId) obj).f47622a);
    }

    public int hashCode() {
        return Objects.m4471b(this.f47622a);
    }

    @NonNull
    public String toString() {
        String valueOf = String.valueOf(mo55877c());
        short a = mo55875a();
        short b = mo55876b();
        return "IBeaconId{proximityUuid=" + valueOf + ", major=" + a + ", minor=" + b + "}";
    }
}
