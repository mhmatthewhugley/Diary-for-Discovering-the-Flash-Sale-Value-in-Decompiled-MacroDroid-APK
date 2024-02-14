package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzip implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f47100a;

    /* renamed from: c */
    final /* synthetic */ zzq f47101c;

    /* renamed from: d */
    final /* synthetic */ boolean f47102d;

    /* renamed from: f */
    final /* synthetic */ zzjm f47103f;

    zzip(zzjm zzjm, AtomicReference atomicReference, zzq zzq, boolean z) {
        this.f47103f = zzjm;
        this.f47100a = atomicReference;
        this.f47101c = zzq;
        this.f47102d = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f47100a) {
            try {
                zzjm zzjm = this.f47103f;
                zzdx H = zzjm.f47171d;
                if (H == null) {
                    zzjm.f46899a.mo55221z().mo55098p().mo55091a("Failed to get all user properties; not connected to service");
                    this.f47100a.notify();
                    return;
                }
                Preconditions.m4488k(this.f47101c);
                this.f47100a.set(H.mo55051n2(this.f47101c, this.f47102d));
                this.f47103f.m65932E();
                atomicReference = this.f47100a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f47103f.f46899a.mo55221z().mo55098p().mo55092b("Failed to get all user properties; remote exception", e);
                    atomicReference = this.f47100a;
                } catch (Throwable th) {
                    this.f47100a.notify();
                    throw th;
                }
            }
        }
    }
}
