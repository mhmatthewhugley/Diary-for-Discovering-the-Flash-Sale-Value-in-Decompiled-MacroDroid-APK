package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zze implements ServiceConnection {

    /* renamed from: a */
    private final int f3755a;

    /* renamed from: c */
    final /* synthetic */ BaseGmsClient f3756c;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.f3756c = baseGmsClient;
        this.f3755a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGmsServiceBroker iGmsServiceBroker;
        BaseGmsClient baseGmsClient = this.f3756c;
        if (iBinder == null) {
            BaseGmsClient.m4354i0(baseGmsClient, 16);
            return;
        }
        synchronized (baseGmsClient.f3577E) {
            BaseGmsClient baseGmsClient2 = this.f3756c;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                iGmsServiceBroker = new zzac(iBinder);
            } else {
                iGmsServiceBroker = (IGmsServiceBroker) queryLocalInterface;
            }
            baseGmsClient2.f3578F = iGmsServiceBroker;
        }
        this.f3756c.mo21649j0(0, (Bundle) null, this.f3755a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3756c.f3577E) {
            this.f3756c.f3578F = null;
        }
        Handler handler = this.f3756c.f3575C;
        handler.sendMessage(handler.obtainMessage(6, this.f3755a, 1));
    }
}
