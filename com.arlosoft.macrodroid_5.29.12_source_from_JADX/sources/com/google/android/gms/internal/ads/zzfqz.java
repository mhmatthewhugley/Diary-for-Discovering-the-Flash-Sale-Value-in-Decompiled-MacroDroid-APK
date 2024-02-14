package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfqz extends zzfrl {

    /* renamed from: a */
    private final zzfrf f36297a;

    /* renamed from: c */
    final /* synthetic */ zzfra f36298c;

    zzfqz(zzfra zzfra, zzfrf zzfrf) {
        this.f36298c = zzfra;
        this.f36297a = zzfrf;
    }

    /* renamed from: x0 */
    public final void mo46132x0(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfrd c = zzfre.m50856c();
        c.mo46112b(i);
        if (string != null) {
            c.mo46111a(string);
        }
        this.f36297a.mo20228a(c.mo46113c());
        if (i == 8157) {
            this.f36298c.mo46133c();
        }
    }
}
