package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzan extends zzal {
    zzan(zzaw zzaw, zzi zzi) {
        super(zzaw, zzi);
    }

    /* renamed from: R6 */
    public final void mo59595R6(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo59595R6(bundle, bundle2);
        this.f51217a.mo60034e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
