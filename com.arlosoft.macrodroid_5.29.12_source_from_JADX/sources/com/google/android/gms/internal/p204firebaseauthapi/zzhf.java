package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzhf {

    /* renamed from: a */
    private final Class f40122a;

    /* renamed from: b */
    private final Class f40123b;

    /* synthetic */ zzhf(Class cls, Class cls2, zzhe zzhe) {
        this.f40122a = cls;
        this.f40123b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhf)) {
            return false;
        }
        zzhf zzhf = (zzhf) obj;
        if (!zzhf.f40122a.equals(this.f40122a) || !zzhf.f40123b.equals(this.f40123b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40122a, this.f40123b});
    }

    public final String toString() {
        String simpleName = this.f40122a.getSimpleName();
        String simpleName2 = this.f40123b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
