package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzg extends zza {

    /* renamed from: g */
    final /* synthetic */ BaseGmsClient f3759g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzg(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle) {
        super(baseGmsClient, i, (Bundle) null);
        this.f3759g = baseGmsClient;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo21784f(ConnectionResult connectionResult) {
        if (!this.f3759g.mo21657y() || !BaseGmsClient.m4357m0(this.f3759g)) {
            this.f3759g.f3579G.mo21444a(connectionResult);
            this.f3759g.mo21632Q(connectionResult);
            return;
        }
        BaseGmsClient.m4354i0(this.f3759g, 16);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo21785g() {
        this.f3759g.f3579G.mo21444a(ConnectionResult.f3044g);
        return true;
    }
}
