package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzarn extends zzarq {

    /* renamed from: z */
    private final View f25375z;

    public zzarn(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2, View view) {
        super(zzaqe, "xcWDoPM3ZfO4P10VSUmZKRTMvsXPXnglJL31bwAJBgJGdSUy2IQG17s4MILOncV2", "9rXsTdb/WXYONX554dN5CJ2eqpcy9gFPMPi8uAjaHTA=", zzamk, i, 57);
        this.f25375z = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        if (this.f25375z != null) {
            Boolean bool = (Boolean) zzay.m1924c().mo42663b(zzbjc.f26839D2);
            Boolean bool2 = (Boolean) zzay.m1924c().mo42663b(zzbjc.f26835C8);
            DisplayMetrics displayMetrics = this.f25384c.mo41806b().getResources().getDisplayMetrics();
            zzaqi zzaqi = new zzaqi((String) this.f25388o.invoke((Object) null, new Object[]{this.f25375z, displayMetrics, bool, bool2}));
            zzamy F = zzamz.m41864F();
            F.mo41730o(zzaqi.f25320a.longValue());
            F.mo41732v(zzaqi.f25321b.longValue());
            F.mo41733x(zzaqi.f25322c.longValue());
            if (bool2.booleanValue()) {
                F.mo41731u(zzaqi.f25324e.longValue());
            }
            if (bool.booleanValue()) {
                F.mo41729n(zzaqi.f25323d.longValue());
            }
            this.f25387g.mo41679V((zzamz) F.mo47341h());
        }
    }
}
