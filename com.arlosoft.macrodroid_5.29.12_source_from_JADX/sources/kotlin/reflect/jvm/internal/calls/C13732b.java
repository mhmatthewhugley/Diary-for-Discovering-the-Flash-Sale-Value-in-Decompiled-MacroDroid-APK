package kotlin.reflect.jvm.internal.calls;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.C13719a0;
import p297ja.C13321g;
import p361pa.C16147a;
import p370qa.C16254a;
import p370qa.C16265l;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a$\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001aK\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u0016\u0010\u0014\u001a\u00020\u0004\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u0002²\u0006\u0016\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u0002"}, mo71668d2 = {"", "Ljava/lang/Class;", "expectedType", "l", "", "index", "", "name", "expectedJvmType", "", "k", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "f", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.calls.b */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C13732b {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "T", "", "a", "()Ljava/lang/Integer;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.b$a */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C13733a extends C13708q implements C16254a<Integer> {
        final /* synthetic */ Map<String, Object> $values;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13733a(Map<String, ? extends Object> map) {
            super(0);
            this.$values = map;
        }

        /* renamed from: a */
        public final Integer invoke() {
            int i;
            int i2 = 0;
            for (Map.Entry entry : this.$values.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    i = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    i = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    i = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    i = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    i = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    i = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    i = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    i = Arrays.hashCode((double[]) value);
                } else if (value instanceof Object[]) {
                    i = Arrays.hashCode((Object[]) value);
                } else {
                    i = value.hashCode();
                }
                i2 += i ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i2);
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00012\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062,\u0010\u0007\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\b0\bH\n¢\u0006\u0004\b\t\u0010\n"}, mo71668d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", "<anonymous parameter 0>", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.calls.b$b */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C13734b implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Class<T> f61957a;

        /* renamed from: b */
        final /* synthetic */ Map<String, Object> f61958b;

        /* renamed from: c */
        final /* synthetic */ C13321g<String> f61959c;

        /* renamed from: d */
        final /* synthetic */ C13321g<Integer> f61960d;

        /* renamed from: e */
        final /* synthetic */ List<Method> f61961e;

        C13734b(Class<T> cls, Map<String, ? extends Object> map, C13321g<String> gVar, C13321g<Integer> gVar2, List<Method> list) {
            this.f61957a = cls;
            this.f61958b = map;
            this.f61959c = gVar;
            this.f61960d = gVar2;
            this.f61961e = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f61957a;
                        }
                    } else if (name.equals("hashCode")) {
                        return Integer.valueOf(C13732b.m87993i(this.f61960d));
                    }
                } else if (name.equals("toString")) {
                    return C13732b.m87994j(this.f61959c);
                }
            }
            if (C13706o.m87924a(name, "equals")) {
                boolean z = true;
                if (objArr == null || objArr.length != 1) {
                    z = false;
                }
                if (z) {
                    Class<T> cls = this.f61957a;
                    List<Method> list = this.f61961e;
                    Map<String, Object> map = this.f61958b;
                    C13706o.m87928e(objArr, "args");
                    return Boolean.valueOf(C13732b.m87992h(cls, list, map, C13596m.m87597V(objArr)));
                }
            }
            if (this.f61958b.containsKey(name)) {
                return this.f61958b.get(name);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(C13596m.m87610i0(objArr));
            sb.append(')');
            throw new C13719a0(sb.toString());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "T", "", "a", "()Ljava/lang/String;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.b$c */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C13735c extends C13708q implements C16254a<String> {
        final /* synthetic */ Class<T> $annotationClass;
        final /* synthetic */ Map<String, Object> $values;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo71668d2 = {"", "T", "", "", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.b$c$a */
        /* compiled from: AnnotationConstructorCaller.kt */
        static final class C13736a extends C13708q implements C16265l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* renamed from: a */
            public static final C13736a f61962a = new C13736a();

            C13736a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
                String str;
                C13706o.m87929f(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    str = Arrays.toString((boolean[]) value);
                    C13706o.m87928e(str, "toString(this)");
                } else if (value instanceof char[]) {
                    str = Arrays.toString((char[]) value);
                    C13706o.m87928e(str, "toString(this)");
                } else if (value instanceof byte[]) {
                    str = Arrays.toString((byte[]) value);
                    C13706o.m87928e(str, "toString(this)");
                } else if (value instanceof short[]) {
                    str = Arrays.toString((short[]) value);
                    C13706o.m87928e(str, "toString(this)");
                } else if (value instanceof int[]) {
                    str = Arrays.toString((int[]) value);
                    C13706o.m87928e(str, "toString(this)");
                } else if (value instanceof float[]) {
                    str = Arrays.toString((float[]) value);
                    C13706o.m87928e(str, "toString(this)");
                } else if (value instanceof long[]) {
                    str = Arrays.toString((long[]) value);
                    C13706o.m87928e(str, "toString(this)");
                } else if (value instanceof double[]) {
                    str = Arrays.toString((double[]) value);
                    C13706o.m87928e(str, "toString(this)");
                } else if (value instanceof Object[]) {
                    str = Arrays.toString((Object[]) value);
                    C13706o.m87928e(str, "toString(this)");
                } else {
                    str = value.toString();
                }
                return key + '=' + str;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13735c(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.$annotationClass = cls;
            this.$values = map;
        }

        /* renamed from: a */
        public final String invoke() {
            Class<T> cls = this.$annotationClass;
            Map<String, Object> map = this.$values;
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(cls.getCanonicalName());
            Appendable unused = C13566b0.m87430e0(map.entrySet(), sb, ", ", "(", ")", 0, (CharSequence) null, C13736a.f61962a, 48, (Object) null);
            String sb2 = sb.toString();
            C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    /* renamed from: f */
    public static final <T> T m87990f(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        C13706o.m87929f(cls, "annotationClass");
        C13706o.m87929f(map, "values");
        C13706o.m87929f(list, "methods");
        C13321g b = C13323i.m85669b(new C13733a(map));
        C13321g b2 = C13323i.m85669b(new C13735c(cls, map));
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C13734b(cls, map, b2, b, list));
        C13706o.m87927d(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m87991g(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set<String> keySet = map.keySet();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(keySet, 10));
            for (String declaredMethod : keySet) {
                arrayList.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
            }
            list = arrayList;
        }
        return m87990f(cls, map, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final <T> boolean m87992h(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        boolean z;
        boolean z2;
        C16875d a;
        Class cls2 = null;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (!(annotation == null || (a = C16147a.m96967a(annotation)) == null)) {
            cls2 = C16147a.m96968b(a);
        }
        if (C13706o.m87924a(cls2, cls)) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Method method = (Method) it.next();
                    Object obj2 = map.get(method.getName());
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        z2 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                        continue;
                    } else if (obj2 instanceof char[]) {
                        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                        z2 = Arrays.equals((char[]) obj2, (char[]) invoke);
                        continue;
                    } else if (obj2 instanceof byte[]) {
                        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        z2 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                        continue;
                    } else if (obj2 instanceof short[]) {
                        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        z2 = Arrays.equals((short[]) obj2, (short[]) invoke);
                        continue;
                    } else if (obj2 instanceof int[]) {
                        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                        z2 = Arrays.equals((int[]) obj2, (int[]) invoke);
                        continue;
                    } else if (obj2 instanceof float[]) {
                        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        z2 = Arrays.equals((float[]) obj2, (float[]) invoke);
                        continue;
                    } else if (obj2 instanceof long[]) {
                        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                        z2 = Arrays.equals((long[]) obj2, (long[]) invoke);
                        continue;
                    } else if (obj2 instanceof double[]) {
                        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        z2 = Arrays.equals((double[]) obj2, (double[]) invoke);
                        continue;
                    } else if (obj2 instanceof Object[]) {
                        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        z2 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                        continue;
                    } else {
                        z2 = C13706o.m87924a(obj2, invoke);
                        continue;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final int m87993i(C13321g<Integer> gVar) {
        return gVar.getValue().intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final String m87994j(C13321g<String> gVar) {
        return gVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final Void m87995k(int i, String str, Class<?> cls) {
        C16875d<?> dVar;
        String str2;
        if (C13706o.m87924a(cls, Class.class)) {
            dVar = C13687e0.m87868b(C16875d.class);
        } else if (!cls.isArray() || !C13706o.m87924a(cls.getComponentType(), Class.class)) {
            dVar = C16147a.m96971e(cls);
        } else {
            dVar = C13687e0.m87868b(C16875d[].class);
        }
        if (C13706o.m87924a(dVar.mo71942g(), C13687e0.m87868b(Object[].class).mo71942g())) {
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.mo71942g());
            sb.append('<');
            Class<?> componentType = C16147a.m96968b(dVar).getComponentType();
            C13706o.m87928e(componentType, "kotlinClass.java.componentType");
            sb.append(C16147a.m96971e(componentType).mo71942g());
            sb.append('>');
            str2 = sb.toString();
        } else {
            str2 = dVar.mo71942g();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final Object m87996l(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof C16875d) {
            obj = C16147a.m96968b((C16875d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof C16875d[]) {
                C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                C16875d[] dVarArr = (C16875d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (C16875d b : dVarArr) {
                    arrayList.add(C16147a.m96968b(b));
                }
                obj = arrayList.toArray(new Class[0]);
                C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
