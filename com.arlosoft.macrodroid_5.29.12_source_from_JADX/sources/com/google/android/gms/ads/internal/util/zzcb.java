package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcgp;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcb {
    @Deprecated
    /* renamed from: a */
    public static Object m2626a(Context context, Callable callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            zzcgp.m45227e("Unexpected exception.", th);
            zzcaf.m44757c(context).mo43253b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
