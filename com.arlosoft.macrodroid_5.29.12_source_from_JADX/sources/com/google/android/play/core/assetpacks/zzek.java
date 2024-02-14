package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.zzco;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzek {

    /* renamed from: a */
    private final zzbh f51572a;

    /* renamed from: b */
    private final zzco f51573b;

    /* renamed from: c */
    private final zzde f51574c;

    /* renamed from: d */
    private final zzco f51575d;

    /* renamed from: e */
    private final zzco f51576e;

    zzek(zzbh zzbh, zzco zzco, zzde zzde, zzco zzco2, zzco zzco3) {
        this.f51572a = zzbh;
        this.f51573b = zzco;
        this.f51574c = zzde;
        this.f51575d = zzco2;
        this.f51576e = zzco3;
    }

    /* renamed from: a */
    public final void mo59756a(zzei zzei) {
        File v = this.f51572a.mo59647v(zzei.f51464b, zzei.f51567c, zzei.f51569e);
        if (v.exists()) {
            File v2 = this.f51572a.mo59647v(zzei.f51464b, zzei.f51568d, zzei.f51569e);
            v2.mkdirs();
            if (v.renameTo(v2)) {
                ((Executor) this.f51575d.zza()).execute(new zzej(this, zzei));
                this.f51574c.mo59722j(zzei.f51464b, zzei.f51568d, zzei.f51569e);
                this.f51576e.mo59710c(zzei.f51464b);
                ((zzy) this.f51573b.zza()).mo59605a(zzei.f51463a, zzei.f51464b);
                return;
            }
            throw new zzck(String.format("Cannot promote pack %s from %s to %s", new Object[]{zzei.f51464b, v.getAbsolutePath(), v2.getAbsolutePath()}), zzei.f51463a);
        }
        throw new zzck(String.format("Cannot find pack files to promote for pack %s at %s", new Object[]{zzei.f51464b, v.getAbsolutePath()}), zzei.f51463a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo59757b(zzei zzei) {
        this.f51572a.mo59636b(zzei.f51464b, zzei.f51568d, zzei.f51569e);
    }
}
