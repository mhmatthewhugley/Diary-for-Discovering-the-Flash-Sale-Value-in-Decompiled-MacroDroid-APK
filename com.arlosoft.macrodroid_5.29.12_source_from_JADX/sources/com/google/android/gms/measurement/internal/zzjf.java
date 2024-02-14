package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzjf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f47153a;

    /* renamed from: c */
    final /* synthetic */ String f47154c;

    /* renamed from: d */
    final /* synthetic */ String f47155d;

    /* renamed from: f */
    final /* synthetic */ zzq f47156f;

    /* renamed from: g */
    final /* synthetic */ boolean f47157g;

    /* renamed from: o */
    final /* synthetic */ zzjm f47158o;

    zzjf(zzjm zzjm, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq, boolean z) {
        this.f47158o = zzjm;
        this.f47153a = atomicReference;
        this.f47154c = str2;
        this.f47155d = str3;
        this.f47156f = zzq;
        this.f47157g = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f47153a) {
            try {
                zzjm zzjm = this.f47158o;
                zzdx H = zzjm.f47171d;
                if (H == null) {
                    zzjm.f46899a.mo55221z().mo55098p().mo55094d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f47154c, this.f47155d);
                    this.f47153a.set(Collections.emptyList());
                    this.f47153a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Preconditions.m4488k(this.f47156f);
                    this.f47153a.set(H.mo55045S4(this.f47154c, this.f47155d, this.f47157g, this.f47156f));
                } else {
                    this.f47153a.set(H.mo55053t7((String) null, this.f47154c, this.f47155d, this.f47157g));
                }
                this.f47158o.m65932E();
                atomicReference = this.f47153a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f47158o.f46899a.mo55221z().mo55098p().mo55094d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f47154c, e);
                    this.f47153a.set(Collections.emptyList());
                    atomicReference = this.f47153a;
                } catch (Throwable th) {
                    this.f47153a.notify();
                    throw th;
                }
            }
        }
    }
}
