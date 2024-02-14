package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.internal.zak;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zabe extends GoogleApiClient implements zabz {

    /* renamed from: b */
    private final Lock f3322b;

    /* renamed from: c */
    private final zak f3323c;
    @Nullable

    /* renamed from: d */
    private zaca f3324d = null;

    /* renamed from: e */
    private final int f3325e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f3326f;

    /* renamed from: g */
    private final Looper f3327g;
    @VisibleForTesting

    /* renamed from: h */
    final Queue f3328h = new LinkedList();

    /* renamed from: i */
    private volatile boolean f3329i;

    /* renamed from: j */
    private long f3330j;

    /* renamed from: k */
    private long f3331k;

    /* renamed from: l */
    private final zabc f3332l;

    /* renamed from: m */
    private final GoogleApiAvailability f3333m;
    @Nullable
    @VisibleForTesting

    /* renamed from: n */
    zabx f3334n;

    /* renamed from: o */
    final Map f3335o;

    /* renamed from: p */
    Set f3336p;

    /* renamed from: q */
    final ClientSettings f3337q;

    /* renamed from: r */
    final Map f3338r;

    /* renamed from: s */
    final Api.AbstractClientBuilder f3339s;

    /* renamed from: t */
    private final ListenerHolders f3340t;

    /* renamed from: u */
    private final ArrayList f3341u;

    /* renamed from: v */
    private Integer f3342v;
    @Nullable

    /* renamed from: w */
    Set f3343w;

    /* renamed from: x */
    final zadc f3344x;

    /* renamed from: y */
    private final zaj f3345y;

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder abstractClientBuilder, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        Looper looper2 = looper;
        int i3 = i;
        this.f3330j = true != ClientLibraryUtils.m4857a() ? 120000 : WorkRequest.MIN_BACKOFF_MILLIS;
        this.f3331k = 5000;
        this.f3336p = new HashSet();
        this.f3340t = new ListenerHolders();
        this.f3342v = null;
        this.f3343w = null;
        zaay zaay = new zaay(this);
        this.f3345y = zaay;
        this.f3326f = context;
        this.f3322b = lock;
        this.f3323c = new zak(looper, zaay);
        this.f3327g = looper2;
        this.f3332l = new zabc(this, looper);
        this.f3333m = googleApiAvailability;
        this.f3325e = i3;
        if (i3 >= 0) {
            this.f3342v = Integer.valueOf(i2);
        }
        this.f3338r = map;
        this.f3335o = map2;
        this.f3341u = arrayList;
        this.f3344x = new zadc();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f3323c.mo21758f((GoogleApiClient.ConnectionCallbacks) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f3323c.mo21759g((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.f3337q = clientSettings;
        this.f3339s = abstractClientBuilder;
    }

    /* renamed from: A */
    static /* bridge */ /* synthetic */ void m4015A(zabe zabe) {
        zabe.f3322b.lock();
        try {
            if (zabe.f3329i) {
                zabe.m4019F();
            }
        } finally {
            zabe.f3322b.unlock();
        }
    }

    /* renamed from: B */
    static /* bridge */ /* synthetic */ void m4016B(zabe zabe) {
        zabe.f3322b.lock();
        try {
            if (zabe.mo21451C()) {
                zabe.m4019F();
            }
        } finally {
            zabe.f3322b.unlock();
        }
    }

    /* renamed from: D */
    private final void m4017D(int i) {
        Integer num = this.f3342v;
        if (num == null) {
            this.f3342v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.f3342v.intValue();
            throw new IllegalStateException("Cannot use sign-in mode: " + m4022y(i) + ". Mode was already set to " + m4022y(intValue));
        }
        if (this.f3324d == null) {
            boolean z = false;
            boolean z2 = false;
            for (Api.Client client : this.f3335o.values()) {
                z |= client.mo21202j();
                z2 |= client.mo21031d();
            }
            int intValue2 = this.f3342v.intValue();
            if (intValue2 != 1) {
                if (intValue2 == 2 && z) {
                    this.f3324d = zaaa.m3893r(this.f3326f, this, this.f3322b, this.f3327g, this.f3333m, this.f3335o, this.f3337q, this.f3338r, this.f3339s, this.f3341u);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f3324d = new zabi(this.f3326f, this, this.f3322b, this.f3327g, this.f3333m, this.f3335o, this.f3337q, this.f3338r, this.f3339s, this.f3341u, this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m4018E(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.f3689d.mo21743a(googleApiClient).mo21273g(new zabb(this, statusPendingResult, z, googleApiClient));
    }

    /* renamed from: F */
    private final void m4019F() {
        this.f3323c.mo21754b();
        ((zaca) Preconditions.m4488k(this.f3324d)).mo21412a();
    }

    /* renamed from: v */
    public static int m4020v(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            z2 |= client.mo21202j();
            z3 |= client.mo21031d();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: y */
    static String m4022y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final boolean mo21451C() {
        if (!this.f3329i) {
            return false;
        }
        this.f3329i = false;
        this.f3332l.removeMessages(2);
        this.f3332l.removeMessages(1);
        zabx zabx = this.f3334n;
        if (zabx != null) {
            zabx.mo21494b();
            this.f3334n = null;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo21452a(@Nullable Bundle bundle) {
        while (!this.f3328h.isEmpty()) {
            mo21253i((BaseImplementation.ApiMethodImpl) this.f3328h.remove());
        }
        this.f3323c.mo21756d(bundle);
    }

    /* renamed from: b */
    public final void mo21453b(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f3329i) {
                this.f3329i = true;
                if (this.f3334n == null && !ClientLibraryUtils.m4857a()) {
                    try {
                        this.f3334n = this.f3333m.mo21167x(this.f3326f.getApplicationContext(), new zabd(this));
                    } catch (SecurityException unused) {
                    }
                }
                zabc zabc = this.f3332l;
                zabc.sendMessageDelayed(zabc.obtainMessage(1), this.f3330j);
                zabc zabc2 = this.f3332l;
                zabc2.sendMessageDelayed(zabc2.obtainMessage(2), this.f3331k);
            }
            i = 1;
        }
        for (BasePendingResult i2 : (BasePendingResult[]) this.f3344x.f3451a.toArray(new BasePendingResult[0])) {
            i2.mo21326i(zadc.f3450c);
        }
        this.f3323c.mo21757e(i);
        this.f3323c.mo21753a();
        if (i == 2) {
            m4019F();
        }
    }

    /* renamed from: c */
    public final void mo21454c(ConnectionResult connectionResult) {
        if (!this.f3333m.mo21174k(this.f3326f, connectionResult.mo21133l2())) {
            mo21451C();
        }
        if (!this.f3329i) {
            this.f3323c.mo21755c(connectionResult);
            this.f3323c.mo21753a();
        }
    }

    /* renamed from: d */
    public final ConnectionResult mo21248d(long j, @NonNull TimeUnit timeUnit) {
        Preconditions.m4494q(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.m4489l(timeUnit, "TimeUnit must not be null");
        this.f3322b.lock();
        try {
            Integer num = this.f3342v;
            if (num == null) {
                this.f3342v = Integer.valueOf(m4020v(this.f3335o.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m4017D(((Integer) Preconditions.m4488k(this.f3342v)).intValue());
            this.f3323c.mo21754b();
            return ((zaca) Preconditions.m4488k(this.f3324d)).mo21419h(j, timeUnit);
        } finally {
            this.f3322b.unlock();
        }
    }

    /* renamed from: e */
    public final void mo21249e() {
        this.f3322b.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f3325e >= 0) {
                Preconditions.m4494q(this.f3342v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f3342v;
                if (num == null) {
                    this.f3342v = Integer.valueOf(m4020v(this.f3335o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) Preconditions.m4488k(this.f3342v)).intValue();
            this.f3322b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                Preconditions.m4479b(z, "Illegal sign-in mode: " + i);
                m4017D(i);
                m4019F();
            }
            z = true;
            Preconditions.m4479b(z, "Illegal sign-in mode: " + i);
            m4017D(i);
            m4019F();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f3322b.unlock();
        }
    }

    /* renamed from: f */
    public final void mo21250f() {
        Lock lock;
        this.f3322b.lock();
        try {
            this.f3344x.mo21518b();
            zaca zaca = this.f3324d;
            if (zaca != null) {
                zaca.mo21415d();
            }
            this.f3340t.mo21382d();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.f3328h) {
                apiMethodImpl.mo21332s((zadb) null);
                apiMethodImpl.mo21212f();
            }
            this.f3328h.clear();
            if (this.f3324d == null) {
                lock = this.f3322b;
            } else {
                mo21451C();
                this.f3323c.mo21753a();
                lock = this.f3322b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f3322b.unlock();
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo21251g(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f3326f);
        printWriter.append(str).append("mResuming=").print(this.f3329i);
        printWriter.append(" mWorkQueue.size()=").print(this.f3328h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f3344x.f3451a.size());
        zaca zaca = this.f3324d;
        if (zaca != null) {
            zaca.mo21417f(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: h */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo21252h(@NonNull T t) {
        Lock lock;
        Api<?> u = t.mo21322u();
        boolean containsKey = this.f3335o.containsKey(t.mo21323v());
        String d = u != null ? u.mo21191d() : "the API";
        Preconditions.m4479b(containsKey, "GoogleApiClient is not configured to use " + d + " required for this call.");
        this.f3322b.lock();
        try {
            zaca zaca = this.f3324d;
            if (zaca == null) {
                this.f3328h.add(t);
                lock = this.f3322b;
            } else {
                t = zaca.mo21420i(t);
                lock = this.f3322b;
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.f3322b.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo21253i(@NonNull T t) {
        Lock lock;
        Api<?> u = t.mo21322u();
        boolean containsKey = this.f3335o.containsKey(t.mo21323v());
        String d = u != null ? u.mo21191d() : "the API";
        Preconditions.m4479b(containsKey, "GoogleApiClient is not configured to use " + d + " required for this call.");
        this.f3322b.lock();
        try {
            zaca zaca = this.f3324d;
            if (zaca != null) {
                if (this.f3329i) {
                    this.f3328h.add(t);
                    while (!this.f3328h.isEmpty()) {
                        BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) this.f3328h.remove();
                        this.f3344x.mo21517a(apiMethodImpl);
                        apiMethodImpl.mo21321b(Status.f3140z);
                    }
                    lock = this.f3322b;
                } else {
                    t = zaca.mo21422k(t);
                    lock = this.f3322b;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f3322b.unlock();
            throw th;
        }
    }

    /* renamed from: k */
    public final Looper mo21254k() {
        return this.f3327g;
    }

    /* renamed from: l */
    public final boolean mo21255l() {
        zaca zaca = this.f3324d;
        return zaca != null && zaca.mo21421j();
    }

    /* renamed from: m */
    public final boolean mo21256m() {
        zaca zaca = this.f3324d;
        return zaca != null && zaca.mo21418g();
    }

    /* renamed from: n */
    public final boolean mo21257n(SignInConnectionListener signInConnectionListener) {
        zaca zaca = this.f3324d;
        return zaca != null && zaca.mo21416e(signInConnectionListener);
    }

    /* renamed from: o */
    public final void mo21258o() {
        zaca zaca = this.f3324d;
        if (zaca != null) {
            zaca.mo21414c();
        }
    }

    /* renamed from: p */
    public final void mo21259p(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f3323c.mo21759g(onConnectionFailedListener);
    }

    /* renamed from: q */
    public final <L> ListenerHolder<L> mo21260q(@NonNull L l) {
        this.f3322b.lock();
        try {
            return this.f3340t.mo21381c(l, this.f3327g, "NO_TYPE");
        } finally {
            this.f3322b.unlock();
        }
    }

    /* renamed from: r */
    public final void mo21261r(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f3323c.mo21760h(onConnectionFailedListener);
    }

    /* renamed from: s */
    public final void mo21262s(zada zada) {
        this.f3322b.lock();
        try {
            if (this.f3343w == null) {
                this.f3343w = new HashSet();
            }
            this.f3343w.add(zada);
        } finally {
            this.f3322b.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21263t(com.google.android.gms.common.api.internal.zada r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f3322b
            r0.lock()
            java.util.Set r0 = r2.f3343w     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0016
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0016:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x0027
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0027:
            java.util.concurrent.locks.Lock r3 = r2.f3322b     // Catch:{ all -> 0x0057 }
            r3.lock()     // Catch:{ all -> 0x0057 }
            java.util.Set r3 = r2.f3343w     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x0036
            java.util.concurrent.locks.Lock r3 = r2.f3322b     // Catch:{ all -> 0x0057 }
            r3.unlock()     // Catch:{ all -> 0x0057 }
            goto L_0x0043
        L_0x0036:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0050 }
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f3322b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x004a
        L_0x0043:
            com.google.android.gms.common.api.internal.zaca r3 = r2.f3324d     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x004a
            r3.mo21413b()     // Catch:{ all -> 0x0057 }
        L_0x004a:
            java.util.concurrent.locks.Lock r3 = r2.f3322b
            r3.unlock()
            return
        L_0x0050:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f3322b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            throw r3     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f3322b
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.mo21263t(com.google.android.gms.common.api.internal.zada):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final String mo21455x() {
        StringWriter stringWriter = new StringWriter();
        mo21251g("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }
}
