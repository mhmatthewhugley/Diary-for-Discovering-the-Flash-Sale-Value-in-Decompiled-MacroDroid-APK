package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzav implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f2186a;

    /* renamed from: c */
    final /* synthetic */ String f2187c;

    /* renamed from: d */
    final /* synthetic */ boolean f2188d;

    /* renamed from: f */
    final /* synthetic */ boolean f2189f;

    zzav(zzaw zzaw, Context context, String str, boolean z, boolean z2) {
        this.f2186a = context;
        this.f2187c = str;
        this.f2188d = z;
        this.f2189f = z2;
    }

    public final void run() {
        zzt.m2905r();
        AlertDialog.Builder g = zzs.m2756g(this.f2186a);
        g.setMessage(this.f2187c);
        if (this.f2188d) {
            g.setTitle("Error");
        } else {
            g.setTitle("Info");
        }
        if (this.f2189f) {
            g.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            g.setPositiveButton("Learn More", new zzau(this));
            g.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        g.create().show();
    }
}
