package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzhd {

    /* renamed from: a */
    private final Class f40120a;

    /* renamed from: b */
    private final zzqv f40121b;

    /* synthetic */ zzhd(Class cls, zzqv zzqv, zzhc zzhc) {
        this.f40120a = cls;
        this.f40121b = zzqv;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhd)) {
            return false;
        }
        zzhd zzhd = (zzhd) obj;
        if (!zzhd.f40120a.equals(this.f40120a) || !zzhd.f40121b.equals(this.f40121b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40120a, this.f40121b});
    }

    public final String toString() {
        String simpleName = this.f40120a.getSimpleName();
        String valueOf = String.valueOf(this.f40121b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
