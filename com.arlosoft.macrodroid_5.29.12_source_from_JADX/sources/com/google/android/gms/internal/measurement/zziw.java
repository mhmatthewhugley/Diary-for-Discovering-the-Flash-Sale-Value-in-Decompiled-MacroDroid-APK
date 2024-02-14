package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zziw implements Comparator {
    zziw() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzje zzje = (zzje) obj;
        zzje zzje2 = (zzje) obj2;
        zziv zziv = new zziv(zzje);
        zziv zziv2 = new zziv(zzje2);
        while (zziv.hasNext() && zziv2.hasNext()) {
            int compareTo = Integer.valueOf(zziv.zza() & 255).compareTo(Integer.valueOf(zziv2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzje.mo51336f()).compareTo(Integer.valueOf(zzje2.mo51336f()));
    }
}
