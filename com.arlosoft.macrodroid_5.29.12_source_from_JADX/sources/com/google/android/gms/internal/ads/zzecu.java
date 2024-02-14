package com.google.android.gms.internal.ads;

import android.os.Binder;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzecu implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    protected final zzchh f33721a = new zzchh();

    /* renamed from: c */
    protected final Object f33722c = new Object();

    /* renamed from: d */
    protected boolean f33723d = false;

    /* renamed from: f */
    protected boolean f33724f = false;

    /* renamed from: g */
    protected zzcbc f33725g;
    @VisibleForTesting(otherwise = 3)
    @GuardedBy("mLock")

    /* renamed from: o */
    protected zzcan f33726o;

    /* renamed from: A1 */
    public void mo21661A1(@NonNull ConnectionResult connectionResult) {
        zzcgp.m45224b("Disconnected from remote ad request service.");
        this.f33721a.mo43575d(new zzedj(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45173a() {
        synchronized (this.f33722c) {
            this.f33724f = true;
            if (this.f33726o.mo21641c() || this.f33726o.mo21644f()) {
                this.f33726o.mo21640b();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: t1 */
    public final void mo21659t1(int i) {
        zzcgp.m45224b("Cannot connect to remote service, fallback to local instance.");
    }
}
