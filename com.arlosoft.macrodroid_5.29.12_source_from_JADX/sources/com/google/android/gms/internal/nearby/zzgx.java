package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgx extends zzkl {

    /* renamed from: a */
    private final BaseImplementation.ResultHolder f44683a;

    zzgx(BaseImplementation.ResultHolder resultHolder) {
        this.f44683a = (BaseImplementation.ResultHolder) Preconditions.m4488k(resultHolder);
    }

    /* renamed from: R2 */
    public final void mo52737R2(zzlm zzlm) {
        Status y0 = zzgy.m62516w0(zzlm.zza());
        if (y0.mo21297q2()) {
            this.f44683a.mo21038a(new zzgw(y0, zzlm.mo52886l2()));
        } else {
            this.f44683a.mo21321b(y0);
        }
    }
}
