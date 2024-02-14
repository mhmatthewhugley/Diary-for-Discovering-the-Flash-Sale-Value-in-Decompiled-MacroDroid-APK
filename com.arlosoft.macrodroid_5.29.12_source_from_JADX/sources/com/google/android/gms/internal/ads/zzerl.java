package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzerl implements zzeve {
    @Nullable

    /* renamed from: a */
    private final zzfag f34787a;

    zzerl(@Nullable zzfag zzfag) {
        this.f34787a = zzfag;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo45446a(Bundle bundle) {
        bundle.putString("key_schema", this.f34787a.mo45564a());
    }

    public final int zza() {
        return 15;
    }

    public final zzfzp zzb() {
        zzfag zzfag = this.f34787a;
        zzerk zzerk = null;
        if (!(zzfag == null || zzfag.mo45564a() == null || zzfag.mo45564a().isEmpty())) {
            zzerk = new zzerk(this);
        }
        return zzfzg.m51414i(zzerk);
    }
}
