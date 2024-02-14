package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: c */
    protected volatile boolean f3476c;

    /* renamed from: d */
    protected final AtomicReference f3477d = new AtomicReference((Object) null);

    /* renamed from: f */
    private final Handler f3478f = new zau(Looper.getMainLooper());

    /* renamed from: g */
    protected final GoogleApiAvailability f3479g;

    @VisibleForTesting
    zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.f3479g = googleApiAvailability;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m4246l(ConnectionResult connectionResult, int i) {
        this.f3477d.set((Object) null);
        mo21428m(connectionResult, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m4247o() {
        this.f3477d.set((Object) null);
        mo21429n();
    }

    /* renamed from: p */
    private static final int m4248p(@Nullable zam zam) {
        if (zam == null) {
            return -1;
        }
        return zam.mo21523a();
    }

    /* renamed from: e */
    public final void mo21364e(int i, int i2, Intent intent) {
        zam zam = (zam) this.f3477d.get();
        if (i != 1) {
            if (i == 2) {
                int i3 = this.f3479g.mo21156i(mo21363b());
                if (i3 == 0) {
                    m4247o();
                    return;
                } else if (zam != null) {
                    if (zam.mo21524b().mo21133l2() == 18 && i3 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            m4247o();
            return;
        } else if (i2 == 0) {
            if (zam != null) {
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m4246l(new ConnectionResult(i4, (PendingIntent) null, zam.mo21524b().toString()), m4248p(zam));
                return;
            }
            return;
        }
        if (zam != null) {
            m4246l(zam.mo21524b(), zam.mo21523a());
        }
    }

    /* renamed from: f */
    public final void mo21365f(@Nullable Bundle bundle) {
        super.mo21365f(bundle);
        if (bundle != null) {
            this.f3477d.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: i */
    public final void mo21368i(Bundle bundle) {
        super.mo21368i(bundle);
        zam zam = (zam) this.f3477d.get();
        if (zam != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zam.mo21523a());
            bundle.putInt("failed_status", zam.mo21524b().mo21133l2());
            bundle.putParcelable("failed_resolution", zam.mo21524b().mo21135n2());
        }
    }

    /* renamed from: j */
    public void mo21369j() {
        super.mo21369j();
        this.f3476c = true;
    }

    /* renamed from: k */
    public void mo21370k() {
        super.mo21370k();
        this.f3476c = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo21428m(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo21429n();

    public final void onCancel(DialogInterface dialogInterface) {
        m4246l(new ConnectionResult(13, (PendingIntent) null), m4248p((zam) this.f3477d.get()));
    }

    /* renamed from: s */
    public final void mo21527s(ConnectionResult connectionResult, int i) {
        zam zam = new zam(connectionResult, i);
        AtomicReference atomicReference = this.f3477d;
        while (!atomicReference.compareAndSet((Object) null, zam)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f3478f.post(new zao(this, zam));
    }
}
