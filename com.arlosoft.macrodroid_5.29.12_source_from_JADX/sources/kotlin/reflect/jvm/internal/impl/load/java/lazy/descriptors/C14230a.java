package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.sequences.C15118h;
import p288ib.C12492g;
import p288ib.C12499n;
import p288ib.C12501p;
import p288ib.C12502q;
import p288ib.C12503r;
import p288ib.C12509w;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a */
/* compiled from: DeclaredMemberIndex.kt */
public class C14230a implements C14232b {

    /* renamed from: a */
    private final C12492g f62956a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16265l<C12502q, Boolean> f62957b;

    /* renamed from: c */
    private final C16265l<C12503r, Boolean> f62958c;

    /* renamed from: d */
    private final Map<C16157f, List<C12503r>> f62959d;

    /* renamed from: e */
    private final Map<C16157f, C12499n> f62960e;

    /* renamed from: f */
    private final Map<C16157f, C12509w> f62961f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a$a */
    /* compiled from: DeclaredMemberIndex.kt */
    static final class C14231a extends C13708q implements C16265l<C12503r, Boolean> {
        final /* synthetic */ C14230a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14231a(C14230a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C12503r rVar) {
            C13706o.m87929f(rVar, "m");
            return Boolean.valueOf(((Boolean) this.this$0.f62957b.invoke(rVar)).booleanValue() && !C12501p.m83606c(rVar));
        }
    }

    public C14230a(C12492g gVar, C16265l<? super C12502q, Boolean> lVar) {
        C13706o.m87929f(gVar, "jClass");
        C13706o.m87929f(lVar, "memberFilter");
        this.f62956a = gVar;
        this.f62957b = lVar;
        C14231a aVar = new C14231a(this);
        this.f62958c = aVar;
        C15118h n = C15132p.m93485n(C13566b0.m87412N(gVar.getMethods()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : n) {
            C16157f name = ((C12503r) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f62959d = linkedHashMap;
        C15118h n2 = C15132p.m93485n(C13566b0.m87412N(this.f62956a.getFields()), this.f62957b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object next2 : n2) {
            linkedHashMap2.put(((C12499n) next2).getName(), next2);
        }
        this.f62960e = linkedHashMap2;
        Collection<C12509w> n3 = this.f62956a.mo68974n();
        C16265l<C12502q, Boolean> lVar2 = this.f62957b;
        ArrayList arrayList = new ArrayList();
        for (T next3 : n3) {
            if (lVar2.invoke(next3).booleanValue()) {
                arrayList.add(next3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(arrayList, 10)), 16));
        for (Object next4 : arrayList) {
            linkedHashMap3.put(((C12509w) next4).getName(), next4);
        }
        this.f62961f = linkedHashMap3;
    }

    /* renamed from: a */
    public Set<C16157f> mo72792a() {
        C15118h<C12503r> n = C15132p.m93485n(C13566b0.m87412N(this.f62956a.getMethods()), this.f62958c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C12503r name : n) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public Collection<C12503r> mo72793b(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        List list = this.f62959d.get(fVar);
        return list != null ? list : C13614t.m87748j();
    }

    /* renamed from: c */
    public C12499n mo72794c(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        return this.f62960e.get(fVar);
    }

    /* renamed from: d */
    public C12509w mo72795d(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        return this.f62961f.get(fVar);
    }

    /* renamed from: e */
    public Set<C16157f> mo72796e() {
        return this.f62961f.keySet();
    }

    /* renamed from: f */
    public Set<C16157f> mo72797f() {
        C15118h<C12499n> n = C15132p.m93485n(C13566b0.m87412N(this.f62956a.getFields()), this.f62957b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C12499n name : n) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }
}
