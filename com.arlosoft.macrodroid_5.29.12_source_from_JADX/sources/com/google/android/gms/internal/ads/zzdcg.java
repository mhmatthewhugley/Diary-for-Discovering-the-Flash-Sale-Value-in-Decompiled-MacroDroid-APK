package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdcg {

    /* renamed from: a */
    private final zzfih f32100a;

    /* renamed from: b */
    private final zzcgv f32101b;

    /* renamed from: c */
    private final ApplicationInfo f32102c;

    /* renamed from: d */
    private final String f32103d;

    /* renamed from: e */
    private final List f32104e;

    /* renamed from: f */
    private final PackageInfo f32105f;

    /* renamed from: g */
    private final zzgxc f32106g;

    /* renamed from: h */
    private final String f32107h;

    /* renamed from: i */
    private final zzevh f32108i;

    /* renamed from: j */
    private final zzg f32109j;

    public zzdcg(zzfih zzfih, zzcgv zzcgv, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, zzgxc zzgxc, zzg zzg, String str2, zzevh zzevh) {
        this.f32100a = zzfih;
        this.f32101b = zzcgv;
        this.f32102c = applicationInfo;
        this.f32103d = str;
        this.f32104e = list;
        this.f32105f = packageInfo;
        this.f32106g = zzgxc;
        this.f32107h = str2;
        this.f32108i = zzevh;
        this.f32109j = zzg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzcbc mo44550a(zzfzp zzfzp) throws Exception {
        return new zzcbc((Bundle) zzfzp.get(), this.f32101b, this.f32102c, this.f32103d, this.f32104e, this.f32105f, (String) ((zzfzp) this.f32106g.zzb()).get(), this.f32107h, (zzffx) null, (String) null, ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27188m6)).booleanValue() ? this.f32109j.mo20366e0() : false);
    }

    /* renamed from: b */
    public final zzfzp mo44551b() {
        zzfih zzfih = this.f32100a;
        return zzfhr.m50181c(this.f32108i.mo45481a(new Bundle()), zzfib.SIGNALS, zzfih).mo45742a();
    }

    /* renamed from: c */
    public final zzfzp mo44552c() {
        zzfzp b = mo44551b();
        return this.f32100a.mo45751a(zzfib.REQUEST_PARCEL, b, (zzfzp) this.f32106g.zzb()).mo45739a(new zzdcf(this, b)).mo45742a();
    }
}
