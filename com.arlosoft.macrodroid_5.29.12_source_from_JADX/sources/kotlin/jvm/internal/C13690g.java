package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.apache.commons.p353io.FilenameUtils;
import p297ja.C13316c;
import p297ja.C13328m;
import p297ja.C13337s;
import p361pa.C16147a;
import p370qa.C16254a;
import p370qa.C16255b;
import p370qa.C16256c;
import p370qa.C16257d;
import p370qa.C16258e;
import p370qa.C16259f;
import p370qa.C16260g;
import p370qa.C16261h;
import p370qa.C16262i;
import p370qa.C16263j;
import p370qa.C16264k;
import p370qa.C16265l;
import p370qa.C16266m;
import p370qa.C16267n;
import p370qa.C16268o;
import p370qa.C16269p;
import p370qa.C16270q;
import p370qa.C16271r;
import p370qa.C16272s;
import p370qa.C16273t;
import p370qa.C16274u;
import p370qa.C16275v;
import p370qa.C16276w;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0013\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0017J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001e\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, mo71668d2 = {"Lkotlin/jvm/internal/g;", "Lxa/d;", "", "Lkotlin/jvm/internal/f;", "value", "", "d", "other", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "jClass", "j", "()Ljava/lang/String;", "simpleName", "g", "qualifiedName", "<init>", "(Ljava/lang/Class;)V", "c", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.jvm.internal.g */
/* compiled from: ClassReference.kt */
public final class C13690g implements C16875d<Object>, C13688f {

    /* renamed from: c */
    public static final C13691a f61922c = new C13691a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Map<Class<? extends C13316c<?>>, Integer> f61923d;

    /* renamed from: f */
    private static final HashMap<String, String> f61924f;

    /* renamed from: g */
    private static final HashMap<String, String> f61925g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final HashMap<String, String> f61926o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final Map<String, String> f61927p;

    /* renamed from: a */
    private final Class<?> f61928a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R,\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0002\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0018"}, mo71668d2 = {"Lkotlin/jvm/internal/g$a;", "", "Ljava/lang/Class;", "jClass", "", "b", "a", "value", "", "c", "", "Lja/c;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.jvm.internal.g$a */
    /* compiled from: ClassReference.kt */
    public static final class C13691a {
        private C13691a() {
        }

        public /* synthetic */ C13691a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final String mo71946a(Class<?> cls) {
            String str;
            C13706o.m87929f(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C13690g.f61926o.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) C13690g.f61926o.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }

        /* renamed from: b */
        public final String mo71947b(Class<?> cls) {
            String str;
            C13706o.m87929f(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        C13706o.m87928e(simpleName, "name");
                        String I0 = C15177w.m93654I0(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (I0 != null) {
                            return I0;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        C13706o.m87928e(simpleName, "name");
                        return C15177w.m93654I0(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                    }
                    C13706o.m87928e(simpleName, "name");
                    return C15177w.m93653H0(simpleName, '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) C13690g.f61927p.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) C13690g.f61927p.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }

        /* renamed from: c */
        public final boolean mo71948c(Object obj, Class<?> cls) {
            C13706o.m87929f(cls, "jClass");
            Map m = C13690g.f61923d;
            C13706o.m87927d(m, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) m.get(cls);
            if (num != null) {
                return C13698j0.m87915o(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = C16147a.m96969c(C16147a.m96971e(cls));
            }
            return cls.isInstance(obj);
        }
    }

    static {
        int i = 0;
        List m = C13614t.m87751m(C16254a.class, C16265l.class, C16269p.class, C16270q.class, C16271r.class, C16272s.class, C16273t.class, C16274u.class, C16275v.class, C16276w.class, C16255b.class, C16256c.class, C16257d.class, C16258e.class, C16259f.class, C16260g.class, C16261h.class, C16262i.class, C16263j.class, C16264k.class, C16266m.class, C16267n.class, C16268o.class);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(m, 10));
        for (Object next : m) {
            int i2 = i + 1;
            if (i < 0) {
                C13614t.m87758t();
            }
            arrayList.add(C13337s.m85692a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f61923d = C13615t0.m87768r(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f61924f = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f61925g = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C13706o.m87928e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C13706o.m87928e(str, "kotlinName");
            sb.append(C15177w.m93658K0(str, FilenameUtils.EXTENSION_SEPARATOR, (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C13328m a = C13337s.m85692a(sb2, str + ".Companion");
            hashMap3.put(a.mo70154c(), a.mo70155d());
        }
        for (Map.Entry next2 : f61923d.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f61926o = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13613s0.m87740e(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C15177w.m93658K0((String) entry.getValue(), FilenameUtils.EXTENSION_SEPARATOR, (String) null, 2, (Object) null));
        }
        f61927p = linkedHashMap;
    }

    public C13690g(Class<?> cls) {
        C13706o.m87929f(cls, "jClass");
        this.f61928a = cls;
    }

    /* renamed from: d */
    public boolean mo71940d(Object obj) {
        return f61922c.mo71948c(obj, mo71931e());
    }

    /* renamed from: e */
    public Class<?> mo71931e() {
        return this.f61928a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13690g) && C13706o.m87924a(C16147a.m96969c(this), C16147a.m96969c((C16875d) obj));
    }

    /* renamed from: g */
    public String mo71942g() {
        return f61922c.mo71946a(mo71931e());
    }

    public int hashCode() {
        return C16147a.m96969c(this).hashCode();
    }

    /* renamed from: j */
    public String mo71944j() {
        return f61922c.mo71947b(mo71931e());
    }

    public String toString() {
        return mo71931e().toString() + " (Kotlin reflection is not available)";
    }
}
