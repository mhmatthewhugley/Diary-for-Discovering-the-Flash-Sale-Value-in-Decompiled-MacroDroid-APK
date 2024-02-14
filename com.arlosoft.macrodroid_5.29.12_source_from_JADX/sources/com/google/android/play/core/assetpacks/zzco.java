package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzco {

    /* renamed from: a */
    private final Map f51415a = new HashMap();

    zzco() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized double mo59708a(String str) {
        Double d = (Double) this.f51415a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized double mo59709b(String str, zzdg zzdg) {
        double d;
        d = (((double) ((zzce) zzdg).f51364h) + 1.0d) / ((double) ((zzce) zzdg).f51365i);
        this.f51415a.put(str, Double.valueOf(d));
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo59710c(String str) {
        this.f51415a.put(str, Double.valueOf(0.0d));
    }
}
