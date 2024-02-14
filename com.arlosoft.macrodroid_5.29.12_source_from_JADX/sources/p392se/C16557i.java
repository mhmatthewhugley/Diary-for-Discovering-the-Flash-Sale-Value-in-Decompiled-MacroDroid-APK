package p392se;

import p352oe.C15861e;
import p352oe.C15867g;
import p352oe.C15890p;
import p352oe.C15892q;
import p365pe.C16187h;

/* renamed from: se.i */
/* compiled from: TemporalQueries */
public final class C16557i {

    /* renamed from: a */
    static final C16565j<C15890p> f67335a = new C16558a();

    /* renamed from: b */
    static final C16565j<C16187h> f67336b = new C16559b();

    /* renamed from: c */
    static final C16565j<C16566k> f67337c = new C16560c();

    /* renamed from: d */
    static final C16565j<C15890p> f67338d = new C16561d();

    /* renamed from: e */
    static final C16565j<C15892q> f67339e = new C16562e();

    /* renamed from: f */
    static final C16565j<C15861e> f67340f = new C16563f();

    /* renamed from: g */
    static final C16565j<C15867g> f67341g = new C16564g();

    /* renamed from: se.i$a */
    /* compiled from: TemporalQueries */
    class C16558a implements C16565j<C15890p> {
        C16558a() {
        }

        /* renamed from: b */
        public C15890p mo75649a(C16551e eVar) {
            return (C15890p) eVar.mo75648r(this);
        }
    }

    /* renamed from: se.i$b */
    /* compiled from: TemporalQueries */
    class C16559b implements C16565j<C16187h> {
        C16559b() {
        }

        /* renamed from: b */
        public C16187h mo75649a(C16551e eVar) {
            return (C16187h) eVar.mo75648r(this);
        }
    }

    /* renamed from: se.i$c */
    /* compiled from: TemporalQueries */
    class C16560c implements C16565j<C16566k> {
        C16560c() {
        }

        /* renamed from: b */
        public C16566k mo75649a(C16551e eVar) {
            return (C16566k) eVar.mo75648r(this);
        }
    }

    /* renamed from: se.i$d */
    /* compiled from: TemporalQueries */
    class C16561d implements C16565j<C15890p> {
        C16561d() {
        }

        /* renamed from: b */
        public C15890p mo75649a(C16551e eVar) {
            C15890p pVar = (C15890p) eVar.mo75648r(C16557i.f67335a);
            return pVar != null ? pVar : (C15890p) eVar.mo75648r(C16557i.f67339e);
        }
    }

    /* renamed from: se.i$e */
    /* compiled from: TemporalQueries */
    class C16562e implements C16565j<C15892q> {
        C16562e() {
        }

        /* renamed from: b */
        public C15892q mo75649a(C16551e eVar) {
            C16540a aVar = C16540a.OFFSET_SECONDS;
            if (eVar.mo75642g(aVar)) {
                return C15892q.m95835H(eVar.mo75647q(aVar));
            }
            return null;
        }
    }

    /* renamed from: se.i$f */
    /* compiled from: TemporalQueries */
    class C16563f implements C16565j<C15861e> {
        C16563f() {
        }

        /* renamed from: b */
        public C15861e mo75649a(C16551e eVar) {
            C16540a aVar = C16540a.EPOCH_DAY;
            if (eVar.mo75642g(aVar)) {
                return C15861e.m95546v0(eVar.mo75644l(aVar));
            }
            return null;
        }
    }

    /* renamed from: se.i$g */
    /* compiled from: TemporalQueries */
    class C16564g implements C16565j<C15867g> {
        C16564g() {
        }

        /* renamed from: b */
        public C15867g mo75649a(C16551e eVar) {
            C16540a aVar = C16540a.NANO_OF_DAY;
            if (eVar.mo75642g(aVar)) {
                return C15867g.m95647L(eVar.mo75644l(aVar));
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final C16565j<C16187h> m98733a() {
        return f67336b;
    }

    /* renamed from: b */
    public static final C16565j<C15861e> m98734b() {
        return f67340f;
    }

    /* renamed from: c */
    public static final C16565j<C15867g> m98735c() {
        return f67341g;
    }

    /* renamed from: d */
    public static final C16565j<C15892q> m98736d() {
        return f67339e;
    }

    /* renamed from: e */
    public static final C16565j<C16566k> m98737e() {
        return f67337c;
    }

    /* renamed from: f */
    public static final C16565j<C15890p> m98738f() {
        return f67338d;
    }

    /* renamed from: g */
    public static final C16565j<C15890p> m98739g() {
        return f67335a;
    }
}
