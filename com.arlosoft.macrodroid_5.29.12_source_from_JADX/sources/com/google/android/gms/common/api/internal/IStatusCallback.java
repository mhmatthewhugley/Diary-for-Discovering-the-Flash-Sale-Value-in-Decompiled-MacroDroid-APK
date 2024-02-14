package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public interface IStatusCallback extends IInterface {

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static abstract class Stub extends zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @NonNull
        /* renamed from: ia */
        public static IStatusCallback m3785ia(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof IStatusCallback ? (IStatusCallback) queryLocalInterface : new zaby(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: Z8 */
        public final boolean mo21357Z8(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            zac.m55854b(parcel);
            mo21356j8((Status) zac.m55853a(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: j8 */
    void mo21356j8(@NonNull Status status) throws RemoteException;
}
