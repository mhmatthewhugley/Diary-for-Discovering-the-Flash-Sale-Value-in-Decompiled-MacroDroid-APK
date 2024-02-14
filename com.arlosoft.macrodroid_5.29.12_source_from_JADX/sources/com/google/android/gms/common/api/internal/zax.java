package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zax implements zabz {

    /* renamed from: a */
    final /* synthetic */ zaaa f3485a;

    /* synthetic */ zax(zaaa zaaa, zaw zaw) {
        this.f3485a = zaaa;
    }

    /* renamed from: a */
    public final void mo21452a(@Nullable Bundle bundle) {
        this.f3485a.f3247D.lock();
        try {
            zaaa.m3901z(this.f3485a, bundle);
            this.f3485a.f3244A = ConnectionResult.f3044g;
            zaaa.m3884A(this.f3485a);
        } finally {
            this.f3485a.f3247D.unlock();
        }
    }

    /* renamed from: b */
    public final void mo21453b(int i, boolean z) {
        Lock u;
        this.f3485a.f3247D.lock();
        try {
            zaaa zaaa = this.f3485a;
            if (!zaaa.f3246C && zaaa.f3245B != null) {
                if (zaaa.f3245B.mo21137p2()) {
                    this.f3485a.f3246C = true;
                    this.f3485a.f3253g.mo21335t1(i);
                    u = this.f3485a.f3247D;
                    u.unlock();
                }
            }
            this.f3485a.f3246C = false;
            zaaa.m3900y(this.f3485a, i, z);
            u = this.f3485a.f3247D;
            u.unlock();
        } catch (Throwable th) {
            this.f3485a.f3247D.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo21454c(@NonNull ConnectionResult connectionResult) {
        this.f3485a.f3247D.lock();
        try {
            this.f3485a.f3244A = connectionResult;
            zaaa.m3884A(this.f3485a);
        } finally {
            this.f3485a.f3247D.unlock();
        }
    }
}
