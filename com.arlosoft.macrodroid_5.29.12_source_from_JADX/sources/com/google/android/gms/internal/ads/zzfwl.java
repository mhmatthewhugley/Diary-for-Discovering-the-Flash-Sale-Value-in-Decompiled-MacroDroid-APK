package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfwl extends zzfwp {

    /* renamed from: a */
    final /* synthetic */ Comparator f36498a;

    zzfwl(Comparator comparator) {
        this.f36498a = comparator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map mo46505a() {
        return new TreeMap(this.f36498a);
    }
}
