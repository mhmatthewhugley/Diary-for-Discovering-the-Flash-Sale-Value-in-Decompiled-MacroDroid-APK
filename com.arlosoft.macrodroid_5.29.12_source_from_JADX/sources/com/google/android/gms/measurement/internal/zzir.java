package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzir implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f47106a;

    /* renamed from: c */
    final /* synthetic */ zzq f47107c;

    /* renamed from: d */
    final /* synthetic */ zzjm f47108d;

    zzir(zzjm zzjm, AtomicReference atomicReference, zzq zzq) {
        this.f47108d = zzjm;
        this.f47106a = atomicReference;
        this.f47107c = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f47106a) {
            try {
                if (!this.f47108d.f46899a.mo55189F().mo55129o().mo54950i(zzah.ANALYTICS_STORAGE)) {
                    this.f47108d.f46899a.mo55221z().mo55104v().mo55091a("Analytics storage consent denied; will not get app instance id");
                    this.f47108d.f46899a.mo55191I().mo55345C((String) null);
                    this.f47108d.f46899a.mo55189F().f46740g.mo55125b((String) null);
                    this.f47106a.set((Object) null);
                    this.f47106a.notify();
                    return;
                }
                zzjm zzjm = this.f47108d;
                zzdx H = zzjm.f47171d;
                if (H == null) {
                    zzjm.f46899a.mo55221z().mo55098p().mo55091a("Failed to get app instance id");
                    this.f47106a.notify();
                    return;
                }
                Preconditions.m4488k(this.f47107c);
                this.f47106a.set(H.mo55044O7(this.f47107c));
                String str = (String) this.f47106a.get();
                if (str != null) {
                    this.f47108d.f46899a.mo55191I().mo55345C(str);
                    this.f47108d.f46899a.mo55189F().f46740g.mo55125b(str);
                }
                this.f47108d.m65932E();
                atomicReference = this.f47106a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f47108d.f46899a.mo55221z().mo55098p().mo55092b("Failed to get app instance id", e);
                    atomicReference = this.f47106a;
                } catch (Throwable th) {
                    this.f47106a.notify();
                    throw th;
                }
            }
        }
    }
}
