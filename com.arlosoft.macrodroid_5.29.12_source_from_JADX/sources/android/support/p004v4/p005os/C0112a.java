package android.support.p004v4.p005os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* compiled from: IResultReceiver */
public interface C0112a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C0113a extends Binder implements C0112a {

        /* renamed from: android.support.v4.os.a$a$a */
        /* compiled from: IResultReceiver */
        private static class C0114a implements C0112a {

            /* renamed from: a */
            private IBinder f293a;

            C0114a(IBinder iBinder) {
                this.f293a = iBinder;
            }

            /* renamed from: G6 */
            public void mo404G6(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    C0115b.m361d(obtain, bundle, 0);
                    this.f293a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f293a;
            }
        }

        public C0113a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: y */
        public static C0112a m356y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0112a)) {
                return new C0114a(iBinder);
            }
            return (C0112a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo404G6(parcel.readInt(), (Bundle) C0115b.m360c(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.os.a$b */
    /* compiled from: IResultReceiver */
    public static class C0115b {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m360c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m361d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: G6 */
    void mo404G6(int i, Bundle bundle) throws RemoteException;
}
