package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzit extends zzm implements zzhl {

    /* renamed from: j0 */
    public static final /* synthetic */ int f37502j0 = 0;

    /* renamed from: A */
    private final zzkn f37503A;

    /* renamed from: B */
    private final long f37504B;

    /* renamed from: C */
    private int f37505C;

    /* renamed from: D */
    private int f37506D;

    /* renamed from: E */
    private boolean f37507E;

    /* renamed from: F */
    private int f37508F;

    /* renamed from: G */
    private zzkd f37509G;

    /* renamed from: H */
    private zzcc f37510H;

    /* renamed from: I */
    private zzbm f37511I;

    /* renamed from: J */
    private zzbm f37512J;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: K */
    public zzaf f37513K;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: L */
    public zzaf f37514L;
    @Nullable

    /* renamed from: M */
    private AudioTrack f37515M;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: N */
    public Object f37516N;
    @Nullable

    /* renamed from: O */
    private Surface f37517O;

    /* renamed from: P */
    private int f37518P;

    /* renamed from: Q */
    private int f37519Q;

    /* renamed from: R */
    private int f37520R;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: S */
    public zzgs f37521S;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: T */
    public zzgs f37522T;

    /* renamed from: U */
    private int f37523U;

    /* renamed from: V */
    private zzk f37524V;

    /* renamed from: W */
    private float f37525W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f37526X;

    /* renamed from: Y */
    private zzdc f37527Y;

    /* renamed from: Z */
    private boolean f37528Z;

    /* renamed from: a0 */
    private boolean f37529a0;

    /* renamed from: b */
    final zzwa f37530b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public zzt f37531b0;

    /* renamed from: c */
    final zzcc f37532c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public zzda f37533c0;

    /* renamed from: d */
    private final zzdg f37534d;

    /* renamed from: d0 */
    private zzbm f37535d0;

    /* renamed from: e */
    private final Context f37536e;

    /* renamed from: e0 */
    private zzju f37537e0;

    /* renamed from: f */
    private final zzcg f37538f;

    /* renamed from: f0 */
    private int f37539f0;

    /* renamed from: g */
    private final zzka[] f37540g;

    /* renamed from: g0 */
    private long f37541g0;

    /* renamed from: h */
    private final zzvz f37542h;

    /* renamed from: h0 */
    private final zzhw f37543h0;

    /* renamed from: i */
    private final zzdn f37544i;

    /* renamed from: i0 */
    private zzuc f37545i0;

    /* renamed from: j */
    private final zzjd f37546j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final zzdt f37547k;

    /* renamed from: l */
    private final CopyOnWriteArraySet f37548l;

    /* renamed from: m */
    private final zzck f37549m;

    /* renamed from: n */
    private final List f37550n;

    /* renamed from: o */
    private final boolean f37551o;

    /* renamed from: p */
    private final zzsh f37552p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final zzko f37553q;

    /* renamed from: r */
    private final Looper f37554r;

    /* renamed from: s */
    private final zzwh f37555s;

    /* renamed from: t */
    private final zzde f37556t;

    /* renamed from: u */
    private final zzip f37557u;

    /* renamed from: v */
    private final zzir f37558v;

    /* renamed from: w */
    private final zzgm f37559w;

    /* renamed from: x */
    private final zzgq f37560x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final zzkl f37561y;

    /* renamed from: z */
    private final zzkm f37562z;

    static {
        zzbh.m43425b("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzwg, java.lang.Object, com.google.android.gms.internal.ads.zzko] */
    public zzit(zzhk zzhk, @Nullable zzcg zzcg) {
        zznb a;
        zzit zzit = this;
        zzhk zzhk2 = zzhk;
        zzcg zzcg2 = zzcg;
        zzdg zzdg = new zzdg(zzde.f32179a);
        zzit.f37534d = zzdg;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzen.f34504e;
            zzdw.m48254d("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "]");
            Context applicationContext = zzhk2.f37445a.getApplicationContext();
            zzit.f37536e = applicationContext;
            ? apply = zzhk2.f37452h.apply(zzhk2.f37446b);
            zzit.f37553q = apply;
            zzit.f37524V = zzhk2.f37454j;
            zzit.f37518P = zzhk2.f37455k;
            zzit.f37526X = false;
            zzit.f37504B = zzhk2.f37459o;
            zzip zzip = new zzip(zzit, (zzio) null);
            zzit.f37557u = zzip;
            zzir zzir = new zzir((zziq) null);
            zzit.f37558v = zzir;
            Handler handler = new Handler(zzhk2.f37453i);
            Handler handler2 = handler;
            zzka[] a2 = ((zzhe) zzhk2.f37447c).f37439a.mo43954a(handler, zzip, zzip, zzip, zzip);
            zzit.f37540g = a2;
            int length = a2.length;
            zzvz zzvz = (zzvz) zzhk2.f37449e.zza();
            zzit.f37542h = zzvz;
            zzit.f37552p = zzhk.m53680a(((zzhf) zzhk2.f37448d).f37440a);
            zzwl c = zzwl.m55263c(((zzhi) zzhk2.f37451g).f37443a);
            zzit.f37555s = c;
            zzit.f37551o = zzhk2.f37456l;
            zzit.f37509G = zzhk2.f37457m;
            Looper looper = zzhk2.f37453i;
            zzit.f37554r = looper;
            zzde zzde = zzhk2.f37446b;
            zzit.f37556t = zzde;
            zzit.f37538f = zzcg2;
            zzdt zzdt = new zzdt(looper, zzde, new zzhv(zzit));
            zzit.f37547k = zzdt;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            zzit.f37548l = copyOnWriteArraySet;
            zzit.f37550n = new ArrayList();
            zzir zzir2 = zzir;
            zzit.f37545i0 = new zzuc(0);
            int length2 = a2.length;
            CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
            zzdt zzdt2 = zzdt;
            zzip zzip2 = zzip;
            zzwa zzwa = new zzwa(new zzkc[2], new zzvt[2], zzcy.f31829b, (Object) null);
            zzit.f37530b = zzwa;
            zzit.f37549m = new zzck();
            zzca zzca = new zzca();
            zzdg zzdg2 = zzdg;
            zzca.mo43243c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zzvz.mo48311c();
            zzca.mo43244d(29, true);
            zzcc e = zzca.mo43245e();
            zzit.f37532c = e;
            zzca zzca2 = new zzca();
            zzca2.mo43242b(e);
            zzca2.mo43241a(4);
            zzca2.mo43241a(10);
            zzit.f37510H = zzca2.mo43245e();
            zzit.f37544i = zzde.mo44586a(looper, (Handler.Callback) null);
            zzhw zzhw = new zzhw(zzit);
            zzit.f37543h0 = zzhw;
            zzit.f37537e0 = zzju.m53968g(zzwa);
            apply.mo47829z(zzcg2, looper);
            int i = zzen.f34500a;
            if (i < 31) {
                a = new zznb();
            } else {
                a = zzii.m53701a(applicationContext, zzit, zzhk2.f37460p);
            }
            zznb zznb = a;
            zzjh zzjh = (zzjh) zzhk2.f37450f.zza();
            zzkd zzkd = zzit.f37509G;
            zzgv zzgv = zzhk2.f37462r;
            int i2 = i;
            try {
                long j = zzhk2.f37458n;
                zzir zzir3 = zzir2;
                CopyOnWriteArraySet copyOnWriteArraySet3 = copyOnWriteArraySet2;
                zzjd zzjd = r7;
                zzwa zzwa2 = zzwa;
                Looper looper2 = looper;
                zzwl zzwl = c;
                zzvz zzvz2 = zzvz;
                zzdt zzdt3 = zzdt2;
                zzip zzip3 = zzip2;
                zzjd zzjd2 = new zzjd(a2, zzvz, zzwa2, zzjh, c, 0, false, apply, zzkd, zzgv, j, false, looper2, zzde, zzhw, zznb, (byte[]) null);
                zzit = this;
                zzit.f37546j = zzjd;
                zzit.f37525W = 1.0f;
                zzbm zzbm = zzbm.f27537v;
                zzit.f37511I = zzbm;
                zzit.f37512J = zzbm;
                zzit.f37535d0 = zzbm;
                zzit.f37539f0 = -1;
                if (i2 < 21) {
                    AudioTrack audioTrack = zzit.f37515M;
                    if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                        zzit.f37515M.release();
                        zzit.f37515M = null;
                    }
                    if (zzit.f37515M == null) {
                        zzit.f37515M = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                    }
                    zzit.f37523U = zzit.f37515M.getAudioSessionId();
                } else {
                    zzit.f37523U = zzen.m49144S(applicationContext);
                }
                zzit.f37527Y = new zzdc(zzfvn.m51135w(), 0);
                zzit.f37528Z = true;
                Objects.requireNonNull(apply);
                zzdt3.mo44966b(apply);
                zzwl.mo48336a(new Handler(looper2), apply);
                zzip zzip4 = zzip3;
                copyOnWriteArraySet3.add(zzip4);
                zzhk zzhk3 = zzhk;
                Handler handler3 = handler2;
                zzit.f37559w = new zzgm(zzhk3.f37445a, handler3, zzip4);
                zzit.f37560x = new zzgq(zzhk3.f37445a, handler3, zzip4);
                zzen.m49181t((Object) null, (Object) null);
                zzkl zzkl = new zzkl(zzhk3.f37445a, handler3, zzip4);
                zzit.f37561y = zzkl;
                int i3 = zzit.f37524V.f37730a;
                zzkl.mo47805f(3);
                zzit.f37562z = new zzkm(zzhk3.f37445a);
                zzit.f37503A = new zzkn(zzhk3.f37445a);
                zzit.f37531b0 = m53746d0(zzkl);
                zzit.f37533c0 = zzda.f31939e;
                zzvz2.mo48310b(zzit.f37524V);
                zzit.m53750h0(1, 10, Integer.valueOf(zzit.f37523U));
                zzit.m53750h0(2, 10, Integer.valueOf(zzit.f37523U));
                zzit.m53750h0(1, 3, zzit.f37524V);
                zzit.m53750h0(2, 4, Integer.valueOf(zzit.f37518P));
                zzit.m53750h0(2, 5, 0);
                zzit.m53750h0(1, 9, Boolean.valueOf(zzit.f37526X));
                zzir zzir4 = zzir3;
                zzit.m53750h0(2, 7, zzir4);
                zzit.m53750h0(6, 8, zzir4);
                zzdg2.mo44618e();
            } catch (Throwable th) {
                th = th;
                zzit = this;
                zzit.f37534d.mo44618e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zzit.f37534d.mo44618e();
            throw th;
        }
    }

    /* renamed from: E */
    static /* bridge */ /* synthetic */ void m53734E(zzit zzit, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzit.m53752j0(surface);
        zzit.f37517O = surface;
    }

    /* renamed from: X */
    private final int m53740X() {
        if (this.f37537e0.f37692a.mo44135o()) {
            return this.f37539f0;
        }
        zzju zzju = this.f37537e0;
        return zzju.f37692a.mo44134n(zzju.f37693b.f27569a, this.f37549m).f28721c;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static int m53741Y(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: Z */
    private final long m53742Z(zzju zzju) {
        if (zzju.f37692a.mo44135o()) {
            return zzen.m49163f0(this.f37541g0);
        }
        if (zzju.f37693b.mo42817b()) {
            return zzju.f37709r;
        }
        zzcn zzcn = zzju.f37692a;
        zzsi zzsi = zzju.f37693b;
        long j = zzju.f37709r;
        m53744b0(zzcn, zzsi, j);
        return j;
    }

    /* renamed from: a0 */
    private static long m53743a0(zzju zzju) {
        zzcm zzcm = new zzcm();
        zzck zzck = new zzck();
        zzju.f37692a.mo44134n(zzju.f37693b.f27569a, zzck);
        long j = zzju.f37694c;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzju.f37692a.mo43603e(zzck.f28721c, zzcm, 0).f28945k;
        return 0;
    }

    /* renamed from: b0 */
    private final long m53744b0(zzcn zzcn, zzsi zzsi, long j) {
        zzcn.mo44134n(zzsi.f27569a, this.f37549m);
        return j;
    }

    @Nullable
    /* renamed from: c0 */
    private final Pair m53745c0(zzcn zzcn, int i, long j) {
        if (zzcn.mo44135o()) {
            this.f37539f0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f37541g0 = j;
            return null;
        }
        if (i == -1 || i >= zzcn.mo43601c()) {
            i = zzcn.mo44126g(false);
            long j2 = zzcn.mo43603e(i, this.f37841a, 0).f28945k;
            j = zzen.m49171j0(0);
        }
        return zzcn.mo44132l(this.f37841a, this.f37549m, i, zzen.m49163f0(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public static zzt m53746d0(zzkl zzkl) {
        return new zzt(0, zzkl.mo47803b(), zzkl.mo47802a());
    }

    /* renamed from: e0 */
    private final zzju m53747e0(zzju zzju, zzcn zzcn, @Nullable Pair pair) {
        zzsi zzsi;
        zzuh zzuh;
        zzwa zzwa;
        zzsi zzsi2;
        List list;
        int i;
        zzju zzju2;
        long j;
        zzcn zzcn2 = zzcn;
        Pair pair2 = pair;
        zzdd.m47210d(zzcn.mo44135o() || pair2 != null);
        zzcn zzcn3 = zzju.f37692a;
        zzju f = zzju.mo47755f(zzcn);
        if (zzcn.mo44135o()) {
            zzsi h = zzju.m53969h();
            long f0 = zzen.m49163f0(this.f37541g0);
            zzju a = f.mo47751b(h, f0, f0, f0, 0, zzuh.f38622d, this.f37530b, zzfvn.m51135w()).mo47750a(h);
            a.f37707p = a.f37709r;
            return a;
        }
        Object obj = f.f37693b.f27569a;
        int i2 = zzen.f34500a;
        boolean z = !obj.equals(pair2.first);
        if (z) {
            zzsi = new zzsi(pair2.first);
        } else {
            zzsi = f.f37693b;
        }
        zzsi zzsi3 = zzsi;
        long longValue = ((Long) pair2.second).longValue();
        long f02 = zzen.m49163f0(mo43520i());
        if (!zzcn3.mo44135o()) {
            zzcn3.mo44134n(obj, this.f37549m);
        }
        if (z || longValue < f02) {
            zzsi zzsi4 = zzsi3;
            zzdd.m47212f(!zzsi4.mo42817b());
            if (z) {
                zzuh = zzuh.f38622d;
            } else {
                zzuh = f.f37699h;
            }
            zzuh zzuh2 = zzuh;
            if (z) {
                zzsi2 = zzsi4;
                zzwa = this.f37530b;
            } else {
                zzsi2 = zzsi4;
                zzwa = f.f37700i;
            }
            zzwa zzwa2 = zzwa;
            if (z) {
                list = zzfvn.m51135w();
            } else {
                list = f.f37701j;
            }
            zzju a2 = f.mo47751b(zzsi2, longValue, longValue, longValue, 0, zzuh2, zzwa2, list).mo47750a(zzsi2);
            a2.f37707p = longValue;
            return a2;
        }
        if (i == 0) {
            int a3 = zzcn2.mo43599a(f.f37702k.f27569a);
            if (a3 != -1 && zzcn2.mo43602d(a3, this.f37549m, false).f28721c == zzcn2.mo44134n(zzsi3.f27569a, this.f37549m).f28721c) {
                return f;
            }
            zzcn2.mo44134n(zzsi3.f27569a, this.f37549m);
            if (zzsi3.mo42817b()) {
                j = this.f37549m.mo43854g(zzsi3.f27570b, zzsi3.f27571c);
            } else {
                j = this.f37549m.f28722d;
            }
            zzju2 = f.mo47751b(zzsi3, f.f37709r, f.f37709r, f.f37695d, j - f.f37709r, f.f37699h, f.f37700i, f.f37701j).mo47750a(zzsi3);
            zzju2.f37707p = j;
        } else {
            zzsi zzsi5 = zzsi3;
            zzdd.m47212f(!zzsi5.mo42817b());
            long max = Math.max(0, f.f37708q - (longValue - f02));
            long j2 = f.f37707p;
            if (f.f37702k.equals(f.f37693b)) {
                j2 = longValue + max;
            }
            zzju2 = f.mo47751b(zzsi5, longValue, longValue, longValue, max, f.f37699h, f.f37700i, f.f37701j);
            zzju2.f37707p = j2;
        }
        return zzju2;
    }

    /* renamed from: f0 */
    private final zzjx m53748f0(zzjw zzjw) {
        int X = m53740X();
        zzjd zzjd = this.f37546j;
        return new zzjx(zzjd, zzjw, this.f37537e0.f37692a, X == -1 ? 0 : X, this.f37556t, zzjd.mo47675R());
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m53749g0(int i, int i2) {
        if (i != this.f37519Q || i2 != this.f37520R) {
            this.f37519Q = i;
            this.f37520R = i2;
            zzdt zzdt = this.f37547k;
            zzdt.mo44968d(24, new zzhz(i, i2));
            zzdt.mo44967c();
        }
    }

    /* renamed from: h0 */
    private final void m53750h0(int i, int i2, @Nullable Object obj) {
        zzka[] zzkaArr = this.f37540g;
        int length = zzkaArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzka zzka = zzkaArr[i3];
            if (zzka.zzb() == i) {
                zzjx f0 = m53748f0(zzka);
                f0.mo47761f(i2);
                f0.mo47760e(obj);
                f0.mo47759d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m53751i0() {
        m53750h0(1, 2, Float.valueOf(this.f37525W * this.f37560x.mo47143a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m53752j0(@Nullable Object obj) {
        boolean z;
        ArrayList<zzjx> arrayList = new ArrayList<>();
        zzka[] zzkaArr = this.f37540g;
        int length = zzkaArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            zzka zzka = zzkaArr[i];
            if (zzka.zzb() == 2) {
                zzjx f0 = m53748f0(zzka);
                f0.mo47761f(1);
                f0.mo47760e(obj);
                f0.mo47759d();
                arrayList.add(f0);
            }
            i++;
        }
        Object obj2 = this.f37516N;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (zzjx i2 : arrayList) {
                    i2.mo47764i(this.f37504B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f37516N;
            Surface surface = this.f37517O;
            if (obj3 == surface) {
                surface.release();
                this.f37517O = null;
            }
        }
        this.f37516N = obj;
        if (z) {
            m53753k0(false, zzha.m53677d(new zzjf(3), 1003));
        }
    }

    /* renamed from: k0 */
    private final void m53753k0(boolean z, @Nullable zzha zzha) {
        zzju zzju = this.f37537e0;
        zzju a = zzju.mo47750a(zzju.f37693b);
        a.f37707p = a.f37709r;
        a.f37708q = 0;
        zzju e = a.mo47754e(1);
        if (zzha != null) {
            e = e.mo47753d(zzha);
        }
        zzju zzju2 = e;
        this.f37505C++;
        this.f37546j.mo47680Z();
        m53755m0(zzju2, 0, 1, false, zzju2.f37692a.mo44135o() && !this.f37537e0.f37692a.mo44135o(), 4, m53742Z(zzju2), -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public final void m53754l0(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzju zzju = this.f37537e0;
        if (zzju.f37703l != z2 || zzju.f37704m != i3) {
            this.f37505C++;
            zzju c = zzju.mo47752c(z2, i3);
            this.f37546j.mo47679Y(z2, i3);
            m53755m0(c, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02aa  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m53755m0(com.google.android.gms.internal.ads.zzju r44, int r45, int r46, boolean r47, boolean r48, int r49, long r50, int r52) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            r2 = r49
            com.google.android.gms.internal.ads.zzju r3 = r0.f37537e0
            r0.f37537e0 = r1
            com.google.android.gms.internal.ads.zzcn r4 = r3.f37692a
            com.google.android.gms.internal.ads.zzcn r5 = r1.f37692a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.zzcn r6 = r3.f37692a
            com.google.android.gms.internal.ads.zzcn r7 = r1.f37692a
            boolean r8 = r7.mo44135o()
            r10 = 3
            r11 = 0
            r12 = 0
            r14 = -1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            if (r8 == 0) goto L_0x0036
            boolean r8 = r6.mo44135o()
            if (r8 == 0) goto L_0x0036
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r15)
            goto L_0x00c0
        L_0x0036:
            boolean r8 = r7.mo44135o()
            boolean r9 = r6.mo44135o()
            if (r8 == r9) goto L_0x004d
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x004d:
            com.google.android.gms.internal.ads.zzsi r8 = r3.f37693b
            java.lang.Object r8 = r8.f27569a
            com.google.android.gms.internal.ads.zzck r9 = r0.f37549m
            com.google.android.gms.internal.ads.zzck r8 = r6.mo44134n(r8, r9)
            int r8 = r8.f28721c
            com.google.android.gms.internal.ads.zzcm r9 = r0.f37841a
            com.google.android.gms.internal.ads.zzcm r6 = r6.mo43603e(r8, r9, r12)
            java.lang.Object r6 = r6.f28935a
            com.google.android.gms.internal.ads.zzsi r8 = r1.f37693b
            java.lang.Object r8 = r8.f27569a
            com.google.android.gms.internal.ads.zzck r9 = r0.f37549m
            com.google.android.gms.internal.ads.zzck r8 = r7.mo44134n(r8, r9)
            int r8 = r8.f28721c
            com.google.android.gms.internal.ads.zzcm r9 = r0.f37841a
            com.google.android.gms.internal.ads.zzcm r7 = r7.mo43603e(r8, r9, r12)
            java.lang.Object r7 = r7.f28935a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            if (r48 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0081
            r4 = 1
            goto L_0x008a
        L_0x0081:
            if (r48 == 0) goto L_0x0087
            if (r2 != r5) goto L_0x0087
            r4 = 2
            goto L_0x008a
        L_0x0087:
            if (r4 == 0) goto L_0x0097
            r4 = 3
        L_0x008a:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00c0
        L_0x0097:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009d:
            if (r48 == 0) goto L_0x00b9
            if (r2 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzsi r4 = r3.f37693b
            long r6 = r4.f27572d
            com.google.android.gms.internal.ads.zzsi r4 = r1.f37693b
            long r8 = r4.f27572d
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b9
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x00b9:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r15)
        L_0x00c0:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzbm r7 = r0.f37511I
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzcn r9 = r1.f37692a
            boolean r9 = r9.mo44135o()
            if (r9 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzcn r9 = r1.f37692a
            com.google.android.gms.internal.ads.zzsi r15 = r1.f37693b
            java.lang.Object r15 = r15.f27569a
            com.google.android.gms.internal.ads.zzck r8 = r0.f37549m
            com.google.android.gms.internal.ads.zzck r8 = r9.mo44134n(r15, r8)
            int r8 = r8.f28721c
            com.google.android.gms.internal.ads.zzcn r9 = r1.f37692a
            com.google.android.gms.internal.ads.zzcm r15 = r0.f37841a
            com.google.android.gms.internal.ads.zzcm r8 = r9.mo43603e(r8, r15, r12)
            com.google.android.gms.internal.ads.zzbg r8 = r8.f28936b
            goto L_0x00f6
        L_0x00f5:
            r8 = 0
        L_0x00f6:
            com.google.android.gms.internal.ads.zzbm r9 = com.google.android.gms.internal.ads.zzbm.f27537v
            r0.f37535d0 = r9
            goto L_0x00fc
        L_0x00fb:
            r8 = 0
        L_0x00fc:
            if (r6 != 0) goto L_0x0108
            java.util.List r9 = r3.f37701j
            java.util.List r15 = r1.f37701j
            boolean r9 = r9.equals(r15)
            if (r9 != 0) goto L_0x0161
        L_0x0108:
            com.google.android.gms.internal.ads.zzbm r7 = r0.f37535d0
            com.google.android.gms.internal.ads.zzbk r7 = r7.mo42754a()
            java.util.List r9 = r1.f37701j
            r15 = 0
        L_0x0111:
            int r10 = r9.size()
            if (r15 >= r10) goto L_0x0133
            java.lang.Object r10 = r9.get(r15)
            com.google.android.gms.internal.ads.zzbq r10 = (com.google.android.gms.internal.ads.zzbq) r10
            r14 = 0
        L_0x011e:
            int r11 = r10.mo42875a()
            if (r14 >= r11) goto L_0x012e
            com.google.android.gms.internal.ads.zzbp r11 = r10.mo42876b(r14)
            r11.mo41259Q1(r7)
            int r14 = r14 + 1
            goto L_0x011e
        L_0x012e:
            int r15 = r15 + 1
            r11 = 0
            r14 = -1
            goto L_0x0111
        L_0x0133:
            com.google.android.gms.internal.ads.zzbm r7 = r7.mo42709L()
            r0.f37535d0 = r7
            com.google.android.gms.internal.ads.zzcn r7 = r43.mo43525n()
            boolean r9 = r7.mo44135o()
            if (r9 == 0) goto L_0x0146
            com.google.android.gms.internal.ads.zzbm r7 = r0.f37535d0
            goto L_0x0161
        L_0x0146:
            int r9 = r43.mo43514c()
            com.google.android.gms.internal.ads.zzcm r10 = r0.f37841a
            com.google.android.gms.internal.ads.zzcm r7 = r7.mo43603e(r9, r10, r12)
            com.google.android.gms.internal.ads.zzbg r7 = r7.f28936b
            com.google.android.gms.internal.ads.zzbm r9 = r0.f37535d0
            com.google.android.gms.internal.ads.zzbk r9 = r9.mo42754a()
            com.google.android.gms.internal.ads.zzbm r7 = r7.f26762e
            r9.mo42711r(r7)
            com.google.android.gms.internal.ads.zzbm r7 = r9.mo42709L()
        L_0x0161:
            com.google.android.gms.internal.ads.zzbm r9 = r0.f37511I
            boolean r9 = r7.equals(r9)
            r9 = r9 ^ r5
            r0.f37511I = r7
            boolean r7 = r3.f37703l
            boolean r10 = r1.f37703l
            int r11 = r3.f37696e
            int r14 = r1.f37696e
            if (r11 != r14) goto L_0x0176
            if (r7 == r10) goto L_0x0179
        L_0x0176:
            r43.m53756n0()
        L_0x0179:
            boolean r15 = r3.f37698g
            boolean r5 = r1.f37698g
            com.google.android.gms.internal.ads.zzcn r12 = r3.f37692a
            com.google.android.gms.internal.ads.zzcn r13 = r1.f37692a
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0197
            com.google.android.gms.internal.ads.zzdt r12 = r0.f37547k
            com.google.android.gms.internal.ads.zzib r13 = new com.google.android.gms.internal.ads.zzib
            r18 = r7
            r7 = r45
            r13.<init>(r1, r7)
            r7 = 0
            r12.mo44968d(r7, r13)
            goto L_0x0199
        L_0x0197:
            r18 = r7
        L_0x0199:
            if (r48 == 0) goto L_0x02cc
            com.google.android.gms.internal.ads.zzck r7 = new com.google.android.gms.internal.ads.zzck
            r7.<init>()
            com.google.android.gms.internal.ads.zzcn r12 = r3.f37692a
            boolean r12 = r12.mo44135o()
            if (r12 != 0) goto L_0x01de
            com.google.android.gms.internal.ads.zzsi r12 = r3.f37693b
            java.lang.Object r12 = r12.f27569a
            com.google.android.gms.internal.ads.zzcn r13 = r3.f37692a
            r13.mo44134n(r12, r7)
            int r13 = r7.f28721c
            r17 = r10
            com.google.android.gms.internal.ads.zzcn r10 = r3.f37692a
            int r10 = r10.mo43599a(r12)
            r45 = r10
            com.google.android.gms.internal.ads.zzcn r10 = r3.f37692a
            r48 = r12
            com.google.android.gms.internal.ads.zzcm r12 = r0.f37841a
            r19 = r14
            r20 = r15
            r14 = 0
            com.google.android.gms.internal.ads.zzcm r10 = r10.mo43603e(r13, r12, r14)
            java.lang.Object r10 = r10.f28935a
            com.google.android.gms.internal.ads.zzcm r12 = r0.f37841a
            com.google.android.gms.internal.ads.zzbg r12 = r12.f28936b
            r26 = r45
            r25 = r48
            r22 = r10
            r24 = r12
            r23 = r13
            goto L_0x01ee
        L_0x01de:
            r17 = r10
            r19 = r14
            r20 = r15
            r23 = r52
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = -1
        L_0x01ee:
            if (r2 != 0) goto L_0x0218
            com.google.android.gms.internal.ads.zzsi r10 = r3.f37693b
            boolean r10 = r10.mo42817b()
            if (r10 == 0) goto L_0x0207
            com.google.android.gms.internal.ads.zzsi r10 = r3.f37693b
            int r12 = r10.f27570b
            int r10 = r10.f27571c
            long r12 = r7.mo43854g(r12, r10)
            long r14 = m53743a0(r3)
            goto L_0x022a
        L_0x0207:
            com.google.android.gms.internal.ads.zzsi r10 = r3.f37693b
            int r10 = r10.f27573e
            r12 = -1
            if (r10 == r12) goto L_0x0215
            com.google.android.gms.internal.ads.zzju r7 = r0.f37537e0
            long r12 = m53743a0(r7)
            goto L_0x0229
        L_0x0215:
            long r12 = r7.f28722d
            goto L_0x0229
        L_0x0218:
            com.google.android.gms.internal.ads.zzsi r7 = r3.f37693b
            boolean r7 = r7.mo42817b()
            if (r7 == 0) goto L_0x0227
            long r12 = r3.f37709r
            long r14 = m53743a0(r3)
            goto L_0x022a
        L_0x0227:
            long r12 = r3.f37709r
        L_0x0229:
            r14 = r12
        L_0x022a:
            com.google.android.gms.internal.ads.zzcf r7 = new com.google.android.gms.internal.ads.zzcf
            long r27 = com.google.android.gms.internal.ads.zzen.m49171j0(r12)
            com.google.android.gms.internal.ads.zzsi r10 = r3.f37693b
            long r29 = com.google.android.gms.internal.ads.zzen.m49171j0(r14)
            int r12 = r10.f27570b
            int r10 = r10.f27571c
            r21 = r7
            r31 = r12
            r32 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31, r32)
            int r10 = r43.mo43514c()
            com.google.android.gms.internal.ads.zzju r12 = r0.f37537e0
            com.google.android.gms.internal.ads.zzcn r12 = r12.f37692a
            boolean r12 = r12.mo44135o()
            if (r12 != 0) goto L_0x0285
            com.google.android.gms.internal.ads.zzju r12 = r0.f37537e0
            com.google.android.gms.internal.ads.zzsi r13 = r12.f37693b
            java.lang.Object r13 = r13.f27569a
            com.google.android.gms.internal.ads.zzcn r12 = r12.f37692a
            com.google.android.gms.internal.ads.zzck r14 = r0.f37549m
            r12.mo44134n(r13, r14)
            com.google.android.gms.internal.ads.zzju r12 = r0.f37537e0
            com.google.android.gms.internal.ads.zzcn r12 = r12.f37692a
            int r12 = r12.mo43599a(r13)
            com.google.android.gms.internal.ads.zzju r14 = r0.f37537e0
            com.google.android.gms.internal.ads.zzcn r14 = r14.f37692a
            com.google.android.gms.internal.ads.zzcm r15 = r0.f37841a
            r45 = r12
            r16 = r13
            r12 = 0
            com.google.android.gms.internal.ads.zzcm r12 = r14.mo43603e(r10, r15, r12)
            java.lang.Object r12 = r12.f28935a
            com.google.android.gms.internal.ads.zzcm r13 = r0.f37841a
            com.google.android.gms.internal.ads.zzbg r13 = r13.f28936b
            r36 = r45
            r32 = r12
            r34 = r13
            r35 = r16
            goto L_0x028d
        L_0x0285:
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = -1
        L_0x028d:
            long r37 = com.google.android.gms.internal.ads.zzen.m49171j0(r50)
            com.google.android.gms.internal.ads.zzcf r12 = new com.google.android.gms.internal.ads.zzcf
            com.google.android.gms.internal.ads.zzju r13 = r0.f37537e0
            com.google.android.gms.internal.ads.zzsi r13 = r13.f37693b
            boolean r13 = r13.mo42817b()
            if (r13 == 0) goto L_0x02aa
            com.google.android.gms.internal.ads.zzju r13 = r0.f37537e0
            long r13 = m53743a0(r13)
            long r13 = com.google.android.gms.internal.ads.zzen.m49171j0(r13)
            r39 = r13
            goto L_0x02ac
        L_0x02aa:
            r39 = r37
        L_0x02ac:
            com.google.android.gms.internal.ads.zzju r13 = r0.f37537e0
            com.google.android.gms.internal.ads.zzsi r13 = r13.f37693b
            int r14 = r13.f27570b
            int r13 = r13.f27571c
            r31 = r12
            r33 = r10
            r41 = r14
            r42 = r13
            r31.<init>(r32, r33, r34, r35, r36, r37, r39, r41, r42)
            com.google.android.gms.internal.ads.zzdt r10 = r0.f37547k
            com.google.android.gms.internal.ads.zzih r13 = new com.google.android.gms.internal.ads.zzih
            r13.<init>(r2, r7, r12)
            r2 = 11
            r10.mo44968d(r2, r13)
            goto L_0x02d2
        L_0x02cc:
            r17 = r10
            r19 = r14
            r20 = r15
        L_0x02d2:
            if (r6 == 0) goto L_0x02df
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzhm r6 = new com.google.android.gms.internal.ads.zzhm
            r6.<init>(r8, r4)
            r4 = 1
            r2.mo44968d(r4, r6)
        L_0x02df:
            com.google.android.gms.internal.ads.zzha r2 = r3.f37697f
            com.google.android.gms.internal.ads.zzha r4 = r1.f37697f
            if (r2 == r4) goto L_0x02ff
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzhn r4 = new com.google.android.gms.internal.ads.zzhn
            r4.<init>(r1)
            r6 = 10
            r2.mo44968d(r6, r4)
            com.google.android.gms.internal.ads.zzha r2 = r1.f37697f
            if (r2 == 0) goto L_0x02ff
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzho r4 = new com.google.android.gms.internal.ads.zzho
            r4.<init>(r1)
            r2.mo44968d(r6, r4)
        L_0x02ff:
            com.google.android.gms.internal.ads.zzwa r2 = r3.f37700i
            com.google.android.gms.internal.ads.zzwa r4 = r1.f37700i
            if (r2 == r4) goto L_0x0317
            com.google.android.gms.internal.ads.zzvz r2 = r0.f37542h
            java.lang.Object r4 = r4.f38765e
            r2.mo48321e(r4)
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzhp r4 = new com.google.android.gms.internal.ads.zzhp
            r4.<init>(r1)
            r6 = 2
            r2.mo44968d(r6, r4)
        L_0x0317:
            if (r9 == 0) goto L_0x0327
            com.google.android.gms.internal.ads.zzbm r2 = r0.f37511I
            com.google.android.gms.internal.ads.zzdt r4 = r0.f37547k
            com.google.android.gms.internal.ads.zzhq r6 = new com.google.android.gms.internal.ads.zzhq
            r6.<init>(r2)
            r2 = 14
            r4.mo44968d(r2, r6)
        L_0x0327:
            r2 = r20
            if (r2 == r5) goto L_0x0336
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzhr r4 = new com.google.android.gms.internal.ads.zzhr
            r4.<init>(r1)
            r5 = 3
            r2.mo44968d(r5, r4)
        L_0x0336:
            r2 = r19
            r5 = r17
            r4 = r18
            if (r11 != r2) goto L_0x0340
            if (r4 == r5) goto L_0x034b
        L_0x0340:
            com.google.android.gms.internal.ads.zzdt r6 = r0.f37547k
            com.google.android.gms.internal.ads.zzhs r7 = new com.google.android.gms.internal.ads.zzhs
            r7.<init>(r1)
            r8 = -1
            r6.mo44968d(r8, r7)
        L_0x034b:
            if (r11 == r2) goto L_0x0358
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzht r6 = new com.google.android.gms.internal.ads.zzht
            r6.<init>(r1)
            r7 = 4
            r2.mo44968d(r7, r6)
        L_0x0358:
            if (r4 == r5) goto L_0x0367
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzic r4 = new com.google.android.gms.internal.ads.zzic
            r5 = r46
            r4.<init>(r1, r5)
            r5 = 5
            r2.mo44968d(r5, r4)
        L_0x0367:
            int r2 = r3.f37704m
            int r4 = r1.f37704m
            if (r2 == r4) goto L_0x0378
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzid r4 = new com.google.android.gms.internal.ads.zzid
            r4.<init>(r1)
            r5 = 6
            r2.mo44968d(r5, r4)
        L_0x0378:
            boolean r2 = m53758p0(r3)
            boolean r4 = m53758p0(r44)
            if (r2 == r4) goto L_0x038d
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzie r4 = new com.google.android.gms.internal.ads.zzie
            r4.<init>(r1)
            r5 = 7
            r2.mo44968d(r5, r4)
        L_0x038d:
            com.google.android.gms.internal.ads.zzby r2 = r3.f37705n
            com.google.android.gms.internal.ads.zzby r4 = r1.f37705n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x03a3
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzif r4 = new com.google.android.gms.internal.ads.zzif
            r4.<init>(r1)
            r5 = 12
            r2.mo44968d(r5, r4)
        L_0x03a3:
            if (r47 == 0) goto L_0x03ad
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzig r4 = com.google.android.gms.internal.ads.zzig.f37489a
            r5 = -1
            r2.mo44968d(r5, r4)
        L_0x03ad:
            com.google.android.gms.internal.ads.zzcc r2 = r0.f37510H
            com.google.android.gms.internal.ads.zzcg r4 = r0.f37538f
            com.google.android.gms.internal.ads.zzcc r5 = r0.f37532c
            com.google.android.gms.internal.ads.zzcc r4 = com.google.android.gms.internal.ads.zzen.m49164g(r4, r5)
            r0.f37510H = r4
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03cb
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            com.google.android.gms.internal.ads.zzhu r4 = new com.google.android.gms.internal.ads.zzhu
            r4.<init>(r0)
            r5 = 13
            r2.mo44968d(r5, r4)
        L_0x03cb:
            com.google.android.gms.internal.ads.zzdt r2 = r0.f37547k
            r2.mo44967c()
            boolean r2 = r3.f37706o
            boolean r3 = r1.f37706o
            if (r2 == r3) goto L_0x03ee
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.f37548l
            java.util.Iterator r2 = r2.iterator()
        L_0x03dc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ee
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzhb r3 = (com.google.android.gms.internal.ads.zzhb) r3
            boolean r4 = r1.f37706o
            r3.mo47619O(r4)
            goto L_0x03dc
        L_0x03ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzit.m53755m0(com.google.android.gms.internal.ads.zzju, int, int, boolean, boolean, int, long, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public final void m53756n0() {
        int e = mo43516e();
        if (e == 2 || e == 3) {
            m53757o0();
            boolean z = this.f37537e0.f37706o;
            mo43528s();
            mo43528s();
        }
    }

    /* renamed from: o0 */
    private final void m53757o0() {
        IllegalStateException illegalStateException;
        this.f37534d.mo44615b();
        if (Thread.currentThread() != this.f37554r.getThread()) {
            String i = zzen.m49168i("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f37554r.getThread().getName());
            if (!this.f37528Z) {
                if (this.f37529a0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzdw.m48256f("ExoPlayerImpl", i, illegalStateException);
                this.f37529a0 = true;
                return;
            }
            throw new IllegalStateException(i);
        }
    }

    /* renamed from: p0 */
    private static boolean m53758p0(zzju zzju) {
        return zzju.f37696e == 3 && zzju.f37703l && zzju.f37704m == 0;
    }

    /* renamed from: I */
    public final void mo47650I(zzkr zzkr) {
        zzko zzko = this.f37553q;
        Objects.requireNonNull(zzkr);
        zzko.mo47807B(zzkr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo47651J(zzjb zzjb) {
        long j;
        boolean z;
        long j2;
        int i = this.f37505C - zzjb.f37575c;
        this.f37505C = i;
        boolean z2 = true;
        if (zzjb.f37576d) {
            this.f37506D = zzjb.f37577e;
            this.f37507E = true;
        }
        if (zzjb.f37578f) {
            this.f37508F = zzjb.f37579g;
        }
        if (i == 0) {
            zzcn zzcn = zzjb.f37574b.f37692a;
            if (!this.f37537e0.f37692a.mo44135o() && zzcn.mo44135o()) {
                this.f37539f0 = -1;
                this.f37541g0 = 0;
            }
            if (!zzcn.mo44135o()) {
                List y = ((zzjy) zzcn).mo47766y();
                zzdd.m47212f(y.size() == this.f37550n.size());
                for (int i2 = 0; i2 < y.size(); i2++) {
                    ((zzis) this.f37550n.get(i2)).f37501b = (zzcn) y.get(i2);
                }
            }
            if (this.f37507E) {
                if (zzjb.f37574b.f37693b.equals(this.f37537e0.f37693b) && zzjb.f37574b.f37695d == this.f37537e0.f37709r) {
                    z2 = false;
                }
                if (z2) {
                    if (zzcn.mo44135o() || zzjb.f37574b.f37693b.mo42817b()) {
                        j2 = zzjb.f37574b.f37695d;
                    } else {
                        zzju zzju = zzjb.f37574b;
                        zzsi zzsi = zzju.f37693b;
                        j2 = zzju.f37695d;
                        m53744b0(zzcn, zzsi, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f37507E = false;
            m53755m0(zzjb.f37574b, 1, this.f37508F, false, z, this.f37506D, j, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo47652K(zzjb zzjb) {
        this.f37544i.mo44716h(new zzhx(this, zzjb));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo47653L(zzcd zzcd) {
        zzcd.mo43368D0(this.f37510H);
    }

    /* renamed from: N */
    public final void mo47654N() {
        m53757o0();
        boolean s = mo43528s();
        int i = 2;
        int b = this.f37560x.mo47144b(s, 2);
        m53754l0(s, b, m53741Y(s, b));
        zzju zzju = this.f37537e0;
        if (zzju.f37696e == 1) {
            zzju d = zzju.mo47753d((zzha) null);
            if (true == d.f37692a.mo44135o()) {
                i = 4;
            }
            zzju e = d.mo47754e(i);
            this.f37505C++;
            this.f37546j.mo47677W();
            m53755m0(e, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: O */
    public final void mo47655O() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzen.f34504e;
        String a = zzbh.m43424a();
        zzdw.m48254d("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "] [" + a + "]");
        m53757o0();
        if (zzen.f34500a < 21 && (audioTrack = this.f37515M) != null) {
            audioTrack.release();
            this.f37515M = null;
        }
        this.f37561y.mo47804e();
        this.f37560x.mo47145d();
        if (!this.f37546j.mo47681a0()) {
            zzdt zzdt = this.f37547k;
            zzdt.mo44968d(10, zzhy.f37477a);
            zzdt.mo44967c();
        }
        this.f37547k.mo44969e();
        this.f37544i.mo44713a((Object) null);
        this.f37555s.mo48337b(this.f37553q);
        zzju e = this.f37537e0.mo47754e(1);
        this.f37537e0 = e;
        zzju a2 = e.mo47750a(e.f37693b);
        this.f37537e0 = a2;
        a2.f37707p = a2.f37709r;
        this.f37537e0.f37708q = 0;
        this.f37553q.mo47808C();
        this.f37542h.mo48309a();
        Surface surface = this.f37517O;
        if (surface != null) {
            surface.release();
            this.f37517O = null;
        }
        this.f37527Y = new zzdc(zzfvn.m51135w(), 0);
    }

    /* renamed from: P */
    public final void mo47656P(zzkr zzkr) {
        this.f37553q.mo47815e(zzkr);
    }

    /* renamed from: Q */
    public final void mo47657Q(zzsk zzsk) {
        m53757o0();
        List singletonList = Collections.singletonList(zzsk);
        m53757o0();
        m53757o0();
        m53740X();
        mo43521j();
        this.f37505C++;
        if (!this.f37550n.isEmpty()) {
            int size = this.f37550n.size();
            for (int i = size - 1; i >= 0; i--) {
                this.f37550n.remove(i);
            }
            this.f37545i0 = this.f37545i0.mo48257h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzjr zzjr = new zzjr((zzsk) singletonList.get(i2), this.f37551o);
            arrayList.add(zzjr);
            this.f37550n.add(i2, new zzis(zzjr.f37675b, zzjr.f37674a.mo48156A()));
        }
        this.f37545i0 = this.f37545i0.mo48256g(0, arrayList.size());
        zzjy zzjy = new zzjy(this.f37550n, this.f37545i0, (byte[]) null);
        if (zzjy.mo44135o() || zzjy.mo43601c() >= 0) {
            int g = zzjy.mo44126g(false);
            zzju e0 = m53747e0(this.f37537e0, zzjy, m53745c0(zzjy, g, -9223372036854775807L));
            int i3 = e0.f37696e;
            if (!(g == -1 || i3 == 1)) {
                i3 = (zzjy.mo44135o() || g >= zzjy.mo43601c()) ? 4 : 2;
            }
            zzju e = e0.mo47754e(i3);
            this.f37546j.mo47683b0(arrayList, g, zzen.m49163f0(-9223372036854775807L), this.f37545i0);
            m53755m0(e, 0, 1, false, !this.f37537e0.f37693b.f27569a.equals(e.f37693b.f27569a) && !this.f37537e0.f37692a.mo44135o(), 4, m53742Z(e), -1);
            return;
        }
        throw new zzag(zzjy, -1, -9223372036854775807L);
    }

    /* renamed from: R */
    public final void mo47658R(boolean z) {
        m53757o0();
        int b = this.f37560x.mo47144b(z, mo43516e());
        m53754l0(z, b, m53741Y(z, b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo47659S(boolean z) {
        this.f37528Z = false;
    }

    /* renamed from: T */
    public final void mo47660T(@Nullable Surface surface) {
        m53757o0();
        m53752j0(surface);
        int i = surface == null ? 0 : -1;
        m53749g0(i, i);
    }

    /* renamed from: U */
    public final void mo47661U(float f) {
        m53757o0();
        float A = zzen.m49126A(f, 0.0f, 1.0f);
        if (this.f37525W != A) {
            this.f37525W = A;
            m53751i0();
            zzdt zzdt = this.f37547k;
            zzdt.mo44968d(22, new zzia(A));
            zzdt.mo44967c();
        }
    }

    /* renamed from: V */
    public final void mo47662V() {
        m53757o0();
        m53757o0();
        this.f37560x.mo47144b(mo43528s(), 1);
        m53753k0(false, (zzha) null);
        this.f37527Y = new zzdc(zzfvn.m51135w(), this.f37537e0.f37709r);
    }

    /* renamed from: b */
    public final int mo43513b() {
        m53757o0();
        if (mo43526p()) {
            return this.f37537e0.f37693b.f27571c;
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo43514c() {
        m53757o0();
        int X = m53740X();
        if (X == -1) {
            return 0;
        }
        return X;
    }

    /* renamed from: d */
    public final int mo43515d() {
        m53757o0();
        if (mo43526p()) {
            return this.f37537e0.f37693b.f27570b;
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo43516e() {
        m53757o0();
        return this.f37537e0.f37696e;
    }

    /* renamed from: f */
    public final int mo43517f() {
        m53757o0();
        if (this.f37537e0.f37692a.mo44135o()) {
            return 0;
        }
        zzju zzju = this.f37537e0;
        return zzju.f37692a.mo43599a(zzju.f37693b.f27569a);
    }

    /* renamed from: g */
    public final int mo43518g() {
        m53757o0();
        return this.f37537e0.f37704m;
    }

    /* renamed from: h */
    public final int mo43519h() {
        m53757o0();
        return 0;
    }

    /* renamed from: i */
    public final long mo43520i() {
        m53757o0();
        if (!mo43526p()) {
            return mo43521j();
        }
        zzju zzju = this.f37537e0;
        zzju.f37692a.mo44134n(zzju.f37693b.f27569a, this.f37549m);
        zzju zzju2 = this.f37537e0;
        if (zzju2.f37694c != -9223372036854775807L) {
            return zzen.m49171j0(0) + zzen.m49171j0(this.f37537e0.f37694c);
        }
        long j = zzju2.f37692a.mo43603e(mo43514c(), this.f37841a, 0).f28945k;
        return zzen.m49171j0(0);
    }

    /* renamed from: j */
    public final long mo43521j() {
        m53757o0();
        return zzen.m49171j0(m53742Z(this.f37537e0));
    }

    /* renamed from: k */
    public final long mo43522k() {
        m53757o0();
        return zzen.m49171j0(this.f37537e0.f37708q);
    }

    /* renamed from: l */
    public final zzcy mo43523l() {
        m53757o0();
        return this.f37537e0.f37700i.f38764d;
    }

    /* renamed from: m */
    public final void mo43524m(int i, long j) {
        int i2 = i;
        long j2 = j;
        m53757o0();
        this.f37553q.mo47809D();
        zzcn zzcn = this.f37537e0.f37692a;
        if (i2 < 0 || (!zzcn.mo44135o() && i2 >= zzcn.mo43601c())) {
            throw new zzag(zzcn, i, j2);
        }
        int i3 = 1;
        this.f37505C++;
        if (mo43526p()) {
            zzdw.m48255e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzjb zzjb = new zzjb(this.f37537e0);
            zzjb.mo47671a(1);
            this.f37543h0.f37474a.mo47652K(zzjb);
            return;
        }
        if (mo43516e() != 1) {
            i3 = 2;
        }
        int c = mo43514c();
        zzju e0 = m53747e0(this.f37537e0.mo47754e(i3), zzcn, m53745c0(zzcn, i, j2));
        this.f37546j.mo47678X(zzcn, i, zzen.m49163f0(j));
        m53755m0(e0, 0, 1, true, true, 1, m53742Z(e0), c);
    }

    /* renamed from: n */
    public final zzcn mo43525n() {
        m53757o0();
        return this.f37537e0.f37692a;
    }

    @Nullable
    /* renamed from: o */
    public final zzha mo47663o() {
        m53757o0();
        return this.f37537e0.f37697f;
    }

    /* renamed from: p */
    public final boolean mo43526p() {
        m53757o0();
        return this.f37537e0.f37693b.mo42817b();
    }

    /* renamed from: q */
    public final boolean mo43527q() {
        m53757o0();
        return false;
    }

    /* renamed from: r0 */
    public final int mo47664r0() {
        m53757o0();
        int length = this.f37540g.length;
        return 2;
    }

    /* renamed from: s */
    public final boolean mo43528s() {
        m53757o0();
        return this.f37537e0.f37703l;
    }

    /* renamed from: s0 */
    public final long mo47665s0() {
        m53757o0();
        if (mo43526p()) {
            zzju zzju = this.f37537e0;
            if (zzju.f37702k.equals(zzju.f37693b)) {
                return zzen.m49171j0(this.f37537e0.f37707p);
            }
            return mo47666t0();
        }
        m53757o0();
        if (this.f37537e0.f37692a.mo44135o()) {
            return this.f37541g0;
        }
        zzju zzju2 = this.f37537e0;
        long j = 0;
        if (zzju2.f37702k.f27572d != zzju2.f37693b.f27572d) {
            return zzen.m49171j0(zzju2.f37692a.mo43603e(mo43514c(), this.f37841a, 0).f28946l);
        }
        long j2 = zzju2.f37707p;
        if (this.f37537e0.f37702k.mo42817b()) {
            zzju zzju3 = this.f37537e0;
            zzju3.f37692a.mo44134n(zzju3.f37702k.f27569a, this.f37549m).mo43855h(this.f37537e0.f37702k.f27570b);
        } else {
            j = j2;
        }
        zzju zzju4 = this.f37537e0;
        m53744b0(zzju4.f37692a, zzju4.f37702k, j);
        return zzen.m49171j0(j);
    }

    /* renamed from: t0 */
    public final long mo47666t0() {
        m53757o0();
        if (!mo43526p()) {
            zzcn n = mo43525n();
            if (n.mo44135o()) {
                return -9223372036854775807L;
            }
            return zzen.m49171j0(n.mo43603e(mo43514c(), this.f37841a, 0).f28946l);
        }
        zzju zzju = this.f37537e0;
        zzsi zzsi = zzju.f37693b;
        zzju.f37692a.mo44134n(zzsi.f27569a, this.f37549m);
        return zzen.m49171j0(this.f37549m.mo43854g(zzsi.f27570b, zzsi.f27571c));
    }
}
