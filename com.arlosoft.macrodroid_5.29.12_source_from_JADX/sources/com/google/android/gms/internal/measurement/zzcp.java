package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzcp extends zzdu {

    /* renamed from: g */
    final /* synthetic */ String f41320g;

    /* renamed from: o */
    final /* synthetic */ String f41321o;

    /* renamed from: p */
    final /* synthetic */ zzbz f41322p;

    /* renamed from: s */
    final /* synthetic */ zzef f41323s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcp(zzef zzef, String str, String str2, zzbz zzbz) {
        super(zzef, true);
        this.f41323s = zzef;
        this.f41320g = str;
        this.f41321o = str2;
        this.f41322p = zzbz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41323s.f41435i)).getConditionalUserProperties(this.f41320g, this.f41321o, this.f41322p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50839b() {
        this.f41322p.mo50779m1((Bundle) null);
    }
}
