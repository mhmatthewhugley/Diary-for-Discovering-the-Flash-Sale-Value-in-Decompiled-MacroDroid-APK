package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zad;
import com.google.android.gms.signin.zae;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zact extends zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: s */
    private static final Api.AbstractClientBuilder f3426s = zad.f47964c;

    /* renamed from: a */
    private final Context f3427a;

    /* renamed from: c */
    private final Handler f3428c;

    /* renamed from: d */
    private final Api.AbstractClientBuilder f3429d;

    /* renamed from: f */
    private final Set f3430f;

    /* renamed from: g */
    private final ClientSettings f3431g;

    /* renamed from: o */
    private zae f3432o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public zacs f3433p;

    @WorkerThread
    public zact(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        Api.AbstractClientBuilder abstractClientBuilder = f3426s;
        this.f3427a = context;
        this.f3428c = handler;
        this.f3431g = (ClientSettings) Preconditions.m4489l(clientSettings, "ClientSettings must not be null");
        this.f3430f = clientSettings.mo21674h();
        this.f3429d = abstractClientBuilder;
    }

    /* renamed from: sb */
    static /* bridge */ /* synthetic */ void m4176sb(zact zact, zak zak) {
        ConnectionResult l2 = zak.mo56120l2();
        if (l2.mo21137p2()) {
            zav zav = (zav) Preconditions.m4488k(zak.mo56121m2());
            ConnectionResult l22 = zav.mo21772l2();
            if (!l22.mo21137p2()) {
                String valueOf = String.valueOf(l22);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                zact.f3433p.mo21492c(l22);
                zact.f3432o.mo21195b();
                return;
            }
            zact.f3433p.mo21491b(zav.mo21773m2(), zact.f3430f);
        } else {
            zact.f3433p.mo21492c(l2);
        }
        zact.f3432o.mo21195b();
    }

    @WorkerThread
    /* renamed from: A1 */
    public final void mo21388A1(@NonNull ConnectionResult connectionResult) {
        this.f3433p.mo21492c(connectionResult);
    }

    @BinderThread
    /* renamed from: C2 */
    public final void mo21446C2(zak zak) {
        this.f3428c.post(new zacr(this, zak));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @WorkerThread
    /* renamed from: Ib */
    public final void mo21506Ib(zacs zacs) {
        zae zae = this.f3432o;
        if (zae != null) {
            zae.mo21195b();
        }
        this.f3431g.mo21679m(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder abstractClientBuilder = this.f3429d;
        Context context = this.f3427a;
        Looper looper = this.f3428c.getLooper();
        ClientSettings clientSettings = this.f3431g;
        this.f3432o = abstractClientBuilder.mo20768c(context, looper, clientSettings, clientSettings.mo21675i(), this, this);
        this.f3433p = zacs;
        Set set = this.f3430f;
        if (set == null || set.isEmpty()) {
            this.f3428c.post(new zacq(this));
        } else {
            this.f3432o.mo56105k();
        }
    }

    /* renamed from: Jb */
    public final void mo21507Jb() {
        zae zae = this.f3432o;
        if (zae != null) {
            zae.mo21195b();
        }
    }

    @WorkerThread
    /* renamed from: t1 */
    public final void mo21335t1(int i) {
        this.f3432o.mo21195b();
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo21336y(@Nullable Bundle bundle) {
        this.f3432o.mo56106p(this);
    }
}
