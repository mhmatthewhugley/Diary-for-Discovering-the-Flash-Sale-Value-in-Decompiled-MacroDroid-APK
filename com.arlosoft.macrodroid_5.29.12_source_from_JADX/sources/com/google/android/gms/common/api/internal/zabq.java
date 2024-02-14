package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zap;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zabq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {

    /* renamed from: A */
    private final List f3371A = new ArrayList();
    @Nullable

    /* renamed from: B */
    private ConnectionResult f3372B = null;

    /* renamed from: C */
    private int f3373C = 0;

    /* renamed from: D */
    final /* synthetic */ GoogleApiManager f3374D;

    /* renamed from: a */
    private final Queue f3375a = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Api.Client f3376c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ApiKey f3377d;

    /* renamed from: f */
    private final zaad f3378f;

    /* renamed from: g */
    private final Set f3379g = new HashSet();

    /* renamed from: o */
    private final Map f3380o = new HashMap();

    /* renamed from: p */
    private final int f3381p;
    @Nullable

    /* renamed from: s */
    private final zact f3382s;

    /* renamed from: z */
    private boolean f3383z;

    @WorkerThread
    public zabq(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        this.f3374D = googleApiManager;
        Api.Client C = googleApi.mo21223C(googleApiManager.f3187G.getLooper(), this);
        this.f3376c = C;
        this.f3377d = googleApi.mo21236v();
        this.f3378f = new zaad();
        this.f3381p = googleApi.mo21222B();
        if (C.mo21202j()) {
            this.f3382s = googleApi.mo21224D(googleApiManager.f3195p, googleApiManager.f3187G);
        } else {
            this.f3382s = null;
        }
    }

    /* renamed from: A */
    static /* bridge */ /* synthetic */ void m4079A(zabq zabq, zabs zabs) {
        Feature[] g;
        if (zabq.f3371A.remove(zabs)) {
            zabq.f3374D.f3187G.removeMessages(15, zabs);
            zabq.f3374D.f3187G.removeMessages(16, zabs);
            Feature a = zabs.f3385b;
            ArrayList arrayList = new ArrayList(zabq.f3375a.size());
            for (zai zai : zabq.f3375a) {
                if ((zai instanceof zac) && (g = ((zac) zai).mo21497g(zabq)) != null && ArrayUtils.m4843c(g, a)) {
                    arrayList.add(zai);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zai zai2 = (zai) arrayList.get(i);
                zabq.f3375a.remove(zai2);
                zai2.mo21511b(new UnsupportedApiCallException(a));
            }
        }
    }

    @WorkerThread
    @Nullable
    /* renamed from: b */
    private final Feature m4081b(@Nullable Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] r = this.f3376c.mo21207r();
            if (r == null) {
                r = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(r3);
            for (Feature feature : r) {
                arrayMap.put(feature.getName(), Long.valueOf(feature.mo21147l2()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) arrayMap.get(feature2.getName());
                if (l == null || l.longValue() < feature2.mo21147l2()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @WorkerThread
    /* renamed from: c */
    private final void m4082c(ConnectionResult connectionResult) {
        for (zal b : this.f3379g) {
            b.mo21522b(this.f3377d, connectionResult, Objects.m4470a(connectionResult, ConnectionResult.f3044g) ? this.f3376c.mo21199g() : null);
        }
        this.f3379g.clear();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: d */
    public final void m4083d(Status status) {
        Preconditions.m4481d(this.f3374D.f3187G);
        m4084e(status, (Exception) null, false);
    }

    @WorkerThread
    /* renamed from: e */
    private final void m4084e(@Nullable Status status, @Nullable Exception exc, boolean z) {
        Preconditions.m4481d(this.f3374D.f3187G);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.f3375a.iterator();
            while (it.hasNext()) {
                zai zai = (zai) it.next();
                if (!z || zai.f3459a == 2) {
                    if (status != null) {
                        zai.mo21510a(status);
                    } else {
                        zai.mo21511b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    @WorkerThread
    /* renamed from: f */
    private final void m4085f() {
        ArrayList arrayList = new ArrayList(this.f3375a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zai zai = (zai) arrayList.get(i);
            if (this.f3376c.mo21196c()) {
                if (m4091l(zai)) {
                    this.f3375a.remove(zai);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: g */
    public final void m4086g() {
        mo21469B();
        m4082c(ConnectionResult.f3044g);
        m4090k();
        Iterator it = this.f3380o.values().iterator();
        while (it.hasNext()) {
            zaci zaci = (zaci) it.next();
            if (m4081b(zaci.f3415a.mo21391c()) != null) {
                it.remove();
            } else {
                try {
                    zaci.f3415a.mo21392d(this.f3376c, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    mo21335t1(3);
                    this.f3376c.mo21197e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m4085f();
        m4088i();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: h */
    public final void m4087h(int i) {
        mo21469B();
        this.f3383z = true;
        this.f3378f.mo21425e(i, this.f3376c.mo21208t());
        GoogleApiManager googleApiManager = this.f3374D;
        googleApiManager.f3187G.sendMessageDelayed(Message.obtain(googleApiManager.f3187G, 9, this.f3377d), this.f3374D.f3189a);
        GoogleApiManager googleApiManager2 = this.f3374D;
        googleApiManager2.f3187G.sendMessageDelayed(Message.obtain(googleApiManager2.f3187G, 11, this.f3377d), this.f3374D.f3190c);
        this.f3374D.f3197z.mo21764c();
        for (zaci zaci : this.f3380o.values()) {
            zaci.f3417c.run();
        }
    }

    /* renamed from: i */
    private final void m4088i() {
        this.f3374D.f3187G.removeMessages(12, this.f3377d);
        GoogleApiManager googleApiManager = this.f3374D;
        googleApiManager.f3187G.sendMessageDelayed(googleApiManager.f3187G.obtainMessage(12, this.f3377d), this.f3374D.f3191d);
    }

    @WorkerThread
    /* renamed from: j */
    private final void m4089j(zai zai) {
        zai.mo21513d(this.f3378f, mo21480N());
        try {
            zai.mo21512c(this);
        } catch (DeadObjectException unused) {
            mo21335t1(1);
            this.f3376c.mo21197e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @WorkerThread
    /* renamed from: k */
    private final void m4090k() {
        if (this.f3383z) {
            this.f3374D.f3187G.removeMessages(11, this.f3377d);
            this.f3374D.f3187G.removeMessages(9, this.f3377d);
            this.f3383z = false;
        }
    }

    @WorkerThread
    /* renamed from: l */
    private final boolean m4091l(zai zai) {
        if (!(zai instanceof zac)) {
            m4089j(zai);
            return true;
        }
        zac zac = (zac) zai;
        Feature b = m4081b(zac.mo21497g(this));
        if (b == null) {
            m4089j(zai);
            return true;
        }
        String name = this.f3376c.getClass().getName();
        String name2 = b.getName();
        long l2 = b.mo21147l2();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + name2 + ", " + l2 + ").");
        if (!this.f3374D.f3188H || !zac.mo21496f(this)) {
            zac.mo21511b(new UnsupportedApiCallException(b));
            return true;
        }
        zabs zabs = new zabs(this.f3377d, b, (zabr) null);
        int indexOf = this.f3371A.indexOf(zabs);
        if (indexOf >= 0) {
            zabs zabs2 = (zabs) this.f3371A.get(indexOf);
            this.f3374D.f3187G.removeMessages(15, zabs2);
            GoogleApiManager googleApiManager = this.f3374D;
            googleApiManager.f3187G.sendMessageDelayed(Message.obtain(googleApiManager.f3187G, 15, zabs2), this.f3374D.f3189a);
            return false;
        }
        this.f3371A.add(zabs);
        GoogleApiManager googleApiManager2 = this.f3374D;
        googleApiManager2.f3187G.sendMessageDelayed(Message.obtain(googleApiManager2.f3187G, 15, zabs), this.f3374D.f3189a);
        GoogleApiManager googleApiManager3 = this.f3374D;
        googleApiManager3.f3187G.sendMessageDelayed(Message.obtain(googleApiManager3.f3187G, 16, zabs), this.f3374D.f3190c);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (m4092m(connectionResult)) {
            return false;
        }
        this.f3374D.mo21352h(connectionResult, this.f3381p);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m4092m(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.f3179K
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.f3374D     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.zaae r2 = r1.f3184D     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f3185E     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.ApiKey r2 = r3.f3377d     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.f3374D     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.zaae r1 = r1.f3184D     // Catch:{ all -> 0x002a }
            int r2 = r3.f3381p     // Catch:{ all -> 0x002a }
            r1.mo21527s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabq.m4092m(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: n */
    public final boolean m4093n(boolean z) {
        Preconditions.m4481d(this.f3374D.f3187G);
        if (!this.f3376c.mo21196c() || this.f3380o.size() != 0) {
            return false;
        }
        if (this.f3378f.mo21427g()) {
            if (z) {
                m4088i();
            }
            return false;
        }
        this.f3376c.mo21197e("Timing out service connection.");
        return true;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ void m4099z(zabq zabq, zabs zabs) {
        if (!zabq.f3371A.contains(zabs) || zabq.f3383z) {
            return;
        }
        if (!zabq.f3376c.mo21196c()) {
            zabq.mo21470C();
        } else {
            zabq.m4085f();
        }
    }

    @WorkerThread
    /* renamed from: A1 */
    public final void mo21388A1(@NonNull ConnectionResult connectionResult) {
        mo21473F(connectionResult, (Exception) null);
    }

    @WorkerThread
    /* renamed from: B */
    public final void mo21469B() {
        Preconditions.m4481d(this.f3374D.f3187G);
        this.f3372B = null;
    }

    @WorkerThread
    /* renamed from: C */
    public final void mo21470C() {
        Preconditions.m4481d(this.f3374D.f3187G);
        if (!this.f3376c.mo21196c() && !this.f3376c.mo21198f()) {
            try {
                GoogleApiManager googleApiManager = this.f3374D;
                int b = googleApiManager.f3197z.mo21763b(googleApiManager.f3195p, this.f3376c);
                if (b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b, (PendingIntent) null);
                    String name = this.f3376c.getClass().getName();
                    String obj = connectionResult.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    mo21473F(connectionResult, (Exception) null);
                    return;
                }
                GoogleApiManager googleApiManager2 = this.f3374D;
                Api.Client client = this.f3376c;
                zabu zabu = new zabu(googleApiManager2, client, this.f3377d);
                if (client.mo21202j()) {
                    ((zact) Preconditions.m4488k(this.f3382s)).mo21506Ib(zabu);
                }
                try {
                    this.f3376c.mo21200h(zabu);
                } catch (SecurityException e) {
                    mo21473F(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                mo21473F(new ConnectionResult(10), e2);
            }
        }
    }

    @WorkerThread
    /* renamed from: D */
    public final void mo21471D(zai zai) {
        Preconditions.m4481d(this.f3374D.f3187G);
        if (!this.f3376c.mo21196c()) {
            this.f3375a.add(zai);
            ConnectionResult connectionResult = this.f3372B;
            if (connectionResult == null || !connectionResult.mo21136o2()) {
                mo21470C();
            } else {
                mo21473F(this.f3372B, (Exception) null);
            }
        } else if (m4091l(zai)) {
            m4088i();
        } else {
            this.f3375a.add(zai);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: E */
    public final void mo21472E() {
        this.f3373C++;
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo21473F(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        Preconditions.m4481d(this.f3374D.f3187G);
        zact zact = this.f3382s;
        if (zact != null) {
            zact.mo21507Jb();
        }
        mo21469B();
        this.f3374D.f3197z.mo21764c();
        m4082c(connectionResult);
        if ((this.f3376c instanceof zap) && connectionResult.mo21133l2() != 24) {
            this.f3374D.f3192f = true;
            GoogleApiManager googleApiManager = this.f3374D;
            googleApiManager.f3187G.sendMessageDelayed(googleApiManager.f3187G.obtainMessage(19), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (connectionResult.mo21133l2() == 4) {
            m4083d(GoogleApiManager.f3178J);
        } else if (this.f3375a.isEmpty()) {
            this.f3372B = connectionResult;
        } else if (exc != null) {
            Preconditions.m4481d(this.f3374D.f3187G);
            m4084e((Status) null, exc, false);
        } else if (this.f3374D.f3188H) {
            m4084e(GoogleApiManager.m3753i(this.f3377d, connectionResult), (Exception) null, true);
            if (!this.f3375a.isEmpty() && !m4092m(connectionResult) && !this.f3374D.mo21352h(connectionResult, this.f3381p)) {
                if (connectionResult.mo21133l2() == 18) {
                    this.f3383z = true;
                }
                if (this.f3383z) {
                    GoogleApiManager googleApiManager2 = this.f3374D;
                    googleApiManager2.f3187G.sendMessageDelayed(Message.obtain(googleApiManager2.f3187G, 9, this.f3377d), this.f3374D.f3189a);
                    return;
                }
                m4083d(GoogleApiManager.m3753i(this.f3377d, connectionResult));
            }
        } else {
            m4083d(GoogleApiManager.m3753i(this.f3377d, connectionResult));
        }
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo21474G(@NonNull ConnectionResult connectionResult) {
        Preconditions.m4481d(this.f3374D.f3187G);
        Api.Client client = this.f3376c;
        String name = client.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        client.mo21197e("onSignInFailed for " + name + " with " + valueOf);
        mo21473F(connectionResult, (Exception) null);
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo21475H(zal zal) {
        Preconditions.m4481d(this.f3374D.f3187G);
        this.f3379g.add(zal);
    }

    @WorkerThread
    /* renamed from: I */
    public final void mo21476I() {
        Preconditions.m4481d(this.f3374D.f3187G);
        if (this.f3383z) {
            mo21470C();
        }
    }

    @WorkerThread
    /* renamed from: J */
    public final void mo21477J() {
        Preconditions.m4481d(this.f3374D.f3187G);
        m4083d(GoogleApiManager.f3177I);
        this.f3378f.mo21426f();
        for (ListenerHolder.ListenerKey zah : (ListenerHolder.ListenerKey[]) this.f3380o.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            mo21471D(new zah(zah, new TaskCompletionSource()));
        }
        m4082c(new ConnectionResult(4));
        if (this.f3376c.mo21196c()) {
            this.f3376c.mo21205n(new zabp(this));
        }
    }

    @WorkerThread
    /* renamed from: K */
    public final void mo21478K() {
        Status status;
        Preconditions.m4481d(this.f3374D.f3187G);
        if (this.f3383z) {
            m4090k();
            GoogleApiManager googleApiManager = this.f3374D;
            if (googleApiManager.f3196s.mo21156i(googleApiManager.f3195p) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m4083d(status);
            this.f3376c.mo21197e("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo21479M() {
        return this.f3376c.mo21196c();
    }

    /* renamed from: N */
    public final boolean mo21480N() {
        return this.f3376c.mo21202j();
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo21481a() {
        return m4093n(true);
    }

    /* renamed from: g8 */
    public final void mo21458g8(ConnectionResult connectionResult, Api api, boolean z) {
        throw null;
    }

    /* renamed from: o */
    public final int mo21482o() {
        return this.f3381p;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final int mo21483p() {
        return this.f3373C;
    }

    @WorkerThread
    @Nullable
    /* renamed from: q */
    public final ConnectionResult mo21484q() {
        Preconditions.m4481d(this.f3374D.f3187G);
        return this.f3372B;
    }

    /* renamed from: s */
    public final Api.Client mo21485s() {
        return this.f3376c;
    }

    /* renamed from: t1 */
    public final void mo21335t1(int i) {
        if (Looper.myLooper() == this.f3374D.f3187G.getLooper()) {
            m4087h(i);
        } else {
            this.f3374D.f3187G.post(new zabn(this, i));
        }
    }

    /* renamed from: u */
    public final Map mo21486u() {
        return this.f3380o;
    }

    /* renamed from: y */
    public final void mo21336y(@Nullable Bundle bundle) {
        if (Looper.myLooper() == this.f3374D.f3187G.getLooper()) {
            m4086g();
        } else {
            this.f3374D.f3187G.post(new zabm(this));
        }
    }
}
