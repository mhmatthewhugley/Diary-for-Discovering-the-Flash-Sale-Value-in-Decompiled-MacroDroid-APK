package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzfs extends zzgp {

    /* renamed from: a */
    final /* synthetic */ zzky f44640a;

    /* renamed from: b */
    final /* synthetic */ Status f44641b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfs(zzfx zzfx, zzky zzky, Status status) {
        super((zzgo) null);
        this.f44640a = zzky;
        this.f44641b = status;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        ((ConnectionLifecycleCallback) obj).mo37368c(this.f44640a.mo52834l2(), new ConnectionResolution(this.f44641b));
    }
}
