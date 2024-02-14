package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.zza;
import com.google.android.play.core.internal.zzco;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzdz {

    /* renamed from: a */
    private final zzbh f51528a;

    /* renamed from: b */
    private final zzco f51529b;

    /* renamed from: c */
    private final zzde f51530c;

    /* renamed from: d */
    private final zzco f51531d;

    /* renamed from: e */
    private final zzco f51532e;

    /* renamed from: f */
    private final zza f51533f;

    /* renamed from: g */
    private final zzeb f51534g;

    zzdz(zzbh zzbh, zzco zzco, zzde zzde, zzco zzco2, zzco zzco3, zza zza, zzeb zzeb) {
        this.f51528a = zzbh;
        this.f51529b = zzco;
        this.f51530c = zzde;
        this.f51531d = zzco2;
        this.f51532e = zzco3;
        this.f51533f = zza;
        this.f51534g = zzeb;
    }

    /* renamed from: a */
    public final void mo59749a(zzdw zzdw) {
        File x = this.f51528a.mo59649x(zzdw.f51464b, zzdw.f51522c, zzdw.f51523d);
        File z = this.f51528a.mo59651z(zzdw.f51464b, zzdw.f51522c, zzdw.f51523d);
        if (!x.exists() || !z.exists()) {
            throw new zzck(String.format("Cannot find pack files to move for pack %s.", new Object[]{zzdw.f51464b}), zzdw.f51463a);
        }
        File v = this.f51528a.mo59647v(zzdw.f51464b, zzdw.f51522c, zzdw.f51523d);
        v.mkdirs();
        if (x.renameTo(v)) {
            new File(this.f51528a.mo59647v(zzdw.f51464b, zzdw.f51522c, zzdw.f51523d), "merge.tmp").delete();
            File w = this.f51528a.mo59648w(zzdw.f51464b, zzdw.f51522c, zzdw.f51523d);
            w.mkdirs();
            if (z.renameTo(w)) {
                if (this.f51533f.mo59791a("assetOnlyUpdates")) {
                    try {
                        this.f51534g.mo59752b(zzdw.f51464b, zzdw.f51522c, zzdw.f51523d, zzdw.f51524e);
                        ((Executor) this.f51531d.zza()).execute(new zzdy(this, zzdw));
                    } catch (IOException e) {
                        throw new zzck(String.format("Could not write asset pack version tag for pack %s: %s", new Object[]{zzdw.f51464b, e.getMessage()}), zzdw.f51463a);
                    }
                } else {
                    zzbh zzbh = this.f51528a;
                    zzbh.getClass();
                    ((Executor) this.f51531d.zza()).execute(new zzdx(zzbh));
                }
                this.f51530c.mo59722j(zzdw.f51464b, zzdw.f51522c, zzdw.f51523d);
                this.f51532e.mo59710c(zzdw.f51464b);
                ((zzy) this.f51529b.zza()).mo59605a(zzdw.f51463a, zzdw.f51464b);
                return;
            }
            throw new zzck("Cannot move metadata files to final location.", zzdw.f51463a);
        }
        throw new zzck("Cannot move merged pack files to final location.", zzdw.f51463a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo59750b(zzdw zzdw) {
        this.f51528a.mo59636b(zzdw.f51464b, zzdw.f51522c, zzdw.f51523d);
    }
}
