package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzjt {

    /* renamed from: a */
    private final zznb f37679a;

    /* renamed from: b */
    private final List f37680b = new ArrayList();

    /* renamed from: c */
    private final IdentityHashMap f37681c = new IdentityHashMap();

    /* renamed from: d */
    private final Map f37682d = new HashMap();

    /* renamed from: e */
    private final zzjs f37683e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzsr f37684f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzpk f37685g;

    /* renamed from: h */
    private final HashMap f37686h;

    /* renamed from: i */
    private final Set f37687i;

    /* renamed from: j */
    private boolean f37688j;
    @Nullable

    /* renamed from: k */
    private zzfz f37689k;

    /* renamed from: l */
    private zzuc f37690l = new zzuc(0);

    public zzjt(zzjs zzjs, zzko zzko, Handler handler, zznb zznb) {
        this.f37679a = zznb;
        this.f37683e = zzjs;
        zzsr zzsr = new zzsr();
        this.f37684f = zzsr;
        zzpk zzpk = new zzpk();
        this.f37685g = zzpk;
        this.f37686h = new HashMap();
        this.f37687i = new HashSet();
        zzsr.mo48168b(handler, zzko);
        zzpk.mo48013b(handler, zzko);
    }

    /* renamed from: p */
    private final void m53949p(int i, int i2) {
        while (i < this.f37680b.size()) {
            ((zzjr) this.f37680b.get(i)).f37677d += i2;
            i++;
        }
    }

    /* renamed from: q */
    private final void m53950q(zzjr zzjr) {
        zzjq zzjq = (zzjq) this.f37686h.get(zzjr);
        if (zzjq != null) {
            zzjq.f37671a.mo48102i(zzjq.f37672b);
        }
    }

    /* renamed from: r */
    private final void m53951r() {
        Iterator it = this.f37687i.iterator();
        while (it.hasNext()) {
            zzjr zzjr = (zzjr) it.next();
            if (zzjr.f37676c.isEmpty()) {
                m53950q(zzjr);
                it.remove();
            }
        }
    }

    /* renamed from: s */
    private final void m53952s(zzjr zzjr) {
        if (zzjr.f37678e && zzjr.f37676c.isEmpty()) {
            zzjq zzjq = (zzjq) this.f37686h.remove(zzjr);
            Objects.requireNonNull(zzjq);
            zzjq.f37671a.mo48097a(zzjq.f37672b);
            zzjq.f37671a.mo48099e(zzjq.f37673c);
            zzjq.f37671a.mo48098d(zzjq.f37673c);
            this.f37687i.remove(zzjr);
        }
    }

    /* renamed from: t */
    private final void m53953t(zzjr zzjr) {
        zzsd zzsd = zzjr.f37674a;
        zzjo zzjo = new zzjo(this);
        zzjp zzjp = new zzjp(this, zzjr);
        this.f37686h.put(zzjr, new zzjq(zzsd, zzjo, zzjp));
        zzsd.mo48101h(new Handler(zzen.m49160e(), (Handler.Callback) null), zzjp);
        zzsd.mo48104k(new Handler(zzen.m49160e(), (Handler.Callback) null), zzjp);
        zzsd.mo48103j(zzjo, this.f37689k, this.f37679a);
    }

    /* renamed from: u */
    private final void m53954u(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                zzjr zzjr = (zzjr) this.f37680b.remove(i2);
                this.f37682d.remove(zzjr.f37675b);
                m53949p(i2, -zzjr.f37674a.mo48156A().mo43601c());
                zzjr.f37678e = true;
                if (this.f37688j) {
                    m53952s(zzjr);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo47737a() {
        return this.f37680b.size();
    }

    /* renamed from: b */
    public final zzcn mo47738b() {
        if (this.f37680b.isEmpty()) {
            return zzcn.f29060a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f37680b.size(); i2++) {
            zzjr zzjr = (zzjr) this.f37680b.get(i2);
            zzjr.f37677d = i;
            i += zzjr.f37674a.mo48156A().mo43601c();
        }
        return new zzjy(this.f37680b, this.f37690l, (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo47739e(zzsk zzsk, zzcn zzcn) {
        this.f37683e.mo47684e();
    }

    /* renamed from: f */
    public final void mo47740f(@Nullable zzfz zzfz) {
        zzdd.m47212f(!this.f37688j);
        this.f37689k = zzfz;
        for (int i = 0; i < this.f37680b.size(); i++) {
            zzjr zzjr = (zzjr) this.f37680b.get(i);
            m53953t(zzjr);
            this.f37687i.add(zzjr);
        }
        this.f37688j = true;
    }

    /* renamed from: g */
    public final void mo47741g() {
        for (zzjq zzjq : this.f37686h.values()) {
            try {
                zzjq.f37671a.mo48097a(zzjq.f37672b);
            } catch (RuntimeException e) {
                zzdw.m48253c("MediaSourceList", "Failed to release child source.", e);
            }
            zzjq.f37671a.mo48099e(zzjq.f37673c);
            zzjq.f37671a.mo48098d(zzjq.f37673c);
        }
        this.f37686h.clear();
        this.f37687i.clear();
        this.f37688j = false;
    }

    /* renamed from: h */
    public final void mo47742h(zzsg zzsg) {
        zzjr zzjr = (zzjr) this.f37681c.remove(zzsg);
        Objects.requireNonNull(zzjr);
        zzjr.f37674a.mo48159c(zzsg);
        zzjr.f37676c.remove(((zzsa) zzsg).f38399a);
        if (!this.f37681c.isEmpty()) {
            m53951r();
        }
        m53952s(zzjr);
    }

    /* renamed from: i */
    public final boolean mo47743i() {
        return this.f37688j;
    }

    /* renamed from: j */
    public final zzcn mo47744j(int i, List list, zzuc zzuc) {
        if (!list.isEmpty()) {
            this.f37690l = zzuc;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzjr zzjr = (zzjr) list.get(i2 - i);
                if (i2 > 0) {
                    zzjr zzjr2 = (zzjr) this.f37680b.get(i2 - 1);
                    zzjr.mo47736a(zzjr2.f37677d + zzjr2.f37674a.mo48156A().mo43601c());
                } else {
                    zzjr.mo47736a(0);
                }
                m53949p(i2, zzjr.f37674a.mo48156A().mo43601c());
                this.f37680b.add(i2, zzjr);
                this.f37682d.put(zzjr.f37675b, zzjr);
                if (this.f37688j) {
                    m53953t(zzjr);
                    if (this.f37681c.isEmpty()) {
                        this.f37687i.add(zzjr);
                    } else {
                        m53950q(zzjr);
                    }
                }
            }
        }
        return mo47738b();
    }

    /* renamed from: k */
    public final zzcn mo47745k(int i, int i2, int i3, zzuc zzuc) {
        zzdd.m47210d(mo47737a() >= 0);
        this.f37690l = null;
        return mo47738b();
    }

    /* renamed from: l */
    public final zzcn mo47746l(int i, int i2, zzuc zzuc) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= mo47737a()) {
            z = true;
        }
        zzdd.m47210d(z);
        this.f37690l = zzuc;
        m53954u(i, i2);
        return mo47738b();
    }

    /* renamed from: m */
    public final zzcn mo47747m(List list, zzuc zzuc) {
        m53954u(0, this.f37680b.size());
        return mo47744j(this.f37680b.size(), list, zzuc);
    }

    /* renamed from: n */
    public final zzcn mo47748n(zzuc zzuc) {
        int a = mo47737a();
        if (zzuc.mo48252c() != a) {
            zzuc = zzuc.mo48255f().mo48256g(0, a);
        }
        this.f37690l = zzuc;
        return mo47738b();
    }

    /* renamed from: o */
    public final zzsg mo47749o(zzsi zzsi, zzwi zzwi, long j) {
        Object obj = zzsi.f27569a;
        Object obj2 = ((Pair) obj).first;
        zzsi c = zzsi.mo48161c(((Pair) obj).second);
        zzjr zzjr = (zzjr) this.f37682d.get(obj2);
        Objects.requireNonNull(zzjr);
        this.f37687i.add(zzjr);
        zzjq zzjq = (zzjq) this.f37686h.get(zzjr);
        if (zzjq != null) {
            zzjq.f37671a.mo48100f(zzjq.f37672b);
        }
        zzjr.f37676c.add(c);
        zzsa B = zzjr.f37674a.mo48160g(c, zzwi, j);
        this.f37681c.put(B, zzjr);
        m53951r();
        return B;
    }
}
