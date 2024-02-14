package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaaa implements zaca {
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: A */
    public ConnectionResult f3244A = null;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: B */
    public ConnectionResult f3245B = null;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f3246C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Lock f3247D;

    /* renamed from: E */
    private int f3248E = 0;

    /* renamed from: a */
    private final Context f3249a;

    /* renamed from: c */
    private final zabe f3250c;

    /* renamed from: d */
    private final Looper f3251d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zabi f3252f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zabi f3253g;

    /* renamed from: o */
    private final Map f3254o;

    /* renamed from: p */
    private final Set f3255p = Collections.newSetFromMap(new WeakHashMap());
    @Nullable

    /* renamed from: s */
    private final Api.Client f3256s;
    @Nullable

    /* renamed from: z */
    private Bundle f3257z;

    private zaaa(Context context, zabe zabe, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, @Nullable Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f3249a = context;
        this.f3250c = zabe;
        this.f3247D = lock;
        this.f3251d = looper;
        this.f3256s = client;
        Context context2 = context;
        zabe zabe2 = zabe;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        zabi zabi = r3;
        zabi zabi2 = new zabi(context2, zabe2, lock2, looper2, googleApiAvailabilityLight2, map2, (ClientSettings) null, map4, (Api.AbstractClientBuilder) null, arrayList2, new zax(this, (zaw) null));
        this.f3252f = zabi;
        this.f3253g = new zabi(context2, zabe2, lock2, looper2, googleApiAvailabilityLight2, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaz(this, (zay) null));
        ArrayMap arrayMap = new ArrayMap();
        for (Api.AnyClientKey put : map2.keySet()) {
            arrayMap.put(put, this.f3252f);
        }
        for (Api.AnyClientKey put2 : map.keySet()) {
            arrayMap.put(put2, this.f3253g);
        }
        this.f3254o = Collections.unmodifiableMap(arrayMap);
    }

    /* renamed from: A */
    static /* bridge */ /* synthetic */ void m3884A(zaaa zaaa) {
        ConnectionResult connectionResult;
        if (m3891p(zaaa.f3244A)) {
            if (m3891p(zaaa.f3245B) || zaaa.m3889n()) {
                int i = zaaa.f3248E;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        zaaa.f3248E = 0;
                        return;
                    }
                    ((zabe) Preconditions.m4488k(zaaa.f3250c)).mo21452a(zaaa.f3257z);
                }
                zaaa.m3888m();
                zaaa.f3248E = 0;
                return;
            }
            ConnectionResult connectionResult2 = zaaa.f3245B;
            if (connectionResult2 == null) {
                return;
            }
            if (zaaa.f3248E == 1) {
                zaaa.m3888m();
                return;
            }
            zaaa.m3887l(connectionResult2);
            zaaa.f3252f.mo21415d();
        } else if (zaaa.f3244A == null || !m3891p(zaaa.f3245B)) {
            ConnectionResult connectionResult3 = zaaa.f3244A;
            if (connectionResult3 != null && (connectionResult = zaaa.f3245B) != null) {
                if (zaaa.f3253g.f3351D < zaaa.f3252f.f3351D) {
                    connectionResult3 = connectionResult;
                }
                zaaa.m3887l(connectionResult3);
            }
        } else {
            zaaa.f3253g.mo21415d();
            zaaa.m3887l((ConnectionResult) Preconditions.m4488k(zaaa.f3244A));
        }
    }

    @Nullable
    /* renamed from: C */
    private final PendingIntent m3886C() {
        if (this.f3256s == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f3249a, System.identityHashCode(this.f3250c), this.f3256s.mo21034u(), zap.f39272a | 134217728);
    }

    /* renamed from: l */
    private final void m3887l(ConnectionResult connectionResult) {
        int i = this.f3248E;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f3248E = 0;
            }
            this.f3250c.mo21454c(connectionResult);
        }
        m3888m();
        this.f3248E = 0;
    }

    /* renamed from: m */
    private final void m3888m() {
        for (SignInConnectionListener onComplete : this.f3255p) {
            onComplete.onComplete();
        }
        this.f3255p.clear();
    }

    /* renamed from: n */
    private final boolean m3889n() {
        ConnectionResult connectionResult = this.f3245B;
        return connectionResult != null && connectionResult.mo21133l2() == 4;
    }

    /* renamed from: o */
    private final boolean m3890o(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabi = (zabi) this.f3254o.get(apiMethodImpl.mo21323v());
        Preconditions.m4489l(zabi, "GoogleApiClient is not configured to use the API required for this call.");
        return zabi.equals(this.f3253g);
    }

    /* renamed from: p */
    private static boolean m3891p(@Nullable ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo21137p2();
    }

    /* renamed from: r */
    public static zaaa m3893r(Context context, zabe zabe, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        Map map3 = map2;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.mo21031d()) {
                client = client2;
            }
            if (client2.mo21202j()) {
                arrayMap.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                arrayMap2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.m4494q(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey b = api.mo21189b();
            if (arrayMap.containsKey(b)) {
                arrayMap3.put(api, (Boolean) map3.get(api));
            } else if (arrayMap2.containsKey(b)) {
                arrayMap4.put(api, (Boolean) map3.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zat zat = (zat) arrayList.get(i);
            if (arrayMap3.containsKey(zat.f3481a)) {
                arrayList2.add(zat);
            } else if (arrayMap4.containsKey(zat.f3481a)) {
                arrayList3.add(zat);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zaaa(context, zabe, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ void m3900y(zaaa zaaa, int i, boolean z) {
        zaaa.f3250c.mo21453b(i, z);
        zaaa.f3245B = null;
        zaaa.f3244A = null;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ void m3901z(zaaa zaaa, Bundle bundle) {
        Bundle bundle2 = zaaa.f3257z;
        if (bundle2 == null) {
            zaaa.f3257z = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: a */
    public final void mo21412a() {
        this.f3248E = 2;
        this.f3246C = false;
        this.f3245B = null;
        this.f3244A = null;
        this.f3252f.mo21412a();
        this.f3253g.mo21412a();
    }

    /* renamed from: b */
    public final void mo21413b() {
        this.f3252f.mo21413b();
        this.f3253g.mo21413b();
    }

    /* renamed from: c */
    public final void mo21414c() {
        this.f3247D.lock();
        try {
            boolean g = mo21418g();
            this.f3253g.mo21415d();
            this.f3245B = new ConnectionResult(4);
            if (g) {
                new zau(this.f3251d).post(new zav(this));
            } else {
                m3888m();
            }
        } finally {
            this.f3247D.unlock();
        }
    }

    /* renamed from: d */
    public final void mo21415d() {
        this.f3245B = null;
        this.f3244A = null;
        this.f3248E = 0;
        this.f3252f.mo21415d();
        this.f3253g.mo21415d();
        m3888m();
    }

    /* renamed from: e */
    public final boolean mo21416e(SignInConnectionListener signInConnectionListener) {
        this.f3247D.lock();
        try {
            if ((mo21418g() || mo21421j()) && !this.f3253g.mo21421j()) {
                this.f3255p.add(signInConnectionListener);
                if (this.f3248E == 0) {
                    this.f3248E = 1;
                }
                this.f3245B = null;
                this.f3253g.mo21412a();
                return true;
            }
            this.f3247D.unlock();
            return false;
        } finally {
            this.f3247D.unlock();
        }
    }

    /* renamed from: f */
    public final void mo21417f(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f3253g.mo21417f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f3252f.mo21417f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: g */
    public final boolean mo21418g() {
        this.f3247D.lock();
        try {
            return this.f3248E == 2;
        } finally {
            this.f3247D.unlock();
        }
    }

    /* renamed from: h */
    public final ConnectionResult mo21419h(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public final BaseImplementation.ApiMethodImpl mo21420i(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!m3890o(apiMethodImpl)) {
            this.f3252f.mo21420i(apiMethodImpl);
            return apiMethodImpl;
        } else if (m3889n()) {
            apiMethodImpl.mo21321b(new Status(4, (String) null, m3886C()));
            return apiMethodImpl;
        } else {
            this.f3253g.mo21420i(apiMethodImpl);
            return apiMethodImpl;
        }
    }

    /* renamed from: j */
    public final boolean mo21421j() {
        this.f3247D.lock();
        try {
            boolean z = false;
            if (this.f3252f.mo21421j() && (this.f3253g.mo21421j() || m3889n() || this.f3248E == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f3247D.unlock();
        }
    }

    /* renamed from: k */
    public final BaseImplementation.ApiMethodImpl mo21422k(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!m3890o(apiMethodImpl)) {
            return this.f3252f.mo21422k(apiMethodImpl);
        }
        if (!m3889n()) {
            return this.f3253g.mo21422k(apiMethodImpl);
        }
        apiMethodImpl.mo21321b(new Status(4, (String) null, m3886C()));
        return apiMethodImpl;
    }
}
