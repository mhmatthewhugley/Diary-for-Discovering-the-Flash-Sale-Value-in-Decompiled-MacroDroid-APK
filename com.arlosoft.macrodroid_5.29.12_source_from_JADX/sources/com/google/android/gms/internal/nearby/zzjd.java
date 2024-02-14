package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzjd implements Connections.StartAdvertisingResult {

    /* renamed from: a */
    final /* synthetic */ Status f44804a;

    zzjd(zzjf zzjf, Status status) {
        this.f44804a = status;
    }

    public final Status getStatus() {
        return this.f44804a;
    }
}
