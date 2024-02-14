package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzggn {

    /* renamed from: a */
    private final Class f36822a;

    /* renamed from: b */
    private final Class f36823b;

    /* synthetic */ zzggn(Class cls, Class cls2, zzggm zzggm) {
        this.f36822a = cls;
        this.f36823b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggn)) {
            return false;
        }
        zzggn zzggn = (zzggn) obj;
        if (!zzggn.f36822a.equals(this.f36822a) || !zzggn.f36823b.equals(this.f36823b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36822a, this.f36823b});
    }

    public final String toString() {
        String simpleName = this.f36822a.getSimpleName();
        String simpleName2 = this.f36823b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
