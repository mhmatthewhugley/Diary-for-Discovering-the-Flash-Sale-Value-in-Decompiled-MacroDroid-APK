package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgw implements Connections.StartAdvertisingResult {

    /* renamed from: a */
    private final Status f44681a;

    /* renamed from: c */
    private final String f44682c;

    zzgw(Status status, String str) {
        this.f44681a = status;
        this.f44682c = str;
    }

    public final Status getStatus() {
        return this.f44681a;
    }
}
