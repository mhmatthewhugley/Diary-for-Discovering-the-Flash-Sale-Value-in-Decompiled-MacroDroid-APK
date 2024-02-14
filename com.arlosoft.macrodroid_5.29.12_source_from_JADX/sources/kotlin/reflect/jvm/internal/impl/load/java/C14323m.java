package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p297ja.C13337s;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16160i;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.m */
/* compiled from: FakePureImplementationsProvider.kt */
public final class C14323m {

    /* renamed from: a */
    public static final C14323m f63100a;

    /* renamed from: b */
    private static final Map<C16151b, C16151b> f63101b;

    /* renamed from: c */
    private static final Map<C16152c, C16152c> f63102c;

    static {
        C14323m mVar = new C14323m();
        f63100a = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f63101b = linkedHashMap;
        C16160i iVar = C16160i.f66342a;
        mVar.m90238c(iVar.mo78600j(), mVar.m90237a("java.util.ArrayList", "java.util.LinkedList"));
        mVar.m90238c(iVar.mo78602l(), mVar.m90237a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        mVar.m90238c(iVar.mo78601k(), mVar.m90237a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C16151b m = C16151b.m96975m(new C16152c("java.util.function.Function"));
        C13706o.m87928e(m, "topLevel(FqName(\"java.util.function.Function\"))");
        mVar.m90238c(m, mVar.m90237a("java.util.function.UnaryOperator"));
        C16151b m2 = C16151b.m96975m(new C16152c("java.util.function.BiFunction"));
        C13706o.m87928e(m2, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        mVar.m90238c(m2, mVar.m90237a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(C13337s.m85692a(((C16151b) entry.getKey()).mo78544b(), ((C16151b) entry.getValue()).mo78544b()));
        }
        f63102c = C13615t0.m87768r(arrayList);
    }

    private C14323m() {
    }

    /* renamed from: a */
    private final List<C16151b> m90237a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String cVar : strArr) {
            arrayList.add(C16151b.m96975m(new C16152c(cVar)));
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void m90238c(C16151b bVar, List<C16151b> list) {
        Map<C16151b, C16151b> map = f63101b;
        for (T next : list) {
            C16151b bVar2 = (C16151b) next;
            map.put(next, bVar);
        }
    }

    /* renamed from: b */
    public final C16152c mo72966b(C16152c cVar) {
        C13706o.m87929f(cVar, "classFqName");
        return f63102c.get(cVar);
    }
}
