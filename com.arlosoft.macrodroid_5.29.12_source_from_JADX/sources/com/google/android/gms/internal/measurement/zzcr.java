package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzcr extends zzdu {

    /* renamed from: g */
    final /* synthetic */ Activity f41326g;

    /* renamed from: o */
    final /* synthetic */ String f41327o;

    /* renamed from: p */
    final /* synthetic */ String f41328p;

    /* renamed from: s */
    final /* synthetic */ zzef f41329s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcr(zzef zzef, Activity activity, String str, String str2) {
        super(zzef, true);
        this.f41329s = zzef;
        this.f41326g = activity;
        this.f41327o = str;
        this.f41328p = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41329s.f41435i)).setCurrentScreen(ObjectWrapper.m5051g8(this.f41326g), this.f41327o, this.f41328p, this.f41402a);
    }
}
