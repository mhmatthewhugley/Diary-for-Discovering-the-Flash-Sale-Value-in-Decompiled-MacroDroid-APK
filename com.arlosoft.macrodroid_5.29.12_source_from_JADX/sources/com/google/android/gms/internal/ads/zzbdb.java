package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbdb implements Comparator {
    public zzbdb(zzbdc zzbdc) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbcq zzbcq = (zzbcq) obj;
        zzbcq zzbcq2 = (zzbcq) obj2;
        if (zzbcq.mo42480d() >= zzbcq2.mo42480d()) {
            if (zzbcq.mo42480d() > zzbcq2.mo42480d()) {
                return 1;
            }
            if (zzbcq.mo42478b() >= zzbcq2.mo42478b()) {
                if (zzbcq.mo42478b() > zzbcq2.mo42478b()) {
                    return 1;
                }
                float a = (zzbcq.mo42477a() - zzbcq.mo42480d()) * (zzbcq.mo42479c() - zzbcq.mo42478b());
                float a2 = (zzbcq2.mo42477a() - zzbcq2.mo42480d()) * (zzbcq2.mo42479c() - zzbcq2.mo42478b());
                if (a <= a2) {
                    if (a < a2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}
