package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class zzoy {

    /* renamed from: a */
    private final zzps f44385a;

    public zzoy(Context context) {
        this.f44385a = new zzps(context, new SharedPrefManager(context), new zzpm(context, zzpl.m62154d("shared-installation-id").mo52405c()), "shared-installation-id");
    }

    protected zzoy(zzps zzps) {
        this.f44385a = zzps;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52393a(zzle zzle, zzox zzox) {
        zzps zzps = this.f44385a;
        zzlf zzlf = new zzlf();
        zzlf.mo52253k(zzox.mo52385a().mo52332i());
        zzps.mo52445e(zzpx.m62188f(zzlf), zzle, "o:a:mlkit:1.0.0");
    }
}
