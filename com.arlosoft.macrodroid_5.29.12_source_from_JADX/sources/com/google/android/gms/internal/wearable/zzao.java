package com.google.android.gms.internal.wearable;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzao implements Comparator {
    zzao() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzaw zzaw = (zzaw) obj;
        zzaw zzaw2 = (zzaw) obj2;
        zzan zzan = new zzan(zzaw);
        zzan zzan2 = new zzan(zzaw2);
        while (zzan.hasNext() && zzan2.hasNext()) {
            int compareTo = Integer.valueOf(zzan.zza() & 255).compareTo(Integer.valueOf(zzan2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzaw.mo53831f()).compareTo(Integer.valueOf(zzaw2.mo53831f()));
    }
}
