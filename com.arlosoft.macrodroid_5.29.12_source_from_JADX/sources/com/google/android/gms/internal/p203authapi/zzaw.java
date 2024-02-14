package com.google.android.gms.internal.p203authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.p023dx.p026io.Opcodes;
import com.google.android.gms.auth.api.identity.zzl;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* renamed from: com.google.android.gms.internal.auth-api.zzaw */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzaw extends GmsClient<zzai> {

    /* renamed from: Z */
    private final Bundle f39135Z;

    public zzaw(Context context, Looper looper, zzl zzl, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, (int) Opcodes.REM_INT_LIT16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f39135Z = zzl.mo20943a();
    }

    /* renamed from: A */
    public final Feature[] mo21618A() {
        return zzay.f39144h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo21623F() {
        return this.f39135Z;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo21629N() {
        return true;
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof zzai) {
            return (zzai) queryLocalInterface;
        }
        return new zzal(iBinder);
    }
}
