package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzayi implements zzaye {

    /* renamed from: a */
    private final zzaye[] f26263a;

    /* renamed from: c */
    private final ArrayList f26264c;

    /* renamed from: d */
    private final zzatg f26265d = new zzatg();

    /* renamed from: f */
    private zzayd f26266f;

    /* renamed from: g */
    private zzath f26267g;

    /* renamed from: o */
    private int f26268o = -1;

    /* renamed from: p */
    private zzayh f26269p;

    public zzayi(zzaye... zzayeArr) {
        this.f26263a = zzayeArr;
        this.f26264c = new ArrayList(Arrays.asList(zzayeArr));
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m42807b(zzayi zzayi, int i, zzath zzath, Object obj) {
        zzayh zzayh;
        if (zzayi.f26269p == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                zzath.mo41991g(i2, zzayi.f26265d, false);
            }
            int i3 = zzayi.f26268o;
            if (i3 == -1) {
                zzayi.f26268o = 1;
            } else if (i3 != 1) {
                zzayh = new zzayh(1);
                zzayi.f26269p = zzayh;
            }
            zzayh = null;
            zzayi.f26269p = zzayh;
        }
        if (zzayi.f26269p == null) {
            zzayi.f26264c.remove(zzayi.f26263a[i]);
            if (i == 0) {
                zzayi.f26267g = zzath;
            }
            if (zzayi.f26264c.isEmpty()) {
                zzayi.f26266f.mo41954b(zzayi.f26267g, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final zzayc mo42226a(int i, zzazp zzazp) {
        int length = this.f26263a.length;
        zzayc[] zzaycArr = new zzayc[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaycArr[i2] = this.f26263a[i2].mo42226a(i, zzazp);
        }
        return new zzayf(zzaycArr);
    }

    /* renamed from: c */
    public final void mo42227c(zzasm zzasm, boolean z, zzayd zzayd) {
        this.f26266f = zzayd;
        int i = 0;
        while (true) {
            zzaye[] zzayeArr = this.f26263a;
            if (i < zzayeArr.length) {
                zzayeArr[i].mo42227c(zzasm, false, new zzayg(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo42228d() {
        for (zzaye d : this.f26263a) {
            d.mo42228d();
        }
    }

    /* renamed from: e */
    public final void mo42229e(zzayc zzayc) {
        zzayf zzayf = (zzayf) zzayc;
        int i = 0;
        while (true) {
            zzaye[] zzayeArr = this.f26263a;
            if (i < zzayeArr.length) {
                zzayeArr[i].mo42229e(zzayf.f26254a[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void zza() throws IOException {
        zzayh zzayh = this.f26269p;
        if (zzayh == null) {
            for (zzaye zza : this.f26263a) {
                zza.zza();
            }
            return;
        }
        throw zzayh;
    }
}
