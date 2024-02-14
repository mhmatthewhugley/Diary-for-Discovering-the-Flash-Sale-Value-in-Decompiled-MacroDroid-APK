package p382rd;

import p351od.C15852c;
import p373qd.C16283b;

/* renamed from: rd.i */
/* compiled from: Token */
abstract class C16416i {

    /* renamed from: a */
    C16426j f67061a;

    /* renamed from: b */
    private int f67062b;

    /* renamed from: c */
    private int f67063c;

    /* renamed from: rd.i$b */
    /* compiled from: Token */
    static final class C16418b extends C16419c {
        C16418b(String str) {
            mo79238t(str);
        }

        public String toString() {
            return "<![CDATA[" + mo79239u() + "]]>";
        }
    }

    /* renamed from: rd.i$c */
    /* compiled from: Token */
    static class C16419c extends C16416i {

        /* renamed from: d */
        private String f67064d;

        C16419c() {
            super();
            this.f67061a = C16426j.Character;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C16416i mo79233o() {
            C16416i.super.mo79233o();
            this.f67064d = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public C16419c mo79238t(String str) {
            this.f67064d = str;
            return this;
        }

        public String toString() {
            return mo79239u();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public String mo79239u() {
            return this.f67064d;
        }
    }

    /* renamed from: rd.i$d */
    /* compiled from: Token */
    static final class C16420d extends C16416i {

        /* renamed from: d */
        private final StringBuilder f67065d = new StringBuilder();

        /* renamed from: e */
        private String f67066e;

        /* renamed from: f */
        boolean f67067f = false;

        C16420d() {
            super();
            this.f67061a = C16426j.Comment;
        }

        /* renamed from: v */
        private void m98373v() {
            String str = this.f67066e;
            if (str != null) {
                this.f67065d.append(str);
                this.f67066e = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C16416i mo79233o() {
            C16416i.super.mo79233o();
            C16416i.m98351p(this.f67065d);
            this.f67066e = null;
            this.f67067f = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final C16420d mo79240t(char c) {
            m98373v();
            this.f67065d.append(c);
            return this;
        }

        public String toString() {
            return "<!--" + mo79243w() + "-->";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public final C16420d mo79242u(String str) {
            m98373v();
            if (this.f67065d.length() == 0) {
                this.f67066e = str;
            } else {
                this.f67065d.append(str);
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public String mo79243w() {
            String str = this.f67066e;
            return str != null ? str : this.f67065d.toString();
        }
    }

    /* renamed from: rd.i$e */
    /* compiled from: Token */
    static final class C16421e extends C16416i {

        /* renamed from: d */
        final StringBuilder f67068d = new StringBuilder();

        /* renamed from: e */
        String f67069e = null;

        /* renamed from: f */
        final StringBuilder f67070f = new StringBuilder();

        /* renamed from: g */
        final StringBuilder f67071g = new StringBuilder();

        /* renamed from: h */
        boolean f67072h = false;

        C16421e() {
            super();
            this.f67061a = C16426j.Doctype;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C16416i mo79233o() {
            C16416i.super.mo79233o();
            C16416i.m98351p(this.f67068d);
            this.f67069e = null;
            C16416i.m98351p(this.f67070f);
            C16416i.m98351p(this.f67071g);
            this.f67072h = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public String mo79244t() {
            return this.f67068d.toString();
        }

        public String toString() {
            return "<!doctype " + mo79244t() + ">";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public String mo79246u() {
            return this.f67069e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public String mo79247v() {
            return this.f67070f.toString();
        }

        /* renamed from: w */
        public String mo79248w() {
            return this.f67071g.toString();
        }

        /* renamed from: x */
        public boolean mo79249x() {
            return this.f67072h;
        }
    }

    /* renamed from: rd.i$f */
    /* compiled from: Token */
    static final class C16422f extends C16416i {
        C16422f() {
            super();
            this.f67061a = C16426j.EOF;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C16416i mo79233o() {
            C16416i.super.mo79233o();
            return this;
        }

        public String toString() {
            return "";
        }
    }

    /* renamed from: rd.i$g */
    /* compiled from: Token */
    static final class C16423g extends C16425i {
        C16423g() {
            this.f67061a = C16426j.EndTag;
        }

        public String toString() {
            return "</" + mo79264M() + ">";
        }
    }

    /* renamed from: rd.i$h */
    /* compiled from: Token */
    static final class C16424h extends C16425i {
        C16424h() {
            this.f67061a = C16426j.StartTag;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public C16425i mo79233o() {
            super.mo79233o();
            this.f67083n = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N */
        public C16424h mo79253N(String str, C16283b bVar) {
            this.f67073d = str;
            this.f67083n = bVar;
            this.f67074e = C16413f.m98324a(str);
            return this;
        }

        public String toString() {
            if (!mo79257E() || this.f67083n.size() <= 0) {
                return "<" + mo79264M() + ">";
            }
            return "<" + mo79264M() + " " + this.f67083n.toString() + ">";
        }
    }

    /* renamed from: rd.i$i */
    /* compiled from: Token */
    static abstract class C16425i extends C16416i {

        /* renamed from: d */
        protected String f67073d;

        /* renamed from: e */
        protected String f67074e;

        /* renamed from: f */
        private final StringBuilder f67075f = new StringBuilder();

        /* renamed from: g */
        private String f67076g;

        /* renamed from: h */
        private boolean f67077h = false;

        /* renamed from: i */
        private final StringBuilder f67078i = new StringBuilder();

        /* renamed from: j */
        private String f67079j;

        /* renamed from: k */
        private boolean f67080k = false;

        /* renamed from: l */
        private boolean f67081l = false;

        /* renamed from: m */
        boolean f67082m = false;

        /* renamed from: n */
        C16283b f67083n;

        C16425i() {
            super();
        }

        /* renamed from: A */
        private void m98388A() {
            this.f67077h = true;
            String str = this.f67076g;
            if (str != null) {
                this.f67075f.append(str);
                this.f67076g = null;
            }
        }

        /* renamed from: B */
        private void m98389B() {
            this.f67080k = true;
            String str = this.f67079j;
            if (str != null) {
                this.f67078i.append(str);
                this.f67079j = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public final void mo79255C() {
            if (this.f67077h) {
                mo79261I();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public final boolean mo79256D(String str) {
            C16283b bVar = this.f67083n;
            return bVar != null && bVar.mo78807u(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public final boolean mo79257E() {
            return this.f67083n != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public final boolean mo79258F() {
            return this.f67082m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public final String mo79259G() {
            String str = this.f67073d;
            C15852c.m95473b(str == null || str.length() == 0);
            return this.f67073d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public final C16425i mo79260H(String str) {
            this.f67073d = str;
            this.f67074e = C16413f.m98324a(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public final void mo79261I() {
            String str;
            if (this.f67083n == null) {
                this.f67083n = new C16283b();
            }
            if (this.f67077h && this.f67083n.size() < 512) {
                String trim = (this.f67075f.length() > 0 ? this.f67075f.toString() : this.f67076g).trim();
                if (trim.length() > 0) {
                    if (this.f67080k) {
                        str = this.f67078i.length() > 0 ? this.f67078i.toString() : this.f67079j;
                    } else {
                        str = this.f67081l ? "" : null;
                    }
                    this.f67083n.mo78796h(trim, str);
                }
            }
            C16416i.m98351p(this.f67075f);
            this.f67076g = null;
            this.f67077h = false;
            C16416i.m98351p(this.f67078i);
            this.f67079j = null;
            this.f67080k = false;
            this.f67081l = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public final String mo79262J() {
            return this.f67074e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public C16425i mo79233o() {
            C16416i.super.mo79233o();
            this.f67073d = null;
            this.f67074e = null;
            C16416i.m98351p(this.f67075f);
            this.f67076g = null;
            this.f67077h = false;
            C16416i.m98351p(this.f67078i);
            this.f67079j = null;
            this.f67081l = false;
            this.f67080k = false;
            this.f67082m = false;
            this.f67083n = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public final void mo79263L() {
            this.f67081l = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public final String mo79264M() {
            String str = this.f67073d;
            return str != null ? str : "[unset]";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final void mo79265t(char c) {
            m98388A();
            this.f67075f.append(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public final void mo79266u(String str) {
            String replace = str.replace(0, 65533);
            m98388A();
            if (this.f67075f.length() == 0) {
                this.f67076g = replace;
            } else {
                this.f67075f.append(replace);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public final void mo79267v(char c) {
            m98389B();
            this.f67078i.append(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final void mo79268w(String str) {
            m98389B();
            if (this.f67078i.length() == 0) {
                this.f67079j = str;
            } else {
                this.f67078i.append(str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public final void mo79269x(int[] iArr) {
            m98389B();
            for (int appendCodePoint : iArr) {
                this.f67078i.appendCodePoint(appendCodePoint);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo79270y(char c) {
            mo79271z(String.valueOf(c));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public final void mo79271z(String str) {
            String replace = str.replace(0, 65533);
            String str2 = this.f67073d;
            if (str2 != null) {
                replace = str2.concat(replace);
            }
            this.f67073d = replace;
            this.f67074e = C16413f.m98324a(replace);
        }
    }

    /* renamed from: rd.i$j */
    /* compiled from: Token */
    public enum C16426j {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* renamed from: p */
    static void m98351p(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C16419c mo79219a() {
        return (C16419c) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C16420d mo79220b() {
        return (C16420d) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C16421e mo79221c() {
        return (C16421e) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C16423g mo79222d() {
        return (C16423g) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C16424h mo79223e() {
        return (C16424h) this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo79224f() {
        return this.f67063c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo79225g(int i) {
        this.f67063c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo79226h() {
        return this instanceof C16418b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo79227i() {
        return this.f67061a == C16426j.Character;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo79228j() {
        return this.f67061a == C16426j.Comment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo79229k() {
        return this.f67061a == C16426j.Doctype;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo79230l() {
        return this.f67061a == C16426j.EOF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo79231m() {
        return this.f67061a == C16426j.EndTag;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo79232n() {
        return this.f67061a == C16426j.StartTag;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C16416i mo79233o() {
        this.f67062b = -1;
        this.f67063c = -1;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo79234q() {
        return this.f67062b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo79235r(int i) {
        this.f67062b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public String mo79236s() {
        return getClass().getSimpleName();
    }

    private C16416i() {
        this.f67063c = -1;
    }
}
