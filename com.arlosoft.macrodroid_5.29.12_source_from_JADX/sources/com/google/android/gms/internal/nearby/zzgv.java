package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgv extends zzki {

    /* renamed from: a */
    private final BaseImplementation.ResultHolder f44680a;

    zzgv(BaseImplementation.ResultHolder resultHolder) {
        this.f44680a = (BaseImplementation.ResultHolder) Preconditions.m4488k(resultHolder);
    }

    /* renamed from: B */
    public final void mo52736B(int i) {
        Status y0 = zzgy.m62516w0(i);
        if (y0.mo21297q2()) {
            this.f44680a.mo21038a(y0);
        } else {
            this.f44680a.mo21321b(y0);
        }
    }
}
