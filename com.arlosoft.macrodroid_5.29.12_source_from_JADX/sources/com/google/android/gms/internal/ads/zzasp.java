package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzasp implements zzasm {

    /* renamed from: a */
    private final zzatb[] f25415a;

    /* renamed from: b */
    private final zzazh f25416b;

    /* renamed from: c */
    private final zzazf f25417c;

    /* renamed from: d */
    private final Handler f25418d;

    /* renamed from: e */
    private final zzasu f25419e;

    /* renamed from: f */
    private final CopyOnWriteArraySet f25420f = new CopyOnWriteArraySet();

    /* renamed from: g */
    private final zzatg f25421g;

    /* renamed from: h */
    private final zzatf f25422h;

    /* renamed from: i */
    private boolean f25423i;

    /* renamed from: j */
    private boolean f25424j = false;

    /* renamed from: k */
    private int f25425k = 1;

    /* renamed from: l */
    private int f25426l;

    /* renamed from: m */
    private int f25427m;

    /* renamed from: n */
    private boolean f25428n;

    /* renamed from: o */
    private zzath f25429o;

    /* renamed from: p */
    private Object f25430p;

    /* renamed from: q */
    private zzayt f25431q;

    /* renamed from: r */
    private zzazf f25432r;

    /* renamed from: s */
    private zzata f25433s;

    /* renamed from: t */
    private zzasr f25434t;

    /* renamed from: u */
    private long f25435u;

    public zzasp(zzatb[] zzatbArr, zzazh zzazh, zzcjv zzcjv, byte[] bArr) {
        String str = zzbar.f26422e;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + str + "]");
        this.f25415a = zzatbArr;
        Objects.requireNonNull(zzazh);
        this.f25416b = zzazh;
        zzazf zzazf = new zzazf(new zzayx[2], (byte[]) null);
        this.f25417c = zzazf;
        this.f25429o = zzath.f25543a;
        this.f25421g = new zzatg();
        this.f25422h = new zzatf();
        this.f25431q = zzayt.f26314d;
        this.f25432r = zzazf;
        this.f25433s = zzata.f25533d;
        zzaso zzaso = new zzaso(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f25418d = zzaso;
        zzasr zzasr = new zzasr(0, 0);
        this.f25434t = zzasr;
        this.f25419e = new zzasu(zzatbArr, zzazh, zzcjv, this.f25424j, 0, zzaso, zzasr, this, (byte[]) null);
    }

    /* renamed from: E */
    public final void mo41917E(int i) {
        this.f25419e.mo41961y(i);
    }

    /* renamed from: F */
    public final void mo41918F(long j) {
        mo41936b();
        if (this.f25429o.mo41992h() || this.f25429o.mo41987c() > 0) {
            this.f25426l++;
            if (!this.f25429o.mo41992h()) {
                this.f25429o.mo41991g(0, this.f25421g, false);
                long a = zzash.m42273a(j);
                long j2 = this.f25429o.mo41988d(0, this.f25422h, false).f25541c;
                if (j2 != -9223372036854775807L) {
                    int i = (a > j2 ? 1 : (a == j2 ? 0 : -1));
                }
            }
            this.f25435u = j;
            this.f25419e.mo41945C(this.f25429o, 0, zzash.m42273a(j));
            Iterator it = this.f25420f.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).mo41911b();
            }
            return;
        }
        throw new zzasy(this.f25429o, 0, j);
    }

    /* renamed from: G */
    public final void mo41919G(boolean z) {
        if (this.f25424j != z) {
            this.f25424j = z;
            this.f25419e.mo41949G(z);
            Iterator it = this.f25420f.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).mo41914p(z, this.f25425k);
            }
        }
    }

    /* renamed from: H */
    public final void mo41920H(zzasj zzasj) {
        this.f25420f.add(zzasj);
    }

    /* renamed from: I */
    public final void mo41921I(zzasl... zzaslArr) {
        this.f25419e.mo41946D(zzaslArr);
    }

    /* renamed from: J */
    public final void mo41922J(zzaye zzaye) {
        if (!this.f25429o.mo41992h() || this.f25430p != null) {
            this.f25429o = zzath.f25543a;
            this.f25430p = null;
            Iterator it = this.f25420f.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).mo41916s(this.f25429o, this.f25430p);
            }
        }
        if (this.f25423i) {
            this.f25423i = false;
            this.f25431q = zzayt.f26314d;
            this.f25432r = this.f25417c;
            this.f25416b.mo42272b((Object) null);
            Iterator it2 = this.f25420f.iterator();
            while (it2.hasNext()) {
                ((zzasj) it2.next()).mo41915q(this.f25431q, this.f25432r);
            }
        }
        this.f25427m++;
        this.f25419e.mo41943A(zzaye, true);
    }

    /* renamed from: K */
    public final void mo41923K(zzasj zzasj) {
        this.f25420f.remove(zzasj);
    }

    /* renamed from: L */
    public final void mo41924L(int i) {
        this.f25419e.mo41947E(i);
    }

    /* renamed from: M */
    public final void mo41925M(zzasl... zzaslArr) {
        if (!this.f25419e.mo41952J()) {
            this.f25419e.mo41959w(zzaslArr);
        } else if (!this.f25419e.mo41951I(zzaslArr)) {
            Iterator it = this.f25420f.iterator();
            while (it.hasNext()) {
                ((zzasj) it.next()).mo41913o(zzasi.m42277c(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    /* renamed from: N */
    public final void mo41926N(int i) {
        this.f25419e.mo41948F(i);
    }

    /* renamed from: a */
    public final long mo41927a() {
        if (this.f25429o.mo41992h() || this.f25426l > 0) {
            return this.f25435u;
        }
        this.f25429o.mo41988d(this.f25434t.f25455a, this.f25422h, false);
        return zzash.m42274b(0) + zzash.m42274b(this.f25434t.f25457c);
    }

    /* renamed from: b */
    public final int mo41936b() {
        if (!this.f25429o.mo41992h() && this.f25426l <= 0) {
            this.f25429o.mo41988d(this.f25434t.f25455a, this.f25422h, false);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41937c(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.f25427m--;
                return;
            case 1:
                this.f25425k = message.arg1;
                Iterator it = this.f25420f.iterator();
                while (it.hasNext()) {
                    ((zzasj) it.next()).mo41914p(this.f25424j, this.f25425k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.f25428n = z;
                Iterator it2 = this.f25420f.iterator();
                while (it2.hasNext()) {
                    ((zzasj) it2.next()).mo41910O(this.f25428n);
                }
                return;
            case 3:
                if (this.f25427m == 0) {
                    zzazi zzazi = (zzazi) message.obj;
                    this.f25423i = true;
                    this.f25431q = zzazi.f26345a;
                    this.f25432r = zzazi.f26346b;
                    this.f25416b.mo42272b(zzazi.f26347c);
                    Iterator it3 = this.f25420f.iterator();
                    while (it3.hasNext()) {
                        ((zzasj) it3.next()).mo41915q(this.f25431q, this.f25432r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f25426l - 1;
                this.f25426l = i;
                if (i == 0) {
                    this.f25434t = (zzasr) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.f25420f.iterator();
                        while (it4.hasNext()) {
                            ((zzasj) it4.next()).mo41911b();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f25426l == 0) {
                    this.f25434t = (zzasr) message.obj;
                    Iterator it5 = this.f25420f.iterator();
                    while (it5.hasNext()) {
                        ((zzasj) it5.next()).mo41911b();
                    }
                    return;
                }
                return;
            case 6:
                zzast zzast = (zzast) message.obj;
                this.f25426l -= zzast.f25465d;
                if (this.f25427m == 0) {
                    this.f25429o = zzast.f25462a;
                    this.f25430p = zzast.f25463b;
                    this.f25434t = zzast.f25464c;
                    Iterator it6 = this.f25420f.iterator();
                    while (it6.hasNext()) {
                        ((zzasj) it6.next()).mo41916s(this.f25429o, this.f25430p);
                    }
                    return;
                }
                return;
            case 7:
                zzata zzata = (zzata) message.obj;
                if (!this.f25433s.equals(zzata)) {
                    this.f25433s = zzata;
                    Iterator it7 = this.f25420f.iterator();
                    while (it7.hasNext()) {
                        ((zzasj) it7.next()).mo41912h(zzata);
                    }
                    return;
                }
                return;
            case 8:
                zzasi zzasi = (zzasi) message.obj;
                Iterator it8 = this.f25420f.iterator();
                while (it8.hasNext()) {
                    ((zzasj) it8.next()).mo41913o(zzasi);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public final long mo41928d() {
        if (this.f25429o.mo41992h()) {
            return -9223372036854775807L;
        }
        zzath zzath = this.f25429o;
        mo41936b();
        return zzash.m42274b(zzath.mo41991g(0, this.f25421g, false).f25542a);
    }

    /* renamed from: f */
    public final void mo41929f() {
        this.f25419e.mo41960x();
    }

    /* renamed from: g */
    public final void mo41930g() {
        this.f25419e.mo41962z();
    }

    /* renamed from: i */
    public final void mo41931i() {
        if (this.f25419e.mo41952J()) {
            if (!this.f25419e.mo41953K()) {
                Iterator it = this.f25420f.iterator();
                while (it.hasNext()) {
                    ((zzasj) it.next()).mo41913o(zzasi.m42277c(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
                }
            }
            this.f25418d.removeCallbacksAndMessages((Object) null);
            return;
        }
        this.f25419e.mo41944B();
        this.f25418d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: q */
    public final void mo41932q() {
        this.f25419e.mo41950H();
    }

    public final int zza() {
        return this.f25425k;
    }

    public final long zzb() {
        if (this.f25429o.mo41992h() || this.f25426l > 0) {
            return this.f25435u;
        }
        this.f25429o.mo41988d(this.f25434t.f25455a, this.f25422h, false);
        return zzash.m42274b(0) + zzash.m42274b(this.f25434t.f25458d);
    }
}
