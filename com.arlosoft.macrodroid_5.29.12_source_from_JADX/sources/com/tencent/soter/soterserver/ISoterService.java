package com.tencent.soter.soterserver;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ISoterService extends IInterface {

    public static class Default implements ISoterService {
        public IBinder asBinder() {
            return null;
        }

        public SoterSignResult finishSign(long j) throws RemoteException {
            return null;
        }

        public int generateAppSecureKey(int i) throws RemoteException {
            return 0;
        }

        public int generateAuthKey(int i, String str) throws RemoteException {
            return 0;
        }

        public SoterExportResult getAppSecureKey(int i) throws RemoteException {
            return null;
        }

        public SoterExportResult getAuthKey(int i, String str) throws RemoteException {
            return null;
        }

        public SoterDeviceResult getDeviceId() throws RemoteException {
            return null;
        }

        public int getVersion() throws RemoteException {
            return 0;
        }

        public boolean hasAskAlready(int i) throws RemoteException {
            return false;
        }

        public boolean hasAuthKey(int i, String str) throws RemoteException {
            return false;
        }

        public SoterSessionResult initSigh(int i, String str, String str2) throws RemoteException {
            return null;
        }

        public int removeAllAuthKey(int i) throws RemoteException {
            return 0;
        }

        public int removeAuthKey(int i, String str) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements ISoterService {
        private static final String DESCRIPTOR = "com.tencent.soter.soterserver.ISoterService";
        static final int TRANSACTION_finishSign = 10;
        static final int TRANSACTION_generateAppSecureKey = 1;
        static final int TRANSACTION_generateAuthKey = 4;
        static final int TRANSACTION_getAppSecureKey = 2;
        static final int TRANSACTION_getAuthKey = 6;
        static final int TRANSACTION_getDeviceId = 11;
        static final int TRANSACTION_getVersion = 12;
        static final int TRANSACTION_hasAskAlready = 3;
        static final int TRANSACTION_hasAuthKey = 8;
        static final int TRANSACTION_initSigh = 9;
        static final int TRANSACTION_removeAllAuthKey = 7;
        static final int TRANSACTION_removeAuthKey = 5;

        private static class Proxy implements ISoterService {
            public static ISoterService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public SoterSignResult finishSign(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().finishSign(j);
                    }
                    obtain2.readException();
                    SoterSignResult createFromParcel = obtain2.readInt() != 0 ? SoterSignResult.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int generateAppSecureKey(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().generateAppSecureKey(i);
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

            public int generateAuthKey(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().generateAuthKey(i, str);
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

            public SoterExportResult getAppSecureKey(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppSecureKey(i);
                    }
                    obtain2.readException();
                    SoterExportResult createFromParcel = obtain2.readInt() != 0 ? SoterExportResult.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public SoterExportResult getAuthKey(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAuthKey(i, str);
                    }
                    obtain2.readException();
                    SoterExportResult createFromParcel = obtain2.readInt() != 0 ? SoterExportResult.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public SoterDeviceResult getDeviceId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeviceId();
                    }
                    obtain2.readException();
                    SoterDeviceResult createFromParcel = obtain2.readInt() != 0 ? SoterDeviceResult.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public int getVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVersion();
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

            public boolean hasAskAlready(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hasAskAlready(i);
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

            public boolean hasAuthKey(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hasAuthKey(i, str);
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

            public SoterSessionResult initSigh(int i, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().initSigh(i, str, str2);
                    }
                    obtain2.readException();
                    SoterSessionResult createFromParcel = obtain2.readInt() != 0 ? SoterSessionResult.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int removeAllAuthKey(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeAllAuthKey(i);
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

            public int removeAuthKey(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeAuthKey(i, str);
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
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISoterService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISoterService)) {
                return new Proxy(iBinder);
            }
            return (ISoterService) queryLocalInterface;
        }

        public static ISoterService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISoterService iSoterService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iSoterService == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iSoterService;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        int generateAppSecureKey = generateAppSecureKey(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(generateAppSecureKey);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        SoterExportResult appSecureKey = getAppSecureKey(parcel.readInt());
                        parcel2.writeNoException();
                        if (appSecureKey != null) {
                            parcel2.writeInt(1);
                            appSecureKey.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean hasAskAlready = hasAskAlready(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(hasAskAlready ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        int generateAuthKey = generateAuthKey(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(generateAuthKey);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        int removeAuthKey = removeAuthKey(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeAuthKey);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        SoterExportResult authKey = getAuthKey(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        if (authKey != null) {
                            parcel2.writeInt(1);
                            authKey.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        int removeAllAuthKey = removeAllAuthKey(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeAllAuthKey);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean hasAuthKey = hasAuthKey(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(hasAuthKey ? 1 : 0);
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        SoterSessionResult initSigh = initSigh(parcel.readInt(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (initSigh != null) {
                            parcel2.writeInt(1);
                            initSigh.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        SoterSignResult finishSign = finishSign(parcel.readLong());
                        parcel2.writeNoException();
                        if (finishSign != null) {
                            parcel2.writeInt(1);
                            finishSign.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        SoterDeviceResult deviceId = getDeviceId();
                        parcel2.writeNoException();
                        if (deviceId != null) {
                            parcel2.writeInt(1);
                            deviceId.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        int version = getVersion();
                        parcel2.writeNoException();
                        parcel2.writeInt(version);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    SoterSignResult finishSign(long j) throws RemoteException;

    int generateAppSecureKey(int i) throws RemoteException;

    int generateAuthKey(int i, String str) throws RemoteException;

    SoterExportResult getAppSecureKey(int i) throws RemoteException;

    SoterExportResult getAuthKey(int i, String str) throws RemoteException;

    SoterDeviceResult getDeviceId() throws RemoteException;

    int getVersion() throws RemoteException;

    boolean hasAskAlready(int i) throws RemoteException;

    boolean hasAuthKey(int i, String str) throws RemoteException;

    SoterSessionResult initSigh(int i, String str, String str2) throws RemoteException;

    int removeAllAuthKey(int i) throws RemoteException;

    int removeAuthKey(int i, String str) throws RemoteException;
}
