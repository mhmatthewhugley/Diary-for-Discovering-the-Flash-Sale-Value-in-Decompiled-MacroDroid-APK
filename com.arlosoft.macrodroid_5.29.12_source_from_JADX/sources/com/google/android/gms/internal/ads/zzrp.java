package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzrp implements zzss, zzpl {

    /* renamed from: a */
    private final Object f38370a;

    /* renamed from: b */
    private zzsr f38371b;

    /* renamed from: c */
    private zzpk f38372c;

    /* renamed from: d */
    final /* synthetic */ zzrr f38373d;

    public zzrp(zzrr zzrr, Object obj) {
        this.f38373d = zzrr;
        this.f38371b = zzrr.mo48108o((zzsi) null);
        this.f38372c = zzrr.mo48106m((zzsi) null);
        this.f38370a = obj;
    }

    /* renamed from: m */
    private final boolean m54794m(int i, @Nullable zzsi zzsi) {
        zzsi zzsi2;
        if (zzsi != null) {
            zzsi2 = this.f38373d.mo48144x(this.f38370a, zzsi);
            if (zzsi2 == null) {
                return false;
            }
        } else {
            zzsi2 = null;
        }
        zzsr zzsr = this.f38371b;
        if (zzsr.f38444a != i || !zzen.m49181t(zzsr.f38445b, zzsi2)) {
            this.f38371b = this.f38373d.mo48109p(i, zzsi2, 0);
        }
        zzpk zzpk = this.f38372c;
        if (zzpk.f38186a == i && zzen.m49181t(zzpk.f38187b, zzsi2)) {
            return true;
        }
        this.f38372c = this.f38373d.mo48107n(i, zzsi2);
        return true;
    }

    /* renamed from: o */
    public final void mo47731o(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse, IOException iOException, boolean z) {
        if (m54794m(i, zzsi)) {
            this.f38371b.mo48175i(zzrz, zzse, iOException, z);
        }
    }

    /* renamed from: r */
    public final void mo47732r(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse) {
        if (m54794m(i, zzsi)) {
            this.f38371b.mo48173g(zzrz, zzse);
        }
    }

    /* renamed from: t */
    public final void mo47733t(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse) {
        if (m54794m(i, zzsi)) {
            this.f38371b.mo48177k(zzrz, zzse);
        }
    }

    /* renamed from: u */
    public final void mo47734u(int i, @Nullable zzsi zzsi, zzse zzse) {
        if (m54794m(i, zzsi)) {
            this.f38371b.mo48169c(zzse);
        }
    }

    /* renamed from: w */
    public final void mo47735w(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse) {
        if (m54794m(i, zzsi)) {
            this.f38371b.mo48171e(zzrz, zzse);
        }
    }
}
