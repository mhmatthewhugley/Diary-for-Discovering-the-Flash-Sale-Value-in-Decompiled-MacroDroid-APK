package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdj extends zzdu {

    /* renamed from: g */
    final /* synthetic */ String f41370g;

    /* renamed from: o */
    final /* synthetic */ zzbz f41371o;

    /* renamed from: p */
    final /* synthetic */ zzef f41372p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdj(zzef zzef, String str, zzbz zzbz) {
        super(zzef, true);
        this.f41372p = zzef;
        this.f41370g = str;
        this.f41371o = zzbz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41372p.f41435i)).getMaxUserProperties(this.f41370g, this.f41371o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50839b() {
        this.f41371o.mo50779m1((Bundle) null);
    }
}
