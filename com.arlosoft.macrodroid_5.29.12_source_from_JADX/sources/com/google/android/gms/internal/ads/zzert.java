package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzert implements zzgxi {

    /* renamed from: a */
    private final zzgxv f34807a;

    /* renamed from: b */
    private final zzgxv f34808b;

    public zzert(zzgxv zzgxv, zzgxv zzgxv2) {
        this.f34807a = zzgxv;
        this.f34808b = zzgxv2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzero(((zzerj) this.f34807a).zzb(), WorkRequest.MIN_BACKOFF_MILLIS, (Clock) this.f34808b.zzb());
    }
}
