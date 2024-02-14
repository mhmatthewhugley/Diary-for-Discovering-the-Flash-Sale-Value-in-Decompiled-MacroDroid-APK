package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzf extends zza {
    @Nullable

    /* renamed from: g */
    public final IBinder f3757g;

    /* renamed from: h */
    final /* synthetic */ BaseGmsClient f3758h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzf(BaseGmsClient baseGmsClient, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.f3758h = baseGmsClient;
        this.f3757g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo21784f(ConnectionResult connectionResult) {
        if (this.f3758h.f3585M != null) {
            this.f3758h.f3585M.mo21661A1(connectionResult);
        }
        this.f3758h.mo21632Q(connectionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo21785g() {
        try {
            IBinder iBinder = this.f3757g;
            Preconditions.m4488k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f3758h.mo21029J().equals(interfaceDescriptor)) {
                String J = this.f3758h.mo21029J();
                Log.w("GmsClient", "service descriptor mismatch: " + J + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface x = this.f3758h.mo21035x(this.f3757g);
            if (x == null || (!BaseGmsClient.m4356l0(this.f3758h, 2, 4, x) && !BaseGmsClient.m4356l0(this.f3758h, 3, 4, x))) {
                return false;
            }
            this.f3758h.f3589Q = null;
            Bundle C = this.f3758h.mo21620C();
            BaseGmsClient baseGmsClient = this.f3758h;
            if (baseGmsClient.f3584L == null) {
                return true;
            }
            baseGmsClient.f3584L.mo21660y(C);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
