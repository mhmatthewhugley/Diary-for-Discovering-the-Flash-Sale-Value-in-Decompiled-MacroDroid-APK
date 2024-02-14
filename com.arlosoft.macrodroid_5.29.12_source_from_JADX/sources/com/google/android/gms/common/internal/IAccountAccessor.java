package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface IAccountAccessor extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class Stub extends zzb implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @NonNull
        /* renamed from: t1 */
        public static IAccountAccessor m4461t1(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new zzv(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public final boolean mo21710y(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account zzb = zzb();
            parcel2.writeNoException();
            zzc.m55908e(parcel2, zzb);
            return true;
        }
    }

    @NonNull
    Account zzb() throws RemoteException;
}
