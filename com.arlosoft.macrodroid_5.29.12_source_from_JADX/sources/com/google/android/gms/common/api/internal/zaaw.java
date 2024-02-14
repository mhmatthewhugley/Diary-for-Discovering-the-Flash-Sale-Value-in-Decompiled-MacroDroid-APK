package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaaw implements zabf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zabi f3289a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f3290b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f3291c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final GoogleApiAvailabilityLight f3292d;
    @Nullable

    /* renamed from: e */
    private ConnectionResult f3293e;

    /* renamed from: f */
    private int f3294f;

    /* renamed from: g */
    private int f3295g = 0;

    /* renamed from: h */
    private int f3296h;

    /* renamed from: i */
    private final Bundle f3297i = new Bundle();

    /* renamed from: j */
    private final Set f3298j = new HashSet();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: k */
    public zae f3299k;

    /* renamed from: l */
    private boolean f3300l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f3301m;

    /* renamed from: n */
    private boolean f3302n;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: o */
    public IAccountAccessor f3303o;

    /* renamed from: p */
    private boolean f3304p;

    /* renamed from: q */
    private boolean f3305q;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: r */
    public final ClientSettings f3306r;

    /* renamed from: s */
    private final Map f3307s;
    @Nullable

    /* renamed from: t */
    private final Api.AbstractClientBuilder f3308t;

    /* renamed from: u */
    private final ArrayList f3309u = new ArrayList();

    public zaaw(zabi zabi, @Nullable ClientSettings clientSettings, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, @Nullable Api.AbstractClientBuilder abstractClientBuilder, Lock lock, Context context) {
        this.f3289a = zabi;
        this.f3306r = clientSettings;
        this.f3307s = map;
        this.f3292d = googleApiAvailabilityLight;
        this.f3308t = abstractClientBuilder;
        this.f3290b = lock;
        this.f3291c = context;
    }

    /* renamed from: B */
    static /* bridge */ /* synthetic */ void m3966B(zaaw zaaw, zak zak) {
        if (zaaw.m3981o(0)) {
            ConnectionResult l2 = zak.mo56120l2();
            if (l2.mo21137p2()) {
                zav zav = (zav) Preconditions.m4488k(zak.mo56121m2());
                ConnectionResult l22 = zav.mo21772l2();
                if (!l22.mo21137p2()) {
                    String valueOf = String.valueOf(l22);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    zaaw.m3978l(l22);
                    return;
                }
                zaaw.f3302n = true;
                zaaw.f3303o = (IAccountAccessor) Preconditions.m4488k(zav.mo21773m2());
                zaaw.f3304p = zav.mo21774n2();
                zaaw.f3305q = zav.mo21775o2();
                zaaw.m3980n();
            } else if (zaaw.m3983q(l2)) {
                zaaw.m3975i();
                zaaw.m3980n();
            } else {
                zaaw.m3978l(l2);
            }
        }
    }

    /* renamed from: J */
    private final void m3974J() {
        ArrayList arrayList = this.f3309u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.f3309u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m3975i() {
        this.f3301m = false;
        this.f3289a.f3352E.f3336p = Collections.emptySet();
        for (Api.AnyClientKey anyClientKey : this.f3298j) {
            if (!this.f3289a.f3360p.containsKey(anyClientKey)) {
                this.f3289a.f3360p.put(anyClientKey, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    /* renamed from: j */
    private final void m3976j(boolean z) {
        zae zae = this.f3299k;
        if (zae != null) {
            if (zae.mo21196c() && z) {
                zae.mo56104a();
            }
            zae.mo21195b();
            ClientSettings clientSettings = (ClientSettings) Preconditions.m4488k(this.f3306r);
            this.f3303o = null;
        }
    }

    /* renamed from: k */
    private final void m3977k() {
        Bundle bundle;
        this.f3289a.mo21459n();
        zabj.m4076a().execute(new zaak(this));
        zae zae = this.f3299k;
        if (zae != null) {
            if (this.f3304p) {
                zae.mo56107s((IAccountAccessor) Preconditions.m4488k(this.f3303o), this.f3305q);
            }
            m3976j(false);
        }
        for (Api.AnyClientKey anyClientKey : this.f3289a.f3360p.keySet()) {
            ((Api.Client) Preconditions.m4488k((Api.Client) this.f3289a.f3359o.get(anyClientKey))).mo21195b();
        }
        if (this.f3297i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f3297i;
        }
        this.f3289a.f3353F.mo21452a(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m3978l(ConnectionResult connectionResult) {
        m3974J();
        m3976j(!connectionResult.mo21136o2());
        this.f3289a.mo21461p(connectionResult);
        this.f3289a.f3353F.mo21454c(connectionResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m3979m(ConnectionResult connectionResult, Api api, boolean z) {
        int b = api.mo21190c().mo21194b();
        if ((!z || connectionResult.mo21136o2() || this.f3292d.mo21172c(connectionResult.mo21133l2()) != null) && (this.f3293e == null || b < this.f3294f)) {
            this.f3293e = connectionResult;
            this.f3294f = b;
        }
        this.f3289a.f3360p.put(api.mo21189b(), connectionResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m3980n() {
        if (this.f3296h == 0) {
            if (!this.f3301m || this.f3302n) {
                ArrayList arrayList = new ArrayList();
                this.f3295g = 1;
                this.f3296h = this.f3289a.f3359o.size();
                for (Api.AnyClientKey anyClientKey : this.f3289a.f3359o.keySet()) {
                    if (!this.f3289a.f3360p.containsKey(anyClientKey)) {
                        arrayList.add((Api.Client) this.f3289a.f3359o.get(anyClientKey));
                    } else if (m3982p()) {
                        m3977k();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f3309u.add(zabj.m4076a().submit(new zaap(this, arrayList)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final boolean m3981o(int i) {
        if (this.f3295g == i) {
            return true;
        }
        Log.w("GACConnecting", this.f3289a.f3352E.mo21455x());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.f3296h;
        Log.w("GACConnecting", "mRemainingConnections=" + i2);
        int i3 = this.f3295g;
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + m3984r(i3) + " but received callback for step " + m3984r(i), new Exception());
        m3978l(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m3982p() {
        int i = this.f3296h - 1;
        this.f3296h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f3289a.f3352E.mo21455x());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m3978l(new ConnectionResult(8, (PendingIntent) null));
            return false;
        }
        ConnectionResult connectionResult = this.f3293e;
        if (connectionResult == null) {
            return true;
        }
        this.f3289a.f3351D = this.f3294f;
        m3978l(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final boolean m3983q(ConnectionResult connectionResult) {
        return this.f3300l && !connectionResult.mo21136o2();
    }

    /* renamed from: r */
    private static final String m3984r(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ Set m3991y(zaaw zaaw) {
        ClientSettings clientSettings = zaaw.f3306r;
        if (clientSettings == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(clientSettings.mo21674h());
        Map l = zaaw.f3306r.mo21678l();
        for (Api api : l.keySet()) {
            if (!zaaw.f3289a.f3360p.containsKey(api.mo21189b())) {
                hashSet.addAll(((zab) l.get(api)).f3697a);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo21434a(@Nullable Bundle bundle) {
        if (m3981o(1)) {
            if (bundle != null) {
                this.f3297i.putAll(bundle);
            }
            if (m3982p()) {
                m3977k();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    /* renamed from: b */
    public final void mo21435b() {
        this.f3289a.f3360p.clear();
        this.f3301m = false;
        this.f3293e = null;
        this.f3295g = 0;
        this.f3300l = true;
        this.f3302n = false;
        this.f3304p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (Api api : this.f3307s.keySet()) {
            Api.Client client = (Api.Client) Preconditions.m4488k((Api.Client) this.f3289a.f3359o.get(api.mo21189b()));
            z |= api.mo21190c().mo21194b() == 1;
            boolean booleanValue = ((Boolean) this.f3307s.get(api)).booleanValue();
            if (client.mo21202j()) {
                this.f3301m = true;
                if (booleanValue) {
                    this.f3298j.add(api.mo21189b());
                } else {
                    this.f3300l = false;
                }
            }
            hashMap.put(client, new zaal(this, api, booleanValue));
        }
        if (z) {
            this.f3301m = false;
        }
        if (this.f3301m) {
            Preconditions.m4488k(this.f3306r);
            Preconditions.m4488k(this.f3308t);
            this.f3306r.mo21679m(Integer.valueOf(System.identityHashCode(this.f3289a.f3352E)));
            zaat zaat = new zaat(this, (zaas) null);
            Api.AbstractClientBuilder abstractClientBuilder = this.f3308t;
            Context context = this.f3291c;
            Looper k = this.f3289a.f3352E.mo21254k();
            ClientSettings clientSettings = this.f3306r;
            this.f3299k = abstractClientBuilder.mo20768c(context, k, clientSettings, clientSettings.mo21675i(), zaat, zaat);
        }
        this.f3296h = this.f3289a.f3359o.size();
        this.f3309u.add(zabj.m4076a().submit(new zaao(this, hashMap)));
    }

    /* renamed from: c */
    public final void mo21436c() {
    }

    /* renamed from: d */
    public final void mo21437d(ConnectionResult connectionResult, Api api, boolean z) {
        if (m3981o(1)) {
            m3979m(connectionResult, api, z);
            if (m3982p()) {
                m3977k();
            }
        }
    }

    /* renamed from: e */
    public final void mo21438e(int i) {
        m3978l(new ConnectionResult(8, (PendingIntent) null));
    }

    /* renamed from: f */
    public final BaseImplementation.ApiMethodImpl mo21439f(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.f3289a.f3352E.f3328h.add(apiMethodImpl);
        return apiMethodImpl;
    }

    /* renamed from: g */
    public final boolean mo21440g() {
        m3974J();
        m3976j(true);
        this.f3289a.mo21461p((ConnectionResult) null);
        return true;
    }

    /* renamed from: h */
    public final BaseImplementation.ApiMethodImpl mo21441h(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
