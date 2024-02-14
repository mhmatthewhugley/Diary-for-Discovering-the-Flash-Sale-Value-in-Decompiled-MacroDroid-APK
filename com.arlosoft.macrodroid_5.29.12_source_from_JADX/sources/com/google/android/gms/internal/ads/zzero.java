package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzero implements zzeve {

    /* renamed from: a */
    private final AtomicReference f34792a = new AtomicReference();

    /* renamed from: b */
    private final Clock f34793b;

    /* renamed from: c */
    private final zzeve f34794c;

    /* renamed from: d */
    private final long f34795d;

    public zzero(zzeve zzeve, long j, Clock clock) {
        this.f34793b = clock;
        this.f34794c = zzeve;
        this.f34795d = j;
    }

    public final int zza() {
        return 16;
    }

    public final zzfzp zzb() {
        zzern zzern = (zzern) this.f34792a.get();
        if (zzern == null || zzern.mo45447a()) {
            zzern = new zzern(this.f34794c.zzb(), this.f34795d, this.f34793b);
            this.f34792a.set(zzern);
        }
        return zzern.f34789a;
    }
}
