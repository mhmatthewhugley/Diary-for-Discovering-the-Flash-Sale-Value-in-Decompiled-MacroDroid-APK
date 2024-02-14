package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zak extends zap {

    /* renamed from: o */
    private final SparseArray f3464o = new SparseArray();

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.m3521q());
        this.f3200a.mo21373t("AutoManageHelper", this);
    }

    /* renamed from: t */
    public static zak m4232t(LifecycleActivity lifecycleActivity) {
        LifecycleFragment d = LifecycleCallback.m3792d(lifecycleActivity);
        zak zak = (zak) d.mo21374u("AutoManageHelper", zak.class);
        if (zak != null) {
            return zak;
        }
        return new zak(d);
    }

    @Nullable
    /* renamed from: w */
    private final zaj m4233w(int i) {
        if (this.f3464o.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.f3464o;
        return (zaj) sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: a */
    public final void mo21362a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f3464o.size(); i++) {
            zaj w = m4233w(i);
            if (w != null) {
                printWriter.append(str).append("GoogleApiClient #").print(w.f3460a);
                printWriter.println(":");
                w.f3461c.mo21251g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: j */
    public final void mo21369j() {
        super.mo21369j();
        boolean z = this.f3476c;
        String valueOf = String.valueOf(this.f3464o);
        StringBuilder sb = new StringBuilder();
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        if (this.f3477d.get() == null) {
            for (int i = 0; i < this.f3464o.size(); i++) {
                zaj w = m4233w(i);
                if (w != null) {
                    w.f3461c.mo21249e();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo21370k() {
        super.mo21370k();
        for (int i = 0; i < this.f3464o.size(); i++) {
            zaj w = m4233w(i);
            if (w != null) {
                w.f3461c.mo21250f();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo21428m(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaj zaj = (zaj) this.f3464o.get(i);
        if (zaj != null) {
            mo21520v(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zaj.f3462d;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.mo21388A1(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo21429n() {
        for (int i = 0; i < this.f3464o.size(); i++) {
            zaj w = m4233w(i);
            if (w != null) {
                w.f3461c.mo21249e();
            }
        }
    }

    /* renamed from: u */
    public final void mo21519u(int i, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m4489l(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.f3464o.indexOfKey(i) < 0;
        Preconditions.m4494q(z, "Already managing a GoogleApiClient with id " + i);
        zam zam = (zam) this.f3477d.get();
        boolean z2 = this.f3476c;
        String valueOf = String.valueOf(zam);
        StringBuilder sb = new StringBuilder();
        sb.append("starting AutoManage for client ");
        sb.append(i);
        sb.append(" ");
        sb.append(z2);
        sb.append(" ");
        sb.append(valueOf);
        zaj zaj = new zaj(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.mo21259p(zaj);
        this.f3464o.put(i, zaj);
        if (this.f3476c && zam == null) {
            "connecting ".concat(googleApiClient.toString());
            googleApiClient.mo21249e();
        }
    }

    /* renamed from: v */
    public final void mo21520v(int i) {
        zaj zaj = (zaj) this.f3464o.get(i);
        this.f3464o.remove(i);
        if (zaj != null) {
            zaj.f3461c.mo21261r(zaj);
            zaj.f3461c.mo21250f();
        }
    }
}
