package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zabi implements zaca, zau {
    @Nullable

    /* renamed from: A */
    final Api.AbstractClientBuilder f3348A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public volatile zabf f3349B;
    @Nullable

    /* renamed from: C */
    private ConnectionResult f3350C = null;

    /* renamed from: D */
    int f3351D;

    /* renamed from: E */
    final zabe f3352E;

    /* renamed from: F */
    final zabz f3353F;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Lock f3354a;

    /* renamed from: c */
    private final Condition f3355c;

    /* renamed from: d */
    private final Context f3356d;

    /* renamed from: f */
    private final GoogleApiAvailabilityLight f3357f;

    /* renamed from: g */
    private final zabh f3358g;

    /* renamed from: o */
    final Map f3359o;

    /* renamed from: p */
    final Map f3360p = new HashMap();
    @Nullable

    /* renamed from: s */
    final ClientSettings f3361s;

    /* renamed from: z */
    final Map f3362z;

    public zabi(Context context, zabe zabe, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, @Nullable ClientSettings clientSettings, Map map2, @Nullable Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList, zabz zabz) {
        this.f3356d = context;
        this.f3354a = lock;
        this.f3357f = googleApiAvailabilityLight;
        this.f3359o = map;
        this.f3361s = clientSettings;
        this.f3362z = map2;
        this.f3348A = abstractClientBuilder;
        this.f3352E = zabe;
        this.f3353F = zabz;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zat) arrayList.get(i)).mo21530a(this);
        }
        this.f3358g = new zabh(this, looper);
        this.f3355c = lock.newCondition();
        this.f3349B = new zaax(this);
    }

    /* renamed from: a */
    public final void mo21412a() {
        this.f3349B.mo21436c();
    }

    /* renamed from: b */
    public final void mo21413b() {
        if (this.f3349B instanceof zaaj) {
            ((zaaj) this.f3349B).mo21442j();
        }
    }

    /* renamed from: c */
    public final void mo21414c() {
    }

    /* renamed from: d */
    public final void mo21415d() {
        if (this.f3349B.mo21440g()) {
            this.f3360p.clear();
        }
    }

    /* renamed from: e */
    public final boolean mo21416e(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    /* renamed from: f */
    public final void mo21417f(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f3349B);
        for (Api api : this.f3362z.keySet()) {
            printWriter.append(str).append(api.mo21191d()).println(":");
            ((Api.Client) Preconditions.m4488k((Api.Client) this.f3359o.get(api.mo21189b()))).mo21206o(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: g */
    public final boolean mo21418g() {
        return this.f3349B instanceof zaaw;
    }

    /* renamed from: g8 */
    public final void mo21458g8(@NonNull ConnectionResult connectionResult, @NonNull Api api, boolean z) {
        this.f3354a.lock();
        try {
            this.f3349B.mo21437d(connectionResult, api, z);
        } finally {
            this.f3354a.unlock();
        }
    }

    /* renamed from: h */
    public final ConnectionResult mo21419h(long j, TimeUnit timeUnit) {
        mo21412a();
        long nanos = timeUnit.toNanos(j);
        while (this.f3349B instanceof zaaw) {
            if (nanos <= 0) {
                try {
                    mo21415d();
                    return new ConnectionResult(14, (PendingIntent) null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, (PendingIntent) null);
                }
            } else {
                nanos = this.f3355c.awaitNanos(nanos);
            }
        }
        if (this.f3349B instanceof zaaj) {
            return ConnectionResult.f3044g;
        }
        ConnectionResult connectionResult = this.f3350C;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    /* renamed from: i */
    public final BaseImplementation.ApiMethodImpl mo21420i(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.mo21330p();
        this.f3349B.mo21439f(apiMethodImpl);
        return apiMethodImpl;
    }

    /* renamed from: j */
    public final boolean mo21421j() {
        return this.f3349B instanceof zaaj;
    }

    /* renamed from: k */
    public final BaseImplementation.ApiMethodImpl mo21422k(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.mo21330p();
        return this.f3349B.mo21441h(apiMethodImpl);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo21459n() {
        this.f3354a.lock();
        try {
            this.f3352E.mo21451C();
            this.f3349B = new zaaj(this);
            this.f3349B.mo21435b();
            this.f3355c.signalAll();
        } finally {
            this.f3354a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo21460o() {
        this.f3354a.lock();
        try {
            this.f3349B = new zaaw(this, this.f3361s, this.f3362z, this.f3357f, this.f3348A, this.f3354a, this.f3356d);
            this.f3349B.mo21435b();
            this.f3355c.signalAll();
        } finally {
            this.f3354a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo21461p(@Nullable ConnectionResult connectionResult) {
        this.f3354a.lock();
        try {
            this.f3350C = connectionResult;
            this.f3349B = new zaax(this);
            this.f3349B.mo21435b();
            this.f3355c.signalAll();
        } finally {
            this.f3354a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo21462q(zabg zabg) {
        this.f3358g.sendMessage(this.f3358g.obtainMessage(1, zabg));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo21463r(RuntimeException runtimeException) {
        this.f3358g.sendMessage(this.f3358g.obtainMessage(2, runtimeException));
    }

    /* renamed from: t1 */
    public final void mo21335t1(int i) {
        this.f3354a.lock();
        try {
            this.f3349B.mo21438e(i);
        } finally {
            this.f3354a.unlock();
        }
    }

    /* renamed from: y */
    public final void mo21336y(@Nullable Bundle bundle) {
        this.f3354a.lock();
        try {
            this.f3349B.mo21434a(bundle);
        } finally {
            this.f3354a.unlock();
        }
    }
}
