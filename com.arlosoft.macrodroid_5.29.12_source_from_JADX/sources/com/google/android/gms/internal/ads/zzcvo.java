package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcvo implements zzgxi {

    /* renamed from: a */
    private final zzgxv f31686a;

    /* renamed from: b */
    private final zzgxv f31687b;

    /* renamed from: c */
    private final zzgxv f31688c;

    /* renamed from: d */
    private final zzgxv f31689d;

    public zzcvo(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3, zzgxv zzgxv4) {
        this.f31686a = zzgxv;
        this.f31687b = zzgxv2;
        this.f31688c = zzgxv3;
        this.f31689d = zzgxv4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzczu) this.f31686a).mo44512a();
        String str = (String) this.f31689d.zzb();
        boolean equals = "native".equals(str);
        zzt.m2905r();
        return new zzbbm(UUID.randomUUID().toString(), ((zzcpc) this.f31687b).mo44235a(), str, (JSONObject) this.f31688c.zzb(), false, equals);
    }
}
