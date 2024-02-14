package p272gc;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C13681c;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

/* renamed from: gc.f */
/* compiled from: SmartSet.kt */
public final class C12359f<T> extends AbstractSet<T> {

    /* renamed from: d */
    public static final C12361b f59044d = new C12361b((C13695i) null);

    /* renamed from: a */
    private Object f59045a;

    /* renamed from: c */
    private int f59046c;

    /* renamed from: gc.f$a */
    /* compiled from: SmartSet.kt */
    private static final class C12360a<T> implements Iterator<T>, C16368a {

        /* renamed from: a */
        private final Iterator<T> f59047a;

        public C12360a(T[] tArr) {
            C13706o.m87929f(tArr, "array");
            this.f59047a = C13681c.m87864a(tArr);
        }

        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f59047a.hasNext();
        }

        public T next() {
            return this.f59047a.next();
        }
    }

    /* renamed from: gc.f$b */
    /* compiled from: SmartSet.kt */
    public static final class C12361b {
        private C12361b() {
        }

        public /* synthetic */ C12361b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final <T> C12359f<T> mo68706a() {
            return new C12359f<>((C13695i) null);
        }

        /* renamed from: b */
        public final <T> C12359f<T> mo68707b(Collection<? extends T> collection) {
            C13706o.m87929f(collection, "set");
            C12359f<T> fVar = new C12359f<>((C13695i) null);
            fVar.addAll(collection);
            return fVar;
        }
    }

    /* renamed from: gc.f$c */
    /* compiled from: SmartSet.kt */
    private static final class C12362c<T> implements Iterator<T>, C16368a {

        /* renamed from: a */
        private final T f59048a;

        /* renamed from: c */
        private boolean f59049c = true;

        public C12362c(T t) {
            this.f59048a = t;
        }

        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f59049c;
        }

        public T next() {
            if (this.f59049c) {
                this.f59049c = false;
                return this.f59048a;
            }
            throw new NoSuchElementException();
        }
    }

    private C12359f() {
    }

    public /* synthetic */ C12359f(C13695i iVar) {
        this();
    }

    /* renamed from: c */
    public static final <T> C12359f<T> m83113c() {
        return f59044d.mo68706a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(T r5) {
        /*
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r4.f59045a = r5
            goto L_0x0078
        L_0x000a:
            int r0 = r4.size()
            r2 = 0
            if (r0 != r1) goto L_0x0026
            java.lang.Object r0 = r4.f59045a
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r0, r5)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r4.f59045a
            r0[r2] = r3
            r0[r1] = r5
            r4.f59045a = r0
            goto L_0x0078
        L_0x0026:
            int r0 = r4.size()
            r3 = 5
            if (r0 >= r3) goto L_0x0066
            java.lang.Object r0 = r4.f59045a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.C13706o.m87927d(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = kotlin.collections.C13596m.m87628w(r0, r5)
            if (r3 == 0) goto L_0x003d
            return r2
        L_0x003d:
            int r2 = r4.size()
            r3 = 4
            if (r2 != r3) goto L_0x0051
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.util.LinkedHashSet r0 = kotlin.collections.C13627z0.m87807e(r0)
            r0.add(r5)
            goto L_0x0063
        L_0x0051:
            int r2 = r4.size()
            int r2 = r2 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r5
        L_0x0063:
            r4.f59045a = r0
            goto L_0x0078
        L_0x0066:
            java.lang.Object r0 = r4.f59045a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.C13706o.m87927d(r0, r3)
            java.util.Set r0 = kotlin.jvm.internal.C13698j0.m87906f(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L_0x0078
            return r2
        L_0x0078:
            int r5 = r4.size()
            int r5 = r5 + r1
            r4.mo68699f(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p272gc.C12359f.add(java.lang.Object):boolean");
    }

    public void clear() {
        this.f59045a = null;
        mo68699f(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C13706o.m87924a(this.f59045a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f59045a;
            C13706o.m87927d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C13596m.m87628w((Object[]) obj2, obj);
        }
        Object obj3 = this.f59045a;
        C13706o.m87927d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    /* renamed from: d */
    public int mo68698d() {
        return this.f59046c;
    }

    /* renamed from: f */
    public void mo68699f(int i) {
        this.f59046c = i;
    }

    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new C12362c(this.f59045a);
        }
        if (size() < 5) {
            Object obj = this.f59045a;
            C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C12360a((Object[]) obj);
        }
        Object obj2 = this.f59045a;
        C13706o.m87927d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return C13698j0.m87906f(obj2).iterator();
    }

    public final /* bridge */ int size() {
        return mo68698d();
    }
}
