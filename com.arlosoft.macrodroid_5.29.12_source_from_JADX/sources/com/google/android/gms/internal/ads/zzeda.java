package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeda extends zzecu {

    /* renamed from: p */
    private String f33736p;

    /* renamed from: s */
    private int f33737s = 1;

    zzeda(Context context) {
        this.f33726o = new zzcan(context, zzt.m2909v().mo20334b(), this, this);
    }

    /* renamed from: A1 */
    public final void mo21661A1(@NonNull ConnectionResult connectionResult) {
        zzcgp.m45224b("Cannot connect to remote service, fallback to local instance.");
        this.f33721a.mo43575d(new zzedj(1));
    }

    /* renamed from: b */
    public final zzfzp mo45180b(zzcbc zzcbc) {
        synchronized (this.f33722c) {
            int i = this.f33737s;
            if (i != 1 && i != 2) {
                zzfzp h = zzfzg.m51413h(new zzedj(2));
                return h;
            } else if (this.f33723d) {
                zzchh zzchh = this.f33721a;
                return zzchh;
            } else {
                this.f33737s = 2;
                this.f33723d = true;
                this.f33725g = zzcbc;
                this.f33726o.mo21655v();
                this.f33721a.mo43580q(new zzecz(this), zzchc.f28461f);
                zzchh zzchh2 = this.f33721a;
                return zzchh2;
            }
        }
    }

    /* renamed from: c */
    public final zzfzp mo45181c(String str) {
        synchronized (this.f33722c) {
            int i = this.f33737s;
            if (i != 1 && i != 3) {
                zzfzp h = zzfzg.m51413h(new zzedj(2));
                return h;
            } else if (this.f33723d) {
                zzchh zzchh = this.f33721a;
                return zzchh;
            } else {
                this.f33737s = 3;
                this.f33723d = true;
                this.f33736p = str;
                this.f33726o.mo21655v();
                this.f33721a.mo43580q(new zzecy(this), zzchc.f28461f);
                zzchh zzchh2 = this.f33721a;
                return zzchh2;
            }
        }
    }

    /* renamed from: y */
    public final void mo21660y(@Nullable Bundle bundle) {
        synchronized (this.f33722c) {
            if (!this.f33724f) {
                this.f33724f = true;
                try {
                    int i = this.f33737s;
                    if (i == 2) {
                        this.f33726o.mo43256o0().mo43265Q6(this.f33725g, new zzect(this));
                    } else if (i == 3) {
                        this.f33726o.mo43256o0().mo43263H9(this.f33736p, new zzect(this));
                    } else {
                        this.f33721a.mo43575d(new zzedj(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f33721a.mo43575d(new zzedj(1));
                } catch (Throwable th) {
                    zzt.m2904q().mo43503t(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.f33721a.mo43575d(new zzedj(1));
                }
            }
        }
    }
}
