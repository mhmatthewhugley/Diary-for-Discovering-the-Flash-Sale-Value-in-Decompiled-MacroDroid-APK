package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdt extends zzdu {

    /* renamed from: g */
    final /* synthetic */ String f41397g;

    /* renamed from: o */
    final /* synthetic */ String f41398o;

    /* renamed from: p */
    final /* synthetic */ Object f41399p;

    /* renamed from: s */
    final /* synthetic */ boolean f41400s;

    /* renamed from: z */
    final /* synthetic */ zzef f41401z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdt(zzef zzef, String str, String str2, Object obj, boolean z) {
        super(zzef, true);
        this.f41401z = zzef;
        this.f41397g = str;
        this.f41398o = str2;
        this.f41399p = obj;
        this.f41400s = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41401z.f41435i)).setUserProperty(this.f41397g, this.f41398o, ObjectWrapper.m5051g8(this.f41399p), this.f41400s, this.f41402a);
    }
}
