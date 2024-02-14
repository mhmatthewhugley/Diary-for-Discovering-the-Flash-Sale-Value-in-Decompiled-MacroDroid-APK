package com.google.android.gms.internal.nearby;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzrx extends ContentObserver {
    zzrx(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        zzry.f45084e.set(true);
    }
}
