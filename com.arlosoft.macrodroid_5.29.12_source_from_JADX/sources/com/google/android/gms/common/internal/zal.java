package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zal {

    /* renamed from: a */
    private final SparseIntArray f3719a;

    /* renamed from: b */
    private GoogleApiAvailabilityLight f3720b;

    public zal() {
        this(GoogleApiAvailability.m3521q());
    }

    /* renamed from: a */
    public final int mo21762a(Context context, int i) {
        return this.f3719a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo21763b(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.m4488k(context);
        Preconditions.m4488k(client);
        int i = 0;
        if (!client.mo21201i()) {
            return 0;
        }
        int q = client.mo21032q();
        int a = mo21762a(context, q);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f3719a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f3719a.keyAt(i2);
                if (keyAt > q && this.f3719a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            a = i == -1 ? this.f3720b.mo21157j(context, q) : i;
            this.f3719a.put(q, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo21764c() {
        this.f3719a.clear();
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f3719a = new SparseIntArray();
        Preconditions.m4488k(googleApiAvailabilityLight);
        this.f3720b = googleApiAvailabilityLight;
    }
}
