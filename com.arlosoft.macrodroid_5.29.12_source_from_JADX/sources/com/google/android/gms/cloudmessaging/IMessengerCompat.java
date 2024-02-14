package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
interface IMessengerCompat extends IInterface {

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static class Impl extends Binder implements IMessengerCompat {
        /* renamed from: E7 */
        public void mo21074E7(@NonNull Message message) throws RemoteException {
            throw null;
        }

        @NonNull
        public IBinder asBinder() {
            throw null;
        }

        public boolean onTransact(int i, @NonNull Parcel parcel, @Nullable Parcel parcel2, int i2) throws RemoteException {
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static class Proxy implements IMessengerCompat {

        /* renamed from: a */
        private final IBinder f2964a;

        /* renamed from: E7 */
        public void mo21074E7(@NonNull Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f2964a.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @NonNull
        public IBinder asBinder() {
            return this.f2964a;
        }
    }

    /* renamed from: E7 */
    void mo21074E7(@NonNull Message message) throws RemoteException;
}
