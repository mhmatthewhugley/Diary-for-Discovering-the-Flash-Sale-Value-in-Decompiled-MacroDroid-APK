package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfr;
import com.google.android.gms.measurement.internal.zzhx;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zza extends zzd {

    /* renamed from: a */
    private final zzfr f47358a;

    /* renamed from: b */
    private final zzhx f47359b;

    public zza(@NonNull zzfr zzfr) {
        super((zzc) null);
        Preconditions.m4488k(zzfr);
        this.f47358a = zzfr;
        this.f47359b = zzfr.mo55191I();
    }

    /* renamed from: a */
    public final void mo55382a(String str, String str2, Bundle bundle) {
        this.f47359b.mo55372p(str, str2, bundle);
    }

    /* renamed from: a0 */
    public final void mo55383a0(String str) {
        this.f47358a.mo55218w().mo55034j(str, this.f47358a.mo55201a().mo21952c());
    }

    /* renamed from: b */
    public final List mo55384b(String str, String str2) {
        return this.f47359b.mo55366Z(str, str2);
    }

    /* renamed from: c */
    public final Map mo55385c(String str, String str2, boolean z) {
        return this.f47359b.mo55367a0(str, str2, z);
    }

    /* renamed from: d */
    public final void mo55386d(Bundle bundle) {
        this.f47359b.mo55346D(bundle);
    }

    /* renamed from: e */
    public final String mo55387e() {
        return this.f47359b.mo55362V();
    }

    /* renamed from: f */
    public final void mo55388f(String str, String str2, Bundle bundle) {
        this.f47358a.mo55191I().mo55369m(str, str2, bundle);
    }

    /* renamed from: g */
    public final String mo55389g() {
        return this.f47359b.mo55363W();
    }

    /* renamed from: h */
    public final String mo55390h() {
        return this.f47359b.mo55364X();
    }

    /* renamed from: i */
    public final String mo55391i() {
        return this.f47359b.mo55362V();
    }

    /* renamed from: o */
    public final int mo55392o(String str) {
        this.f47359b.mo55357Q(str);
        return 25;
    }

    /* renamed from: x */
    public final void mo55393x(String str) {
        this.f47358a.mo55218w().mo55035k(str, this.f47358a.mo55201a().mo21952c());
    }

    public final long zzb() {
        return this.f47358a.mo55196N().mo55608r0();
    }
}
