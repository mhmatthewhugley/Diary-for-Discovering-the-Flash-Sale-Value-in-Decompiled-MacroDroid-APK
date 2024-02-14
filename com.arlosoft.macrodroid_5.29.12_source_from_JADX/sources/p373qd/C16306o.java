package p373qd;

import org.apache.commons.cli.HelpFormatter;

/* renamed from: qd.o */
/* compiled from: Range */
public class C16306o {

    /* renamed from: c */
    private static final String f66700c = C16283b.m97686M("jsoup.sourceRange");

    /* renamed from: d */
    private static final String f66701d = C16283b.m97686M("jsoup.endSourceRange");

    /* renamed from: e */
    private static final C16307a f66702e;

    /* renamed from: f */
    private static final C16306o f66703f;

    /* renamed from: a */
    private final C16307a f66704a;

    /* renamed from: b */
    private final C16307a f66705b;

    /* renamed from: qd.o$a */
    /* compiled from: Range */
    public static class C16307a {

        /* renamed from: a */
        private final int f66706a;

        /* renamed from: b */
        private final int f66707b;

        /* renamed from: c */
        private final int f66708c;

        public C16307a(int i, int i2, int i3) {
            this.f66706a = i;
            this.f66707b = i2;
            this.f66708c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C16307a aVar = (C16307a) obj;
            if (this.f66706a == aVar.f66706a && this.f66707b == aVar.f66707b && this.f66708c == aVar.f66708c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f66706a * 31) + this.f66707b) * 31) + this.f66708c;
        }

        public String toString() {
            return this.f66707b + "," + this.f66708c + ":" + this.f66706a;
        }
    }

    static {
        C16307a aVar = new C16307a(-1, -1, -1);
        f66702e = aVar;
        f66703f = new C16306o(aVar, aVar);
    }

    public C16306o(C16307a aVar, C16307a aVar2) {
        this.f66704a = aVar;
        this.f66705b = aVar2;
    }

    /* renamed from: a */
    public void mo78916a(C16303m mVar, boolean z) {
        mVar.mo78867e().mo78793V(z ? f66700c : f66701d, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16306o oVar = (C16306o) obj;
        if (!this.f66704a.equals(oVar.f66704a)) {
            return false;
        }
        return this.f66705b.equals(oVar.f66705b);
    }

    public int hashCode() {
        return (this.f66704a.hashCode() * 31) + this.f66705b.hashCode();
    }

    public String toString() {
        return this.f66704a + HelpFormatter.DEFAULT_OPT_PREFIX + this.f66705b;
    }
}
