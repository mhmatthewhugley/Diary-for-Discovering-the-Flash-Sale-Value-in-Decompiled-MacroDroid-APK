package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhe extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ zzhf f41474a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzhe(zzhf zzhf, Handler handler) {
        super((Handler) null);
        this.f41474a = zzhf;
    }

    public final void onChange(boolean z) {
        this.f41474a.mo51267e();
    }
}
