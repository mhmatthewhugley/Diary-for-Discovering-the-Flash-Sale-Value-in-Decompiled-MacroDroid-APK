package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzkn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f47236a;

    /* renamed from: c */
    final /* synthetic */ String f47237c = "_err";

    /* renamed from: d */
    final /* synthetic */ Bundle f47238d;

    /* renamed from: f */
    final /* synthetic */ zzko f47239f;

    zzkn(zzko zzko, String str, String str2, Bundle bundle) {
        this.f47239f = zzko;
        this.f47236a = str;
        this.f47238d = bundle;
    }

    public final void run() {
        this.f47239f.f47240a.mo55534i((zzaw) Preconditions.m4488k(this.f47239f.f47240a.mo55533h0().mo55616w0(this.f47236a, this.f47237c, this.f47238d, "auto", this.f47239f.f47240a.mo55201a().mo21950a(), false, true)), this.f47236a);
    }
}
