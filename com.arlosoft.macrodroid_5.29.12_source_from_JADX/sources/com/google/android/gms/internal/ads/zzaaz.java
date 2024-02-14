package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaaz implements zzaal {

    /* renamed from: a */
    private final long f23786a;

    /* renamed from: b */
    final /* synthetic */ zzabc f23787b;

    public zzaaz(zzabc zzabc, long j) {
        this.f23787b = zzabc;
        this.f23786a = j;
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f23786a;
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        zzaaj a = this.f23787b.f23798g[0].mo41233a(j);
        int i = 1;
        while (true) {
            zzabc zzabc = this.f23787b;
            if (i >= zzabc.f23798g.length) {
                return a;
            }
            zzaaj a2 = zzabc.f23798g[i].mo41233a(j);
            if (a2.f23734a.f23740b < a.f23734a.f23740b) {
                a = a2;
            }
            i++;
        }
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return true;
    }
}
