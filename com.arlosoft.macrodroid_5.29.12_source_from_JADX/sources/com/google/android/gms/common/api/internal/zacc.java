package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zacc extends zap {

    /* renamed from: o */
    private TaskCompletionSource f3399o = new TaskCompletionSource();

    private zacc(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.m3521q());
        this.f3200a.mo21373t("GmsAvailabilityHelper", this);
    }

    /* renamed from: t */
    public static zacc m4156t(@NonNull Activity activity) {
        LifecycleFragment c = LifecycleCallback.m3791c(activity);
        zacc zacc = (zacc) c.mo21374u("GmsAvailabilityHelper", zacc.class);
        if (zacc == null) {
            return new zacc(c);
        }
        if (zacc.f3399o.mo56137a().mo23718s()) {
            zacc.f3399o = new TaskCompletionSource();
        }
        return zacc;
    }

    /* renamed from: g */
    public final void mo21366g() {
        super.mo21366g();
        this.f3399o.mo56140d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo21428m(ConnectionResult connectionResult, int i) {
        String m2 = connectionResult.mo21134m2();
        if (m2 == null) {
            m2 = "Error connecting to Google Play services";
        }
        this.f3399o.mo56138b(new ApiException(new Status(connectionResult, m2, connectionResult.mo21133l2())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo21429n() {
        Activity N = this.f3200a.mo21371N();
        if (N == null) {
            this.f3399o.mo56140d(new ApiException(new Status(8)));
            return;
        }
        int i = this.f3479g.mo21156i(N);
        if (i == 0) {
            this.f3399o.mo56141e(null);
        } else if (!this.f3399o.mo56137a().mo23718s()) {
            mo21527s(new ConnectionResult(i, (PendingIntent) null), 0);
        }
    }

    /* renamed from: u */
    public final Task mo21499u() {
        return this.f3399o.mo56137a();
    }
}
