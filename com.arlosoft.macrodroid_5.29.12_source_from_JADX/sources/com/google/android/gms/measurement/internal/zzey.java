package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzey implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f46761a;

    /* renamed from: c */
    final /* synthetic */ zzez f46762c;

    zzey(zzez zzez, String str) {
        this.f46762c = zzez;
        this.f46761a = str;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                zzbr t1 = zzbq.m59538t1(iBinder);
                if (t1 == null) {
                    this.f46762c.f46763a.mo55221z().mo55103u().mo55091a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f46762c.f46763a.mo55221z().mo55102t().mo55091a("Install Referrer Service connected");
                this.f46762c.f46763a.mo55185B().mo55181x(new zzex(this, t1, this));
            } catch (RuntimeException e) {
                this.f46762c.f46763a.mo55221z().mo55103u().mo55092b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f46762c.f46763a.mo55221z().mo55103u().mo55091a("Install Referrer connection returned with null binder");
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f46762c.f46763a.mo55221z().mo55102t().mo55091a("Install Referrer Service disconnected");
    }
}
