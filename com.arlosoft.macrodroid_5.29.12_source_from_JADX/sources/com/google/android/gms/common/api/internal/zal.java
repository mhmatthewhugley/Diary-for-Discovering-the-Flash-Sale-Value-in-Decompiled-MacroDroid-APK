package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zal {

    /* renamed from: a */
    private final ArrayMap f3465a;

    /* renamed from: b */
    private final ArrayMap f3466b;

    /* renamed from: c */
    private final TaskCompletionSource f3467c;

    /* renamed from: d */
    private int f3468d;

    /* renamed from: e */
    private boolean f3469e;

    /* renamed from: a */
    public final Set mo21521a() {
        return this.f3465a.keySet();
    }

    /* renamed from: b */
    public final void mo21522b(ApiKey apiKey, ConnectionResult connectionResult, @Nullable String str) {
        this.f3465a.put(apiKey, connectionResult);
        this.f3466b.put(apiKey, str);
        this.f3468d--;
        if (!connectionResult.mo21137p2()) {
            this.f3469e = true;
        }
        if (this.f3468d != 0) {
            return;
        }
        if (this.f3469e) {
            this.f3467c.mo56138b(new AvailabilityException(this.f3465a));
            return;
        }
        this.f3467c.mo56139c(this.f3466b);
    }
}
