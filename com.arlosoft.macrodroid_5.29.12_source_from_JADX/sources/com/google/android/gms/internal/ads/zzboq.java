package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzboq implements zzbpu {

    /* renamed from: a */
    private final zzbor f27592a;

    public zzboq(zzbor zzbor) {
        this.f27592a = zzbor;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzcgp.m45229g("App event with no name parameter.");
        } else {
            this.f27592a.mo42869x0(str, (String) map.get("info"));
        }
    }
}
