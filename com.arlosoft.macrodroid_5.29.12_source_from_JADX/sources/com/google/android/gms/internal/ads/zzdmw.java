package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdmw implements zzczh {

    /* renamed from: a */
    private final Map f32490a;

    /* renamed from: b */
    private final Map f32491b;

    /* renamed from: c */
    private final Map f32492c;

    /* renamed from: d */
    private final zzgxv f32493d;

    /* renamed from: e */
    private final zzdpb f32494e;

    zzdmw(Map map, Map map2, Map map3, zzgxv zzgxv, zzdpb zzdpb) {
        this.f32490a = map;
        this.f32491b = map2;
        this.f32492c = map3;
        this.f32493d = zzgxv;
        this.f32494e = zzdpb;
    }

    @Nullable
    /* renamed from: a */
    public final zzehc mo44501a(int i, String str) {
        zzehc a;
        zzehc zzehc = (zzehc) this.f32490a.get(str);
        if (zzehc != null) {
            return zzehc;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzejp zzejp = (zzejp) this.f32492c.get(str);
            if (zzejp != null) {
                return new zzehd(zzejp, zzczj.f31905a);
            }
            zzehc zzehc2 = (zzehc) this.f32491b.get(str);
            if (zzehc2 == null) {
                return null;
            }
            return zzczl.m47078a(zzehc2);
        } else if (this.f32494e.mo44866e() == null || (a = ((zzczh) this.f32493d.zzb()).mo44501a(i, str)) == null) {
            return null;
        } else {
            return zzczl.m47078a(a);
        }
    }
}
