package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import p297ja.C13328m;
import p297ja.C13337s;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.g */
/* compiled from: BuiltinSpecialProperties.kt */
public final class C14202g {

    /* renamed from: a */
    public static final C14202g f62890a = new C14202g();

    /* renamed from: b */
    private static final Map<C16152c, C16157f> f62891b;

    /* renamed from: c */
    private static final Map<C16157f, List<C16157f>> f62892c;

    /* renamed from: d */
    private static final Set<C16152c> f62893d;

    /* renamed from: e */
    private static final Set<C16157f> f62894e;

    static {
        C16153d dVar = C13902k.C13903a.f62275s;
        C16152c cVar = C13902k.C13903a.f62237Y;
        Map<C16152c, C16157f> l = C13615t0.m87762l(C13337s.m85692a(C14207h.m89766d(dVar, "name"), C16157f.m97019i("name")), C13337s.m85692a(C14207h.m89766d(dVar, "ordinal"), C16157f.m97019i("ordinal")), C13337s.m85692a(C14207h.m89765c(C13902k.C13903a.f62233U, "size"), C16157f.m97019i("size")), C13337s.m85692a(C14207h.m89765c(cVar, "size"), C16157f.m97019i("size")), C13337s.m85692a(C14207h.m89766d(C13902k.C13903a.f62251g, "length"), C16157f.m97019i("length")), C13337s.m85692a(C14207h.m89765c(cVar, "keys"), C16157f.m97019i("keySet")), C13337s.m85692a(C14207h.m89765c(cVar, "values"), C16157f.m97019i("values")), C13337s.m85692a(C14207h.m89765c(cVar, "entries"), C16157f.m97019i("entrySet")));
        f62891b = l;
        Set<Map.Entry<C16152c, C16157f>> entrySet = l.entrySet();
        ArrayList<C13328m> arrayList = new ArrayList<>(C13616u.m87774u(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new C13328m(((C16152c) entry.getKey()).mo78562g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C13328m mVar : arrayList) {
            C16157f fVar = (C16157f) mVar.mo70155d();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((C16157f) mVar.mo70154c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C13613s0.m87740e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C13566b0.m87415P((Iterable) entry2.getValue()));
        }
        f62892c = linkedHashMap2;
        Set<C16152c> keySet = f62891b.keySet();
        f62893d = keySet;
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(keySet, 10));
        for (C16152c g : keySet) {
            arrayList2.add(g.mo78562g());
        }
        f62894e = C13566b0.m87407K0(arrayList2);
    }

    private C14202g() {
    }

    /* renamed from: a */
    public final Map<C16152c, C16157f> mo72731a() {
        return f62891b;
    }

    /* renamed from: b */
    public final List<C16157f> mo72732b(C16157f fVar) {
        C13706o.m87929f(fVar, "name1");
        List<C16157f> list = f62892c.get(fVar);
        return list == null ? C13614t.m87748j() : list;
    }

    /* renamed from: c */
    public final Set<C16152c> mo72733c() {
        return f62893d;
    }

    /* renamed from: d */
    public final Set<C16157f> mo72734d() {
        return f62894e;
    }
}
