package com.google.android.gms.appindexing;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class AndroidAppUri {

    /* renamed from: a */
    private final Uri f2626a;

    public boolean equals(Object obj) {
        if (obj instanceof AndroidAppUri) {
            return this.f2626a.equals(((AndroidAppUri) obj).f2626a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(this.f2626a);
    }

    @NonNull
    public String toString() {
        return this.f2626a.toString();
    }
}
