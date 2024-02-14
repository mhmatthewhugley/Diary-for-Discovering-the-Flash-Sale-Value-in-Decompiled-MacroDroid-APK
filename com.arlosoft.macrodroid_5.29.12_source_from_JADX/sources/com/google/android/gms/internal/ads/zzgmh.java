package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgmh extends zzgra implements zzgsp {
    private zzgmh() {
        super(zzgmk.zzb);
    }

    /* renamed from: n */
    public final zzgmh mo46985n(zzgmj zzgmj) {
        if (this.f37155d) {
            mo47343l();
            this.f37155d = false;
        }
        zzgmk.m52340N((zzgmk) this.f37154c, zzgmj);
        return this;
    }

    /* renamed from: o */
    public final zzgmh mo46986o(int i) {
        if (this.f37155d) {
            mo47343l();
            this.f37155d = false;
        }
        ((zzgmk) this.f37154c).zze = i;
        return this;
    }

    /* renamed from: u */
    public final List mo46987u() {
        return Collections.unmodifiableList(((zzgmk) this.f37154c).mo46999L());
    }

    /* synthetic */ zzgmh(zzgmg zzgmg) {
        super(zzgmk.zzb);
    }
}
