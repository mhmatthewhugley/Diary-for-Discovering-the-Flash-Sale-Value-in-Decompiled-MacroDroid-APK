package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbut {

    /* renamed from: a */
    private final zzbtw f27808a;

    /* renamed from: b */
    private zzfzp f27809b;

    zzbut(zzbtw zzbtw) {
        this.f27808a = zzbtw;
    }

    /* renamed from: d */
    private final void m44159d() {
        if (this.f27809b == null) {
            zzchh zzchh = new zzchh();
            this.f27809b = zzchh;
            this.f27808a.mo42989b((zzape) null).mo43584e(new zzbur(zzchh), new zzbus(zzchh));
        }
    }

    /* renamed from: a */
    public final zzbuw mo43002a(String str, zzbud zzbud, zzbuc zzbuc) {
        m44159d();
        return new zzbuw(this.f27809b, "google.afma.activeView.handleUpdate", zzbud, zzbuc);
    }

    /* renamed from: b */
    public final void mo43003b(String str, zzbpu zzbpu) {
        m44159d();
        this.f27809b = zzfzg.m51419n(this.f27809b, new zzbup(str, zzbpu), zzchc.f28461f);
    }

    /* renamed from: c */
    public final void mo43004c(String str, zzbpu zzbpu) {
        this.f27809b = zzfzg.m51418m(this.f27809b, new zzbuq(str, zzbpu), zzchc.f28461f);
    }
}
