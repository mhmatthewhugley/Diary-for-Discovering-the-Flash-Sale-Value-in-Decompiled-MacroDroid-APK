package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfoe extends zzc {

    /* renamed from: W */
    private final int f36186W;

    public zzfoe(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, int i) {
        super(context, looper, 116, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
        this.f36186W = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: o0 */
    public final zzfoj mo46024o0() throws DeadObjectException {
        return (zzfoj) super.mo21626I();
    }

    /* renamed from: q */
    public final int mo21032q() {
        return this.f36186W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzfoj ? (zzfoj) queryLocalInterface : new zzfoj(iBinder);
    }
}
