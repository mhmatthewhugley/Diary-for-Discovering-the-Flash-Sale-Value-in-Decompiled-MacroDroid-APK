package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.resolve.C14656h;
import kotlin.reflect.jvm.internal.impl.resolve.C14658j;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14698k;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p263fb.C12253b;
import p272gc.C12338a;
import p272gc.C12354e;
import p297ja.C13339u;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.e */
/* compiled from: GivenFunctionsMemberScope.kt */
public abstract class C14686e extends C14696i {

    /* renamed from: d */
    static final /* synthetic */ C16887m<Object>[] f63715d = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C14686e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b */
    private final C13948e f63716b;

    /* renamed from: c */
    private final C17006i f63717c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.e$a */
    /* compiled from: GivenFunctionsMemberScope.kt */
    static final class C14687a extends C13708q implements C16254a<List<? extends C14064m>> {
        final /* synthetic */ C14686e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14687a(C14686e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* renamed from: a */
        public final List<C14064m> invoke() {
            List<C14154y> i = this.this$0.mo62203i();
            return C13566b0.m87442q0(i, this.this$0.m91849j(i));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.e$b */
    /* compiled from: GivenFunctionsMemberScope.kt */
    public static final class C14688b extends C14656h {

        /* renamed from: a */
        final /* synthetic */ ArrayList<C14064m> f63718a;

        /* renamed from: b */
        final /* synthetic */ C14686e f63719b;

        C14688b(ArrayList<C14064m> arrayList, C14686e eVar) {
            this.f63718a = arrayList;
            this.f63719b = eVar;
        }

        /* renamed from: a */
        public void mo72455a(C13936b bVar) {
            C13706o.m87929f(bVar, "fakeOverride");
            C14658j.m91664K(bVar, (C16265l<C13936b, C13339u>) null);
            this.f63718a.add(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo72456e(C13936b bVar, C13936b bVar2) {
            C13706o.m87929f(bVar, "fromSuper");
            C13706o.m87929f(bVar2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f63719b.mo73817l() + ": " + bVar + " vs " + bVar2).toString());
        }
    }

    public C14686e(C17012n nVar, C13948e eVar) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(eVar, "containingClass");
        this.f63716b = eVar;
        this.f63717c = nVar.mo80221f(new C14687a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final List<C14064m> m91849j(List<? extends C14154y> list) {
        Collection collection;
        ArrayList arrayList = new ArrayList(3);
        Collection<C14900e0> l = this.f63716b.mo62171j().mo72370l();
        C13706o.m87928e(l, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (C14900e0 n : l) {
            boolean unused = C13624y.m87797z(arrayList2, C14698k.C14699a.m91887a(n.mo72955n(), (C14683d) null, (C16265l) null, 3, (Object) null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (next instanceof C13936b) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList3) {
            C16157f name = ((C13936b) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C16157f fVar = (C16157f) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((C13936b) next3) instanceof C14154y);
                Object obj2 = linkedHashMap2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                C14658j jVar = C14658j.f63654f;
                if (booleanValue) {
                    collection = new ArrayList();
                    for (T next4 : list) {
                        if (C13706o.m87924a(((C14154y) next4).getName(), fVar)) {
                            collection.add(next4);
                        }
                    }
                } else {
                    collection = C13614t.m87748j();
                }
                jVar.mo73771v(fVar, list2, collection, this.f63716b, new C14688b(arrayList, this));
            }
        }
        return C12338a.m83073c(arrayList);
    }

    /* renamed from: k */
    private final List<C14064m> m91850k() {
        return (List) C17011m.m100276a(this.f63717c, this, f63715d[0]);
    }

    /* renamed from: c */
    public Collection<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        List<C14064m> k = m91850k();
        C12354e eVar = new C12354e();
        for (T next : k) {
            if ((next instanceof C14156y0) && C13706o.m87924a(((C14156y0) next).getName(), fVar)) {
                eVar.add(next);
            }
        }
        return eVar;
    }

    /* renamed from: d */
    public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        List<C14064m> k = m91850k();
        C12354e eVar = new C12354e();
        for (T next : k) {
            if ((next instanceof C14140t0) && C13706o.m87924a(((C14140t0) next).getName(), fVar)) {
                eVar.add(next);
            }
        }
        return eVar;
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        if (!dVar.mo73800a(C14683d.f63700p.mo73804m())) {
            return C13614t.m87748j();
        }
        return m91850k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract List<C14154y> mo62203i();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C13948e mo73817l() {
        return this.f63716b;
    }
}
