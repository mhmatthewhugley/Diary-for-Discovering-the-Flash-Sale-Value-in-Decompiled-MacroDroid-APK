package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzfv extends zzgp {

    /* renamed from: a */
    final /* synthetic */ String f44644a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfv(zzfx zzfx, String str) {
        super((zzgo) null);
        this.f44644a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        ((ConnectionLifecycleCallback) obj).mo37368c(this.f44644a, new ConnectionResolution(zzgy.m62516w0(13)));
    }
}
