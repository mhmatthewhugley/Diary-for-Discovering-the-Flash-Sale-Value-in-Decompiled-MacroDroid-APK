package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzix implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzaw f47120a;

    /* renamed from: c */
    final /* synthetic */ String f47121c;

    /* renamed from: d */
    final /* synthetic */ zzcf f47122d;

    /* renamed from: f */
    final /* synthetic */ zzjm f47123f;

    zzix(zzjm zzjm, zzaw zzaw, String str, zzcf zzcf) {
        this.f47123f = zzjm;
        this.f47120a = zzaw;
        this.f47121c = str;
        this.f47122d = zzcf;
    }

    public final void run() {
        zzfr zzfr;
        byte[] bArr = null;
        try {
            zzjm zzjm = this.f47123f;
            zzdx H = zzjm.f47171d;
            if (H == null) {
                zzjm.f46899a.mo55221z().mo55098p().mo55091a("Discarding data. Failed to send event to service to bundle");
                zzfr = this.f47123f.f46899a;
            } else {
                bArr = H.mo55040F7(this.f47120a, this.f47121c);
                this.f47123f.m65932E();
                zzfr = this.f47123f.f46899a;
            }
        } catch (RemoteException e) {
            this.f47123f.f46899a.mo55221z().mo55098p().mo55092b("Failed to send event to the service to bundle", e);
            zzfr = this.f47123f.f46899a;
        } catch (Throwable th) {
            this.f47123f.f46899a.mo55196N().mo55578G(this.f47122d, bArr);
            throw th;
        }
        zzfr.mo55196N().mo55578G(this.f47122d, bArr);
    }
}
