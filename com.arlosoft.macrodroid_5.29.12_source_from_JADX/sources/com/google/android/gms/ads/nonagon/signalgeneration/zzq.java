package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzq implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzaa f2564a;

    /* renamed from: c */
    public final /* synthetic */ Uri f2565c;

    /* renamed from: d */
    public final /* synthetic */ IObjectWrapper f2566d;

    public /* synthetic */ zzq(zzaa zzaa, Uri uri, IObjectWrapper iObjectWrapper) {
        this.f2564a = zzaa;
        this.f2565c = uri;
        this.f2566d = iObjectWrapper;
    }

    public final Object call() {
        return this.f2564a.mo20660kc(this.f2565c, this.f2566d);
    }
}
