package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcdz {

    /* renamed from: a */
    private Context f28276a;

    /* renamed from: b */
    private Clock f28277b;

    /* renamed from: c */
    private zzg f28278c;

    /* renamed from: d */
    private zzceu f28279d;

    private zzcdz() {
    }

    /* synthetic */ zzcdz(zzcdy zzcdy) {
    }

    /* renamed from: a */
    public final zzcdz mo43413a(zzg zzg) {
        this.f28278c = zzg;
        return this;
    }

    /* renamed from: b */
    public final zzcdz mo43414b(Context context) {
        Objects.requireNonNull(context);
        this.f28276a = context;
        return this;
    }

    /* renamed from: c */
    public final zzcdz mo43415c(Clock clock) {
        Objects.requireNonNull(clock);
        this.f28277b = clock;
        return this;
    }

    /* renamed from: d */
    public final zzcdz mo43416d(zzceu zzceu) {
        this.f28279d = zzceu;
        return this;
    }

    /* renamed from: e */
    public final zzcev mo43417e() {
        zzgxq.m53659c(this.f28276a, Context.class);
        zzgxq.m53659c(this.f28277b, Clock.class);
        zzgxq.m53659c(this.f28278c, zzg.class);
        zzgxq.m53659c(this.f28279d, zzceu.class);
        return new zzceb(this.f28276a, this.f28277b, this.f28278c, this.f28279d, (zzcea) null);
    }
}
