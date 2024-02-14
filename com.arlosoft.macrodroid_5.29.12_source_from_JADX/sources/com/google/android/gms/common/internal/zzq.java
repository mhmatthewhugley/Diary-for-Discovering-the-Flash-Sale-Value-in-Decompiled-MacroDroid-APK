package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.p007os.EnvironmentCompat;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzq implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ zzr f3777a;

    /* synthetic */ zzq(zzr zzr, zzp zzp) {
        this.f3777a = zzr;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f3777a.f3778f) {
                zzn zzn = (zzn) message.obj;
                zzo zzo = (zzo) this.f3777a.f3778f.get(zzn);
                if (zzo != null && zzo.mo21826i()) {
                    if (zzo.mo21827j()) {
                        zzo.mo21824g("GmsClientSupervisor");
                    }
                    this.f3777a.f3778f.remove(zzn);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f3777a.f3778f) {
                zzn zzn2 = (zzn) message.obj;
                zzo zzo2 = (zzo) this.f3777a.f3778f.get(zzn2);
                if (zzo2 != null && zzo2.mo21818a() == 3) {
                    String valueOf = String.valueOf(zzn2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName b = zzo2.mo21819b();
                    if (b == null) {
                        b = zzn2.mo21812b();
                    }
                    if (b == null) {
                        String d = zzn2.mo21814d();
                        Preconditions.m4488k(d);
                        b = new ComponentName(d, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    zzo2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
