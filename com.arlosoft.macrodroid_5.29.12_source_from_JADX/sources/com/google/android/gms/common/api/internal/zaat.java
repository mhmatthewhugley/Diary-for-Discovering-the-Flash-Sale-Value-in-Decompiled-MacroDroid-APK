package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    final /* synthetic */ zaaw f3287a;

    /* synthetic */ zaat(zaaw zaaw, zaas zaas) {
        this.f3287a = zaaw;
    }

    /* renamed from: A1 */
    public final void mo21388A1(@NonNull ConnectionResult connectionResult) {
        this.f3287a.f3290b.lock();
        try {
            if (this.f3287a.m3983q(connectionResult)) {
                this.f3287a.m3975i();
                this.f3287a.m3980n();
            } else {
                this.f3287a.m3978l(connectionResult);
            }
        } finally {
            this.f3287a.f3290b.unlock();
        }
    }

    /* renamed from: t1 */
    public final void mo21335t1(int i) {
    }

    /* renamed from: y */
    public final void mo21336y(@Nullable Bundle bundle) {
        ClientSettings clientSettings = (ClientSettings) Preconditions.m4488k(this.f3287a.f3306r);
        ((zae) Preconditions.m4488k(this.f3287a.f3299k)).mo56106p(new zaar(this.f3287a));
    }
}
