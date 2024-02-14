package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcyk extends zzcxc {

    /* renamed from: i */
    private final zzbnv f31848i;

    /* renamed from: j */
    private final Runnable f31849j;

    /* renamed from: k */
    private final Executor f31850k;

    public zzcyk(zzczd zzczd, zzbnv zzbnv, Runnable runnable, Executor executor) {
        super(zzczd);
        this.f31848i = zzbnv;
        this.f31849j = runnable;
        this.f31850k = executor;
    }

    /* renamed from: o */
    static /* synthetic */ void m47024o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo44461b() {
        this.f31850k.execute(new zzcyj(this, new zzcyi(new AtomicReference(this.f31849j))));
    }

    /* renamed from: h */
    public final int mo44453h() {
        return 0;
    }

    /* renamed from: i */
    public final View mo44454i() {
        return null;
    }

    /* renamed from: j */
    public final zzdk mo44455j() {
        return null;
    }

    /* renamed from: k */
    public final zzfdl mo44456k() {
        return null;
    }

    /* renamed from: l */
    public final zzfdl mo44457l() {
        return null;
    }

    /* renamed from: m */
    public final void mo44458m() {
    }

    /* renamed from: n */
    public final void mo44459n(ViewGroup viewGroup, zzq zzq) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo44482p(Runnable runnable) {
        try {
            if (!this.f31848i.mo20139q0(ObjectWrapper.m5051g8(runnable))) {
                m47024o(((zzcyi) runnable).f31845a);
            }
        } catch (RemoteException unused) {
            m47024o(((zzcyi) runnable).f31845a);
        }
    }
}
