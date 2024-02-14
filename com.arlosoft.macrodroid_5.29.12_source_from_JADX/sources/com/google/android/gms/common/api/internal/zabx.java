package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zabx extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    Context f3395a;

    /* renamed from: b */
    private final zabw f3396b;

    public zabx(zabw zabw) {
        this.f3396b = zabw;
    }

    /* renamed from: a */
    public final void mo21493a(Context context) {
        this.f3395a = context;
    }

    /* renamed from: b */
    public final synchronized void mo21494b() {
        Context context = this.f3395a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f3395a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f3396b.mo21450a();
            mo21494b();
        }
    }
}
