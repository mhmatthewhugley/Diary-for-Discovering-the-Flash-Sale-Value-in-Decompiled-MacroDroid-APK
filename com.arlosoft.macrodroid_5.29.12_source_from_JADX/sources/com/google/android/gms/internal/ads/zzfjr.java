package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfjr implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzfju f35917a;

    /* renamed from: b */
    final /* synthetic */ zzfjj f35918b;

    /* renamed from: c */
    final /* synthetic */ boolean f35919c;

    zzfjr(zzfju zzfju, zzfjj zzfjj, boolean z) {
        this.f35917a = zzfju;
        this.f35918b = zzfjj;
        this.f35919c = z;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        zzfjj zzfjj = this.f35918b;
        if (zzfjj.mo45795e()) {
            zzfju zzfju = this.f35917a;
            zzfjj.mo45801o0(false);
            zzfju.mo45822a(zzfjj);
            if (this.f35919c) {
                this.f35917a.mo45828g();
            }
        }
    }

    /* renamed from: c */
    public final void mo20700c(Object obj) {
        zzfju zzfju = this.f35917a;
        zzfjj zzfjj = this.f35918b;
        zzfjj.mo45801o0(true);
        zzfju.mo45822a(zzfjj);
        if (this.f35919c) {
            this.f35917a.mo45828g();
        }
    }
}
