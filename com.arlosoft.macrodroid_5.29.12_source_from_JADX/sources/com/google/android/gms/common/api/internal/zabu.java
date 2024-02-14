package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zabu implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Api.Client f3388a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ApiKey f3389b;
    @Nullable

    /* renamed from: c */
    private IAccountAccessor f3390c = null;
    @Nullable

    /* renamed from: d */
    private Set f3391d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f3392e = false;

    /* renamed from: f */
    final /* synthetic */ GoogleApiManager f3393f;

    public zabu(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.f3393f = googleApiManager;
        this.f3388a = client;
        this.f3389b = apiKey;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: h */
    public final void m4128h() {
        IAccountAccessor iAccountAccessor;
        if (this.f3392e && (iAccountAccessor = this.f3390c) != null) {
            this.f3388a.mo21204m(iAccountAccessor, this.f3391d);
        }
    }

    /* renamed from: a */
    public final void mo21444a(@NonNull ConnectionResult connectionResult) {
        this.f3393f.f3187G.post(new zabt(this, connectionResult));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo21491b(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo21492c(new ConnectionResult(4));
            return;
        }
        this.f3390c = iAccountAccessor;
        this.f3391d = set;
        m4128h();
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo21492c(ConnectionResult connectionResult) {
        zabq zabq = (zabq) this.f3393f.f3183C.get(this.f3389b);
        if (zabq != null) {
            zabq.mo21474G(connectionResult);
        }
    }
}
