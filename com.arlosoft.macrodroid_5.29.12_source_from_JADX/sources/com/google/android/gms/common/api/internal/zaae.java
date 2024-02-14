package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaae extends zap {

    /* renamed from: o */
    private final ArraySet f3264o = new ArraySet();

    /* renamed from: p */
    private final GoogleApiManager f3265p;

    @VisibleForTesting
    zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f3265p = googleApiManager;
        this.f3200a.mo21373t("ConnectionlessLifecycleHelper", this);
    }

    @MainThread
    /* renamed from: u */
    public static void m3923u(Activity activity, GoogleApiManager googleApiManager, ApiKey apiKey) {
        LifecycleFragment c = LifecycleCallback.m3791c(activity);
        zaae zaae = (zaae) c.mo21374u("ConnectionlessLifecycleHelper", zaae.class);
        if (zaae == null) {
            zaae = new zaae(c, googleApiManager, GoogleApiAvailability.m3521q());
        }
        Preconditions.m4489l(apiKey, "ApiKey cannot be null");
        zaae.f3264o.add(apiKey);
        googleApiManager.mo21349d(zaae);
    }

    /* renamed from: v */
    private final void m3924v() {
        if (!this.f3264o.isEmpty()) {
            this.f3265p.mo21349d(this);
        }
    }

    /* renamed from: h */
    public final void mo21367h() {
        super.mo21367h();
        m3924v();
    }

    /* renamed from: j */
    public final void mo21369j() {
        super.mo21369j();
        m3924v();
    }

    /* renamed from: k */
    public final void mo21370k() {
        super.mo21370k();
        this.f3265p.mo21350e(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo21428m(ConnectionResult connectionResult, int i) {
        this.f3265p.mo21346K(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo21429n() {
        this.f3265p.mo21347b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final ArraySet mo21430t() {
        return this.f3264o;
    }
}
