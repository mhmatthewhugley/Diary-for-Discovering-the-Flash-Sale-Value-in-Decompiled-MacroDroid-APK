package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzht extends zzhn {

    /* renamed from: c */
    private final zzca f48369c;

    public zzht(BaseImplementation.ResultHolder resultHolder, zzca zzca) {
        super(resultHolder);
        this.f48369c = (zzca) Preconditions.m4488k(zzca);
    }

    /* renamed from: mb */
    public final void mo56279mb(zzdr zzdr) {
        zzbt zzbt;
        if (zzdr.f48257c != null) {
            zzbt = new zzbt(new ParcelFileDescriptor.AutoCloseInputStream(zzdr.f48257c));
            this.f48369c.mo56334t1(new zzbs(zzbt));
        } else {
            zzbt = null;
        }
        mo56496t1(new zzbo(new Status(zzdr.f48256a), zzbt));
    }
}
