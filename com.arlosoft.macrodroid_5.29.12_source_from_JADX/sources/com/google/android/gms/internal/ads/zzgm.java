package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgm {

    /* renamed from: a */
    private final Context f36907a;

    /* renamed from: b */
    private final zzgk f36908b;

    public zzgm(Context context, Handler handler, zzgl zzgl) {
        this.f36907a = context.getApplicationContext();
        this.f36908b = new zzgk(this, handler, zzgl);
    }
}
