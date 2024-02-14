package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzegr implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ zzl f33969a;

    public /* synthetic */ zzegr(zzl zzl) {
        this.f33969a = zzl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        zzl zzl = this.f33969a;
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
