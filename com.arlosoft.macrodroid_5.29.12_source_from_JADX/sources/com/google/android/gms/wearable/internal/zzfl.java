package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzfl implements MessageApi {
    /* renamed from: d */
    private static final PendingResult m67056d(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener, IntentFilter[] intentFilterArr) {
        return googleApiClient.mo21252h(new zzfj(googleApiClient, messageListener, googleApiClient.mo21260q(messageListener), intentFilterArr, (zzfi) null));
    }

    /* renamed from: a */
    public final PendingResult<MessageApi.SendMessageResult> mo56209a(GoogleApiClient googleApiClient, String str, String str2, byte[] bArr) {
        return googleApiClient.mo21252h(new zzfg(this, googleApiClient, str, str2, bArr));
    }

    /* renamed from: b */
    public final PendingResult<Status> mo56210b(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener) {
        return googleApiClient.mo21252h(new zzfh(this, googleApiClient, messageListener));
    }

    /* renamed from: c */
    public final PendingResult<Status> mo56211c(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener) {
        return m67056d(googleApiClient, messageListener, new IntentFilter[]{zzhl.m67098a("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }
}
