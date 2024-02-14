package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzau implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ zzav f2185a;

    zzau(zzav zzav) {
        this.f2185a = zzav;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzt.m2905r();
        zzs.m2766q(this.f2185a.f2186a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
