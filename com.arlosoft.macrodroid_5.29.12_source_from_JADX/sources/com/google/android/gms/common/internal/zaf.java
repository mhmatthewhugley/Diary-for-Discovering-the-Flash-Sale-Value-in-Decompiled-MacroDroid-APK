package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaf extends zag {

    /* renamed from: a */
    final /* synthetic */ Intent f3706a;

    /* renamed from: c */
    final /* synthetic */ LifecycleFragment f3707c;

    zaf(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.f3706a = intent;
        this.f3707c = lifecycleFragment;
    }

    /* renamed from: a */
    public final void mo21751a() {
        Intent intent = this.f3706a;
        if (intent != null) {
            this.f3707c.startActivityForResult(intent, 2);
        }
    }
}
