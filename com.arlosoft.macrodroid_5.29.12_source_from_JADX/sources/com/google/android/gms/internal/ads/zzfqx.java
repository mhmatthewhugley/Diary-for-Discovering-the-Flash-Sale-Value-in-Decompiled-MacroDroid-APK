package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqx extends zzfro {

    /* renamed from: c */
    final /* synthetic */ zzfqr f36288c;

    /* renamed from: d */
    final /* synthetic */ zzfrf f36289d;

    /* renamed from: f */
    final /* synthetic */ TaskCompletionSource f36290f;

    /* renamed from: g */
    final /* synthetic */ zzfra f36291g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfqx(zzfra zzfra, TaskCompletionSource taskCompletionSource, zzfqr zzfqr, zzfrf zzfrf, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f36291g = zzfra;
        this.f36288c = zzfqr;
        this.f36289d = zzfrf;
        this.f36290f = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfrk, android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46131a() {
        try {
            ? e = this.f36291g.f36301a.mo46153e();
            zzfqr zzfqr = this.f36288c;
            String b = this.f36291g.f36302b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfqr.mo46086b());
            bundle.putString("callerPackage", b);
            bundle.putString("appId", zzfqr.mo46085a());
            e.mo46137N2(bundle, new zzfqz(this.f36291g, this.f36289d));
        } catch (RemoteException e2) {
            zzfra.f36299c.mo46142c(e2, "dismiss overlay display from: %s", this.f36291g.f36302b);
            this.f36290f.mo56140d(new RuntimeException(e2));
        }
    }
}
