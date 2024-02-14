package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzejx implements zzehj {

    /* renamed from: a */
    private final Context f34229a;

    /* renamed from: b */
    private final zzdnd f34230b;

    /* renamed from: c */
    private final Executor f34231c;

    public zzejx(Context context, zzdnd zzdnd, Executor executor) {
        this.f34229a = context;
        this.f34230b = zzdnd;
        this.f34231c = executor;
    }

    /* renamed from: c */
    private static final boolean m48977c(zzfdw zzfdw, int i) {
        return zzfdw.f35589a.f35583a.f35632g.contains(Integer.toString(i));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45309a(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek, zzekr {
        zzdoq zzdoq;
        zzbvv b = ((zzffa) zzehf.f34016b).mo45646b();
        zzbvw c = ((zzffa) zzehf.f34016b).mo45647c();
        zzbvz g = ((zzffa) zzehf.f34016b).mo45651g();
        if (g != null && m48977c(zzfdw, 6)) {
            zzdoq = zzdoq.m47718a0(g);
        } else if (b != null && m48977c(zzfdw, 6)) {
            zzdoq = zzdoq.m47713E(b);
        } else if (b != null && m48977c(zzfdw, 2)) {
            zzdoq = zzdoq.m47711C(b);
        } else if (c != null && m48977c(zzfdw, 6)) {
            zzdoq = zzdoq.m47714F(c);
        } else if (c == null || !m48977c(zzfdw, 1)) {
            throw new zzekr(1, "No native ad mappers");
        } else {
            zzdoq = zzdoq.m47712D(c);
        }
        if (zzfdw.f35589a.f35583a.f35632g.contains(Integer.toString(zzdoq.mo44798K()))) {
            zzdos d = this.f34230b.mo44249d(new zzczt(zzfdw, zzfdk, zzehf.f34015a), new zzdpc(zzdoq), new zzdqq(c, b, g, (byte[]) null));
            ((zzeix) zzehf.f34017c).mo45330Kb(d.mo44279g());
            d.mo44277c().mo44629G0(new zzcuq((zzffa) zzehf.f34016b), this.f34231c);
            return d.mo44308h();
        }
        throw new zzekr(1, "No corresponding native ad listener");
    }

    /* renamed from: b */
    public final void mo45310b(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek {
        zzfef zzfef = zzfdw.f35589a.f35583a;
        ((zzffa) zzehf.f34016b).mo45662r(this.f34229a, zzfdw.f35589a.f35583a.f35629d, zzfdk.f35557w.toString(), zzbu.m2602l(zzfdk.f35554t), (zzbvq) zzehf.f34017c, zzfef.f35634i, zzfef.f35632g);
    }
}
