package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcan extends zzc {
    public zzcan(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzcbq.m44809a(context), looper, 8, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.ads.service.START";
    }

    /* renamed from: o0 */
    public final zzcau mo43256o0() throws DeadObjectException {
        return (zzcau) super.mo21626I();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof zzcau ? (zzcau) queryLocalInterface : new zzcas(iBinder);
    }
}
