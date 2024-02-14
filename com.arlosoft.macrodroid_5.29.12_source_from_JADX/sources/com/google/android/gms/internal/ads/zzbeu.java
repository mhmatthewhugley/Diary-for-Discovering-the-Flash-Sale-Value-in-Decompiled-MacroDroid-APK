package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbeu {

    /* renamed from: a */
    private final byte[] f26718a;

    /* renamed from: b */
    private int f26719b;

    /* renamed from: c */
    final /* synthetic */ zzbev f26720c;

    /* synthetic */ zzbeu(zzbev zzbev, byte[] bArr, zzbet zzbet) {
        this.f26720c = zzbev;
        this.f26718a = bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final synchronized void m43249d() {
        try {
            zzbev zzbev = this.f26720c;
            if (zzbev.f26722b) {
                zzbev.f26721a.mo41878o1(this.f26718a);
                this.f26720c.f26721a.mo41876b0(0);
                this.f26720c.f26721a.mo41879x(this.f26719b);
                this.f26720c.f26721a.mo41874R0((int[]) null);
                this.f26720c.f26721a.mo41877c();
            }
        } catch (RemoteException e) {
            zzcgp.m45225c("Clearcut log failed", e);
        }
    }

    /* renamed from: a */
    public final zzbeu mo42554a(int i) {
        this.f26719b = i;
        return this;
    }

    /* renamed from: c */
    public final synchronized void mo42555c() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26875G8)).booleanValue()) {
            this.f26720c.f26723c.execute(new zzbes(this));
        } else {
            m43249d();
        }
    }
}
