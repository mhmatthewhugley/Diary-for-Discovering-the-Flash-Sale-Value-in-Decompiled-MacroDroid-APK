package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class BooleanResult implements Result {

    /* renamed from: a */
    private final Status f3091a;

    /* renamed from: c */
    private final boolean f3092c;

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        return this.f3091a.equals(booleanResult.f3091a) && this.f3092c == booleanResult.f3092c;
    }

    @NonNull
    public Status getStatus() {
        return this.f3091a;
    }

    public final int hashCode() {
        return ((this.f3091a.hashCode() + 527) * 31) + (this.f3092c ? 1 : 0);
    }
}
