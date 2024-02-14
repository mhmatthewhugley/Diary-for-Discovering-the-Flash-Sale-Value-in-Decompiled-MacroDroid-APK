package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdnz implements zzgxi {

    /* renamed from: a */
    private final zzgxv f32573a;

    /* renamed from: b */
    private final zzgxv f32574b;

    public zzdnz(zzgxv zzgxv, zzgxv zzgxv2) {
        this.f32573a = zzgxv;
        this.f32574b = zzgxv2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgv a = ((zzcpc) this.f32573a).mo44235a();
        zzt.m2905r();
        return new zzbbm(UUID.randomUUID().toString(), a, "native", new JSONObject(), false, true);
    }
}
