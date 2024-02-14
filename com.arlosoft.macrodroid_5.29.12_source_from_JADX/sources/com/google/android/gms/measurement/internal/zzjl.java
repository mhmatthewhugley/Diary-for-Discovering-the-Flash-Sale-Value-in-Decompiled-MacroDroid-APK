package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzjl implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f47167a;

    /* renamed from: c */
    private volatile zzed f47168c;

    /* renamed from: d */
    final /* synthetic */ zzjm f47169d;

    protected zzjl(zzjm zzjm) {
        this.f47169d = zzjm;
    }

    @MainThread
    /* renamed from: A1 */
    public final void mo21661A1(@NonNull ConnectionResult connectionResult) {
        Preconditions.m4483f("MeasurementServiceConnection.onConnectionFailed");
        zzeh E = this.f47169d.f46899a.mo55188E();
        if (E != null) {
            E.mo55103u().mo55092b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f47167a = false;
            this.f47168c = null;
        }
        this.f47169d.f46899a.mo55185B().mo55181x(new zzjk(this));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo55438b(Intent intent) {
        this.f47169d.mo55073e();
        Context c = this.f47169d.f46899a.mo55202c();
        ConnectionTracker b = ConnectionTracker.m4827b();
        synchronized (this) {
            if (this.f47167a) {
                this.f47169d.f46899a.mo55221z().mo55102t().mo55091a("Connection attempt already in progress");
                return;
            }
            this.f47169d.f46899a.mo55221z().mo55102t().mo55091a("Using local app measurement service");
            this.f47167a = true;
            b.mo21938a(c, intent, this.f47169d.f47170c, 129);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo55439c() {
        this.f47169d.mo55073e();
        Context c = this.f47169d.f46899a.mo55202c();
        synchronized (this) {
            if (this.f47167a) {
                this.f47169d.f46899a.mo55221z().mo55102t().mo55091a("Connection attempt already in progress");
            } else if (this.f47168c == null || (!this.f47168c.mo21644f() && !this.f47168c.mo21641c())) {
                this.f47168c = new zzed(c, Looper.getMainLooper(), this, this);
                this.f47169d.f46899a.mo55221z().mo55102t().mo55091a("Connecting to remote service");
                this.f47167a = true;
                Preconditions.m4488k(this.f47168c);
                this.f47168c.mo21655v();
            } else {
                this.f47169d.f46899a.mo55221z().mo55102t().mo55091a("Already awaiting connection attempt");
            }
        }
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo55440d() {
        if (this.f47168c != null && (this.f47168c.mo21641c() || this.f47168c.mo21644f())) {
            this.f47168c.mo21640b();
        }
        this.f47168c = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f47169d.f46899a.mo55221z().mo55098p().mo55091a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    @androidx.annotation.MainThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.Preconditions.m4483f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f47167a = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzjm r4 = r3.f47169d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzfr r4 = r4.f46899a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55098p()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo55091a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.zzdx     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.internal.zzdx r1 = (com.google.android.gms.measurement.internal.zzdx) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.zzdv r1 = new com.google.android.gms.measurement.internal.zzdv     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.zzjm r5 = r3.f47169d     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzfr r5 = r5.f46899a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.mo55221z()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55102t()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo55091a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.zzjm r5 = r3.f47169d     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzfr r5 = r5.f46899a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.mo55221z()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo55092b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.zzjm r5 = r3.f47169d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzfr r5 = r5.f46899a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.mo55221z()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo55091a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f47167a = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.common.stats.ConnectionTracker r4 = com.google.android.gms.common.stats.ConnectionTracker.m4827b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.zzjm r5 = r3.f47169d     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.zzfr r5 = r5.f46899a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo55202c()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.zzjm r0 = r3.f47169d     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.zzjl r0 = r0.f47170c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo21939c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.zzjm r4 = r3.f47169d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzfr r4 = r4.f46899a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzfo r4 = r4.mo55185B()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzjg r5 = new com.google.android.gms.measurement.internal.zzjg     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo55181x(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjl.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.m4483f("MeasurementServiceConnection.onServiceDisconnected");
        this.f47169d.f46899a.mo55221z().mo55097o().mo55091a("Service disconnected");
        this.f47169d.f46899a.mo55185B().mo55181x(new zzjh(this, componentName));
    }

    @MainThread
    /* renamed from: t1 */
    public final void mo21659t1(int i) {
        Preconditions.m4483f("MeasurementServiceConnection.onConnectionSuspended");
        this.f47169d.f46899a.mo55221z().mo55097o().mo55091a("Service connection suspended");
        this.f47169d.f46899a.mo55185B().mo55181x(new zzjj(this));
    }

    @MainThread
    /* renamed from: y */
    public final void mo21660y(Bundle bundle) {
        Preconditions.m4483f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.m4488k(this.f47168c);
                this.f47169d.f46899a.mo55185B().mo55181x(new zzji(this, (zzdx) this.f47168c.mo21626I()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f47168c = null;
                this.f47167a = false;
            }
        }
    }
}
