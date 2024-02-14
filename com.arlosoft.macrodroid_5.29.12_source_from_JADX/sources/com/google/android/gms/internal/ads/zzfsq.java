package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzfsq {

    /* renamed from: a */
    private final String f36345a;

    /* renamed from: b */
    private final zzfsp f36346b;

    /* renamed from: c */
    private zzfsp f36347c;

    /* synthetic */ zzfsq(String str, zzfso zzfso) {
        zzfsp zzfsp = new zzfsp((zzfso) null);
        this.f36346b = zzfsp;
        this.f36347c = zzfsp;
        Objects.requireNonNull(str);
        this.f36345a = str;
    }

    /* renamed from: a */
    public final zzfsq mo46170a(Object obj) {
        zzfsp zzfsp = new zzfsp((zzfso) null);
        this.f36347c.f36344b = zzfsp;
        this.f36347c = zzfsp;
        zzfsp.f36343a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f36345a);
        sb.append('{');
        zzfsp zzfsp = this.f36346b.f36344b;
        String str = "";
        while (zzfsp != null) {
            Object obj = zzfsp.f36343a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzfsp = zzfsp.f36344b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
