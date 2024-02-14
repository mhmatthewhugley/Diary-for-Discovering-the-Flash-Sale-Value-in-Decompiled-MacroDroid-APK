package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzg;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbea extends zzc {
    zzbea(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzcbq.m44809a(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
    }

    /* renamed from: A */
    public final Feature[] mo21618A() {
        return zzg.f2625b;
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* renamed from: o0 */
    public final boolean mo42531o0() {
        return ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() && ArrayUtils.m4843c(mo21653r(), zzg.f2624a);
    }

    /* renamed from: p0 */
    public final zzbed mo42532p0() throws DeadObjectException {
        return (zzbed) super.mo21626I();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzbed ? (zzbed) queryLocalInterface : new zzbed(iBinder);
    }
}
