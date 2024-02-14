package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: android.support.customtabs.b */
/* compiled from: ICustomTabsService */
public interface C0051b extends IInterface {

    /* renamed from: android.support.customtabs.b$a */
    /* compiled from: ICustomTabsService */
    public static abstract class C0052a extends Binder implements C0051b {
        private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsService";
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_newSessionWithExtras = 10;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_receiveFile = 12;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        /* renamed from: android.support.customtabs.b$a$a */
        /* compiled from: ICustomTabsService */
        private static class C0053a implements C0051b {

            /* renamed from: c */
            public static C0051b f174c;

            /* renamed from: a */
            private IBinder f175a;

            C0053a(IBinder iBinder) {
                this.f175a = iBinder;
            }

            public IBinder asBinder() {
                return this.f175a;
            }

            public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f175a.transact(5, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().extraCommand(str, bundle);
                    }
                    obtain2.readException();
                    Bundle bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean mayLaunchUrl(C0048a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    if (!this.f175a.transact(4, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().mayLaunchUrl(aVar, uri, bundle, list);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean newSession(C0048a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f175a.transact(3, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().newSession(aVar);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean newSessionWithExtras(C0048a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f175a.transact(10, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().newSessionWithExtras(aVar, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int postMessage(C0048a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f175a.transact(8, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().postMessage(aVar, str, bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean receiveFile(C0048a aVar, Uri uri, int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f175a.transact(12, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().receiveFile(aVar, uri, i, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean requestPostMessageChannel(C0048a aVar, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f175a.transact(7, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().requestPostMessageChannel(aVar, uri);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean requestPostMessageChannelWithExtras(C0048a aVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f175a.transact(11, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().requestPostMessageChannelWithExtras(aVar, uri, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean updateVisuals(C0048a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f175a.transact(6, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().updateVisuals(aVar, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean validateRelationship(C0048a aVar, int i, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeInt(i);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f175a.transact(9, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().validateRelationship(aVar, i, uri, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean warmup(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0052a.DESCRIPTOR);
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.f175a.transact(2, obtain, obtain2, 0) && C0052a.getDefaultImpl() != null) {
                        return C0052a.getDefaultImpl().warmup(j);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0052a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static C0051b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0051b)) {
                return new C0053a(iBinder);
            }
            return (C0051b) queryLocalInterface;
        }

        public static C0051b getDefaultImpl() {
            return C0053a.f174c;
        }

        public static boolean setDefaultImpl(C0051b bVar) {
            if (C0053a.f174c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (bVar == null) {
                return false;
            } else {
                C0053a.f174c = bVar;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v34 */
        /* JADX WARNING: type inference failed for: r0v35 */
        /* JADX WARNING: type inference failed for: r0v36 */
        /* JADX WARNING: type inference failed for: r0v37 */
        /* JADX WARNING: type inference failed for: r0v38 */
        /* JADX WARNING: type inference failed for: r0v39 */
        /* JADX WARNING: type inference failed for: r0v40 */
        /* JADX WARNING: type inference failed for: r0v41 */
        /* JADX WARNING: type inference failed for: r0v42 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                if (r5 == r0) goto L_0x01dd
                r0 = 0
                switch(r5) {
                    case 2: goto L_0x01cb;
                    case 3: goto L_0x01b5;
                    case 4: goto L_0x017b;
                    case 5: goto L_0x0150;
                    case 6: goto L_0x012b;
                    case 7: goto L_0x0106;
                    case 8: goto L_0x00dd;
                    case 9: goto L_0x00a4;
                    case 10: goto L_0x007f;
                    case 11: goto L_0x004a;
                    case 12: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0011:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x002b
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x002c
            L_0x002b:
                r8 = r0
            L_0x002c:
                int r2 = r6.readInt()
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x003f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x003f:
                boolean r5 = r4.receiveFile(r5, r8, r2, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x004a:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0064
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0065
            L_0x0064:
                r8 = r0
            L_0x0065:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0074
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0074:
                boolean r5 = r4.requestPostMessageChannelWithExtras(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x007f:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0099
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0099:
                boolean r5 = r4.newSessionWithExtras(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00a4:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                int r8 = r6.readInt()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00c2
                android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r6)
                android.net.Uri r2 = (android.net.Uri) r2
                goto L_0x00c3
            L_0x00c2:
                r2 = r0
            L_0x00c3:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x00d2
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00d2:
                boolean r5 = r4.validateRelationship(r5, r8, r2, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00dd:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00fb
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00fb:
                int r5 = r4.postMessage(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0106:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0120
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x0120:
                boolean r5 = r4.requestPostMessageChannel(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x012b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0145
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0145:
                boolean r5 = r4.updateVisuals(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0150:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0166
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0166:
                android.os.Bundle r5 = r4.extraCommand(r5, r0)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0176
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x017a
            L_0x0176:
                r5 = 0
                r7.writeInt(r5)
            L_0x017a:
                return r1
            L_0x017b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0195
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0196
            L_0x0195:
                r8 = r0
            L_0x0196:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x01a4
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x01a4:
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.util.ArrayList r6 = r6.createTypedArrayList(r2)
                boolean r5 = r4.mayLaunchUrl(r5, r8, r0, r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01b5:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.a r5 = android.support.customtabs.C0048a.C0049a.asInterface(r5)
                boolean r5 = r4.newSession(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01cb:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                boolean r5 = r4.warmup(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01dd:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.C0051b.C0052a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    Bundle extraCommand(String str, Bundle bundle) throws RemoteException;

    boolean mayLaunchUrl(C0048a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean newSession(C0048a aVar) throws RemoteException;

    boolean newSessionWithExtras(C0048a aVar, Bundle bundle) throws RemoteException;

    int postMessage(C0048a aVar, String str, Bundle bundle) throws RemoteException;

    boolean receiveFile(C0048a aVar, Uri uri, int i, Bundle bundle) throws RemoteException;

    boolean requestPostMessageChannel(C0048a aVar, Uri uri) throws RemoteException;

    boolean requestPostMessageChannelWithExtras(C0048a aVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean updateVisuals(C0048a aVar, Bundle bundle) throws RemoteException;

    boolean validateRelationship(C0048a aVar, int i, Uri uri, Bundle bundle) throws RemoteException;

    boolean warmup(long j) throws RemoteException;
}
