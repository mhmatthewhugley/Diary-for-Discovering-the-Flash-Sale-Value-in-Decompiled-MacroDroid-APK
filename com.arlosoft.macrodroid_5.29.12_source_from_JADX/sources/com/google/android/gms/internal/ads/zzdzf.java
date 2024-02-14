package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdzf implements zzdyp {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f33425a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzdyu f33426b;

    /* renamed from: c */
    private final zzfdb f33427c;

    zzdzf(long j, Context context, zzdyu zzdyu, zzcom zzcom, String str) {
        this.f33425a = j;
        this.f33426b = zzdyu;
        zzfdd x = zzcom.mo44214x();
        x.mo44343b(context);
        x.mo44344o(str);
        this.f33427c = x.mo44342a().zza();
    }

    /* renamed from: a */
    public final void mo45064a() {
        try {
            this.f33427c.mo20125eb(new zzdze(this));
            this.f33427c.mo20121Pa(ObjectWrapper.m5051g8(null));
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo45065b(zzl zzl) {
        try {
            this.f33427c.mo20127r7(zzl, new zzdzd(this));
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    public final void zza() {
    }
}
