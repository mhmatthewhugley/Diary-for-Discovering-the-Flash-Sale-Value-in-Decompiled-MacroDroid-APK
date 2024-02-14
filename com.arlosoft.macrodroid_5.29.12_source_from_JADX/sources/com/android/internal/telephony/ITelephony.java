package com.android.internal.telephony;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ITelephony extends IInterface {

    public static class Default implements ITelephony {
        public void answerRingingCall() throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        public void call(String str) throws RemoteException {
        }

        public void cancelMissedCallsNotification() throws RemoteException {
        }

        public void dial(String str) throws RemoteException {
        }

        public int disableApnType(String str) throws RemoteException {
            return 0;
        }

        public boolean disableDataConnectivity() throws RemoteException {
            return false;
        }

        public void disableLocationUpdates() throws RemoteException {
        }

        public int enableApnType(String str) throws RemoteException {
            return 0;
        }

        public boolean enableDataConnectivity() throws RemoteException {
            return false;
        }

        public void enableLocationUpdates() throws RemoteException {
        }

        public boolean endCall() throws RemoteException {
            return false;
        }

        public int getActiveCallsCount() throws RemoteException {
            return 0;
        }

        public int getActivePhoneType() throws RemoteException {
            return 0;
        }

        public long getCallBaseTime() throws RemoteException {
            return 0;
        }

        public int getCallState() throws RemoteException {
            return 0;
        }

        public long getCallTime() throws RemoteException {
            return 0;
        }

        public String getCallerName() throws RemoteException {
            return null;
        }

        public int getCdmaEriIconIndex() throws RemoteException {
            return 0;
        }

        public int getCdmaEriIconMode() throws RemoteException {
            return 0;
        }

        public String getCdmaEriText() throws RemoteException {
            return null;
        }

        public boolean getCdmaNeedsProvisioning() throws RemoteException {
            return false;
        }

        public Bundle getCellLocation() throws RemoteException {
            return null;
        }

        public int getDataActivity() throws RemoteException {
            return 0;
        }

        public int getDataState() throws RemoteException {
            return 0;
        }

        public boolean getDataStatebyApnType(String str) throws RemoteException {
            return false;
        }

        public int getHoldCallsCount() throws RemoteException {
            return 0;
        }

        public boolean getMsisdnavailable() throws RemoteException {
            return false;
        }

        public boolean getMute() throws RemoteException {
            return false;
        }

        public int getNetworkType() throws RemoteException {
            return 0;
        }

        public int getSimPinRetry() throws RemoteException {
            return 0;
        }

        public int getSimPukRetry() throws RemoteException {
            return 0;
        }

        public int getVoiceMessageCount() throws RemoteException {
            return 0;
        }

        public boolean handlePinMmi(String str) throws RemoteException {
            return false;
        }

        public boolean hasIccCard() throws RemoteException {
            return false;
        }

        public void initiateFakecall() throws RemoteException {
        }

        public boolean isDataConnectivityPossible() throws RemoteException {
            return false;
        }

        public boolean isIdle() throws RemoteException {
            return false;
        }

        public boolean isOffhook() throws RemoteException {
            return false;
        }

        public boolean isRadioOn() throws RemoteException {
            return false;
        }

        public boolean isRinging() throws RemoteException {
            return false;
        }

        public boolean isSimFDNEnabled() throws RemoteException {
            return false;
        }

        public boolean isSimPinEnabled() throws RemoteException {
            return false;
        }

        public boolean isVideoCall() throws RemoteException {
            return false;
        }

        public void setMute(boolean z) throws RemoteException {
        }

        public boolean setRadio(boolean z) throws RemoteException {
            return false;
        }

        public boolean showCallScreen() throws RemoteException {
            return false;
        }

        public boolean showCallScreenWithDialpad(boolean z) throws RemoteException {
            return false;
        }

        public void silenceRinger() throws RemoteException {
        }

        public boolean supplyPin(String str) throws RemoteException {
            return false;
        }

        public boolean supplyPin2(String str) throws RemoteException {
            return false;
        }

        public boolean supplyPuk(String str, String str2) throws RemoteException {
            return false;
        }

        public void switchHoldingAndActive() throws RemoteException {
        }

        public void toggleRadioOnOff() throws RemoteException {
        }

        public void turnOnSpeaker(boolean z) throws RemoteException {
        }

        public void updateServiceLocation() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITelephony {
        private static final String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
        static final int TRANSACTION_answerRingingCall = 6;
        static final int TRANSACTION_call = 2;
        static final int TRANSACTION_cancelMissedCallsNotification = 14;
        static final int TRANSACTION_dial = 1;
        static final int TRANSACTION_disableApnType = 26;
        static final int TRANSACTION_disableDataConnectivity = 28;
        static final int TRANSACTION_disableLocationUpdates = 24;
        static final int TRANSACTION_enableApnType = 25;
        static final int TRANSACTION_enableDataConnectivity = 27;
        static final int TRANSACTION_enableLocationUpdates = 23;
        static final int TRANSACTION_endCall = 5;
        static final int TRANSACTION_getActiveCallsCount = 49;
        static final int TRANSACTION_getActivePhoneType = 34;
        static final int TRANSACTION_getCallBaseTime = 53;
        static final int TRANSACTION_getCallState = 31;
        static final int TRANSACTION_getCallTime = 52;
        static final int TRANSACTION_getCallerName = 51;
        static final int TRANSACTION_getCdmaEriIconIndex = 35;
        static final int TRANSACTION_getCdmaEriIconMode = 36;
        static final int TRANSACTION_getCdmaEriText = 37;
        static final int TRANSACTION_getCdmaNeedsProvisioning = 38;
        static final int TRANSACTION_getCellLocation = 30;
        static final int TRANSACTION_getDataActivity = 32;
        static final int TRANSACTION_getDataState = 33;
        static final int TRANSACTION_getDataStatebyApnType = 55;
        static final int TRANSACTION_getHoldCallsCount = 50;
        static final int TRANSACTION_getMsisdnavailable = 18;
        static final int TRANSACTION_getMute = 47;
        static final int TRANSACTION_getNetworkType = 40;
        static final int TRANSACTION_getSimPinRetry = 43;
        static final int TRANSACTION_getSimPukRetry = 44;
        static final int TRANSACTION_getVoiceMessageCount = 39;
        static final int TRANSACTION_handlePinMmi = 19;
        static final int TRANSACTION_hasIccCard = 41;
        static final int TRANSACTION_initiateFakecall = 42;
        static final int TRANSACTION_isDataConnectivityPossible = 29;
        static final int TRANSACTION_isIdle = 10;
        static final int TRANSACTION_isOffhook = 8;
        static final int TRANSACTION_isRadioOn = 11;
        static final int TRANSACTION_isRinging = 9;
        static final int TRANSACTION_isSimFDNEnabled = 13;
        static final int TRANSACTION_isSimPinEnabled = 12;
        static final int TRANSACTION_isVideoCall = 54;
        static final int TRANSACTION_setMute = 46;
        static final int TRANSACTION_setRadio = 21;
        static final int TRANSACTION_showCallScreen = 3;
        static final int TRANSACTION_showCallScreenWithDialpad = 4;
        static final int TRANSACTION_silenceRinger = 7;
        static final int TRANSACTION_supplyPin = 15;
        static final int TRANSACTION_supplyPin2 = 17;
        static final int TRANSACTION_supplyPuk = 16;
        static final int TRANSACTION_switchHoldingAndActive = 45;
        static final int TRANSACTION_toggleRadioOnOff = 20;
        static final int TRANSACTION_turnOnSpeaker = 48;
        static final int TRANSACTION_updateServiceLocation = 22;

        private static class Proxy implements ITelephony {
            public static ITelephony sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void answerRingingCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().answerRingingCall();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void call(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().call(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void cancelMissedCallsNotification() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(14, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().cancelMissedCallsNotification();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void dial(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().dial(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int disableApnType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disableApnType(str);
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

            public boolean disableDataConnectivity() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disableDataConnectivity();
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

            public void disableLocationUpdates() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(24, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().disableLocationUpdates();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int enableApnType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().enableApnType(str);
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

            public boolean enableDataConnectivity() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().enableDataConnectivity();
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

            public void enableLocationUpdates() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(23, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().enableLocationUpdates();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean endCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().endCall();
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

            public int getActiveCallsCount() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(49, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getActiveCallsCount();
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

            public int getActivePhoneType() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(34, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getActivePhoneType();
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

            public long getCallBaseTime() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(53, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCallBaseTime();
                    }
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getCallState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCallState();
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

            public long getCallTime() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(52, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCallTime();
                    }
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getCallerName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(51, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCallerName();
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getCdmaEriIconIndex() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(35, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCdmaEriIconIndex();
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

            public int getCdmaEriIconMode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(36, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCdmaEriIconMode();
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

            public String getCdmaEriText() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(37, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCdmaEriText();
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean getCdmaNeedsProvisioning() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(38, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCdmaNeedsProvisioning();
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

            public Bundle getCellLocation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCellLocation();
                    }
                    obtain2.readException();
                    Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getDataActivity() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDataActivity();
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

            public int getDataState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(33, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDataState();
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

            public boolean getDataStatebyApnType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.mRemote.transact(55, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDataStatebyApnType(str);
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

            public int getHoldCallsCount() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(50, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getHoldCallsCount();
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

            public boolean getMsisdnavailable() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMsisdnavailable();
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

            public boolean getMute() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(47, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMute();
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

            public int getNetworkType() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(40, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNetworkType();
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

            public int getSimPinRetry() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(43, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSimPinRetry();
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

            public int getSimPukRetry() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(44, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSimPukRetry();
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

            public int getVoiceMessageCount() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(39, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVoiceMessageCount();
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

            public boolean handlePinMmi(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().handlePinMmi(str);
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

            public boolean hasIccCard() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(41, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hasIccCard();
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

            public void initiateFakecall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(42, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().initiateFakecall();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isDataConnectivityPossible() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDataConnectivityPossible();
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

            public boolean isIdle() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isIdle();
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

            public boolean isOffhook() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isOffhook();
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

            public boolean isRadioOn() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isRadioOn();
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

            public boolean isRinging() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isRinging();
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

            public boolean isSimFDNEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSimFDNEnabled();
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

            public boolean isSimPinEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSimPinEnabled();
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

            public boolean isVideoCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(54, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVideoCall();
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

            public void setMute(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(46, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setMute(z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean setRadio(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z2 = true;
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setRadio(z);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean showCallScreen() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().showCallScreen();
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

            public boolean showCallScreenWithDialpad(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z2 = true;
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().showCallScreenWithDialpad(z);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void silenceRinger() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().silenceRinger();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean supplyPin(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().supplyPin(str);
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

            public boolean supplyPin2(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().supplyPin2(str);
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

            public boolean supplyPuk(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().supplyPuk(str, str2);
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

            public void switchHoldingAndActive() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(45, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().switchHoldingAndActive();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void toggleRadioOnOff() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(20, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().toggleRadioOnOff();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void turnOnSpeaker(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(48, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().turnOnSpeaker(z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void updateServiceLocation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(22, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().updateServiceLocation();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITelephony asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITelephony)) {
                return new Proxy(iBinder);
            }
            return (ITelephony) queryLocalInterface;
        }

        public static ITelephony getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ITelephony iTelephony) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iTelephony == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iTelephony;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        dial(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        call(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean showCallScreen = showCallScreen();
                        parcel2.writeNoException();
                        parcel2.writeInt(showCallScreen ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        boolean showCallScreenWithDialpad = showCallScreenWithDialpad(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(showCallScreenWithDialpad ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean endCall = endCall();
                        parcel2.writeNoException();
                        parcel2.writeInt(endCall ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        answerRingingCall();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        silenceRinger();
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isOffhook = isOffhook();
                        parcel2.writeNoException();
                        parcel2.writeInt(isOffhook ? 1 : 0);
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isRinging = isRinging();
                        parcel2.writeNoException();
                        parcel2.writeInt(isRinging ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isIdle = isIdle();
                        parcel2.writeNoException();
                        parcel2.writeInt(isIdle ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isRadioOn = isRadioOn();
                        parcel2.writeNoException();
                        parcel2.writeInt(isRadioOn ? 1 : 0);
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isSimPinEnabled = isSimPinEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isSimPinEnabled ? 1 : 0);
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isSimFDNEnabled = isSimFDNEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isSimFDNEnabled ? 1 : 0);
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        cancelMissedCallsNotification();
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean supplyPin = supplyPin(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(supplyPin ? 1 : 0);
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean supplyPuk = supplyPuk(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(supplyPuk ? 1 : 0);
                        return true;
                    case 17:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean supplyPin2 = supplyPin2(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(supplyPin2 ? 1 : 0);
                        return true;
                    case 18:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean msisdnavailable = getMsisdnavailable();
                        parcel2.writeNoException();
                        parcel2.writeInt(msisdnavailable ? 1 : 0);
                        return true;
                    case 19:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean handlePinMmi = handlePinMmi(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(handlePinMmi ? 1 : 0);
                        return true;
                    case 20:
                        parcel.enforceInterface(DESCRIPTOR);
                        toggleRadioOnOff();
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        boolean radio = setRadio(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(radio ? 1 : 0);
                        return true;
                    case 22:
                        parcel.enforceInterface(DESCRIPTOR);
                        updateServiceLocation();
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface(DESCRIPTOR);
                        enableLocationUpdates();
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface(DESCRIPTOR);
                        disableLocationUpdates();
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface(DESCRIPTOR);
                        int enableApnType = enableApnType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(enableApnType);
                        return true;
                    case 26:
                        parcel.enforceInterface(DESCRIPTOR);
                        int disableApnType = disableApnType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(disableApnType);
                        return true;
                    case 27:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean enableDataConnectivity = enableDataConnectivity();
                        parcel2.writeNoException();
                        parcel2.writeInt(enableDataConnectivity ? 1 : 0);
                        return true;
                    case 28:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean disableDataConnectivity = disableDataConnectivity();
                        parcel2.writeNoException();
                        parcel2.writeInt(disableDataConnectivity ? 1 : 0);
                        return true;
                    case 29:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isDataConnectivityPossible = isDataConnectivityPossible();
                        parcel2.writeNoException();
                        parcel2.writeInt(isDataConnectivityPossible ? 1 : 0);
                        return true;
                    case 30:
                        parcel.enforceInterface(DESCRIPTOR);
                        Bundle cellLocation = getCellLocation();
                        parcel2.writeNoException();
                        if (cellLocation != null) {
                            parcel2.writeInt(1);
                            cellLocation.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 31:
                        parcel.enforceInterface(DESCRIPTOR);
                        int callState = getCallState();
                        parcel2.writeNoException();
                        parcel2.writeInt(callState);
                        return true;
                    case 32:
                        parcel.enforceInterface(DESCRIPTOR);
                        int dataActivity = getDataActivity();
                        parcel2.writeNoException();
                        parcel2.writeInt(dataActivity);
                        return true;
                    case 33:
                        parcel.enforceInterface(DESCRIPTOR);
                        int dataState = getDataState();
                        parcel2.writeNoException();
                        parcel2.writeInt(dataState);
                        return true;
                    case 34:
                        parcel.enforceInterface(DESCRIPTOR);
                        int activePhoneType = getActivePhoneType();
                        parcel2.writeNoException();
                        parcel2.writeInt(activePhoneType);
                        return true;
                    case 35:
                        parcel.enforceInterface(DESCRIPTOR);
                        int cdmaEriIconIndex = getCdmaEriIconIndex();
                        parcel2.writeNoException();
                        parcel2.writeInt(cdmaEriIconIndex);
                        return true;
                    case 36:
                        parcel.enforceInterface(DESCRIPTOR);
                        int cdmaEriIconMode = getCdmaEriIconMode();
                        parcel2.writeNoException();
                        parcel2.writeInt(cdmaEriIconMode);
                        return true;
                    case 37:
                        parcel.enforceInterface(DESCRIPTOR);
                        String cdmaEriText = getCdmaEriText();
                        parcel2.writeNoException();
                        parcel2.writeString(cdmaEriText);
                        return true;
                    case 38:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean cdmaNeedsProvisioning = getCdmaNeedsProvisioning();
                        parcel2.writeNoException();
                        parcel2.writeInt(cdmaNeedsProvisioning ? 1 : 0);
                        return true;
                    case 39:
                        parcel.enforceInterface(DESCRIPTOR);
                        int voiceMessageCount = getVoiceMessageCount();
                        parcel2.writeNoException();
                        parcel2.writeInt(voiceMessageCount);
                        return true;
                    case 40:
                        parcel.enforceInterface(DESCRIPTOR);
                        int networkType = getNetworkType();
                        parcel2.writeNoException();
                        parcel2.writeInt(networkType);
                        return true;
                    case 41:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean hasIccCard = hasIccCard();
                        parcel2.writeNoException();
                        parcel2.writeInt(hasIccCard ? 1 : 0);
                        return true;
                    case 42:
                        parcel.enforceInterface(DESCRIPTOR);
                        initiateFakecall();
                        parcel2.writeNoException();
                        return true;
                    case 43:
                        parcel.enforceInterface(DESCRIPTOR);
                        int simPinRetry = getSimPinRetry();
                        parcel2.writeNoException();
                        parcel2.writeInt(simPinRetry);
                        return true;
                    case 44:
                        parcel.enforceInterface(DESCRIPTOR);
                        int simPukRetry = getSimPukRetry();
                        parcel2.writeNoException();
                        parcel2.writeInt(simPukRetry);
                        return true;
                    case 45:
                        parcel.enforceInterface(DESCRIPTOR);
                        switchHoldingAndActive();
                        parcel2.writeNoException();
                        return true;
                    case 46:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setMute(z);
                        parcel2.writeNoException();
                        return true;
                    case 47:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean mute = getMute();
                        parcel2.writeNoException();
                        parcel2.writeInt(mute ? 1 : 0);
                        return true;
                    case 48:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        turnOnSpeaker(z);
                        parcel2.writeNoException();
                        return true;
                    case 49:
                        parcel.enforceInterface(DESCRIPTOR);
                        int activeCallsCount = getActiveCallsCount();
                        parcel2.writeNoException();
                        parcel2.writeInt(activeCallsCount);
                        return true;
                    case 50:
                        parcel.enforceInterface(DESCRIPTOR);
                        int holdCallsCount = getHoldCallsCount();
                        parcel2.writeNoException();
                        parcel2.writeInt(holdCallsCount);
                        return true;
                    case 51:
                        parcel.enforceInterface(DESCRIPTOR);
                        String callerName = getCallerName();
                        parcel2.writeNoException();
                        parcel2.writeString(callerName);
                        return true;
                    case 52:
                        parcel.enforceInterface(DESCRIPTOR);
                        long callTime = getCallTime();
                        parcel2.writeNoException();
                        parcel2.writeLong(callTime);
                        return true;
                    case 53:
                        parcel.enforceInterface(DESCRIPTOR);
                        long callBaseTime = getCallBaseTime();
                        parcel2.writeNoException();
                        parcel2.writeLong(callBaseTime);
                        return true;
                    case 54:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isVideoCall = isVideoCall();
                        parcel2.writeNoException();
                        parcel2.writeInt(isVideoCall ? 1 : 0);
                        return true;
                    case 55:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean dataStatebyApnType = getDataStatebyApnType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(dataStatebyApnType ? 1 : 0);
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

    void answerRingingCall() throws RemoteException;

    void call(String str) throws RemoteException;

    void cancelMissedCallsNotification() throws RemoteException;

    void dial(String str) throws RemoteException;

    int disableApnType(String str) throws RemoteException;

    boolean disableDataConnectivity() throws RemoteException;

    void disableLocationUpdates() throws RemoteException;

    int enableApnType(String str) throws RemoteException;

    boolean enableDataConnectivity() throws RemoteException;

    void enableLocationUpdates() throws RemoteException;

    boolean endCall() throws RemoteException;

    int getActiveCallsCount() throws RemoteException;

    int getActivePhoneType() throws RemoteException;

    long getCallBaseTime() throws RemoteException;

    int getCallState() throws RemoteException;

    long getCallTime() throws RemoteException;

    String getCallerName() throws RemoteException;

    int getCdmaEriIconIndex() throws RemoteException;

    int getCdmaEriIconMode() throws RemoteException;

    String getCdmaEriText() throws RemoteException;

    boolean getCdmaNeedsProvisioning() throws RemoteException;

    Bundle getCellLocation() throws RemoteException;

    int getDataActivity() throws RemoteException;

    int getDataState() throws RemoteException;

    boolean getDataStatebyApnType(String str) throws RemoteException;

    int getHoldCallsCount() throws RemoteException;

    boolean getMsisdnavailable() throws RemoteException;

    boolean getMute() throws RemoteException;

    int getNetworkType() throws RemoteException;

    int getSimPinRetry() throws RemoteException;

    int getSimPukRetry() throws RemoteException;

    int getVoiceMessageCount() throws RemoteException;

    boolean handlePinMmi(String str) throws RemoteException;

    boolean hasIccCard() throws RemoteException;

    void initiateFakecall() throws RemoteException;

    boolean isDataConnectivityPossible() throws RemoteException;

    boolean isIdle() throws RemoteException;

    boolean isOffhook() throws RemoteException;

    boolean isRadioOn() throws RemoteException;

    boolean isRinging() throws RemoteException;

    boolean isSimFDNEnabled() throws RemoteException;

    boolean isSimPinEnabled() throws RemoteException;

    boolean isVideoCall() throws RemoteException;

    void setMute(boolean z) throws RemoteException;

    boolean setRadio(boolean z) throws RemoteException;

    boolean showCallScreen() throws RemoteException;

    boolean showCallScreenWithDialpad(boolean z) throws RemoteException;

    void silenceRinger() throws RemoteException;

    boolean supplyPin(String str) throws RemoteException;

    boolean supplyPin2(String str) throws RemoteException;

    boolean supplyPuk(String str, String str2) throws RemoteException;

    void switchHoldingAndActive() throws RemoteException;

    void toggleRadioOnOff() throws RemoteException;

    void turnOnSpeaker(boolean z) throws RemoteException;

    void updateServiceLocation() throws RemoteException;
}
