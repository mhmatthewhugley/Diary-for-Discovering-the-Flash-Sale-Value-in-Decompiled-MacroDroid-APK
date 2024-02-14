package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzjj {

    /* renamed from: a */
    private final zzjc f40210a;

    /* renamed from: b */
    private final List f40211b;

    /* renamed from: c */
    private final Integer f40212c;

    /* synthetic */ zzjj(zzjc zzjc, List list, Integer num, zzji zzji) {
        this.f40210a = zzjc;
        this.f40211b = list;
        this.f40212c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjj)) {
            return false;
        }
        zzjj zzjj = (zzjj) obj;
        if (this.f40210a.equals(zzjj.f40210a) && this.f40211b.equals(zzjj.f40211b)) {
            Integer num = this.f40212c;
            Integer num2 = zzjj.f40212c;
            if (num == num2) {
                return true;
            }
            if (num == null || !num.equals(num2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40210a, this.f40211b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f40210a, this.f40211b, this.f40212c});
    }
}
