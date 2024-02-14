package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzhu extends zzhn {

    /* renamed from: c */
    private final zzca f48370c;

    public zzhu(BaseImplementation.ResultHolder resultHolder, zzca zzca) {
        super(resultHolder);
        this.f48370c = (zzca) Preconditions.m4488k(zzca);
    }

    /* renamed from: W6 */
    public final void mo56267W6(zzdt zzdt) {
        zzbv zzbv;
        if (zzdt.f48259c != null) {
            zzbv = new zzbv(new ParcelFileDescriptor.AutoCloseOutputStream(zzdt.f48259c));
            this.f48370c.mo56334t1(new zzbu(zzbv));
        } else {
            zzbv = null;
        }
        mo56496t1(new zzbp(new Status(zzdt.f48258a), zzbv));
    }
}
