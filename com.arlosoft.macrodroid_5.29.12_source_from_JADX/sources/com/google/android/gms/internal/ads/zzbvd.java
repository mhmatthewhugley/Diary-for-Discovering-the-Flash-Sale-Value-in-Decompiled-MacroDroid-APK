package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbvd {

    /* renamed from: b */
    private static zzbvd f27825b;

    /* renamed from: a */
    private final AtomicBoolean f27826a = new AtomicBoolean(false);

    @VisibleForTesting
    zzbvd() {
    }

    /* renamed from: a */
    public static zzbvd m44190a() {
        if (f27825b == null) {
            f27825b = new zzbvd();
        }
        return f27825b;
    }

    @Nullable
    /* renamed from: b */
    public final Thread mo43027b(Context context, @Nullable String str) {
        if (!this.f27826a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzbvc(this, context, str));
        thread.start();
        return thread;
    }
}
