package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdcw implements zzgxi {

    /* renamed from: a */
    private final zzdcv f32150a;

    /* renamed from: b */
    private final zzgxv f32151b;

    /* renamed from: c */
    private final zzgxv f32152c;

    /* renamed from: d */
    private final zzgxv f32153d;

    /* renamed from: e */
    private final zzgxv f32154e;

    public zzdcw(zzdcv zzdcv, zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3, zzgxv zzgxv4) {
        this.f32150a = zzdcv;
        this.f32151b = zzgxv;
        this.f32152c = zzgxv2;
        this.f32153d = zzgxv3;
        this.f32154e = zzgxv4;
    }

    @Nullable
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.f32151b.zzb();
        zzcgv a = ((zzcpc) this.f32152c).mo44235a();
        zzfdk a2 = ((zzczu) this.f32153d).mo44512a();
        zzcdm zzcdm = new zzcdm();
        if (a2.f35494B != null) {
            return new zzcdl(context, a, a2.f35494B, a2.f35554t.f35578b, zzcdm, (byte[]) null);
        }
        return null;
    }
}
