package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List f2207a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List f2208b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List f2209c = new ArrayList();

    /* renamed from: a */
    public final zzbd mo20320a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f2207a.size()) {
            double doubleValue = ((Double) this.f2209c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f2208b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f2207a.add(i, str);
        this.f2209c.add(i, Double.valueOf(d));
        this.f2208b.add(i, Double.valueOf(d2));
        return this;
    }

    /* renamed from: b */
    public final zzbf mo20321b() {
        return new zzbf(this, (zzbe) null);
    }
}
