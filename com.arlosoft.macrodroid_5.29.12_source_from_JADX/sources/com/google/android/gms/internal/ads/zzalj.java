package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzalj implements zzaky {

    /* renamed from: a */
    private File f24947a = null;

    /* renamed from: b */
    final /* synthetic */ Context f24948b;

    zzalj(Context context) {
        this.f24948b = context;
    }

    public final File zza() {
        if (this.f24947a == null) {
            this.f24947a = new File(this.f24948b.getCacheDir(), "volley");
        }
        return this.f24947a;
    }
}
