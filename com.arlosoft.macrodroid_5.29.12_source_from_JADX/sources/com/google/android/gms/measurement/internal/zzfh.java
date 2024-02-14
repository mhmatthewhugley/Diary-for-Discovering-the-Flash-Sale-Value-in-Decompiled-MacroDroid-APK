package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzfh implements zzo {

    /* renamed from: a */
    final /* synthetic */ String f46775a;

    /* renamed from: b */
    final /* synthetic */ zzfi f46776b;

    zzfh(zzfi zzfi, String str) {
        this.f46776b = zzfi;
        this.f46775a = str;
    }

    /* renamed from: o */
    public final String mo51665o(String str) {
        Map map = (Map) this.f46776b.f46777d.get(this.f46775a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
