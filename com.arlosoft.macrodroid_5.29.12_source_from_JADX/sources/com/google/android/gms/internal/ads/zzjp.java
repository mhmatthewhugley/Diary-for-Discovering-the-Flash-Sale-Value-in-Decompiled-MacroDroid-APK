package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzjp implements zzss, zzpl {

    /* renamed from: a */
    private final zzjr f37667a;

    /* renamed from: b */
    private zzsr f37668b;

    /* renamed from: c */
    private zzpk f37669c;

    /* renamed from: d */
    final /* synthetic */ zzjt f37670d;

    public zzjp(zzjt zzjt, zzjr zzjr) {
        this.f37670d = zzjt;
        this.f37668b = zzjt.f37684f;
        this.f37669c = zzjt.f37685g;
        this.f37667a = zzjr;
    }

    /* renamed from: m */
    private final boolean m53939m(int i, @Nullable zzsi zzsi) {
        zzsi zzsi2 = null;
        if (zzsi != null) {
            zzjr zzjr = this.f37667a;
            int i2 = 0;
            while (true) {
                if (i2 >= zzjr.f37676c.size()) {
                    break;
                } else if (((zzsi) zzjr.f37676c.get(i2)).f27572d == zzsi.f27572d) {
                    zzsi2 = zzsi.mo48161c(Pair.create(zzjr.f37675b, zzsi.f27569a));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzsi2 == null) {
                return false;
            }
        }
        int i3 = i + this.f37667a.f37677d;
        zzsr zzsr = this.f37668b;
        if (zzsr.f38444a != i3 || !zzen.m49181t(zzsr.f38445b, zzsi2)) {
            this.f37668b = this.f37670d.f37684f.mo48167a(i3, zzsi2, 0);
        }
        zzpk zzpk = this.f37669c;
        if (zzpk.f38186a == i3 && zzen.m49181t(zzpk.f38187b, zzsi2)) {
            return true;
        }
        this.f37669c = this.f37670d.f37685g.mo48012a(i3, zzsi2);
        return true;
    }

    /* renamed from: o */
    public final void mo47731o(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse, IOException iOException, boolean z) {
        if (m53939m(i, zzsi)) {
            this.f37668b.mo48175i(zzrz, zzse, iOException, z);
        }
    }

    /* renamed from: r */
    public final void mo47732r(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse) {
        if (m53939m(i, zzsi)) {
            this.f37668b.mo48173g(zzrz, zzse);
        }
    }

    /* renamed from: t */
    public final void mo47733t(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse) {
        if (m53939m(i, zzsi)) {
            this.f37668b.mo48177k(zzrz, zzse);
        }
    }

    /* renamed from: u */
    public final void mo47734u(int i, @Nullable zzsi zzsi, zzse zzse) {
        if (m53939m(i, zzsi)) {
            this.f37668b.mo48169c(zzse);
        }
    }

    /* renamed from: w */
    public final void mo47735w(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse) {
        if (m53939m(i, zzsi)) {
            this.f37668b.mo48171e(zzrz, zzse);
        }
    }
}
