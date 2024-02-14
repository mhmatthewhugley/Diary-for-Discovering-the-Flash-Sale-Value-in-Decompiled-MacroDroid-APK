package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaan extends zabg {

    /* renamed from: b */
    final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f3279b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zaan(zaao zaao, zabf zabf, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabf);
        this.f3279b = connectionProgressReportCallbacks;
    }

    /* renamed from: a */
    public final void mo21433a() {
        this.f3279b.mo21444a(new ConnectionResult(16, (PendingIntent) null));
    }
}
