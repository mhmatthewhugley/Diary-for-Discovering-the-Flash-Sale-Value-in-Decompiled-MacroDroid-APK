package p373qd;

import java.util.List;

/* renamed from: qd.l */
/* compiled from: LeafNode */
abstract class C16302l extends C16303m {

    /* renamed from: f */
    Object f66694f;

    C16302l() {
    }

    /* renamed from: Y */
    private void m97854Y() {
        if (!mo78881t()) {
            Object obj = this.f66694f;
            C16283b bVar = new C16283b();
            this.f66694f = bVar;
            if (obj != null) {
                bVar.mo78790R(mo78819y(), (String) obj);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public String mo78893V() {
        return mo78823c(mo78819y());
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public C16302l mo78874o(C16303m mVar) {
        C16302l lVar = (C16302l) super.mo78874o(mVar);
        if (mo78881t()) {
            lVar.f66694f = ((C16283b) this.f66694f).clone();
        }
        return lVar;
    }

    /* renamed from: a */
    public String mo78821a(String str) {
        m97854Y();
        return super.mo78821a(str);
    }

    /* renamed from: c */
    public String mo78823c(String str) {
        if (!mo78881t()) {
            return mo78819y().equals(str) ? (String) this.f66694f : "";
        }
        return super.mo78823c(str);
    }

    /* renamed from: d */
    public C16303m mo78853d(String str, String str2) {
        if (mo78881t() || !str.equals(mo78819y())) {
            m97854Y();
            super.mo78853d(str, str2);
        } else {
            this.f66694f = str2;
        }
        return this;
    }

    /* renamed from: e */
    public final C16283b mo78867e() {
        m97854Y();
        return (C16283b) this.f66694f;
    }

    /* renamed from: f */
    public String mo78824f() {
        return mo78913u() ? mo78857G().mo78824f() : "";
    }

    /* renamed from: k */
    public int mo78825k() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo78876p(String str) {
    }

    /* renamed from: q */
    public C16303m mo78826q() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public List<C16303m> mo78878r() {
        return C16303m.f66695d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo78881t() {
        return this.f66694f instanceof C16283b;
    }
}
