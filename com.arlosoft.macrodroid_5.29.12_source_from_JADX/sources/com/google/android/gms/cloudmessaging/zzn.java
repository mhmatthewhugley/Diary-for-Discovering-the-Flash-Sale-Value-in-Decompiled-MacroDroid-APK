package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class zzn {
    @Nullable

    /* renamed from: a */
    private final Messenger f2998a;
    @Nullable

    /* renamed from: b */
    private final zzd f2999b;

    zzn(IBinder iBinder) throws RemoteException {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f2998a = new Messenger(iBinder);
            this.f2999b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f2999b = new zzd(iBinder);
            this.f2998a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21109a(Message message) throws RemoteException {
        Messenger messenger = this.f2998a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzd = this.f2999b;
        if (zzd != null) {
            zzd.mo21088b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
