package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zabt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionResult f3386a;

    /* renamed from: c */
    final /* synthetic */ zabu f3387c;

    zabt(zabu zabu, ConnectionResult connectionResult) {
        this.f3387c = zabu;
        this.f3386a = connectionResult;
    }

    public final void run() {
        zabu zabu = this.f3387c;
        zabq zabq = (zabq) zabu.f3393f.f3183C.get(zabu.f3389b);
        if (zabq != null) {
            if (this.f3386a.mo21137p2()) {
                this.f3387c.f3392e = true;
                if (this.f3387c.f3388a.mo21202j()) {
                    this.f3387c.m4128h();
                    return;
                }
                try {
                    zabu zabu2 = this.f3387c;
                    zabu2.f3388a.mo21204m((IAccountAccessor) null, zabu2.f3388a.mo21203l());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f3387c.f3388a.mo21197e("Failed to get service from broker.");
                    zabq.mo21473F(new ConnectionResult(10), (Exception) null);
                }
            } else {
                zabq.mo21473F(this.f3386a, (Exception) null);
            }
        }
    }
}
