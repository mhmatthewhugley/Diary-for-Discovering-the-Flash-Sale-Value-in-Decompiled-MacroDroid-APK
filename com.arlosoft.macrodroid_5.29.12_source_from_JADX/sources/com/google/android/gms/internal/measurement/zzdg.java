package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdg extends zzdu {

    /* renamed from: g */
    final /* synthetic */ String f41363g;

    /* renamed from: o */
    final /* synthetic */ Object f41364o;

    /* renamed from: p */
    final /* synthetic */ zzef f41365p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdg(zzef zzef, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(zzef, false);
        this.f41365p = zzef;
        this.f41363g = str;
        this.f41364o = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41365p.f41435i)).logHealthData(5, this.f41363g, ObjectWrapper.m5051g8(this.f41364o), ObjectWrapper.m5051g8(null), ObjectWrapper.m5051g8(null));
    }
}
