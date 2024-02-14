package android.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public interface IBluetoothA2dp extends IInterface {

    public static class Default implements IBluetoothA2dp {
        public IBinder asBinder() {
            return null;
        }

        public boolean connect(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        public boolean connectSink(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        public boolean disconnect(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        public boolean disconnectSink(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        public List<BluetoothDevice> getConnectedDevices() throws RemoteException {
            return null;
        }

        public BluetoothDevice[] getConnectedSinks() throws RemoteException {
            return null;
        }

        public int getConnectionState(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        public BluetoothDevice[] getNonDisconnectedSinks() throws RemoteException {
            return null;
        }

        public int getPriority(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        public int getSinkPriority(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        public int getSinkState(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        public boolean isA2dpPlaying(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        public boolean resumeSink(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        public boolean setPriority(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
            return false;
        }

        public boolean setSinkPriority(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
            return false;
        }

        public boolean suspendSink(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IBluetoothA2dp {
        private static final String DESCRIPTOR = "android.bluetooth.IBluetoothA2dp";
        static final int TRANSACTION_connect = 3;
        static final int TRANSACTION_connectSink = 1;
        static final int TRANSACTION_disconnect = 4;
        static final int TRANSACTION_disconnectSink = 2;
        static final int TRANSACTION_getConnectedDevices = 11;
        static final int TRANSACTION_getConnectedSinks = 7;
        static final int TRANSACTION_getConnectionState = 10;
        static final int TRANSACTION_getNonDisconnectedSinks = 8;
        static final int TRANSACTION_getPriority = 14;
        static final int TRANSACTION_getSinkPriority = 15;
        static final int TRANSACTION_getSinkState = 9;
        static final int TRANSACTION_isA2dpPlaying = 16;
        static final int TRANSACTION_resumeSink = 6;
        static final int TRANSACTION_setPriority = 13;
        static final int TRANSACTION_setSinkPriority = 12;
        static final int TRANSACTION_suspendSink = 5;

        private static class Proxy implements IBluetoothA2dp {
            public static IBluetoothA2dp sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public boolean connect(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                        return Stub.getDefaultImpl().connect(bluetoothDevice);
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

            public boolean connectSink(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectSink(bluetoothDevice);
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

            public boolean disconnect(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disconnect(bluetoothDevice);
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

            public boolean disconnectSink(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disconnectSink(bluetoothDevice);
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

            public List<BluetoothDevice> getConnectedDevices() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getConnectedDevices();
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(BluetoothDevice.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public BluetoothDevice[] getConnectedSinks() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getConnectedSinks();
                    }
                    obtain2.readException();
                    BluetoothDevice[] bluetoothDeviceArr = (BluetoothDevice[]) obtain2.createTypedArray(BluetoothDevice.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return bluetoothDeviceArr;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getConnectionState(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getConnectionState(bluetoothDevice);
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

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public BluetoothDevice[] getNonDisconnectedSinks() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNonDisconnectedSinks();
                    }
                    obtain2.readException();
                    BluetoothDevice[] bluetoothDeviceArr = (BluetoothDevice[]) obtain2.createTypedArray(BluetoothDevice.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return bluetoothDeviceArr;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
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
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            public int getSinkPriority(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSinkPriority(bluetoothDevice);
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

            public int getSinkState(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                        return Stub.getDefaultImpl().getSinkState(bluetoothDevice);
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

            public boolean isA2dpPlaying(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isA2dpPlaying(bluetoothDevice);
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

            public boolean resumeSink(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().resumeSink(bluetoothDevice);
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
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            public boolean setSinkPriority(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
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
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setSinkPriority(bluetoothDevice, i);
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

            public boolean suspendSink(BluetoothDevice bluetoothDevice) throws RemoteException {
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
                        return Stub.getDefaultImpl().suspendSink(bluetoothDevice);
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
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBluetoothA2dp asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IBluetoothA2dp)) {
                return new Proxy(iBinder);
            }
            return (IBluetoothA2dp) queryLocalInterface;
        }

        public static IBluetoothA2dp getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBluetoothA2dp iBluetoothA2dp) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iBluetoothA2dp == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iBluetoothA2dp;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: android.bluetooth.BluetoothDevice} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.bluetooth.IBluetoothA2dp"
                if (r4 == r0) goto L_0x01bc
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x019f;
                    case 2: goto L_0x0182;
                    case 3: goto L_0x0165;
                    case 4: goto L_0x0148;
                    case 5: goto L_0x012b;
                    case 6: goto L_0x010e;
                    case 7: goto L_0x0100;
                    case 8: goto L_0x00f2;
                    case 9: goto L_0x00d5;
                    case 10: goto L_0x00b8;
                    case 11: goto L_0x00aa;
                    case 12: goto L_0x0089;
                    case 13: goto L_0x0068;
                    case 14: goto L_0x004b;
                    case 15: goto L_0x002e;
                    case 16: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0023
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x0023:
                boolean r4 = r3.isA2dpPlaying(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x002e:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0040
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x0040:
                int r4 = r3.getSinkPriority(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x004b:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x005d
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x005d:
                int r4 = r3.getPriority(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0068:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x007a
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x007a:
                int r4 = r5.readInt()
                boolean r4 = r3.setPriority(r0, r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0089:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x009b
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x009b:
                int r4 = r5.readInt()
                boolean r4 = r3.setSinkPriority(r0, r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x00aa:
                r5.enforceInterface(r2)
                java.util.List r4 = r3.getConnectedDevices()
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r1
            L_0x00b8:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00ca
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x00ca:
                int r4 = r3.getConnectionState(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x00d5:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00e7
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x00e7:
                int r4 = r3.getSinkState(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x00f2:
                r5.enforceInterface(r2)
                android.bluetooth.BluetoothDevice[] r4 = r3.getNonDisconnectedSinks()
                r6.writeNoException()
                r6.writeTypedArray(r4, r1)
                return r1
            L_0x0100:
                r5.enforceInterface(r2)
                android.bluetooth.BluetoothDevice[] r4 = r3.getConnectedSinks()
                r6.writeNoException()
                r6.writeTypedArray(r4, r1)
                return r1
            L_0x010e:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0120
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x0120:
                boolean r4 = r3.resumeSink(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x012b:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x013d
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x013d:
                boolean r4 = r3.suspendSink(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0148:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x015a
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x015a:
                boolean r4 = r3.disconnect(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0165:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0177
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x0177:
                boolean r4 = r3.connect(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0182:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0194
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x0194:
                boolean r4 = r3.disconnectSink(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x019f:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x01b1
                android.os.Parcelable$Creator r4 = android.bluetooth.BluetoothDevice.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            L_0x01b1:
                boolean r4 = r3.connectSink(r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x01bc:
                r6.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.bluetooth.IBluetoothA2dp.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    boolean connect(BluetoothDevice bluetoothDevice) throws RemoteException;

    boolean connectSink(BluetoothDevice bluetoothDevice) throws RemoteException;

    boolean disconnect(BluetoothDevice bluetoothDevice) throws RemoteException;

    boolean disconnectSink(BluetoothDevice bluetoothDevice) throws RemoteException;

    List<BluetoothDevice> getConnectedDevices() throws RemoteException;

    BluetoothDevice[] getConnectedSinks() throws RemoteException;

    int getConnectionState(BluetoothDevice bluetoothDevice) throws RemoteException;

    BluetoothDevice[] getNonDisconnectedSinks() throws RemoteException;

    int getPriority(BluetoothDevice bluetoothDevice) throws RemoteException;

    int getSinkPriority(BluetoothDevice bluetoothDevice) throws RemoteException;

    int getSinkState(BluetoothDevice bluetoothDevice) throws RemoteException;

    boolean isA2dpPlaying(BluetoothDevice bluetoothDevice) throws RemoteException;

    boolean resumeSink(BluetoothDevice bluetoothDevice) throws RemoteException;

    boolean setPriority(BluetoothDevice bluetoothDevice, int i) throws RemoteException;

    boolean setSinkPriority(BluetoothDevice bluetoothDevice, int i) throws RemoteException;

    boolean suspendSink(BluetoothDevice bluetoothDevice) throws RemoteException;
}
