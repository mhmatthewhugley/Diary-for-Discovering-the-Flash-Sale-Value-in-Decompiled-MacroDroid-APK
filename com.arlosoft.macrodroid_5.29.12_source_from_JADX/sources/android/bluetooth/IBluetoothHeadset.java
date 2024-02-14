package android.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IBluetoothHeadset extends IInterface {

    public static class Default implements IBluetoothHeadset {
        public IBinder asBinder() {
            return null;
        }

        public boolean connectHeadset(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        public void disconnectHeadset() throws RemoteException {
        }

        public int getBatteryUsageHint() throws RemoteException {
            return 0;
        }

        public BluetoothDevice getCurrentHeadset() throws RemoteException {
            return null;
        }

        public int getPriority(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        public int getState() throws RemoteException {
            return 0;
        }

        public boolean isConnected(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        public boolean setPriority(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
            return false;
        }

        public boolean startVoiceRecognition() throws RemoteException {
            return false;
        }

        public boolean stopVoiceRecognition() throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IBluetoothHeadset {
        private static final String DESCRIPTOR = "android.bluetooth.IBluetoothHeadset";
        static final int TRANSACTION_connectHeadset = 3;
        static final int TRANSACTION_disconnectHeadset = 4;
        static final int TRANSACTION_getBatteryUsageHint = 10;
        static final int TRANSACTION_getCurrentHeadset = 2;
        static final int TRANSACTION_getPriority = 9;
        static final int TRANSACTION_getState = 1;
        static final int TRANSACTION_isConnected = 5;
        static final int TRANSACTION_setPriority = 8;
        static final int TRANSACTION_startVoiceRecognition = 6;
        static final int TRANSACTION_stopVoiceRecognition = 7;

        private static class Proxy implements IBluetoothHeadset {
            public static IBluetoothHeadset sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public boolean connectHeadset(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectHeadset(bluetoothDevice);
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

            public void disconnectHeadset() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().disconnectHeadset();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getBatteryUsageHint() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBatteryUsageHint();
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

            public BluetoothDevice getCurrentHeadset() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentHeadset();
                    }
                    obtain2.readException();
                    BluetoothDevice bluetoothDevice = obtain2.readInt() != 0 ? (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bluetoothDevice;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public int getPriority(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPriority(bluetoothDevice);
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

            public int getState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getState();
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

            public boolean isConnected(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isConnected(bluetoothDevice);
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

            public boolean setPriority(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPriority(bluetoothDevice, i);
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

            public boolean startVoiceRecognition() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startVoiceRecognition();
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

            public boolean stopVoiceRecognition() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopVoiceRecognition();
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

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBluetoothHeadset asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IBluetoothHeadset)) {
                return new Proxy(iBinder);
            }
            return (IBluetoothHeadset) queryLocalInterface;
        }

        public static IBluetoothHeadset getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBluetoothHeadset iBluetoothHeadset) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iBluetoothHeadset == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iBluetoothHeadset;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.bluetooth.IBluetoothHeadset"
                if (r4 == r0) goto L_0x00e3
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x00d5;
                    case 2: goto L_0x00bd;
                    case 3: goto L_0x00a0;
                    case 4: goto L_0x0096;
                    case 5: goto L_0x0079;
                    case 6: goto L_0x006b;
                    case 7: goto L_0x005d;
                    case 8: goto L_0x003c;
                    case 9: goto L_0x001f;
                    case 10: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r2)
                int r4 = r3.getBatteryUsageHint()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x001f:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0031
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x0031:
                int r4 = r3.getPriority(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x003c:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x004e
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x004e:
                int r4 = r5.readInt()
                boolean r4 = r3.setPriority(r0, r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x005d:
                r5.enforceInterface(r2)
                boolean r4 = r3.stopVoiceRecognition()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x006b:
                r5.enforceInterface(r2)
                boolean r4 = r3.startVoiceRecognition()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0079:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x008b
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x008b:
                boolean r4 = r3.isConnected(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0096:
                r5.enforceInterface(r2)
                r3.disconnectHeadset()
                r6.writeNoException()
                return r1
            L_0x00a0:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00b2
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x00b2:
                boolean r4 = r3.connectHeadset(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x00bd:
                r5.enforceInterface(r2)
                android.bluetooth.BluetoothDevice r4 = r3.getCurrentHeadset()
                r6.writeNoException()
                if (r4 == 0) goto L_0x00d0
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x00d4
            L_0x00d0:
                r4 = 0
                r6.writeInt(r4)
            L_0x00d4:
                return r1
            L_0x00d5:
                r5.enforceInterface(r2)
                int r4 = r3.getState()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x00e3:
                r6.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.bluetooth.IBluetoothHeadset.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    boolean connectHeadset(BluetoothDevice bluetoothDevice) throws RemoteException;

    void disconnectHeadset() throws RemoteException;

    int getBatteryUsageHint() throws RemoteException;

    BluetoothDevice getCurrentHeadset() throws RemoteException;

    int getPriority(BluetoothDevice bluetoothDevice) throws RemoteException;

    int getState() throws RemoteException;

    boolean isConnected(BluetoothDevice bluetoothDevice) throws RemoteException;

    boolean setPriority(BluetoothDevice bluetoothDevice, int i) throws RemoteException;

    boolean startVoiceRecognition() throws RemoteException;

    boolean stopVoiceRecognition() throws RemoteException;
}
