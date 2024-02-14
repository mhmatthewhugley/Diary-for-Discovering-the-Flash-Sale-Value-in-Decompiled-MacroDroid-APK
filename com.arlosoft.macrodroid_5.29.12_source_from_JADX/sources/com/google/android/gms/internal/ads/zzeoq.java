package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeoq {

    /* renamed from: a */
    private final zzeov f34611a;

    /* renamed from: b */
    private final String f34612b;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public zzdh f34613c;

    public zzeoq(zzeov zzeov, String str) {
        this.f34611a = zzeov;
        this.f34612b = str;
    }

    @Nullable
    /* renamed from: a */
    public final synchronized String mo45403a() {
        String str;
        str = null;
        try {
            zzdh zzdh = this.f34613c;
            if (zzdh != null) {
                str = zzdh.mo19995f();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    @Nullable
    /* renamed from: b */
    public final synchronized String mo45404b() {
        String str;
        str = null;
        try {
            zzdh zzdh = this.f34613c;
            if (zzdh != null) {
                str = zzdh.mo19995f();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public final synchronized void mo45405d(zzl zzl, int i) throws RemoteException {
        this.f34613c = null;
        this.f34611a.mo45412a(zzl, this.f34612b, new zzeow(i), new zzeop(this));
    }

    /* renamed from: e */
    public final synchronized boolean mo45406e() throws RemoteException {
        return this.f34611a.zza();
    }
}
