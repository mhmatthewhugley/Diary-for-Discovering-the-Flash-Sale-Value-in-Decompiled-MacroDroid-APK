package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzedt {

    /* renamed from: a */
    private final zzfzq f33763a;

    /* renamed from: b */
    private final zzeda f33764b;

    /* renamed from: c */
    private final zzgxc f33765c;

    public zzedt(zzfzq zzfzq, zzeda zzeda, zzgxc zzgxc) {
        this.f33763a = zzfzq;
        this.f33764b = zzeda;
        this.f33765c = zzgxc;
    }

    /* renamed from: g */
    private final zzfzp m48629g(zzcbc zzcbc, zzeds zzeds, zzeds zzeds2, zzfyn zzfyn) {
        zzfzp zzfzp;
        String str = zzcbc.f28125f;
        zzt.m2905r();
        if (zzs.m2748V(str)) {
            zzfzp = zzfzg.m51413h(new zzedj(1));
        } else {
            zzfzp = zzfzg.m51412g(zzeds.mo45185a(zzcbc), ExecutionException.class, zzedk.f33752a, this.f33763a);
        }
        return zzfzg.m51412g(zzfzg.m51419n(zzfyx.m51389C(zzfzp), zzfyn, this.f33763a), zzedj.class, new zzedr(this, zzeds2, zzcbc, zzfyn), this.f33763a);
    }

    /* renamed from: a */
    public final zzfzp mo45186a(zzcbc zzcbc) {
        return m48629g(zzcbc, new zzedp(this.f33764b), new zzedq(this), new zzedo(zzcbc));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzfzp mo45187b(zzeds zzeds, zzcbc zzcbc, zzfyn zzfyn, zzedj zzedj) throws Exception {
        return zzfzg.m51419n(zzeds.mo45185a(zzcbc), zzfyn, this.f33763a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45188c(zzcbc zzcbc) {
        return ((zzeek) this.f33765c.zzb()).mo45211Jb(zzcbc, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ zzfzp mo45189d(zzcbc zzcbc) {
        String str;
        zzeda zzeda = this.f33764b;
        if (((Boolean) zzbky.f27480d.mo42728e()).booleanValue()) {
            str = zzcbc.f28129s;
        } else {
            str = zzcbc.f28120A;
        }
        return zzeda.mo45181c(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ zzfzp mo45190e(zzcbc zzcbc) {
        String str;
        zzeek zzeek = (zzeek) this.f33765c.zzb();
        if (((Boolean) zzbky.f27480d.mo42728e()).booleanValue()) {
            str = zzcbc.f28129s;
        } else {
            str = zzcbc.f28120A;
        }
        return zzeek.mo45214Mb(str);
    }

    /* renamed from: f */
    public final zzfzp mo45191f(zzcbc zzcbc) {
        if (zzaqh.m42134g(zzcbc.f28120A)) {
            return zzfzg.m51413h(new zzebh(2, "Pool key missing from removeUrl call."));
        }
        return m48629g(zzcbc, new zzedm(this), new zzedn(this), zzedl.f33753a);
    }
}
