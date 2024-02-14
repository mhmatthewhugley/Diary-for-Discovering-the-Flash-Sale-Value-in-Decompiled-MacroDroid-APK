package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzemy {

    /* renamed from: a */
    private final ConcurrentHashMap f34497a = new ConcurrentHashMap();

    /* renamed from: b */
    private final zzdvl f34498b;

    public zzemy(zzdvl zzdvl) {
        this.f34498b = zzdvl;
    }

    /* renamed from: a */
    public final zzbxd mo45380a(String str) {
        if (this.f34497a.containsKey(str)) {
            return (zzbxd) this.f34497a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo45381b(String str) {
        try {
            this.f34497a.put(str, this.f34498b.mo45016b(str));
        } catch (RemoteException e) {
            zzcgp.m45227e("Couldn't create RTB adapter : ", e);
        }
    }
}
