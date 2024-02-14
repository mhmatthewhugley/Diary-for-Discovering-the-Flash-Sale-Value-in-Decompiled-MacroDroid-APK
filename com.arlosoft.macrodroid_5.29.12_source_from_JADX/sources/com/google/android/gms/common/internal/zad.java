package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zad extends zag {

    /* renamed from: a */
    final /* synthetic */ Intent f3700a;

    /* renamed from: c */
    final /* synthetic */ Activity f3701c;

    /* renamed from: d */
    final /* synthetic */ int f3702d;

    zad(Intent intent, Activity activity, int i) {
        this.f3700a = intent;
        this.f3701c = activity;
        this.f3702d = i;
    }

    /* renamed from: a */
    public final void mo21751a() {
        Intent intent = this.f3700a;
        if (intent != null) {
            this.f3701c.startActivityForResult(intent, this.f3702d);
        }
    }
}
