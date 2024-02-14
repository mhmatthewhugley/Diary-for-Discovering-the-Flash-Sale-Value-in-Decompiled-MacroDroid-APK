package com.google.android.gms.internal.icing;

import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzby implements Comparator<zzcf> {
    zzby() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzcf zzcf = (zzcf) obj;
        zzcf zzcf2 = (zzcf) obj2;
        zzbx zzbx = new zzbx(zzcf);
        zzbx zzbx2 = new zzbx(zzcf2);
        while (zzbx.hasNext() && zzbx2.hasNext()) {
            int compare = Integer.compare(zzbx.zza() & 255, zzbx2.zza() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzcf.mo50214f(), zzcf2.mo50214f());
    }
}
