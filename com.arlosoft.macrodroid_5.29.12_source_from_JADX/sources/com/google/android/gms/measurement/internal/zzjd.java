package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzjd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f47143a;

    /* renamed from: c */
    final /* synthetic */ String f47144c;

    /* renamed from: d */
    final /* synthetic */ String f47145d;

    /* renamed from: f */
    final /* synthetic */ zzq f47146f;

    /* renamed from: g */
    final /* synthetic */ zzjm f47147g;

    zzjd(zzjm zzjm, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq) {
        this.f47147g = zzjm;
        this.f47143a = atomicReference;
        this.f47144c = str2;
        this.f47145d = str3;
        this.f47146f = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f47143a) {
            try {
                zzjm zzjm = this.f47147g;
                zzdx H = zzjm.f47171d;
                if (H == null) {
                    zzjm.f46899a.mo55221z().mo55098p().mo55094d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f47144c, this.f47145d);
                    this.f47143a.set(Collections.emptyList());
                    this.f47143a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Preconditions.m4488k(this.f47146f);
                    this.f47143a.set(H.mo55054t9(this.f47144c, this.f47145d, this.f47146f));
                } else {
                    this.f47143a.set(H.mo55048c8((String) null, this.f47144c, this.f47145d));
                }
                this.f47147g.m65932E();
                atomicReference = this.f47143a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f47147g.f46899a.mo55221z().mo55098p().mo55094d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f47144c, e);
                    this.f47143a.set(Collections.emptyList());
                    atomicReference = this.f47143a;
                } catch (Throwable th) {
                    this.f47143a.notify();
                    throw th;
                }
            }
        }
    }
}
