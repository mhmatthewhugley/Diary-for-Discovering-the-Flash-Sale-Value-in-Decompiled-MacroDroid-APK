package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14473x;
import p297ja.C13328m;
import p297ja.C13337s;
import p362pb.C16157f;
import p398tb.C16610e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.h0 */
/* compiled from: SpecialGenericSignatures.kt */
public class C14208h0 {

    /* renamed from: a */
    public static final C14209a f62898a = new C14209a((C13695i) null);

    /* renamed from: b */
    private static final List<C14209a.C14210a> f62899b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final List<String> f62900c;

    /* renamed from: d */
    private static final List<String> f62901d;

    /* renamed from: e */
    private static final Map<C14209a.C14210a, C14212c> f62902e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Map<String, C14212c> f62903f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Set<C16157f> f62904g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Set<String> f62905h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C14209a.C14210a f62906i;

    /* renamed from: j */
    private static final Map<C14209a.C14210a, C16157f> f62907j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Map<String, C16157f> f62908k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final List<C16157f> f62909l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Map<C16157f, C16157f> f62910m;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.h0$a */
    /* compiled from: SpecialGenericSignatures.kt */
    public static final class C14209a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.h0$a$a */
        /* compiled from: SpecialGenericSignatures.kt */
        public static final class C14210a {

            /* renamed from: a */
            private final C16157f f62911a;

            /* renamed from: b */
            private final String f62912b;

            public C14210a(C16157f fVar, String str) {
                C13706o.m87929f(fVar, "name");
                C13706o.m87929f(str, "signature");
                this.f62911a = fVar;
                this.f62912b = str;
            }

            /* renamed from: a */
            public final C16157f mo72749a() {
                return this.f62911a;
            }

