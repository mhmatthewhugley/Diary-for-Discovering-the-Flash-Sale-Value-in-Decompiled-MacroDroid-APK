package dev.skomlach.biometric.compat.engine.internal.face.miui.impl;

import android.os.Binder;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/internal/face/miui/impl/MiuiFaceManagerImpl$mServiceReceiver$1", "Landroid/os/Binder;", "onTransact", "", "code", "", "data", "Landroid/os/Parcel;", "reply", "flags", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: MiuiFaceManagerImpl.kt */
public final class MiuiFaceManagerImpl$mServiceReceiver$1 extends Binder {
    final /* synthetic */ MiuiFaceManagerImpl this$0;

    MiuiFaceManagerImpl$mServiceReceiver$1(MiuiFaceManagerImpl miuiFaceManagerImpl) {
        this.this$0 = miuiFaceManagerImpl;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C13706o.m87929f(parcel, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        boolean z = false;
        BiometricLoggerImpl.INSTANCE.mo68217d("FaceManagerImpl", "mServiceReceiver callback: " + i);
        Handler handler = null;
        if (i == 261) {
            parcel.enforceInterface("receiver.FaceService");
            Handler access$getMHandler$p = this.this$0.mHandler;
            if (access$getMHandler$p == null) {
                C13706o.m87945v("mHandler");
            } else {
                handler = access$getMHandler$p;
            }
            handler.obtainMessage(261, Integer.valueOf(parcel.readInt())).sendToTarget();
            if (parcel2 == null) {
                return true;
            }
            parcel2.writeNoException();
            return true;
        } else if (i != 301) {
            switch (i) {
                case 201:
                    parcel.enforceInterface("receiver.FaceService");
                    long readLong = parcel.readLong();
                    int readInt = parcel.readInt();
                    Handler access$getMHandler$p2 = this.this$0.mHandler;
                    if (access$getMHandler$p2 == null) {
                        C13706o.m87945v("mHandler");
                    } else {
                        handler = access$getMHandler$p2;
                    }
                    handler.obtainMessage(201, parcel.readInt(), 0, new Miuiface((CharSequence) null, parcel.readInt(), readInt, readLong)).sendToTarget();
                    if (parcel2 == null) {
                        return true;
                    }
                    parcel2.writeNoException();
                    return true;
                case 202:
                    parcel.enforceInterface("receiver.FaceService");
                    Handler access$getMHandler$p3 = this.this$0.mHandler;
                    if (access$getMHandler$p3 == null) {
                        C13706o.m87945v("mHandler");
                    } else {
                        handler = access$getMHandler$p3;
                    }
                    handler.obtainMessage(202, parcel.readInt(), parcel.readInt(), Long.valueOf(parcel.readLong())).sendToTarget();
                    if (parcel2 == null) {
                        return true;
                    }
                    parcel2.writeNoException();
                    return true;
                case 203:
                    parcel.enforceInterface("receiver.FaceService");
                    parcel.readLong();
                    Miuiface createFromParcel = parcel.readInt() != 0 ? Miuiface.CREATOR.createFromParcel(parcel) : null;
                    Handler access$getMHandler$p4 = this.this$0.mHandler;
                    if (access$getMHandler$p4 == null) {
                        C13706o.m87945v("mHandler");
                    } else {
                        handler = access$getMHandler$p4;
                    }
                    handler.obtainMessage(203, parcel.readInt(), 0, createFromParcel).sendToTarget();
                    if (parcel2 == null) {
                        return true;
                    }
                    parcel2.writeNoException();
                    return true;
                case 204:
                    parcel.enforceInterface("receiver.FaceService");
                    parcel.readLong();
                    Handler access$getMHandler$p5 = this.this$0.mHandler;
                    if (access$getMHandler$p5 == null) {
                        C13706o.m87945v("mHandler");
                    } else {
                        handler = access$getMHandler$p5;
                    }
                    handler.obtainMessage(204).sendToTarget();
                    if (parcel2 == null) {
                        return true;
                    }
                    parcel2.writeNoException();
                    return true;
                case 205:
                    parcel.enforceInterface("receiver.FaceService");
                    Handler access$getMHandler$p6 = this.this$0.mHandler;
                    if (access$getMHandler$p6 == null) {
                        C13706o.m87945v("mHandler");
                    } else {
                        handler = access$getMHandler$p6;
                    }
                    handler.obtainMessage(205, parcel.readInt(), parcel.readInt(), Long.valueOf(parcel.readLong())).sendToTarget();
                    if (parcel2 == null) {
                        return true;
                    }
                    parcel2.writeNoException();
                    return true;
                case 206:
                    parcel.enforceInterface("receiver.FaceService");
                    long readLong2 = parcel.readLong();
                    int readInt2 = parcel.readInt();
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    Miuiface miuiface = new Miuiface((CharSequence) null, readInt3, readInt2, readLong2);
                    Handler access$getMHandler$p7 = this.this$0.mHandler;
                    if (access$getMHandler$p7 == null) {
                        C13706o.m87945v("mHandler");
                    } else {
                        handler = access$getMHandler$p7;
                    }
                    handler.obtainMessage(206, readInt4, 0, miuiface).sendToTarget();
                    if (parcel2 == null) {
                        return true;
                    }
                    parcel2.writeNoException();
                    return true;
                case 207:
                    parcel.enforceInterface("receiver.FaceService");
                    MiuiFaceManagerImpl miuiFaceManagerImpl = this.this$0;
                    if (parcel.readInt() == 1) {
                        z = true;
                    }
                    miuiFaceManagerImpl.isFaceUnlockInited = z;
                    if (parcel2 == null) {
                        return true;
                    }
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel.enforceInterface("receiver.FaceService");
            Handler access$getMHandler$p8 = this.this$0.mHandler;
            if (access$getMHandler$p8 == null) {
                C13706o.m87945v("mHandler");
            } else {
                handler = access$getMHandler$p8;
            }
            handler.obtainMessage(301, Integer.valueOf(parcel.readInt())).sendToTarget();
            if (parcel2 == null) {
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
