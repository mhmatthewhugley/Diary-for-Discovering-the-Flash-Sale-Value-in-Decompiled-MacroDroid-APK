package com.google.firebase.appindexing;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class AndroidAppUri {

    /* renamed from: a */
    private final Uri f53828a;

    public boolean equals(@NonNull Object obj) {
        if (obj instanceof AndroidAppUri) {
            return this.f53828a.equals(((AndroidAppUri) obj).f53828a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(this.f53828a);
    }

    @NonNull
    public String toString() {
        return this.f53828a.toString();
    }
}
