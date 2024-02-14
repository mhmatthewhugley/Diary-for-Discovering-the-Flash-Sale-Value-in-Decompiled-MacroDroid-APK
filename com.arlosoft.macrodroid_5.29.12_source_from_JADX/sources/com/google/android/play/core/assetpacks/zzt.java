package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.zzco;
import com.google.android.play.core.internal.zzcq;
import com.google.android.play.core.internal.zzcr;
import com.google.android.play.core.internal.zzcs;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzt implements zzcs {

    /* renamed from: a */
    private final zzcs f51636a;

    /* renamed from: b */
    private final zzcs f51637b;

    /* renamed from: c */
    private final zzcs f51638c;

    public zzt(zzcs zzcs, zzcs zzcs2, zzcs zzcs3) {
        this.f51636a = zzcs;
        this.f51637b = zzcs2;
        this.f51638c = zzcs3;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzy zzy;
        Context a = ((zzu) this.f51636a).mo59787a();
        zzco a2 = zzcq.m70942a(this.f51637b);
        zzco a3 = zzcq.m70942a(this.f51638c);
        if (zzp.m70752b(a) == null) {
            zzy = (zzy) a2.zza();
        } else {
            zzy = (zzy) a3.zza();
        }
        zzcr.m70944a(zzy);
        return zzy;
    }
}
