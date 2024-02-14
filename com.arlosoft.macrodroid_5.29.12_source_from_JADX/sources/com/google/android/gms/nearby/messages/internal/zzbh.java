package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzbh extends GoogleApi implements MessagesClient {

    /* renamed from: l */
    private static final Api.ClientKey f47754l;

    /* renamed from: m */
    private static final Api.AbstractClientBuilder f47755m;

    /* renamed from: n */
    private static final Api f47756n;

    /* renamed from: o */
    public static final /* synthetic */ int f47757o = 0;

    /* renamed from: k */
    private final int f47758k;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f47754l = clientKey;
        zzav zzav = new zzav();
        f47755m = zzav;
        f47756n = new Api("Nearby.MESSAGES_API", zzav, clientKey);
    }

    /* renamed from: N */
    private final ListenerHolder m66490N(TaskCompletionSource taskCompletionSource) {
        return mo21221A(new zzay(this, taskCompletionSource), Status.class.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final Task m66491O(zzbc zzbc, int i) {
        return mo21235u(TaskApiCall.m3866c().mo21409e(i).mo21406b(new zzam(this, zzbc)).mo21405a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final /* synthetic */ void mo55975H(Message message, zzbe zzbe, PublishOptions publishOptions, zzai zzai, ListenerHolder listenerHolder) throws RemoteException {
        zzai.mo55960w0(listenerHolder, zzae.m66443l2(message), zzbe, publishOptions, this.f47758k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo55976I(zzbc zzbc, zzai zzai, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbc.mo55964a(zzai, m66490N(taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo55977J(zzbc zzbc, zzai zzai, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbc.mo55964a(zzai, m66490N(taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo55978K(ListenerHolder listenerHolder, zzbg zzbg, SubscribeOptions subscribeOptions, zzai zzai, ListenerHolder listenerHolder2) throws RemoteException {
        zzai.mo55953B0(listenerHolder2, listenerHolder, zzbg, subscribeOptions, (byte[]) null, this.f47758k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo55979L(PendingIntent pendingIntent, zzbg zzbg, SubscribeOptions subscribeOptions, zzai zzai, ListenerHolder listenerHolder) throws RemoteException {
        zzai.mo55963z0(listenerHolder, pendingIntent, zzbg, subscribeOptions, this.f47758k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo55980M(zzbc zzbc, zzai zzai, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbc.mo55964a(zzai, m66490N(taskCompletionSource));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final ClientSettings.Builder mo21226l() {
        ClientSettings.Builder l = super.mo21226l();
        if (mo21237w() != null) {
            String str = ((MessagesOptions) mo21237w()).f47644d;
        }
        return l;
    }
}
