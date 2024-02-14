package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class zai {

    /* renamed from: a */
    public final int f3459a;

    public zai(int i) {
        this.f3459a = i;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ Status m4226e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo21510a(@NonNull Status status);

    /* renamed from: b */
    public abstract void mo21511b(@NonNull Exception exc);

    /* renamed from: c */
    public abstract void mo21512c(zabq zabq) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo21513d(@NonNull zaad zaad, boolean z);
}
