package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzasq {

    /* renamed from: a */
    public final zzayc f25436a;

    /* renamed from: b */
    public final Object f25437b;

    /* renamed from: c */
    public final int f25438c;

    /* renamed from: d */
    public final zzayo[] f25439d = new zzayo[2];

    /* renamed from: e */
    public final boolean[] f25440e = new boolean[2];

    /* renamed from: f */
    public final long f25441f;

    /* renamed from: g */
    public int f25442g;

    /* renamed from: h */
    public long f25443h;

    /* renamed from: i */
    public boolean f25444i;

    /* renamed from: j */
    public boolean f25445j;

    /* renamed from: k */
    public boolean f25446k;

    /* renamed from: l */
    public zzasq f25447l;

    /* renamed from: m */
    public zzazi f25448m;

    /* renamed from: n */
    private final zzatb[] f25449n;

    /* renamed from: o */
    private final zzatc[] f25450o;

    /* renamed from: p */
    private final zzazh f25451p;

    /* renamed from: q */
    private final zzaye f25452q;

    /* renamed from: r */
    private zzazi f25453r;

    /* renamed from: s */
    private final zzcjv f25454s;

    public zzasq(zzatb[] zzatbArr, zzatc[] zzatcArr, long j, zzazh zzazh, zzcjv zzcjv, zzaye zzaye, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.f25449n = zzatbArr;
        this.f25450o = zzatcArr;
        this.f25441f = j;
        this.f25451p = zzazh;
        this.f25454s = zzcjv;
        this.f25452q = zzaye;
        Objects.requireNonNull(obj);
        this.f25437b = obj;
        this.f25438c = i;
        this.f25442g = i2;
        this.f25444i = z;
        this.f25443h = j2;
        this.f25436a = zzaye.mo42226a(i2, zzcjv.mo43846l());
    }

    /* renamed from: a */
    public final long mo41938a(long j, boolean z) {
        return mo41939b(j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo41939b(long j, boolean z, boolean[] zArr) {
        zzazf zzazf = this.f25448m.f26346b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.f25440e;
            if (z || !this.f25448m.mo42280a(this.f25453r, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long c = this.f25436a.mo42209c(zzazf.mo42275b(), this.f25440e, this.f25439d, zArr, j);
        this.f25453r = this.f25448m;
        this.f25446k = false;
        int i2 = 0;
        while (true) {
            zzayo[] zzayoArr = this.f25439d;
            if (i2 < 2) {
                if (zzayoArr[i2] != null) {
                    zzbac.m42926e(zzazf.mo42274a(i2) != null);
                    this.f25446k = true;
                } else {
                    zzbac.m42926e(zzazf.mo42274a(i2) == null);
                }
                i2++;
            } else {
                this.f25454s.mo43838d(this.f25449n, this.f25448m.f26345a, zzazf);
                return c;
            }
        }
    }

    /* renamed from: c */
    public final void mo41940c() {
        try {
            this.f25452q.mo42229e(this.f25436a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    /* renamed from: d */
    public final boolean mo41941d() {
        return this.f25445j && (!this.f25446k || this.f25436a.mo42212f() == Long.MIN_VALUE);
    }

    /* renamed from: e */
    public final boolean mo41942e() throws zzasi {
        zzazi a = this.f25451p.mo42271a(this.f25450o, this.f25436a.mo42219n());
        zzazi zzazi = this.f25453r;
        if (zzazi != null) {
            int i = 0;
            while (i < 2) {
                if (a.mo42280a(zzazi, i)) {
                    i++;
                }
            }
            return false;
        }
        this.f25448m = a;
        return true;
    }
}
