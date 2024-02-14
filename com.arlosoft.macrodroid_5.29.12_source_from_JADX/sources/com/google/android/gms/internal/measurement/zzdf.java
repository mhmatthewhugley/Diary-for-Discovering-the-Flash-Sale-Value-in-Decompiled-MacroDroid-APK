package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdf extends zzdu {

    /* renamed from: g */
    final /* synthetic */ String f41358g;

    /* renamed from: o */
    final /* synthetic */ String f41359o;

    /* renamed from: p */
    final /* synthetic */ boolean f41360p;

    /* renamed from: s */
    final /* synthetic */ zzbz f41361s;

    /* renamed from: z */
    final /* synthetic */ zzef f41362z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdf(zzef zzef, String str, String str2, boolean z, zzbz zzbz) {
        super(zzef, true);
        this.f41362z = zzef;
        this.f41358g = str;
        this.f41359o = str2;
        this.f41360p = z;
        this.f41361s = zzbz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41362z.f41435i)).getUserProperties(this.f41358g, this.f41359o, this.f41360p, this.f41361s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50839b() {
        this.f41361s.mo50779m1((Bundle) null);
    }
}
