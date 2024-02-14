package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzmq extends zzmo {
    zzmq() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ int mo51559a(Object obj) {
        return ((zzmp) obj).mo51568a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ int mo51560b(Object obj) {
        return ((zzmp) obj).mo51569b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo51561c(Object obj) {
        zzkf zzkf = (zzkf) obj;
        zzmp zzmp = zzkf.zzc;
        if (zzmp != zzmp.m60784c()) {
            return zzmp;
        }
        zzmp f = zzmp.m60786f();
        zzkf.zzc = f;
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Object mo51562d(Object obj) {
        return ((zzkf) obj).zzc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo51563e(Object obj, Object obj2) {
        if (zzmp.m60784c().equals(obj2)) {
            return obj;
        }
        if (zzmp.m60784c().equals(obj)) {
            return zzmp.m60785e((zzmp) obj, (zzmp) obj2);
        }
        ((zzmp) obj).mo51570d((zzmp) obj2);
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo51564f(Object obj, int i, long j) {
        ((zzmp) obj).mo51576j(i << 3, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo51565g(Object obj) {
        ((zzkf) obj).zzc.mo51573h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo51566h(Object obj, Object obj2) {
        ((zzkf) obj).zzc = (zzmp) obj2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo51567i(Object obj, zzng zzng) throws IOException {
        ((zzmp) obj).mo51577k(zzng);
    }
}
