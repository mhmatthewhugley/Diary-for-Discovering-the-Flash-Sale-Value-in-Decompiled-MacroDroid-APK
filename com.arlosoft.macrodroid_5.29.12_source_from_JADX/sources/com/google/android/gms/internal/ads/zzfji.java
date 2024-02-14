package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzfji {
    /* renamed from: a */
    public static zzfjj m50258a(Context context, int i) {
        boolean z;
        if (zzfjw.m50333a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        z = ((Boolean) zzbkl.f27408c.mo42728e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        z = ((Boolean) zzbkl.f27409d.mo42728e()).booleanValue();
                        break;
                    case 5:
                        z = ((Boolean) zzbkl.f27407b.mo42728e()).booleanValue();
                        break;
                }
            } else {
                z = ((Boolean) zzbkl.f27410e.mo42728e()).booleanValue();
            }
            if (z) {
                return new zzfjl(context, i);
            }
        }
        return new zzfkf();
    }

    /* renamed from: b */
    public static zzfjj m50259b(Context context, int i, int i2, zzl zzl) {
        zzfjj a = m50258a(context, i);
        if (!(a instanceof zzfjl)) {
            return a;
        }
        a.mo45794c();
        a.mo45802q0(i2);
        if (zzfjt.m50322e(zzl.f1988G)) {
            a.mo45800h0(zzl.f1988G);
        }
        return a;
    }
}
