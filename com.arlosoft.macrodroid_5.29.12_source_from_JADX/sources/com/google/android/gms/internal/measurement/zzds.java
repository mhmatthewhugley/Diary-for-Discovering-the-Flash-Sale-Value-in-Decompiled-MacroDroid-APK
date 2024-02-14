package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzds extends zzdu {

    /* renamed from: A */
    final /* synthetic */ boolean f41390A;

    /* renamed from: B */
    final /* synthetic */ zzef f41391B;

    /* renamed from: g */
    final /* synthetic */ Long f41392g;

    /* renamed from: o */
    final /* synthetic */ String f41393o;

    /* renamed from: p */
    final /* synthetic */ String f41394p;

    /* renamed from: s */
    final /* synthetic */ Bundle f41395s;

    /* renamed from: z */
    final /* synthetic */ boolean f41396z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzds(zzef zzef, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzef, true);
        this.f41391B = zzef;
        this.f41392g = l;
        this.f41393o = str;
        this.f41394p = str2;
        this.f41395s = bundle;
        this.f41396z = z;
        this.f41390A = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        long j;
        Long l = this.f41392g;
        if (l == null) {
            j = this.f41402a;
        } else {
            j = l.longValue();
        }
        ((zzcc) Preconditions.m4488k(this.f41391B.f41435i)).logEvent(this.f41393o, this.f41394p, this.f41395s, this.f41396z, this.f41390A, j);
    }
}
