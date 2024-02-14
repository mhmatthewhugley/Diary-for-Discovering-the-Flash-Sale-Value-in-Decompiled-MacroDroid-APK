package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.sequences.C15118h;
import org.apache.commons.p353io.FilenameUtils;
import p297ja.C13316c;
import p297ja.C13337s;
import p361pa.C16147a;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
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

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d */
/* compiled from: reflectClassUtil.kt */
public final class C14088d {

    /* renamed from: a */
    private static final List<C16875d<? extends Object>> f62713a;

    /* renamed from: b */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f62714b;

    /* renamed from: c */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f62715c;

    /* renamed from: d */
    private static final Map<Class<? extends C13316c<?>>, Integer> f62716d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d$a */
    /* compiled from: reflectClassUtil.kt */
    static final class C14089a extends C13708q implements C16265l<ParameterizedType, ParameterizedType> {

        /* renamed from: a */
        public static final C14089a f62717a = new C14089a();

        C14089a() {
            super(1);
        }

        /* renamed from: a */
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            C13706o.m87929f(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d$b */
    /* compiled from: reflectClassUtil.kt */
    static final class C14090b extends C13708q implements C16265l<ParameterizedType, C15118h<? extends Type>> {

        /* renamed from: a */
        public static final C14090b f62718a = new C14090b();

        C14090b() {
            super(1);
        }

        /* renamed from: a */
        public final C15118h<Type> invoke(ParameterizedType parameterizedType) {
            C13706o.m87929f(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C13706o.m87928e(actualTypeArguments, "it.actualTypeArguments");
            return C13596m.m87622t(actualTypeArguments);
        }
    }

    static {
        int i = 0;
        List<C16875d<? extends Object>> m = C13614t.m87751m(C13687e0.m87868b(Boolean.TYPE), C13687e0.m87868b(Byte.TYPE), C13687e0.m87868b(Character.TYPE), C13687e0.m87868b(Double.TYPE), C13687e0.m87868b(Float.TYPE), C13687e0.m87868b(Integer.TYPE), C13687e0.m87868b(Long.TYPE), C13687e0.m87868b(Short.TYPE));
        f62713a = m;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(m, 10));
        for (C16875d dVar : m) {
            arrayList.add(C13337s.m85692a(C16147a.m96969c(dVar), C16147a.m96970d(dVar)));
        }
        f62714b = C13615t0.m87768r(arrayList);
        List<C16875d<? extends Object>> list = f62713a;
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list, 10));
        for (C16875d dVar2 : list) {
            arrayList2.add(C13337s.m85692a(C16147a.m96970d(dVar2), C16147a.m96969c(dVar2)));
        }
        f62715c = C13615t0.m87768r(arrayList2);
        List m2 = C13614t.m87751m(C16254a.class, C16265l.class, C16269p.class, C16270q.class, C16271r.class, C16272s.class, C16273t.class, C16274u.class, C16275v.class, C16276w.class, C16255b.class, C16256c.class, C16257d.class, C16258e.class, C16259f.class, C16260g.class, C16261h.class, C16262i.class, C16263j.class, C16264k.class, C16266m.class, C16267n.class, C16268o.class);
        ArrayList arrayList3 = new ArrayList(C13616u.m87774u(m2, 10));
        for (Object next : m2) {
            int i2 = i + 1;
            if (i < 0) {
                C13614t.m87758t();
            }
            arrayList3.add(C13337s.m85692a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f62716d = C13615t0.m87768r(arrayList3);
    }

    /* renamed from: a */
    public static final C16151b m89397a(Class<?> cls) {
        C16151b bVar;
        C16151b a;
        C13706o.m87929f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C13706o.m87928e(simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass == null || (a = m89397a(declaringClass)) == null || (bVar = a.mo78546d(C16157f.m97019i(cls.getSimpleName()))) == null) {
                        bVar = C16151b.m96975m(new C16152c(cls.getName()));
                    }
                    C13706o.m87928e(bVar, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                    return bVar;
                }
            }
            C16152c cVar = new C16152c(cls.getName());
            return new C16151b(cVar.mo78559e(), C16152c.m96986k(cVar.mo78562g()), true);
        } else {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
    }

    /* renamed from: b */
    public static final String m89398b(Class<?> cls) {
        C13706o.m87929f(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return ExifInterface.LATITUDE_SOUTH;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        } else if (cls.isArray()) {
            String name2 = cls.getName();
            C13706o.m87928e(name2, "name");
            return C15176v.m93629D(name2, FilenameUtils.EXTENSION_SEPARATOR, '/', false, 4, (Object) null);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            String name3 = cls.getName();
            C13706o.m87928e(name3, "name");
            sb.append(C15176v.m93629D(name3, FilenameUtils.EXTENSION_SEPARATOR, '/', false, 4, (Object) null));
            sb.append(';');
            return sb.toString();
        }
    }

    /* renamed from: c */
    public static final Integer m89399c(Class<?> cls) {
        C13706o.m87929f(cls, "<this>");
        return f62716d.get(cls);
    }

    /* renamed from: d */
    public static final List<Type> m89400d(Type type) {
        C13706o.m87929f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C13614t.m87748j();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C15132p.m93480D(C15132p.m93489r(C15125n.m93473h(type, C14089a.f62717a), C14090b.f62718a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C13706o.m87928e(actualTypeArguments, "actualTypeArguments");
        return C13596m.m87610i0(actualTypeArguments);
    }

    /* renamed from: e */
    public static final Class<?> m89401e(Class<?> cls) {
        C13706o.m87929f(cls, "<this>");
        return f62714b.get(cls);
    }

    /* renamed from: f */
    public static final ClassLoader m89402f(Class<?> cls) {
        C13706o.m87929f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C13706o.m87928e(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    /* renamed from: g */
    public static final Class<?> m89403g(Class<?> cls) {
        C13706o.m87929f(cls, "<this>");
        return f62715c.get(cls);
    }

    /* renamed from: h */
    public static final boolean m89404h(Class<?> cls) {
        C13706o.m87929f(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
