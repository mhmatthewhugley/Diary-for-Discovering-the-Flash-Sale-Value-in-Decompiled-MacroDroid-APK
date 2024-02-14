package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.customtabs.trusted.a */
/* compiled from: ITrustedWebActivityCallback */
public interface C0057a extends IInterface {

    /* renamed from: android.support.customtabs.trusted.a$a */
    /* compiled from: ITrustedWebActivityCallback */
    public static abstract class C0058a extends Binder implements C0057a {
        private static final String DESCRIPTOR = "android.support.customtabs.trusted.ITrustedWebActivityCallback";
        static final int TRANSACTION_onExtraCallback = 2;

        /* renamed from: android.support.customtabs.trusted.a$a$a */
        /* compiled from: ITrustedWebActivityCallback */
        private static class C0059a implements C0057a {

            /* renamed from: c */
            public static C0057a f178c;

            /* renamed from: a */
            private IBinder f179a;

            C0059a(IBinder iBinder) {
                this.f179a = iBinder;
            }

            public IBinder asBinder() {
                return this.f179a;
            }

            public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0058a.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f179a.transact(2, obtain, obtain2, 0) || C0058a.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0058a.getDefaultImpl().onExtraCallback(str, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0058a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static C0057a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0057a)) {
                return new C0059a(iBinder);
            }
            return (C0057a) queryLocalInterface;
        }

        public static C0057a getDefaultImpl() {
            return C0059a.f178c;
        }

        public static boolean setDefaultImpl(C0057a aVar) {
            if (C0059a.f178c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                C0059a.f178c = aVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onExtraCallback(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onExtraCallback(String str, Bundle bundle) throws RemoteException;
}
