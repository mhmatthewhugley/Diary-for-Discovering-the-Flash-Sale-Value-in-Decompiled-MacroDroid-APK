package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbaq implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ String f26417a = "Loader:ExtractorMediaPeriod";

    zzbaq(String str) {
    }

    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, this.f26417a);
    }
}
