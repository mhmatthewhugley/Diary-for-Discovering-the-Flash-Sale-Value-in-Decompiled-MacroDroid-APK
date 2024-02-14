package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzu;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class zzfd implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzfi f46770a;

    /* renamed from: c */
    public final /* synthetic */ String f46771c;

    public /* synthetic */ zzfd(zzfi zzfi, String str) {
        this.f46770a = zzfi;
        this.f46771c = str;
    }

    public final Object call() {
        return new zzu("internal.appMetadata", new zzfb(this.f46770a, this.f46771c));
    }
}
