package p373qd;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import p351od.C15851b;
import p373qd.C16296i;
import p382rd.C16413f;
import p382rd.C16414g;
import p382rd.C16415h;
import p391sd.C16533c;

/* renamed from: qd.f */
/* compiled from: Document */
public class C16288f extends C16293h {

    /* renamed from: G */
    private static final C16533c f66647G = new C16533c.C16537d("title");

    /* renamed from: B */
    private C16289a f66648B = new C16289a();

    /* renamed from: C */
    private C16414g f66649C;

    /* renamed from: D */
    private C16291b f66650D = C16291b.noQuirks;

    /* renamed from: E */
    private final String f66651E;

    /* renamed from: F */
    private boolean f66652F = false;

    /* renamed from: qd.f$a */
    /* compiled from: Document */
    public static class C16289a implements Cloneable {

        /* renamed from: a */
        private C16296i.C16299c f66653a = C16296i.C16299c.base;

        /* renamed from: c */
        private Charset f66654c = C15851b.f65301b;

        /* renamed from: d */
        private final ThreadLocal<CharsetEncoder> f66655d = new ThreadLocal<>();

        /* renamed from: f */
        C16296i.C16298b f66656f;

        /* renamed from: g */
        private boolean f66657g = true;

        /* renamed from: o */
        private boolean f66658o = false;

        /* renamed from: p */
        private int f66659p = 1;

        /* renamed from: s */
        private int f66660s = 30;

        /* renamed from: z */
        private C16290a f66661z = C16290a.html;

        /* renamed from: qd.f$a$a */
        /* compiled from: Document */
        public enum C16290a {
            html,
            xml
        }

        /* renamed from: a */
        public C16289a mo78840a(String str) {
            mo78841b(Charset.forName(str));
            return this;
        }

        /* renamed from: b */
        public C16289a mo78841b(Charset charset) {
            this.f66654c = charset;
            return this;
        }

        /* renamed from: c */
        public C16289a clone() {
            try {
                C16289a aVar = (C16289a) super.clone();
                aVar.mo78840a(this.f66654c.name());
                aVar.f66653a = C16296i.C16299c.valueOf(this.f66653a.name());
                return aVar;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public CharsetEncoder mo78844d() {
            CharsetEncoder charsetEncoder = this.f66655d.get();
            return charsetEncoder != null ? charsetEncoder : mo78849k();
        }

        /* renamed from: e */
        public C16296i.C16299c mo78845e() {
            return this.f66653a;
        }

        /* renamed from: f */
        public int mo78846f() {
            return this.f66659p;
        }

        /* renamed from: g */
        public int mo78847g() {
            return this.f66660s;
        }

        /* renamed from: h */
        public boolean mo78848h() {
            return this.f66658o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public CharsetEncoder mo78849k() {
            CharsetEncoder newEncoder = this.f66654c.newEncoder();
            this.f66655d.set(newEncoder);
            this.f66656f = C16296i.C16298b.m97837d(newEncoder.charset().name());
            return newEncoder;
        }

        /* renamed from: l */
        public boolean mo78850l() {
            return this.f66657g;
        }

        /* renamed from: n */
        public C16290a mo78851n() {
            return this.f66661z;
        }
    }

    /* renamed from: qd.f$b */
    /* compiled from: Document */
    public enum C16291b {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public C16288f(String str) {
        super(C16415h.m98338r("#root", C16413f.f67036c), str);
        this.f66651E = str;
        this.f66649C = C16414g.m98330b();
    }

    /* renamed from: L0 */
    private C16293h m97740L0() {
        for (C16293h next : mo78866d0()) {
            if (next.mo78885z0().equals("html")) {
                return next;
            }
        }
        return mo78864a0("html");
    }

    /* renamed from: A */
    public String mo78830A() {
        return super.mo78879r0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p373qd.C16293h mo78831J0() {
        /*
            r5 = this;
            qd.h r0 = r5.m97740L0()
            java.util.List r1 = r0.mo78866d0()
            java.util.Iterator r1 = r1.iterator()
        L_0x000c:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "body"
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()
            qd.h r2 = (p373qd.C16293h) r2
            java.lang.String r4 = r2.mo78885z0()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0030
            java.lang.String r3 = r2.mo78885z0()
            java.lang.String r4 = "frameset"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x000c
        L_0x0030:
            return r2
        L_0x0031:
            qd.h r0 = r0.mo78864a0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p373qd.C16288f.mo78831J0():qd.h");
    }

    /* renamed from: K0 */
    public C16288f mo78818n() {
        C16288f fVar = (C16288f) super.mo78818n();
        fVar.f66648B = this.f66648B.clone();
        return fVar;
    }

    /* renamed from: M0 */
    public C16289a mo78833M0() {
        return this.f66648B;
    }

    /* renamed from: N0 */
    public C16288f mo78834N0(C16414g gVar) {
        this.f66649C = gVar;
        return this;
    }

    /* renamed from: O0 */
    public C16414g mo78835O0() {
        return this.f66649C;
    }

    /* renamed from: P0 */
    public C16291b mo78836P0() {
        return this.f66650D;
    }

    /* renamed from: Q0 */
    public C16288f mo78837Q0(C16291b bVar) {
        this.f66650D = bVar;
        return this;
    }

    /* renamed from: R0 */
    public C16288f mo78838R0() {
        C16288f fVar = new C16288f(mo78824f());
        C16283b bVar = this.f66675p;
        if (bVar != null) {
            fVar.f66675p = bVar.clone();
        }
        fVar.f66648B = this.f66648B.clone();
        return fVar;
    }

    /* renamed from: y */
    public String mo78819y() {
        return "#document";
    }
}
