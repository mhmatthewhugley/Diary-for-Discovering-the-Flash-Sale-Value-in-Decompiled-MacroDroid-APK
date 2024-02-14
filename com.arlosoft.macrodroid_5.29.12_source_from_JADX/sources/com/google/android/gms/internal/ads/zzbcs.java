package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbcs implements Comparator {
    zzbcs(zzbcu zzbcu) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbcy zzbcy = (zzbcy) obj;
        zzbcy zzbcy2 = (zzbcy) obj2;
        int i = zzbcy.f26638c - zzbcy2.f26638c;
        if (i != 0) {
            return i;
        }
        return (zzbcy.f26636a > zzbcy2.f26636a ? 1 : (zzbcy.f26636a == zzbcy2.f26636a ? 0 : -1));
    }
}
