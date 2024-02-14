package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zada<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a */
    public ResultTransform f3440a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public zada f3441c;
    @Nullable

    /* renamed from: d */
    private volatile ResultCallbacks f3442d;
    @Nullable

    /* renamed from: f */
    private PendingResult f3443f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f3444g;
    @Nullable

    /* renamed from: o */
    private Status f3445o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final WeakReference f3446p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final zacz f3447s;

    /* renamed from: z */
    private boolean f3448z;

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m4198j(Status status) {
        synchronized (this.f3444g) {
            this.f3445o = status;
            m4200l(status);
        }
    }

    /* renamed from: k */
    private final void m4199k() {
        if (this.f3440a != null || this.f3442d != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f3446p.get();
            if (!(this.f3448z || this.f3440a == null || googleApiClient == null)) {
                googleApiClient.mo21262s(this);
                this.f3448z = true;
            }
            Status status = this.f3445o;
            if (status != null) {
                m4200l(status);
                return;
            }
            PendingResult pendingResult = this.f3443f;
            if (pendingResult != null) {
                pendingResult.mo21273g(this);
            }
        }
    }

    /* renamed from: l */
    private final void m4200l(Status status) {
        synchronized (this.f3444g) {
            ResultTransform resultTransform = this.f3440a;
            if (resultTransform != null) {
                ((zada) Preconditions.m4488k(this.f3441c)).m4198j((Status) Preconditions.m4489l(resultTransform.mo21282a(status), "onFailure must not return null"));
            } else if (m4201m()) {
                ((ResultCallbacks) Preconditions.m4488k(this.f3442d)).mo21276a(status);
            }
        }
    }

    /* renamed from: m */
    private final boolean m4201m() {
        return (this.f3442d == null || ((GoogleApiClient) this.f3446p.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m4202n(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(result)), e);
            }
        }
    }

    /* renamed from: A */
    public final void mo21280A(Result result) {
        synchronized (this.f3444g) {
            if (!result.getStatus().mo21297q2()) {
                m4198j(result.getStatus());
                m4202n(result);
            } else if (this.f3440a != null) {
                zaco.m4166a().submit(new zacy(this, result));
            } else if (m4201m()) {
                ((ResultCallbacks) Preconditions.m4488k(this.f3442d)).mo21281b(result);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo21515h() {
        this.f3442d = null;
    }

    /* renamed from: i */
    public final void mo21516i(PendingResult pendingResult) {
        synchronized (this.f3444g) {
            this.f3443f = pendingResult;
            m4199k();
        }
    }
}
