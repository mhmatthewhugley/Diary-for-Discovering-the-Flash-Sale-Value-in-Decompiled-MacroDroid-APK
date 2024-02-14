package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {

    /* renamed from: C */
    private static final String f3207C = NonGmsServiceBrokerClient.class.getSimpleName();
    @Nullable

    /* renamed from: A */
    private String f3208A;
    @Nullable

    /* renamed from: B */
    private String f3209B;
    @Nullable

    /* renamed from: a */
    private final String f3210a;
    @Nullable

    /* renamed from: c */
    private final String f3211c;
    @Nullable

    /* renamed from: d */
    private final ComponentName f3212d;

    /* renamed from: f */
    private final Context f3213f;

    /* renamed from: g */
    private final ConnectionCallbacks f3214g;

    /* renamed from: o */
    private final Handler f3215o;

    /* renamed from: p */
    private final OnConnectionFailedListener f3216p;
    @Nullable

    /* renamed from: s */
    private IBinder f3217s;

    /* renamed from: z */
    private boolean f3218z;

    @WorkerThread
    /* renamed from: x */
    private final void m3815x() {
        if (Thread.currentThread() != this.f3215o.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo21195b() {
        m3815x();
        String.valueOf(this.f3217s);
        try {
            this.f3213f.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f3218z = false;
        this.f3217s = null;
    }

    @WorkerThread
    /* renamed from: c */
    public final boolean mo21196c() {
        m3815x();
        return this.f3217s != null;
    }

    /* renamed from: d */
    public final boolean mo21031d() {
        return false;
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo21197e(@NonNull String str) {
        m3815x();
        this.f3208A = str;
        mo21195b();
    }

    @WorkerThread
    /* renamed from: f */
    public final boolean mo21198f() {
        m3815x();
        return this.f3218z;
    }

    @NonNull
    /* renamed from: g */
    public final String mo21199g() {
        String str = this.f3210a;
        if (str != null) {
            return str;
        }
        Preconditions.m4488k(this.f3212d);
        return this.f3212d.getPackageName();
    }

    @WorkerThread
    /* renamed from: h */
    public final void mo21200h(@NonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        m3815x();
        String.valueOf(this.f3217s);
        if (mo21196c()) {
            try {
                mo21197e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f3212d;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f3210a).setAction(this.f3211c);
            }
            boolean bindService = this.f3213f.bindService(intent, this, GmsClientSupervisor.m4443b());
            this.f3218z = bindService;
            if (!bindService) {
                this.f3217s = null;
                this.f3216p.mo21388A1(new ConnectionResult(16));
            }
            String.valueOf(this.f3217s);
        } catch (SecurityException e) {
            this.f3218z = false;
            this.f3217s = null;
            throw e;
        }
    }

    /* renamed from: i */
    public final boolean mo21201i() {
        return false;
    }

    /* renamed from: j */
    public final boolean mo21202j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo21383k() {
        this.f3218z = false;
        this.f3217s = null;
        this.f3214g.mo21335t1(1);
    }

    @NonNull
    /* renamed from: l */
    public final Set<Scope> mo21203l() {
        return Collections.emptySet();
    }

    /* renamed from: m */
    public final void mo21204m(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set) {
    }

    /* renamed from: n */
    public final void mo21205n(@NonNull BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    /* renamed from: o */
    public final void mo21206o(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f3215o.post(new zacg(this, iBinder));
    }

    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f3215o.post(new zacf(this));
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 0;
    }

    @NonNull
    /* renamed from: r */
    public final Feature[] mo21207r() {
        return new Feature[0];
    }

    @Nullable
    /* renamed from: t */
    public final String mo21208t() {
        return this.f3208A;
    }

    @NonNull
    /* renamed from: u */
    public final Intent mo21034u() {
        return new Intent();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo21386v(IBinder iBinder) {
        this.f3218z = false;
        this.f3217s = iBinder;
        String.valueOf(iBinder);
        this.f3214g.mo21336y(new Bundle());
    }

    /* renamed from: w */
    public final void mo21387w(@Nullable String str) {
        this.f3209B = str;
    }
}
