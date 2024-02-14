package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzecw extends zzecu {
    zzecw(Context context) {
        this.f33726o = new zzcan(context, zzt.m2909v().mo20334b(), this, this);
    }

    /* renamed from: y */
    public final void mo21660y(Bundle bundle) {
        synchronized (this.f33722c) {
            if (!this.f33724f) {
                this.f33724f = true;
                try {
                    this.f33726o.mo43256o0().mo43264P8(this.f33725g, new zzect(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f33721a.mo43575d(new zzedj(1));
                } catch (Throwable th) {
                    zzt.m2904q().mo43503t(th, "RemoteSignalsClientTask.onConnected");
                    this.f33721a.mo43575d(new zzedj(1));
                }
            }
        }
    }
}
