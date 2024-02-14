package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzku {

    /* renamed from: a */
    final Context f47280a;

    @VisibleForTesting
    public zzku(Context context) {
        Preconditions.m4488k(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m4488k(applicationContext);
        this.f47280a = applicationContext;
    }
}
