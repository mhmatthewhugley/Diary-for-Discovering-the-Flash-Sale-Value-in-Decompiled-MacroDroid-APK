package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzmr {

    /* renamed from: a */
    private final zzck f37873a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzfvn f37874b = zzfvn.m51135w();

    /* renamed from: c */
    private zzfvq f37875c = zzfvq.m51148d();
    @Nullable

    /* renamed from: d */
    private zzsi f37876d;

    /* renamed from: e */
    private zzsi f37877e;

    /* renamed from: f */
    private zzsi f37878f;

    public zzmr(zzck zzck) {
        this.f37873a = zzck;
    }

    @Nullable
    /* renamed from: j */
    private static zzsi m54164j(zzcg zzcg, zzfvn zzfvn, @Nullable zzsi zzsi, zzck zzck) {
        zzcn n = zzcg.mo43525n();
        int f = zzcg.mo43517f();
        Object f2 = n.mo44135o() ? null : n.mo43604f(f);
        int c = (zzcg.mo43526p() || n.mo44135o()) ? -1 : n.mo43602d(f, zzck, false).mo43849c(zzen.m49163f0(zzcg.mo43521j()));
        for (int i = 0; i < zzfvn.size(); i++) {
            zzsi zzsi2 = (zzsi) zzfvn.get(i);
            if (m54167m(zzsi2, f2, zzcg.mo43526p(), zzcg.mo43515d(), zzcg.mo43513b(), c)) {
                return zzsi2;
            }
        }
        if (zzfvn.isEmpty() && zzsi != null) {
            if (m54167m(zzsi, f2, zzcg.mo43526p(), zzcg.mo43515d(), zzcg.mo43513b(), c)) {
                return zzsi;
            }
        }
        return null;
    }

    /* renamed from: k */
    private final void m54165k(zzfvp zzfvp, @Nullable zzsi zzsi, zzcn zzcn) {
        if (zzsi != null) {
            if (zzcn.mo43599a(zzsi.f27569a) != -1) {
                zzfvp.mo46447a(zzsi, zzcn);
                return;
            }
            zzcn zzcn2 = (zzcn) this.f37875c.get(zzsi);
            if (zzcn2 != null) {
                zzfvp.mo46447a(zzsi, zzcn2);
            }
        }
    }

    /* renamed from: l */
    private final void m54166l(zzcn zzcn) {
        zzfvp zzfvp = new zzfvp();
        if (this.f37874b.isEmpty()) {
            m54165k(zzfvp, this.f37877e, zzcn);
            if (!zzfss.m50929a(this.f37878f, this.f37877e)) {
                m54165k(zzfvp, this.f37878f, zzcn);
            }
            if (!zzfss.m50929a(this.f37876d, this.f37877e) && !zzfss.m50929a(this.f37876d, this.f37878f)) {
                m54165k(zzfvp, this.f37876d, zzcn);
            }
        } else {
            for (int i = 0; i < this.f37874b.size(); i++) {
                m54165k(zzfvp, (zzsi) this.f37874b.get(i), zzcn);
            }
            if (!this.f37874b.contains(this.f37876d)) {
                m54165k(zzfvp, this.f37876d, zzcn);
            }
        }
        this.f37875c = zzfvp.mo46449c();
    }

    /* renamed from: m */
    private static boolean m54167m(zzsi zzsi, @Nullable Object obj, boolean z, int i, int i2, int i3) {
        if (!zzsi.f27569a.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(zzsi.f27570b == i && zzsi.f27571c == i2)) {
                return false;
            }
        } else if (!(zzsi.f27570b == -1 && zzsi.f27573e == i3)) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: a */
    public final zzcn mo47839a(zzsi zzsi) {
        return (zzcn) this.f37875c.get(zzsi);
    }

    @Nullable
    /* renamed from: b */
    public final zzsi mo47840b() {
        return this.f37876d;
    }

    @Nullable
    /* renamed from: c */
    public final zzsi mo47841c() {
        Object obj;
        Object next;
        if (this.f37874b.isEmpty()) {
            return null;
        }
        zzfvn zzfvn = this.f37874b;
        if (!(zzfvn instanceof List)) {
            Iterator it = zzfvn.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (!zzfvn.isEmpty()) {
            obj = zzfvn.get(zzfvn.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (zzsi) obj;
    }

    @Nullable
    /* renamed from: d */
    public final zzsi mo47842d() {
        return this.f37877e;
    }

    @Nullable
    /* renamed from: e */
    public final zzsi mo47843e() {
        return this.f37878f;
    }

    /* renamed from: g */
    public final void mo47844g(zzcg zzcg) {
        this.f37876d = m54164j(zzcg, this.f37874b, this.f37877e, this.f37873a);
    }

    /* renamed from: h */
    public final void mo47845h(List list, @Nullable zzsi zzsi, zzcg zzcg) {
        this.f37874b = zzfvn.m51133t(list);
        if (!list.isEmpty()) {
            this.f37877e = (zzsi) list.get(0);
            Objects.requireNonNull(zzsi);
            this.f37878f = zzsi;
        }
        if (this.f37876d == null) {
            this.f37876d = m54164j(zzcg, this.f37874b, this.f37877e, this.f37873a);
        }
        m54166l(zzcg.mo43525n());
    }

    /* renamed from: i */
    public final void mo47846i(zzcg zzcg) {
        this.f37876d = m54164j(zzcg, this.f37874b, this.f37877e, this.f37873a);
        m54166l(zzcg.mo43525n());
    }
}
