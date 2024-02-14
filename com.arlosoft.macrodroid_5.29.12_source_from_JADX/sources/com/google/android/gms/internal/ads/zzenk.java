package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzenk extends zzbk {

    /* renamed from: a */
    private final zzeoq f34549a;

    public zzenk(Context context, zzcom zzcom, zzfed zzfed, zzdpb zzdpb, zzbf zzbf) {
        zzeos zzeos = new zzeos(zzdpb, zzcom.mo44190A());
        zzeos.mo45411e(zzbf);
        this.f34549a = new zzeoq(new zzepc(zzcom, context, zzeos, zzfed), zzfed.mo45621i());
    }

    /* renamed from: Q8 */
    public final void mo19903Q8(zzl zzl) throws RemoteException {
        this.f34549a.mo45405d(zzl, 1);
    }

    /* renamed from: b */
    public final synchronized String mo19904b() {
        return this.f34549a.mo45403a();
    }

    /* renamed from: c */
    public final synchronized String mo19905c() {
        return this.f34549a.mo45404b();
    }

    /* renamed from: g */
    public final synchronized boolean mo19906g() throws RemoteException {
        return this.f34549a.mo45406e();
    }

    /* renamed from: u6 */
    public final synchronized void mo19907u6(zzl zzl, int i) throws RemoteException {
        this.f34549a.mo45405d(zzl, i);
    }
}
