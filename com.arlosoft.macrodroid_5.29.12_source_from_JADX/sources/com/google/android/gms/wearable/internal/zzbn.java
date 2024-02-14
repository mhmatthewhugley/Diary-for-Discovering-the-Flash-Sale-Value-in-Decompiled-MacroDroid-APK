package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbn implements zzb {

    /* renamed from: a */
    final /* synthetic */ String f48178a;

    /* renamed from: b */
    final /* synthetic */ IntentFilter[] f48179b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56296a(zzim zzim, BaseImplementation.ResultHolder resultHolder, Object obj, ListenerHolder listenerHolder) throws RemoteException {
        zzim.mo56513v0(resultHolder, (ChannelApi.ChannelListener) obj, listenerHolder, this.f48178a, this.f48179b);
    }
}
