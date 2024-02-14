package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zznn extends zznp {

    /* renamed from: a */
    final /* synthetic */ Status f44972a;

    zznn(zzno zzno, Status status) {
        this.f44972a = status;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        BaseImplementation.ResultHolder resultHolder = (BaseImplementation.ResultHolder) obj;
        if (this.f44972a.mo21297q2()) {
            resultHolder.mo21038a(this.f44972a);
        } else {
            resultHolder.mo21321b(this.f44972a);
        }
    }
}
