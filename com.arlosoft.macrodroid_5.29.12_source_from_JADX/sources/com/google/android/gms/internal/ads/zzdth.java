package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdth implements zza, zzbop, zzo, zzbor, zzz {

    /* renamed from: a */
    private zza f33037a;

    /* renamed from: c */
    private zzbop f33038c;

    /* renamed from: d */
    private zzo f33039d;

    /* renamed from: f */
    private zzbor f33040f;

    /* renamed from: g */
    private zzz f33041g;

    private zzdth() {
    }

    /* synthetic */ zzdth(zzdtg zzdtg) {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized void m48126c(zza zza, zzbop zzbop, zzo zzo, zzbor zzbor, zzz zzz) {
        this.f33037a = zza;
        this.f33038c = zzbop;
        this.f33039d = zzo;
        this.f33040f = zzbor;
        this.f33041g = zzz;
    }

    /* renamed from: Z8 */
    public final synchronized void mo20216Z8() {
        zzo zzo = this.f33039d;
        if (zzo != null) {
            zzo.mo20216Z8();
        }
    }

    /* renamed from: b */
    public final synchronized void mo20217b() {
        zzo zzo = this.f33039d;
        if (zzo != null) {
            zzo.mo20217b();
        }
    }

    /* renamed from: f */
    public final synchronized void mo20242f() {
        zzz zzz = this.f33041g;
        if (zzz != null) {
            ((zzdti) zzz).f33042a.zzb();
        }
    }

    /* renamed from: h1 */
    public final synchronized void mo42868h1(String str, Bundle bundle) {
        zzbop zzbop = this.f33038c;
        if (zzbop != null) {
            zzbop.mo42868h1(str, bundle);
        }
    }

    public final synchronized void onAdClicked() {
        zza zza = this.f33037a;
        if (zza != null) {
            zza.onAdClicked();
        }
    }

    /* renamed from: sb */
    public final synchronized void mo20218sb() {
        zzo zzo = this.f33039d;
        if (zzo != null) {
            zzo.mo20218sb();
        }
    }

    /* renamed from: t1 */
    public final synchronized void mo20219t1() {
        zzo zzo = this.f33039d;
        if (zzo != null) {
            zzo.mo20219t1();
        }
    }

    /* renamed from: x0 */
    public final synchronized void mo42869x0(String str, @Nullable String str2) {
        zzbor zzbor = this.f33040f;
        if (zzbor != null) {
            zzbor.mo42869x0(str, str2);
        }
    }

    /* renamed from: y */
    public final synchronized void mo20220y(int i) {
        zzo zzo = this.f33039d;
        if (zzo != null) {
            zzo.mo20220y(i);
        }
    }

    public final synchronized void zzb() {
        zzo zzo = this.f33039d;
        if (zzo != null) {
            zzo.zzb();
        }
    }
}
