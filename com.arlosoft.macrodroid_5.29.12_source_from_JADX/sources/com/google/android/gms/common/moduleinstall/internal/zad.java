package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class zad extends zab implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z8 */
    public final boolean mo21357Z8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zac.m55854b(parcel);
            mo21865I9((Status) zac.m55853a(parcel, Status.CREATOR), (ModuleAvailabilityResponse) zac.m55853a(parcel, ModuleAvailabilityResponse.CREATOR));
        } else if (i == 2) {
            zac.m55854b(parcel);
            mo21864D9((Status) zac.m55853a(parcel, Status.CREATOR), (ModuleInstallResponse) zac.m55853a(parcel, ModuleInstallResponse.CREATOR));
        } else if (i == 3) {
            zac.m55854b(parcel);
            mo21867X2((Status) zac.m55853a(parcel, Status.CREATOR), (ModuleInstallIntentResponse) zac.m55853a(parcel, ModuleInstallIntentResponse.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            zac.m55854b(parcel);
            mo21866Oa((Status) zac.m55853a(parcel, Status.CREATOR));
        }
        return true;
    }
}
