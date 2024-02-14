package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgpn implements Comparator {
    zzgpn() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgpw zzgpw = (zzgpw) obj;
        zzgpw zzgpw2 = (zzgpw) obj2;
        zzgpq O = zzgpw.iterator();
        zzgpq O2 = zzgpw2.iterator();
        while (O.hasNext() && O2.hasNext()) {
            int compareTo = Integer.valueOf(O.zza() & 255).compareTo(Integer.valueOf(O2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgpw.mo47083m()).compareTo(Integer.valueOf(zzgpw2.mo47083m()));
    }
}
