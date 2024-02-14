package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zae extends zag {

    /* renamed from: a */
    final /* synthetic */ Intent f3703a;

    /* renamed from: c */
    final /* synthetic */ Fragment f3704c;

    /* renamed from: d */
    final /* synthetic */ int f3705d;

    /* renamed from: a */
    public final void mo21751a() {
        Intent intent = this.f3703a;
        if (intent != null) {
            this.f3704c.startActivityForResult(intent, this.f3705d);
        }
    }
}
