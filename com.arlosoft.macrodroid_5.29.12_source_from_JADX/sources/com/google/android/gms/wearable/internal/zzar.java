package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzar implements zzb {

    /* renamed from: a */
    final /* synthetic */ IntentFilter[] f48141a;

    /* renamed from: a */
    public final /* synthetic */ void mo56296a(zzim zzim, BaseImplementation.ResultHolder resultHolder, Object obj, ListenerHolder listenerHolder) throws RemoteException {
        zzim.mo56513v0(resultHolder, (ChannelApi.ChannelListener) obj, listenerHolder, (String) null, this.f48141a);
    }
}
