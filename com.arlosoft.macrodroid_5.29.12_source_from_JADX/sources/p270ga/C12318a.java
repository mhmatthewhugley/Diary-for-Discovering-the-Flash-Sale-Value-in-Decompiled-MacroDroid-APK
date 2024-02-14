package p270ga;

import java.util.concurrent.Callable;
import p262fa.C12251a;
import p292io.reactivex.internal.schedulers.C13180b;
import p292io.reactivex.internal.schedulers.C13185d;
import p292io.reactivex.internal.schedulers.C13189e;
import p292io.reactivex.internal.schedulers.C13199l;
import p292io.reactivex.internal.schedulers.C13201m;
import p414v9.C16742o;

/* renamed from: ga.a */
/* compiled from: Schedulers */
public final class C12318a {

    /* renamed from: a */
    static final C16742o f58997a = C12251a.m82977h(new C12326h());

    /* renamed from: b */
    static final C16742o f58998b = C12251a.m82974e(new C12320b());

    /* renamed from: c */
    static final C16742o f58999c = C12251a.m82975f(new C12321c());

    /* renamed from: d */
    static final C16742o f59000d = C13201m.m85503e();

    /* renamed from: e */
    static final C16742o f59001e = C12251a.m82976g(new C12324f());

    /* renamed from: ga.a$a */
    /* compiled from: Schedulers */
    static final class C12319a {

        /* renamed from: a */
        static final C16742o f59002a = new C13180b();
    }

    /* renamed from: ga.a$b */
    /* compiled from: Schedulers */
    static final class C12320b implements Callable<C16742o> {
        C12320b() {
        }

        /* renamed from: a */
        public C16742o call() throws Exception {
            return C12319a.f59002a;
        }
    }

    /* renamed from: ga.a$c */
    /* compiled from: Schedulers */
    static final class C12321c implements Callable<C16742o> {
        C12321c() {
        }

        /* renamed from: a */
        public C16742o call() throws Exception {
            return C12322d.f59003a;
        }
    }

    /* renamed from: ga.a$d */
    /* compiled from: Schedulers */
    static final class C12322d {

        /* renamed from: a */
        static final C16742o f59003a = new C13185d();
    }

    /* renamed from: ga.a$e */
    /* compiled from: Schedulers */
    static final class C12323e {

        /* renamed from: a */
        static final C16742o f59004a = new C13189e();
    }

    /* renamed from: ga.a$f */
    /* compiled from: Schedulers */
    static final class C12324f implements Callable<C16742o> {
        C12324f() {
        }

        /* renamed from: a */
        public C16742o call() throws Exception {
            return C12323e.f59004a;
        }
    }

    /* renamed from: ga.a$g */
    /* compiled from: Schedulers */
    static final class C12325g {

        /* renamed from: a */
        static final C16742o f59005a = new C13199l();
    }

    /* renamed from: ga.a$h */
    /* compiled from: Schedulers */
    static final class C12326h implements Callable<C16742o> {
        C12326h() {
        }

        /* renamed from: a */
        public C16742o call() throws Exception {
            return C12325g.f59005a;
        }
    }

    /* renamed from: a */
    public static C16742o m83029a() {
        return C12251a.m82984o(f58998b);
    }

    /* renamed from: b */
    public static C16742o m83030b() {
        return C12251a.m82986q(f58999c);
    }
}
