package com.google.android.gms.internal.p203authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.p023dx.p026io.Opcodes;
import com.google.android.gms.auth.api.identity.zzf;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* renamed from: com.google.android.gms.internal.auth-api.zzab */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzab extends GmsClient<zzac> {

    /* renamed from: Z */
    private final Bundle f39118Z;

    public zzab(Context context, Looper looper, zzf zzf, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, (int) Opcodes.XOR_INT_LIT8, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f39118Z = zzf.mo20930a();
    }

    /* renamed from: A */
    public final Feature[] mo21618A() {
        return zzay.f39144h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo21623F() {
        return this.f39118Z;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        if (queryLocalInterface instanceof zzac) {
            return (zzac) queryLocalInterface;
        }
        return new zzaf(iBinder);
    }
}
