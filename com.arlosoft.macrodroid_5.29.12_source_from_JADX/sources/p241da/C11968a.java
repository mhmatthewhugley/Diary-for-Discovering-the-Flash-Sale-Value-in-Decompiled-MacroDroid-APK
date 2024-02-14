package p241da;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p216ba.C11110a;
import p216ba.C11111b;
import p216ba.C11113d;
import p216ba.C11114e;
import p216ba.C11115f;
import p216ba.C11116g;
import p262fa.C12251a;
import p292io.reactivex.exceptions.OnErrorNotImplementedException;
import p329me.C15739d;

/* renamed from: da.a */
/* compiled from: Functions */
public final class C11968a {

    /* renamed from: a */
    static final C11114e<Object, Object> f58164a = new C11977i();

    /* renamed from: b */
    public static final Runnable f58165b = new C11974f();

    /* renamed from: c */
    public static final C11110a f58166c = new C11971c();

    /* renamed from: d */
    static final C11113d<Object> f58167d = new C11972d();

    /* renamed from: e */
    public static final C11113d<Throwable> f58168e = new C11975g();

    /* renamed from: f */
    public static final C11113d<Throwable> f58169f = new C11982n();

    /* renamed from: g */
    public static final C11115f f58170g = new C11973e();

    /* renamed from: h */
    static final C11116g<Object> f58171h = new C11983o();

    /* renamed from: i */
    static final C11116g<Object> f58172i = new C11976h();

    /* renamed from: j */
    static final Callable<Object> f58173j = new C11981m();

    /* renamed from: k */
    static final Comparator<Object> f58174k = new C11980l();

    /* renamed from: l */
    public static final C11113d<C15739d> f58175l = new C11979k();

    /* renamed from: da.a$a */
    /* compiled from: Functions */
    static final class C11969a<T1, T2, R> implements C11114e<Object[], R> {

        /* renamed from: a */
        final C11111b<? super T1, ? super T2, ? extends R> f58176a;

        C11969a(C11111b<? super T1, ? super T2, ? extends R> bVar) {
            this.f58176a = bVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f58176a.mo62247a(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: da.a$b */
    /* compiled from: Functions */
    static final class C11970b<T> implements Callable<List<T>> {

        /* renamed from: a */
        final int f58177a;

        C11970b(int i) {
            this.f58177a = i;
        }

        /* renamed from: a */
        public List<T> call() throws Exception {
            return new ArrayList(this.f58177a);
        }
    }

    /* renamed from: da.a$c */
    /* compiled from: Functions */
    static final class C11971c implements C11110a {
        C11971c() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: da.a$d */
    /* compiled from: Functions */
    static final class C11972d implements C11113d<Object> {
        C11972d() {
        }

        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: da.a$e */
    /* compiled from: Functions */
    static final class C11973e implements C11115f {
        C11973e() {
        }
    }

    /* renamed from: da.a$f */
    /* compiled from: Functions */
    static final class C11974f implements Runnable {
        C11974f() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: da.a$g */
    /* compiled from: Functions */
    static final class C11975g implements C11113d<Throwable> {
        C11975g() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C12251a.m82985p(th);
        }
    }

    /* renamed from: da.a$h */
    /* compiled from: Functions */
    static final class C11976h implements C11116g<Object> {
        C11976h() {
        }

        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: da.a$i */
    /* compiled from: Functions */
    static final class C11977i implements C11114e<Object, Object> {
        C11977i() {
        }

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: da.a$j */
    /* compiled from: Functions */
    static final class C11978j<T, U> implements Callable<U>, C11114e<T, U> {

        /* renamed from: a */
        final U f58178a;

        C11978j(U u) {
            this.f58178a = u;
        }

        public U apply(T t) throws Exception {
            return this.f58178a;
        }

        public U call() throws Exception {
            return this.f58178a;
        }
    }

    /* renamed from: da.a$k */
    /* compiled from: Functions */
    static final class C11979k implements C11113d<C15739d> {
        C11979k() {
        }

        /* renamed from: a */
        public void accept(C15739d dVar) throws Exception {
            dVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
        }
    }

    /* renamed from: da.a$l */
    /* compiled from: Functions */
    static final class C11980l implements Comparator<Object> {
        C11980l() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: da.a$m */
    /* compiled from: Functions */
    static final class C11981m implements Callable<Object> {
        C11981m() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: da.a$n */
    /* compiled from: Functions */
    static final class C11982n implements C11113d<Throwable> {
        C11982n() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C12251a.m82985p(new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: da.a$o */
    /* compiled from: Functions */
    static final class C11983o implements C11116g<Object> {
        C11983o() {
        }

        public boolean test(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static <T> Callable<List<T>> m82354a(int i) {
        return new C11970b(i);
    }

    /* renamed from: b */
    public static <T> C11113d<T> m82355b() {
        return f58167d;
    }

    /* renamed from: c */
    public static <T> C11114e<T, T> m82356c() {
        return f58164a;
    }

    /* renamed from: d */
    public static <T> Callable<T> m82357d(T t) {
        return new C11978j(t);
    }

    /* renamed from: e */
    public static <T1, T2, R> C11114e<Object[], R> m82358e(C11111b<? super T1, ? super T2, ? extends R> bVar) {
        C11984b.m82367d(bVar, "f is null");
        return new C11969a(bVar);
    }
}