            /* renamed from: b */
            public final String mo72750b() {
                return this.f62912b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C14210a)) {
                    return false;
                }
                C14210a aVar = (C14210a) obj;
                return C13706o.m87924a(this.f62911a, aVar.f62911a) && C13706o.m87924a(this.f62912b, aVar.f62912b);
            }

            public int hashCode() {
                return (this.f62911a.hashCode() * 31) + this.f62912b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f62911a + ", signature=" + this.f62912b + ')';
            }
        }

        private C14209a() {
        }

        public /* synthetic */ C14209a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final C14210a m89776m(String str, String str2, String str3, String str4) {
            C16157f i = C16157f.m97019i(str2);
            C13706o.m87928e(i, "identifier(name)");
            C14473x xVar = C14473x.f63314a;
            return new C14210a(i, xVar.mo73225k(str, str2 + '(' + str3 + ')' + str4));
        }

        /* renamed from: b */
        public final C16157f mo72738b(C16157f fVar) {
            C13706o.m87929f(fVar, "name");
            return mo72742f().get(fVar);
        }

        /* renamed from: c */
        public final List<String> mo72739c() {
            return C14208h0.f62900c;
        }

        /* renamed from: d */
        public final Set<C16157f> mo72740d() {
            return C14208h0.f62904g;
        }

        /* renamed from: e */
        public final Set<String> mo72741e() {
            return C14208h0.f62905h;
        }

        /* renamed from: f */
        public final Map<C16157f, C16157f> mo72742f() {
            return C14208h0.f62910m;
        }

        /* renamed from: g */
        public final List<C16157f> mo72743g() {
            return C14208h0.f62909l;
        }

        /* renamed from: h */
        public final C14210a mo72744h() {
            return C14208h0.f62906i;
        }

        /* renamed from: i */
        public final Map<String, C14212c> mo72745i() {
            return C14208h0.f62903f;
        }

        /* renamed from: j */
        public final Map<String, C16157f> mo72746j() {
            return C14208h0.f62908k;
        }

        /* renamed from: k */
        public final boolean mo72747k(C16157f fVar) {
            C13706o.m87929f(fVar, "<this>");
            return mo72743g().contains(fVar);
        }

        /* renamed from: l */
        public final C14211b mo72748l(String str) {
            C13706o.m87929f(str, "builtinSignature");
            if (mo72739c().contains(str)) {
                return C14211b.ONE_COLLECTION_PARAMETER;
            }
            if (((C14212c) C13615t0.m87760j(mo72745i(), str)) == C14212c.NULL) {
                return C14211b.OBJECT_PARAMETER_GENERIC;
            }
            return C14211b.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.h0$b */
    /* compiled from: SpecialGenericSignatures.kt */
    public enum C14211b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC((String) null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        private C14211b(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.h0$c */
    /* compiled from: SpecialGenericSignatures.kt */
    public enum C14212c {
        NULL((String) null),
        INDEX(-1),
        FALSE(Boolean.FALSE);
        
        private final Object defaultValue;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.h0$c$a */
        /* compiled from: SpecialGenericSignatures.kt */
        static final class C14213a extends C14212c {
            C14213a(String str, int i) {
                super(str, i, (Object) null, (C13695i) null);
            }
        }

        private C14212c(Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        Set<String> g = C13627z0.m87809g("containsAll", "removeAll", "retainAll");
        ArrayList<C14209a.C14210a> arrayList = new ArrayList<>(C13616u.m87774u(g, 10));
        for (String a : g) {
            C14209a aVar = f62898a;
            String f = C16610e.BOOLEAN.mo79462f();
            C13706o.m87928e(f, "BOOLEAN.desc");
            arrayList.add(aVar.m89776m("java/util/Collection", a, "Ljava/util/Collection;", f));
        }
        f62899b = arrayList;
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
        for (C14209a.C14210a b : arrayList) {
            arrayList2.add(b.mo72750b());
        }
        f62900c = arrayList2;
        List<C14209a.C14210a> list = f62899b;
        ArrayList arrayList3 = new ArrayList(C13616u.m87774u(list, 10));
        for (C14209a.C14210a a2 : list) {
            arrayList3.add(a2.mo72749a().mo78583d());
        }
        f62901d = arrayList3;
        C14473x xVar = C14473x.f63314a;
        C14209a aVar2 = f62898a;
        String i = xVar.mo73223i("Collection");
        C16610e eVar = C16610e.BOOLEAN;
        String f2 = eVar.mo79462f();
        C13706o.m87928e(f2, "BOOLEAN.desc");
        C14209a.C14210a a3 = aVar2.m89776m(i, "contains", "Ljava/lang/Object;", f2);
        C14212c cVar = C14212c.FALSE;
        String i2 = xVar.mo73223i("Collection");
        String f3 = eVar.mo79462f();
        C13706o.m87928e(f3, "BOOLEAN.desc");
        String i3 = xVar.mo73223i("Map");
        String f4 = eVar.mo79462f();
        C13706o.m87928e(f4, "BOOLEAN.desc");
        String i4 = xVar.mo73223i("Map");
        String f5 = eVar.mo79462f();
        C13706o.m87928e(f5, "BOOLEAN.desc");
        String i5 = xVar.mo73223i("Map");
        String f6 = eVar.mo79462f();
        C13706o.m87928e(f6, "BOOLEAN.desc");
        C14209a.C14210a a4 = aVar2.m89776m(xVar.mo73223i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        C14212c cVar2 = C14212c.NULL;
        String i6 = xVar.mo73223i("List");
        C16610e eVar2 = C16610e.INT;
        String f7 = eVar2.mo79462f();
        C13706o.m87928e(f7, "INT.desc");
        C14209a.C14210a a5 = aVar2.m89776m(i6, "indexOf", "Ljava/lang/Object;", f7);
        C14212c cVar3 = C14212c.INDEX;
        String i7 = xVar.mo73223i("List");
        String f8 = eVar2.mo79462f();
        C13706o.m87928e(f8, "INT.desc");
        Map<C14209a.C14210a, C14212c> l = C13615t0.m87762l(C13337s.m85692a(a3, cVar), C13337s.m85692a(aVar2.m89776m(i2, "remove", "Ljava/lang/Object;", f3), cVar), C13337s.m85692a(aVar2.m89776m(i3, "containsKey", "Ljava/lang/Object;", f4), cVar), C13337s.m85692a(aVar2.m89776m(i4, "containsValue", "Ljava/lang/Object;", f5), cVar), C13337s.m85692a(aVar2.m89776m(i5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", f6), cVar), C13337s.m85692a(aVar2.m89776m(xVar.mo73223i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), C14212c.f62920f), C13337s.m85692a(a4, cVar2), C13337s.m85692a(aVar2.m89776m(xVar.mo73223i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2), C13337s.m85692a(a5, cVar3), C13337s.m85692a(aVar2.m89776m(i7, "lastIndexOf", "Ljava/lang/Object;", f8), cVar3));
        f62902e = l;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13613s0.m87740e(l.size()));
        for (Map.Entry entry : l.entrySet()) {
            linkedHashMap.put(((C14209a.C14210a) entry.getKey()).mo72750b(), entry.getValue());
        }
        f62903f = linkedHashMap;
        Set<C14209a.C14210a> j = C13563a1.m87391j(f62902e.keySet(), f62899b);
        ArrayList arrayList4 = new ArrayList(C13616u.m87774u(j, 10));
        for (C14209a.C14210a a6 : j) {
            arrayList4.add(a6.mo72749a());
        }
        f62904g = C13566b0.m87407K0(arrayList4);
        ArrayList arrayList5 = new ArrayList(C13616u.m87774u(j, 10));
        for (C14209a.C14210a b2 : j) {
            arrayList5.add(b2.mo72750b());
        }
        f62905h = C13566b0.m87407K0(arrayList5);
        C14209a aVar3 = f62898a;
        C16610e eVar3 = C16610e.INT;
        String f9 = eVar3.mo79462f();
        C13706o.m87928e(f9, "INT.desc");
        C14209a.C14210a a7 = aVar3.m89776m("java/util/List", "removeAt", f9, "Ljava/lang/Object;");
        f62906i = a7;
        C14473x xVar2 = C14473x.f63314a;
        String h = xVar2.mo73222h("Number");
        String f10 = C16610e.BYTE.mo79462f();
        C13706o.m87928e(f10, "BYTE.desc");
        String h2 = xVar2.mo73222h("Number");
        String f11 = C16610e.SHORT.mo79462f();
        C13706o.m87928e(f11, "SHORT.desc");
        String h3 = xVar2.mo73222h("Number");
        String f12 = eVar3.mo79462f();
        C13706o.m87928e(f12, "INT.desc");
        String h4 = xVar2.mo73222h("Number");
        String f13 = C16610e.LONG.mo79462f();
        C13706o.m87928e(f13, "LONG.desc");
        String h5 = xVar2.mo73222h("Number");
        String f14 = C16610e.FLOAT.mo79462f();
        C13706o.m87928e(f14, "FLOAT.desc");
        String h6 = xVar2.mo73222h("Number");
        String f15 = C16610e.DOUBLE.mo79462f();
        C13706o.m87928e(f15, "DOUBLE.desc");
        String h7 = xVar2.mo73222h("CharSequence");
        String f16 = eVar3.mo79462f();
        C13706o.m87928e(f16, "INT.desc");
        String f17 = C16610e.CHAR.mo79462f();
        C13706o.m87928e(f17, "CHAR.desc");
        Map<C14209a.C14210a, C16157f> l2 = C13615t0.m87762l(C13337s.m85692a(aVar3.m89776m(h, "toByte", "", f10), C16157f.m97019i("byteValue")), C13337s.m85692a(aVar3.m89776m(h2, "toShort", "", f11), C16157f.m97019i("shortValue")), C13337s.m85692a(aVar3.m89776m(h3, "toInt", "", f12), C16157f.m97019i("intValue")), C13337s.m85692a(aVar3.m89776m(h4, "toLong", "", f13), C16157f.m97019i("longValue")), C13337s.m85692a(aVar3.m89776m(h5, "toFloat", "", f14), C16157f.m97019i("floatValue")), C13337s.m85692a(aVar3.m89776m(h6, "toDouble", "", f15), C16157f.m97019i("doubleValue")), C13337s.m85692a(a7, C16157f.m97019i("remove")), C13337s.m85692a(aVar3.m89776m(h7, "get", f16, f17), C16157f.m97019i("charAt")));
        f62907j = l2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C13613s0.m87740e(l2.size()));
        for (Map.Entry entry2 : l2.entrySet()) {
            linkedHashMap2.put(((C14209a.C14210a) entry2.getKey()).mo72750b(), entry2.getValue());
        }
        f62908k = linkedHashMap2;
        Set<C14209a.C14210a> keySet = f62907j.keySet();
        ArrayList arrayList6 = new ArrayList(C13616u.m87774u(keySet, 10));
        for (C14209a.C14210a a8 : keySet) {
            arrayList6.add(a8.mo72749a());
        }
        f62909l = arrayList6;
        Set<Map.Entry<C14209a.C14210a, C16157f>> entrySet = f62907j.entrySet();
        ArrayList<C13328m> arrayList7 = new ArrayList<>(C13616u.m87774u(entrySet, 10));
        for (Map.Entry entry3 : entrySet) {
            arrayList7.add(new C13328m(((C14209a.C14210a) entry3.getKey()).mo72749a(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(arrayList7, 10)), 16));
        for (C13328m mVar : arrayList7) {
            linkedHashMap3.put((C16157f) mVar.mo70155d(), (C16157f) mVar.mo70154c());
        }
        f62910m = linkedHashMap3;
    }
}
