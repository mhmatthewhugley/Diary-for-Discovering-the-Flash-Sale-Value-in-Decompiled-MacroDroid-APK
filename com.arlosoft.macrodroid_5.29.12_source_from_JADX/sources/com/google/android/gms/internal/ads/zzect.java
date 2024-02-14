package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzect extends zzcax {

    /* renamed from: a */
    final /* synthetic */ zzecu f33720a;

    protected zzect(zzecu zzecu) {
        this.f33720a = zzecu;
    }

    /* renamed from: B9 */
    public final void mo43267B9(ParcelFileDescriptor parcelFileDescriptor) {
        this.f33720a.f33721a.mo43574c(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    /* renamed from: a6 */
    public final void mo43268a6(zzaz zzaz) {
        this.f33720a.f33721a.mo43575d(new zzay(zzaz.f2198a, zzaz.f2199c));
    }
}
