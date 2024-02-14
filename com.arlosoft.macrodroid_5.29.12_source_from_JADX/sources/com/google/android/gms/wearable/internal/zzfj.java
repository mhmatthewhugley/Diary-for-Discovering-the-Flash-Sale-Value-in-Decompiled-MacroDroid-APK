package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzfj extends zzu {

    /* renamed from: t */
    private MessageApi.MessageListener f48295t;

    /* renamed from: u */
    private ListenerHolder f48296u;

    /* renamed from: v */
    private IntentFilter[] f48297v;

    /* synthetic */ zzfj(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr, zzfi zzfi) {
        super(googleApiClient);
        this.f48295t = (MessageApi.MessageListener) Preconditions.m4488k(messageListener);
        this.f48296u = (ListenerHolder) Preconditions.m4488k(listenerHolder);
        this.f48297v = (IntentFilter[]) Preconditions.m4488k(intentFilterArr);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        this.f48295t = null;
        this.f48296u = null;
        this.f48297v = null;
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzim) anyClient).mo56515x0(this, this.f48295t, this.f48296u, this.f48297v);
        this.f48295t = null;
        this.f48296u = null;
        this.f48297v = null;
    }
}
