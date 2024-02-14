package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zzb();

    /* renamed from: a */
    Messenger f2977a;

    /* renamed from: c */
    IMessengerCompat f2978c;

    public zzd(IBinder iBinder) {
        this.f2977a = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo21087a() {
        Messenger messenger = this.f2977a;
        return messenger != null ? messenger.getBinder() : this.f2978c.asBinder();
    }

    /* renamed from: b */
    public final void mo21088b(Message message) throws RemoteException {
        Messenger messenger = this.f2977a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f2978c.mo21074E7(message);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo21087a().equals(((zzd) obj).mo21087a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return mo21087a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f2977a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f2978c.asBinder());
        }
    }
}
