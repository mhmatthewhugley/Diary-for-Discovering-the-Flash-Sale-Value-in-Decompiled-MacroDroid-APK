package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

public final class zzx extends GmsClient<zzi> {

    /* renamed from: Z */
    private final Context f45526Z;

    public zzx(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 45, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f45526Z = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.safetynet.service.START";
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 12200000;
    }

    /* renamed from: r0 */
    public final void mo53763r0(zzg zzg, List<Integer> list, int i, String str, String str2) throws RemoteException {
        if (str2 == null) {
            str2 = mo53764s0("com.google.android.safetynet.API_KEY");
        }
        String str3 = str2;
        int[] iArr = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            iArr[i2] = list.get(i2).intValue();
        }
        ((zzi) mo21626I()).mo53757P6(zzg, str3, iArr, i, str);
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: s0 */
    public final String mo53764s0(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f45526Z.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f45526Z.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return (String) bundle.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof zzi ? (zzi) queryLocalInterface : new zzj(iBinder);
    }
}
