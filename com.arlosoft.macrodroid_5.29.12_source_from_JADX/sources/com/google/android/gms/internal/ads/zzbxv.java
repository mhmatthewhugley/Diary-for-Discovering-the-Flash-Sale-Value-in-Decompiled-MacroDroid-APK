package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbxv implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ zzbxx f27936a;

    zzbxv(zzbxx zzbxx) {
        this.f27936a = zzbxx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent i2 = this.f27936a.mo43196i();
        zzt.m2905r();
        zzs.m2759j(this.f27936a.f27939d, i2);
    }
}
