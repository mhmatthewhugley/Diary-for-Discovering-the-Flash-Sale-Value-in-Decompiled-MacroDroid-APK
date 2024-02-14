package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqy extends zzfro {

    /* renamed from: c */
    final /* synthetic */ zzfrh f36292c;

    /* renamed from: d */
    final /* synthetic */ int f36293d;

    /* renamed from: f */
    final /* synthetic */ zzfrf f36294f;

    /* renamed from: g */
    final /* synthetic */ TaskCompletionSource f36295g;

    /* renamed from: o */
    final /* synthetic */ zzfra f36296o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfqy(zzfra zzfra, TaskCompletionSource taskCompletionSource, zzfrh zzfrh, int i, zzfrf zzfrf, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f36296o = zzfra;
        this.f36292c = zzfrh;
        this.f36293d = i;
        this.f36294f = zzfrf;
        this.f36295g = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfrk, android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46131a() {
        try {
            ? e = this.f36296o.f36301a.mo46153e();
            zzfrh zzfrh = this.f36292c;
            String b = this.f36296o.f36302b;
            int i = this.f36293d;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfrh.mo46123b());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", b);
            bundle.putString("appId", zzfrh.mo46122a());
            e.mo46139ob(bundle, new zzfqz(this.f36296o, this.f36294f));
        } catch (RemoteException e2) {
            zzfra.f36299c.mo46142c(e2, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.f36293d), this.f36296o.f36302b);
            this.f36295g.mo56140d(new RuntimeException(e2));
        }
    }
}
