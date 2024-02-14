package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzvz {
    @Nullable

    /* renamed from: a */
    private zzvy f38754a;
    @Nullable

    /* renamed from: b */
    private zzwh f38755b;

    @CallSuper
    /* renamed from: a */
    public void mo48309a() {
        this.f38754a = null;
        this.f38755b = null;
    }

    /* renamed from: b */
    public void mo48310b(zzk zzk) {
        throw null;
    }

    /* renamed from: c */
    public boolean mo48311c() {
        throw null;
    }

    /* renamed from: d */
    public abstract zzwa mo48320d(zzkb[] zzkbArr, zzuh zzuh, zzsi zzsi, zzcn zzcn) throws zzha;

    /* renamed from: e */
    public abstract void mo48321e(@Nullable Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final zzwh mo48322f() {
        zzwh zzwh = this.f38755b;
        zzdd.m47208b(zzwh);
        return zzwh;
    }

    @CallSuper
    /* renamed from: g */
    public final void mo48323g(zzvy zzvy, zzwh zzwh) {
        this.f38754a = zzvy;
        this.f38755b = zzwh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo48324h() {
        zzvy zzvy = this.f38754a;
        if (zzvy != null) {
            zzvy.mo47687h();
        }
    }
}
