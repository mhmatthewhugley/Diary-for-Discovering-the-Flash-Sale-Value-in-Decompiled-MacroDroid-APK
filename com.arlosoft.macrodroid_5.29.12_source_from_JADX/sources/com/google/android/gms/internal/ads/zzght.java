package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzght {

    /* renamed from: a */
    private final zzghm f36855a;

    /* renamed from: b */
    private final List f36856b;

    /* renamed from: c */
    private final Integer f36857c;

    /* synthetic */ zzght(zzghm zzghm, List list, Integer num, zzghs zzghs) {
        this.f36855a = zzghm;
        this.f36856b = list;
        this.f36857c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzght)) {
            return false;
        }
        zzght zzght = (zzght) obj;
        if (this.f36855a.equals(zzght.f36855a) && this.f36856b.equals(zzght.f36856b)) {
            Integer num = this.f36857c;
            Integer num2 = zzght.f36857c;
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
        return Arrays.hashCode(new Object[]{this.f36855a, this.f36856b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f36855a, this.f36856b, this.f36857c});
    }
}
