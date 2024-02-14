package p433xa;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13704m;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13707p;
import kotlin.sequences.C15118h;
import p361pa.C16147a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003\u001a\"\u0010\n\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\b8BX\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo71668d2 = {"Lxa/n;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "jClass", "", "Lxa/p;", "arguments", "e", "type", "", "h", "f", "(Lxa/n;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lxa/n;)V", "javaType", "g", "(Lxa/p;)Ljava/lang/reflect/Type;", "(Lxa/p;)V", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: xa.u */
/* compiled from: TypesJVM.kt */
public final class C16898u {

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: xa.u$a */
    /* compiled from: TypesJVM.kt */
    public /* synthetic */ class C16899a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68148a;

        static {
            int[] iArr = new int[C16893q.values().length];
            iArr[C16893q.IN.ordinal()] = 1;
            iArr[C16893q.INVARIANT.ordinal()] = 2;
            iArr[C16893q.OUT.ordinal()] = 3;
            f68148a = iArr;
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: xa.u$b */
    /* compiled from: TypesJVM.kt */
    /* synthetic */ class C16900b extends C13704m implements C16265l<Class<?>, Class<?>> {

        /* renamed from: a */
        public static final C16900b f68149a = new C16900b();

        C16900b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        /* renamed from: l */
        public final Class<?> invoke(Class<?> cls) {
            C13706o.m87929f(cls, "p0");
            return cls.getComponentType();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final Type m99951c(C16888n nVar, boolean z) {
        int i;
        C16877f c = nVar.mo74389c();
        if (c instanceof C16889o) {
            return new C16897t((C16889o) c);
        }
        if (c instanceof C16875d) {
            C16875d dVar = (C16875d) c;
            Class c2 = z ? C16147a.m96969c(dVar) : C16147a.m96968b(dVar);
            List<C16890p> arguments = nVar.getArguments();
            if (arguments.isEmpty()) {
                return c2;
            }
            if (!c2.isArray()) {
                return m99953e(c2, arguments);
            }
            if (c2.getComponentType().isPrimitive()) {
                return c2;
            }
            C16890p pVar = (C16890p) C13566b0.m87448w0(arguments);
            if (pVar != null) {
                C16893q a = pVar.mo80041a();
                C16888n b = pVar.mo80042b();
                if (a == null) {
                    i = -1;
                } else {
                    i = C16899a.f68148a[a.ordinal()];
                }
                if (i == -1 || i == 1) {
                    return c2;
                }
                if (i == 2 || i == 3) {
                    C13706o.m87926c(b);
                    Type d = m99952d(b, false, 1, (Object) null);
                    return d instanceof Class ? c2 : new C16872a(d);
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + nVar);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + nVar);
    }

    /* renamed from: d */
    static /* synthetic */ Type m99952d(C16888n nVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m99951c(nVar, z);
    }

    /* renamed from: e */
    private static final Type m99953e(Class<?> cls, List<C16890p> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
            for (C16890p g : list) {
                arrayList.add(m99955g(g));
            }
            return new C16895s(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list, 10));
            for (C16890p g2 : list) {
                arrayList2.add(m99955g(g2));
            }
            return new C16895s(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e = m99953e(declaringClass, list.subList(length, list.size()));
            List<C16890p> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(C13616u.m87774u(subList, 10));
            for (C16890p g3 : subList) {
                arrayList3.add(m99955g(g3));
            }
            return new C16895s(cls, e, arrayList3);
        }
    }

    /* renamed from: f */
    public static final Type m99954f(C16888n nVar) {
        Type b;
        C13706o.m87929f(nVar, "<this>");
        if (!(nVar instanceof C13707p) || (b = ((C13707p) nVar).mo71961b()) == null) {
            return m99952d(nVar, false, 1, (Object) null);
        }
        return b;
    }

    /* renamed from: g */
    private static final Type m99955g(C16890p pVar) {
        C16893q d = pVar.mo80044d();
        if (d == null) {
            return C16901v.f68150d.mo80074a();
        }
        C16888n c = pVar.mo80043c();
        C13706o.m87926c(c);
        int i = C16899a.f68148a[d.ordinal()];
        if (i == 1) {
            return new C16901v((Type) null, m99951c(c, true));
        }
        if (i == 2) {
            return m99951c(c, true);
        }
        if (i == 3) {
            return new C16901v(m99951c(c, true), (Type) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final String m99956h(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            C15118h h = C15125n.m93473h(type, C16900b.f68149a);
            str = ((Class) C15132p.m93493v(h)).getName() + C15176v.m93626A("[]", C15132p.m93483l(h));
        } else {
            str = cls.getName();
        }
        C13706o.m87928e(str, "{\n        if (type.isArr…   } else type.name\n    }");
        return str;
    }
}
