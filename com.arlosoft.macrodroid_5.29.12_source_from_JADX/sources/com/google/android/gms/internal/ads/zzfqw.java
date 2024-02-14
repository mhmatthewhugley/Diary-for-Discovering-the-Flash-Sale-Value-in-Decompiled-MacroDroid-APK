package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqw extends zzfro {

    /* renamed from: c */
    final /* synthetic */ zzfrc f36284c;

    /* renamed from: d */
    final /* synthetic */ zzfrf f36285d;

    /* renamed from: f */
    final /* synthetic */ TaskCompletionSource f36286f;

    /* renamed from: g */
    final /* synthetic */ zzfra f36287g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfqw(zzfra zzfra, TaskCompletionSource taskCompletionSource, zzfrc zzfrc, zzfrf zzfrf, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f36287g = zzfra;
        this.f36284c = zzfrc;
        this.f36285d = zzfrf;
        this.f36286f = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.zzfrk, android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46131a() {
        try {
            ? e = this.f36287g.f36301a.mo46153e();
            zzfra zzfra = this.f36287g;
            String b = zzfra.f36302b;
            zzfrc zzfrc = this.f36284c;
            String b2 = zzfra.f36302b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfrc.mo46103e());
            bundle.putString("adFieldEnifd", zzfrc.mo46105f());
            bundle.putInt("layoutGravity", zzfrc.mo46101c());
            bundle.putFloat("layoutVerticalMargin", zzfrc.mo46099a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfrc.mo46102d());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", b2);
            if (zzfrc.mo46106g() != null) {
                bundle.putString("appId", zzfrc.mo46106g());
            }
            e.mo46138a9(b, bundle, new zzfqz(this.f36287g, this.f36285d));
        } catch (RemoteException e2) {
            zzfra.f36299c.mo46142c(e2, "show overlay display from: %s", this.f36287g.f36302b);
            this.f36286f.mo56140d(new RuntimeException(e2));
        }
    }
}
