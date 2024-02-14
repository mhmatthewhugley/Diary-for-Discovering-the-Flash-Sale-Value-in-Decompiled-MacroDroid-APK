package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzt extends zzq implements Serializable {
    private final Pattern zza;

    zzt(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.zza = pattern;
    }

    /* renamed from: a */
    public final zzp mo49716a(CharSequence charSequence) {
        return new zzs(this.zza.matcher(charSequence));
    }

    public final String toString() {
        return this.zza.toString();
    }
}
