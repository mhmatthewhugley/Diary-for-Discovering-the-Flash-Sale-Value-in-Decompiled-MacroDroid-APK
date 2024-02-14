package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class zzo extends zzp<Void> {
    zzo(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21110a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo21113d(null);
        } else {
            mo21112c(new zzq(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo21111b() {
        return true;
    }
}
