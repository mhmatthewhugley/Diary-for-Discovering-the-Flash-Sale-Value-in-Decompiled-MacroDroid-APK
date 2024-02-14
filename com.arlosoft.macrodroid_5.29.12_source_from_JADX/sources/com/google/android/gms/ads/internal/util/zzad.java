package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzad implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ zzas f2144a;

    /* renamed from: c */
    public final /* synthetic */ String f2145c;

    public /* synthetic */ zzad(zzas zzas, String str) {
        this.f2144a = zzas;
        this.f2145c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2144a.mo20284i(this.f2145c, dialogInterface, i);
    }
}
