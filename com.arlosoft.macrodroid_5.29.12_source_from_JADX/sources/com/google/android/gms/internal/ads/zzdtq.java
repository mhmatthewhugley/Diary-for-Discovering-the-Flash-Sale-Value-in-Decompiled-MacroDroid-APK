package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdtq implements zza, zzbop, zzo, zzbor, zzz, zzdkn {

    /* renamed from: a */
    private zza f33094a;

    /* renamed from: c */
    private zzbop f33095c;

    /* renamed from: d */
    private zzo f33096d;

    /* renamed from: f */
    private zzbor f33097f;

    /* renamed from: g */
    private zzz f33098g;

    /* renamed from: o */
    private zzdkn f33099o;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized void m48160c(zza zza, zzbop zzbop, zzo zzo, zzbor zzbor, zzz zzz, zzdkn zzdkn) {
        this.f33094a = zza;
        this.f33095c = zzbop;
        this.f33096d = zzo;
        this.f33097f = zzbor;
        this.f33098g = zzz;
        this.f33099o = zzdkn;
    }

    /* renamed from: Z8 */
    public final synchronized void mo20216Z8() {
        zzo zzo = this.f33096d;
        if (zzo != null) {
            zzo.mo20216Z8();
        }
    }

    /* renamed from: b */
    public final synchronized void mo20217b() {
        zzo zzo = this.f33096d;
        if (zzo != null) {
            zzo.mo20217b();
        }
    }

    /* renamed from: f */
    public final synchronized void mo20242f() {
        zzz zzz = this.f33098g;
        if (zzz != null) {
            ((zzdtr) zzz).f33100a.zzb();
        }
    }

    /* renamed from: h1 */
    public final synchronized void mo42868h1(String str, Bundle bundle) {
        zzbop zzbop = this.f33095c;
        if (zzbop != null) {
            zzbop.mo42868h1(str, bundle);
        }
    }

    public final synchronized void onAdClicked() {
        zza zza = this.f33094a;
        if (zza != null) {
            zza.onAdClicked();
        }
    }

    /* renamed from: s */
    public final synchronized void mo44113s() {
        zzdkn zzdkn = this.f33099o;
        if (zzdkn != null) {
            zzdkn.mo44113s();
        }
    }

    /* renamed from: sb */
    public final synchronized void mo20218sb() {
        zzo zzo = this.f33096d;
        if (zzo != null) {
            zzo.mo20218sb();
        }
    }

    /* renamed from: t1 */
    public final synchronized void mo20219t1() {
        zzo zzo = this.f33096d;
        if (zzo != null) {
            zzo.mo20219t1();
        }
    }

    /* renamed from: x0 */
    public final synchronized void mo42869x0(String str, @Nullable String str2) {
        zzbor zzbor = this.f33097f;
        if (zzbor != null) {
            zzbor.mo42869x0(str, str2);
        }
    }

    /* renamed from: y */
    public final synchronized void mo20220y(int i) {
        zzo zzo = this.f33096d;
        if (zzo != null) {
            zzo.mo20220y(i);
        }
    }

    public final synchronized void zzb() {
        zzo zzo = this.f33096d;
        if (zzo != null) {
            zzo.zzb();
        }
    }
}
