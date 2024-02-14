package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.customtabs.c */
/* compiled from: IPostMessageService */
public interface C0054c extends IInterface {

    /* renamed from: android.support.customtabs.c$a */
    /* compiled from: IPostMessageService */
    public static abstract class C0055a extends Binder implements C0054c {
        private static final String DESCRIPTOR = "android.support.customtabs.IPostMessageService";
        static final int TRANSACTION_onMessageChannelReady = 2;
        static final int TRANSACTION_onPostMessage = 3;

        /* renamed from: android.support.customtabs.c$a$a */
        /* compiled from: IPostMessageService */
        private static class C0056a implements C0054c {

            /* renamed from: c */
            public static C0054c f176c;

            /* renamed from: a */
            private IBinder f177a;

            C0056a(IBinder iBinder) {
                this.f177a = iBinder;
            }

            public IBinder asBinder() {
                return this.f177a;
            }

            public void onMessageChannelReady(C0048a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0055a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f177a.transact(2, obtain, obtain2, 0) || C0055a.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0055a.getDefaultImpl().onMessageChannelReady(aVar, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onPostMessage(C0048a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0055a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f177a.transact(3, obtain, obtain2, 0) || C0055a.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0055a.getDefaultImpl().onPostMessage(aVar, str, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0055a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static C0054c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0054c)) {
                return new C0056a(iBinder);
            }
            return (C0054c) queryLocalInterface;
        }

        public static C0054c getDefaultImpl() {
            return C0056a.f176c;
        }

        public static boolean setDefaultImpl(C0054c cVar) {
            if (C0056a.f176c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (cVar == null) {
                return false;
            } else {
                C0056a.f176c = cVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 2
                r1 = 0
                r2 = 1
                java.lang.String r3 = "android.support.customtabs.IPostMessageService"
                if (r5 == r0) goto L_0x003d
                r0 = 3
                if (r5 == r0) goto L_0x0018
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0014
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0014:
                r7.writeString(r3)
                return r2
            L_0x0018:
                r6.enforceInterface(r3)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                java.lang.String r8 = r6.readString()
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0036
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0036:
                r4.onPostMessage(r5, r8, r1)
                r7.writeNoException()
                return r2
            L_0x003d:
                r6.enforceInterface(r3)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0057
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0057:
                r4.onMessageChannelReady(r5, r1)
                r7.writeNoException()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.C0054c.C0055a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onMessageChannelReady(C0048a aVar, Bundle bundle) throws RemoteException;

    void onPostMessage(C0048a aVar, String str, Bundle bundle) throws RemoteException;
}
