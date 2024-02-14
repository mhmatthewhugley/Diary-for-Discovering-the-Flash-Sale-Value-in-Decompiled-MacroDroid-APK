package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaya implements zzaye, zzayd {

    /* renamed from: A */
    private zzath f26243A;

    /* renamed from: B */
    private boolean f26244B;

    /* renamed from: a */
    private final Uri f26245a;

    /* renamed from: c */
    private final zzazl f26246c;

    /* renamed from: d */
    private final zzavb f26247d;

    /* renamed from: f */
    private final int f26248f;

    /* renamed from: g */
    private final Handler f26249g;

    /* renamed from: o */
    private final zzaxz f26250o;

    /* renamed from: p */
    private final zzatf f26251p = new zzatf();

    /* renamed from: s */
    private final int f26252s;

    /* renamed from: z */
    private zzayd f26253z;

    public zzaya(Uri uri, zzazl zzazl, zzavb zzavb, int i, Handler handler, zzaxz zzaxz, String str, int i2) {
        this.f26245a = uri;
        this.f26246c = zzazl;
        this.f26247d = zzavb;
        this.f26248f = i;
        this.f26249g = handler;
        this.f26250o = zzaxz;
        this.f26252s = i2;
    }

    /* renamed from: a */
    public final zzayc mo42226a(int i, zzazp zzazp) {
        zzbac.m42924c(i == 0);
        return new zzaxy(this.f26245a, this.f26246c.zza(), this.f26247d.zza(), this.f26248f, this.f26249g, this.f26250o, this, zzazp, (String) null, this.f26252s, (byte[]) null);
    }

    /* renamed from: b */
    public final void mo41954b(zzath zzath, Object obj) {
        zzatf zzatf = this.f26251p;
        boolean z = false;
        zzath.mo41988d(0, zzatf, false);
        if (zzatf.f25541c != -9223372036854775807L) {
            z = true;
        }
        if (!this.f26244B || z) {
            this.f26243A = zzath;
            this.f26244B = z;
            this.f26253z.mo41954b(zzath, (Object) null);
        }
    }

    /* renamed from: c */
    public final void mo42227c(zzasm zzasm, boolean z, zzayd zzayd) {
        this.f26253z = zzayd;
        zzayr zzayr = new zzayr(-9223372036854775807L, false);
        this.f26243A = zzayr;
        zzayd.mo41954b(zzayr, (Object) null);
    }

    /* renamed from: d */
    public final void mo42228d() {
        this.f26253z = null;
    }

    /* renamed from: e */
    public final void mo42229e(zzayc zzayc) {
        ((zzaxy) zzayc).mo42207E();
    }

    public final void zza() throws IOException {
    }
}
