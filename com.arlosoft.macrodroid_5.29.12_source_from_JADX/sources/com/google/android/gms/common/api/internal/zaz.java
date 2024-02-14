package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaz implements zabz {

    /* renamed from: a */
    final /* synthetic */ zaaa f3486a;

    /* synthetic */ zaz(zaaa zaaa, zay zay) {
        this.f3486a = zaaa;
    }

    /* renamed from: a */
    public final void mo21452a(@Nullable Bundle bundle) {
        this.f3486a.f3247D.lock();
        try {
            this.f3486a.f3245B = ConnectionResult.f3044g;
            zaaa.m3884A(this.f3486a);
        } finally {
            this.f3486a.f3247D.unlock();
        }
    }

    /* renamed from: b */
    public final void mo21453b(int i, boolean z) {
        Lock u;
        this.f3486a.f3247D.lock();
        try {
            zaaa zaaa = this.f3486a;
            if (zaaa.f3246C) {
                zaaa.f3246C = false;
                zaaa.m3900y(this.f3486a, i, z);
                u = this.f3486a.f3247D;
            } else {
                zaaa.f3246C = true;
                this.f3486a.f3252f.mo21335t1(i);
                u = this.f3486a.f3247D;
            }
            u.unlock();
        } catch (Throwable th) {
            this.f3486a.f3247D.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo21454c(@NonNull ConnectionResult connectionResult) {
        this.f3486a.f3247D.lock();
        try {
            this.f3486a.f3245B = connectionResult;
            zaaa.m3884A(this.f3486a);
        } finally {
            this.f3486a.f3247D.unlock();
        }
    }
}
