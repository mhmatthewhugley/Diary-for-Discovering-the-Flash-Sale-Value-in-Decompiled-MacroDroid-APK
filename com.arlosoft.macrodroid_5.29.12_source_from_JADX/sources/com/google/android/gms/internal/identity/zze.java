package com.google.android.gms.internal.identity;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public final class zze extends GmsClient<zzh> {

    /* renamed from: Z */
    private final Activity f41074Z;
    @Nullable

    /* renamed from: a0 */
    private zzd f41075a0;
    @Nullable

    /* renamed from: b0 */
    private final String f41076b0;

    /* renamed from: c0 */
    private final int f41077c0;

    public zze(Activity activity, Looper looper, ClientSettings clientSettings, int i, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super((Context) activity, looper, 12, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f41076b0 = clientSettings.mo21669c();
        this.f41074Z = activity;
        this.f41077c0 = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.identity.service.BIND";
    }

    /* renamed from: T */
    public final boolean mo21635T() {
        return true;
    }

    /* renamed from: b */
    public final void mo21640b() {
        super.mo21640b();
        zzd zzd = this.f41075a0;
        if (zzd != null) {
            zzd.f41073c = null;
            this.f41075a0 = null;
        }
    }

    /* renamed from: q */
    public final int mo21032q() {
        return GooglePlayServicesUtilLight.f3065a;
    }

    /* renamed from: r0 */
    public final void mo50498r0(UserAddressRequest userAddressRequest, int i) {
        super.mo21656w();
        this.f41075a0 = new zzd(i, this.f41074Z);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", mo21621D().getPackageName());
            if (!TextUtils.isEmpty(this.f41076b0)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.f41076b0, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.f41077c0);
            ((zzh) super.mo21626I()).mo50499A1((zzg) Preconditions.m4488k(this.f41075a0), userAddressRequest, bundle);
        } catch (RemoteException e) {
            Log.e("AddressClientImpl", "Exception requesting user address", e);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
            ((zzd) Preconditions.m4488k(this.f41075a0)).mo50497G7(1, bundle2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        if (queryLocalInterface instanceof zzh) {
            return (zzh) queryLocalInterface;
        }
        return new zzh(iBinder);
    }
}
