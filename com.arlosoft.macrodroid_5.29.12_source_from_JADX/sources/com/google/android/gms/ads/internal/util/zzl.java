package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfpz;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzl implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Uri f2297a;

    public /* synthetic */ zzl(Uri uri) {
        this.f2297a = uri;
    }

    public final Object call() {
        Uri uri = this.f2297a;
        zzfpz zzfpz = zzs.f2304i;
        zzt.m2905r();
        return zzs.m2761l(uri);
    }
}
