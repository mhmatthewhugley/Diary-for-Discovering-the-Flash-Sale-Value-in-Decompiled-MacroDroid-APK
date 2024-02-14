package com.google.android.gms.common.server.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Nullable
    @VisibleForTesting
    /* renamed from: c */
    public Object mo21898c(@NonNull String str) {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    @VisibleForTesting
    /* renamed from: e */
    public boolean mo21899e(@NonNull String str) {
        return false;
    }

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : mo20789a().values()) {
            if (mo20791d(next)) {
                if (!fastJsonResponse.mo20791d(next) || !Objects.m4470a(mo20790b(next), fastJsonResponse.mo20790b(next))) {
                    return false;
                }
            } else if (fastJsonResponse.mo20791d(next)) {
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field next : mo20789a().values()) {
            if (mo20791d(next)) {
                i = (i * 31) + Preconditions.m4488k(mo20790b(next)).hashCode();
            }
        }
        return i;
    }
}
