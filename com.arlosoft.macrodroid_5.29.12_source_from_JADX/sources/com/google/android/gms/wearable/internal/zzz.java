package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.CapabilityApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzz implements zzb {

    /* renamed from: a */
    final /* synthetic */ IntentFilter[] f48451a;

    /* renamed from: a */
    public final /* synthetic */ void mo56296a(zzim zzim, BaseImplementation.ResultHolder resultHolder, Object obj, ListenerHolder listenerHolder) throws RemoteException {
        zzim.mo56512u0(resultHolder, (CapabilityApi.CapabilityListener) obj, listenerHolder, this.f48451a);
    }
}
