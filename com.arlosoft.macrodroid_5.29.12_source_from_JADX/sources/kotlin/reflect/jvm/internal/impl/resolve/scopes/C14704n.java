package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.resolve.C14671l;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p263fb.C12253b;
import p264fc.C12260a;
import p272gc.C12354e;
import p297ja.C13328m;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.n */
/* compiled from: TypeIntersectionScope.kt */
public final class C14704n extends C14677a {

    /* renamed from: d */
    public static final C14705a f63734d = new C14705a((C13695i) null);

    /* renamed from: b */
    private final String f63735b;

    /* renamed from: c */
    private final C14692h f63736c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.n$a */
    /* compiled from: TypeIntersectionScope.kt */
    public static final class C14705a {
        private C14705a() {
        }

        public /* synthetic */ C14705a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14692h mo73829a(String str, Collection<? extends C14900e0> collection) {
            C13706o.m87929f(str, "message");
            C13706o.m87929f(collection, "types");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(collection, 10));
            for (C14900e0 n : collection) {
                arrayList.add(n.mo72955n());
            }
            C12354e<C14692h> b = C12260a.m83003b(arrayList);
            C14692h b2 = C14678b.f63681d.mo73797b(str, b);
            if (b.size() <= 1) {
                return b2;
            }
            return new C14704n(str, b2, (C13695i) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.n$b */
    /* compiled from: TypeIntersectionScope.kt */
    static final class C14706b extends C13708q implements C16265l<C13908a, C13908a> {

        /* renamed from: a */
        public static final C14706b f63737a = new C14706b();

        C14706b() {
            super(1);
        }

        /* renamed from: a */
        public final C13908a invoke(C13908a aVar) {
            C13706o.m87929f(aVar, "$this$selectMostSpecificInEachOverridableGroup");
            return aVar;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.n$c */
    /* compiled from: TypeIntersectionScope.kt */
    static final class C14707c extends C13708q implements C16265l<C14156y0, C13908a> {

        /* renamed from: a */
        public static final C14707c f63738a = new C14707c();

        C14707c() {
            super(1);
        }

        /* renamed from: a */
        public final C13908a invoke(C14156y0 y0Var) {
            C13706o.m87929f(y0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return y0Var;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.n$d */
    /* compiled from: TypeIntersectionScope.kt */
    static final class C14708d extends C13708q implements C16265l<C14140t0, C13908a> {

        /* renamed from: a */
        public static final C14708d f63739a = new C14708d();

        C14708d() {
            super(1);
        }

        /* renamed from: a */
        public final C13908a invoke(C14140t0 t0Var) {
            C13706o.m87929f(t0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return t0Var;
        }
    }

    private C14704n(String str, C14692h hVar) {
        this.f63735b = str;
        this.f63736c = hVar;
    }

    public /* synthetic */ C14704n(String str, C14692h hVar, C13695i iVar) {
        this(str, hVar);
    }

    /* renamed from: j */
    public static final C14692h m91910j(String str, Collection<? extends C14900e0> collection) {
        return f63734d.mo73829a(str, collection);
    }

    /* renamed from: c */
    public Collection<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return C14671l.m91795a(super.mo72450c(fVar, bVar), C14707c.f63738a);
    }

    /* renamed from: d */
    public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return C14671l.m91795a(super.mo72451d(fVar, bVar), C14708d.f63739a);
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        Collection<C14064m> g = super.mo72405g(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : g) {
            if (((C14064m) next) instanceof C13908a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        C13328m mVar = new C13328m(arrayList, arrayList2);
        List list = (List) mVar.mo70152a();
        C13706o.m87927d(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return C13566b0.m87442q0(C14671l.m91795a(list, C14706b.f63737a), (List) mVar.mo70153b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C14692h mo73794i() {
        return this.f63736c;
    }
}
