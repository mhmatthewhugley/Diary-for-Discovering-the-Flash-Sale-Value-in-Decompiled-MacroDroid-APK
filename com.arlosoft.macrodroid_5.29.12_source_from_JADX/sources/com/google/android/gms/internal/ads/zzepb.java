package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzepb implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzeou f34625a;

    /* renamed from: b */
    final /* synthetic */ zzfju f34626b;

    /* renamed from: c */
    final /* synthetic */ zzfjj f34627c;

    /* renamed from: d */
    final /* synthetic */ zzdnd f34628d;

    /* renamed from: e */
    final /* synthetic */ zzepc f34629e;

    zzepb(zzepc zzepc, zzeou zzeou, zzfju zzfju, zzfjj zzfjj, zzdnd zzdnd) {
        this.f34629e = zzepc;
        this.f34625a = zzeou;
        this.f34626b = zzfju;
        this.f34627c = zzfjj;
        this.f34628d = zzdnd;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        zzfju zzfju;
        zze a = this.f34628d.mo44246a().mo44524a(th);
        this.f34628d.mo44247b().mo44382r(a);
        this.f34629e.f34631b.mo44194b().execute(new zzepa(this, a));
        zzfez.m50042b(a.f1934a, th, "NativeAdLoader.onFailure");
        this.f34625a.zza();
        if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f34626b) == null) {
            zzfjw d = this.f34629e.f34634e;
            zzfjj zzfjj = this.f34627c;
            zzfjj.mo45803r(a);
            zzfjj.mo45801o0(false);
            d.mo45831b(zzfjj.mo45799h());
            return;
        }
        zzfju.mo45824c(a);
        zzfjj zzfjj2 = this.f34627c;
        zzfjj2.mo45801o0(false);
        zzfju.mo45822a(zzfjj2);
        zzfju.mo45828g();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        zzfju zzfju;
        zzcze zzcze = (zzcze) obj;
        synchronized (this.f34629e) {
            zzcze.mo44498e().mo44619a(this.f34629e.f34633d.mo45410d());
            this.f34625a.mo45391c(zzcze);
            this.f34629e.f34631b.mo44194b().execute(new zzeoz(this));
            if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f34626b) == null) {
                zzfjw d = this.f34629e.f34634e;
                zzfjj zzfjj = this.f34627c;
                zzfjj.mo45793a(zzcze.mo44500g().f35590b);
                zzfjj.mo45797f0(zzcze.mo44496c().mo19995f());
                zzfjj.mo45801o0(true);
                d.mo45831b(zzfjj.mo45799h());
            } else {
                zzfju.mo45827f(zzcze.mo44500g().f35590b);
                zzfju.mo45826e(zzcze.mo44496c().mo19995f());
                zzfjj zzfjj2 = this.f34627c;
                zzfjj2.mo45801o0(true);
                zzfju.mo45822a(zzfjj2);
                zzfju.mo45828g();
            }
        }
    }
}
