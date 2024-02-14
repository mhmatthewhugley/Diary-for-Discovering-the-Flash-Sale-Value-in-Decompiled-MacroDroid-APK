package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.safetynet.zzk;
import java.util.ArrayList;

final class zzn extends zzk.zzf {

    /* renamed from: u */
    private final /* synthetic */ int[] f45516u;

    /* renamed from: v */
    private final /* synthetic */ int f45517v;

    /* renamed from: w */
    private final /* synthetic */ String f45518w;

    /* renamed from: x */
    private final /* synthetic */ String f45519x;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        zzx zzx = (zzx) anyClient;
        ArrayList arrayList = new ArrayList();
        for (int valueOf : this.f45516u) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        zzx.mo53763r0(this.f45499t, arrayList, this.f45517v, this.f45518w, this.f45519x);
    }
}
