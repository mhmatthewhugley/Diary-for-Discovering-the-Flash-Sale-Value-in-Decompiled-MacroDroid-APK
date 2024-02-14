package p272gc;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import p370qa.C16265l;

/* renamed from: gc.b */
/* compiled from: DFS */
public class C12339b {

    /* renamed from: gc.b$a */
    /* compiled from: DFS */
    static class C12340a extends C12341b<N, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C16265l f59023a;

        /* renamed from: b */
        final /* synthetic */ boolean[] f59024b;

        C12340a(C16265l lVar, boolean[] zArr) {
            this.f59023a = lVar;
            this.f59024b = zArr;
        }

        /* renamed from: c */
        public boolean mo68668c(N n) {
            if (((Boolean) this.f59023a.invoke(n)).booleanValue()) {
                this.f59024b[0] = true;
            }
            return !this.f59024b[0];
        }

        /* renamed from: d */
        public Boolean mo68667a() {
            return Boolean.valueOf(this.f59024b[0]);
        }
    }

    /* renamed from: gc.b$b */
    /* compiled from: DFS */
    public static abstract class C12341b<N, R> implements C12343d<N, R> {
        /* renamed from: b */
        public void mo68670b(N n) {
        }
    }

    /* renamed from: gc.b$c */
    /* compiled from: DFS */
    public interface C12342c<N> {
        /* renamed from: a */
        Iterable<? extends N> mo68671a(N n);
    }

    /* renamed from: gc.b$d */
    /* compiled from: DFS */
    public interface C12343d<N, R> {
        /* renamed from: a */
        R mo68667a();

        /* renamed from: b */
        void mo68670b(N n);

        /* renamed from: c */
        boolean mo68668c(N n);
    }

    /* renamed from: gc.b$e */
    /* compiled from: DFS */
    public interface C12344e<N> {
        /* renamed from: a */
        boolean mo68672a(N n);
    }

    /* renamed from: gc.b$f */
    /* compiled from: DFS */
    public static class C12345f<N> implements C12344e<N> {

        /* renamed from: a */
        private final Set<N> f59025a;

        public C12345f() {
            this(new HashSet());
        }

        /* renamed from: b */
        private static /* synthetic */ void m83092b(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"}));
        }

        /* renamed from: a */
        public boolean mo68672a(N n) {
            return this.f59025a.add(n);
        }

        public C12345f(Set<N> set) {
            if (set == null) {
                m83092b(0);
            }
            this.f59025a = set;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m83078a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <N, R> R m83079b(Collection<N> collection, C12342c<N> cVar, C12343d<N, R> dVar) {
        if (collection == null) {
            m83078a(4);
        }
        if (cVar == null) {
            m83078a(5);
        }
        if (dVar == null) {
            m83078a(6);
        }
        return m83080c(collection, cVar, new C12345f(), dVar);
    }

    /* renamed from: c */
    public static <N, R> R m83080c(Collection<N> collection, C12342c<N> cVar, C12344e<N> eVar, C12343d<N, R> dVar) {
        if (collection == null) {
            m83078a(0);
        }
        if (cVar == null) {
            m83078a(1);
        }
        if (eVar == null) {
            m83078a(2);
        }
        if (dVar == null) {
            m83078a(3);
        }
        for (N d : collection) {
            m83081d(d, cVar, eVar, dVar);
        }
        return dVar.mo68667a();
    }

    /* renamed from: d */
    public static <N> void m83081d(N n, C12342c<N> cVar, C12344e<N> eVar, C12343d<N, ?> dVar) {
        if (n == null) {
            m83078a(22);
        }
        if (cVar == null) {
            m83078a(23);
        }
        if (eVar == null) {
            m83078a(24);
        }
        if (dVar == null) {
            m83078a(25);
        }
        if (eVar.mo68672a(n) && dVar.mo68668c(n)) {
            for (Object d : cVar.mo68671a(n)) {
                m83081d(d, cVar, eVar, dVar);
            }
            dVar.mo68670b(n);
        }
    }

    /* renamed from: e */
    public static <N> Boolean m83082e(Collection<N> collection, C12342c<N> cVar, C16265l<N, Boolean> lVar) {
        if (collection == null) {
            m83078a(7);
        }
        if (cVar == null) {
            m83078a(8);
        }
        if (lVar == null) {
            m83078a(9);
        }
        return (Boolean) m83079b(collection, cVar, new C12340a(lVar, new boolean[1]));
    }
}
