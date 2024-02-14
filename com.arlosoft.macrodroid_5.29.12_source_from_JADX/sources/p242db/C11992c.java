package p242db;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13871c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14616f;
import p361pa.C16147a;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p362pb.C16159h;
import p398tb.C16610e;

/* renamed from: db.c */
/* compiled from: ReflectKotlinClass.kt */
final class C11992c {

    /* renamed from: a */
    public static final C11992c f58193a = new C11992c();

    private C11992c() {
    }

    /* renamed from: a */
    private final C14616f m82393a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            C13706o.m87928e(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            C16151b a = C14088d.m89397a(cls);
            C13871c cVar = C13871c.f62112a;
            C16152c b = a.mo78544b();
            C13706o.m87928e(b, "javaClassId.asSingleFqName()");
            C16151b m = cVar.mo72173m(b);
            if (m != null) {
                a = m;
            }
            return new C14616f(a, i);
        } else if (C13706o.m87924a(cls, Void.TYPE)) {
            C16151b m2 = C16151b.m96975m(C13902k.C13903a.f62249f.mo78579l());
            C13706o.m87928e(m2, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new C14616f(m2, i);
        } else {
            C13859i i2 = C16610e.m98934d(cls.getName()).mo79464i();
            C13706o.m87928e(i2, "get(currentClass.name).primitiveType");
            if (i > 0) {
                C16151b m3 = C16151b.m96975m(i2.mo72156d());
                C13706o.m87928e(m3, "topLevel(primitiveType.arrayTypeFqName)");
                return new C14616f(m3, i - 1);
            }
            C16151b m4 = C16151b.m96975m(i2.mo72158f());
            C13706o.m87928e(m4, "topLevel(primitiveType.typeFqName)");
            return new C14616f(m4, i);
        }
    }

    /* renamed from: c */
    private final void m82394c(Class<?> cls, C14459q.C14463d dVar) {
        int i;
        Constructor[] constructorArr;
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        C13706o.m87928e(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor constructor = declaredConstructors[i2];
            C16157f fVar = C16159h.f66310i;
            C12005m mVar = C12005m.f58207a;
            C13706o.m87928e(constructor, "constructor");
            C14459q.C14464e b = dVar.mo73121b(fVar, mVar.mo67449a(constructor));
            if (b == null) {
                constructorArr = declaredConstructors;
                i = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                C13706o.m87928e(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C13706o.m87928e(annotation, "annotation");
                    m82397f(b, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C13706o.m87928e(parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        Annotation[] annotationArr = parameterAnnotations[i3];
                        C13706o.m87928e(annotationArr, "annotations");
                        int length4 = annotationArr.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            Annotation annotation2 = annotationArr[i4];
                            Class b2 = C16147a.m96968b(C16147a.m96967a(annotation2));
                            Constructor[] constructorArr2 = declaredConstructors;
                            int i5 = length;
                            C16151b a = C14088d.m89397a(b2);
                            int i6 = length2;
                            C13706o.m87928e(annotation2, "annotation");
                            C14459q.C14460a b3 = b.mo73122b(i3 + length2, a, new C11991b(annotation2));
                            if (b3 != null) {
                                f58193a.m82399h(b3, annotation2, b2);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i5;
                            length2 = i6;
                        }
                        Constructor[] constructorArr3 = declaredConstructors;
                        int i7 = length;
                        int i8 = length2;
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                b.mo70772a();
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    /* renamed from: d */
    private final void m82395d(Class<?> cls, C14459q.C14463d dVar) {
        Field[] declaredFields = cls.getDeclaredFields();
        C13706o.m87928e(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            C16157f i = C16157f.m97019i(field.getName());
            C13706o.m87928e(i, "identifier(field.name)");
            C12005m mVar = C12005m.f58207a;
            C13706o.m87928e(field, "field");
            C14459q.C14462c a = dVar.mo73120a(i, mVar.mo67450b(field), (Object) null);
            if (a != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                C13706o.m87928e(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C13706o.m87928e(annotation, "annotation");
                    m82397f(a, annotation);
                }
                a.mo70772a();
            }
        }
    }

    /* renamed from: e */
    private final void m82396e(Class<?> cls, C14459q.C14463d dVar) {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        C13706o.m87928e(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            C16157f i2 = C16157f.m97019i(method.getName());
            C13706o.m87928e(i2, "identifier(method.name)");
            C12005m mVar = C12005m.f58207a;
            C13706o.m87928e(method, "method");
            C14459q.C14464e b = dVar.mo73121b(i2, mVar.mo67451c(method));
            if (b == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                C13706o.m87928e(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C13706o.m87928e(annotation, "annotation");
                    m82397f(b, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C13706o.m87928e(parameterAnnotations, "method.parameterAnnotations");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    Annotation[] annotationArr2 = annotationArr[i3];
                    C13706o.m87928e(annotationArr2, "annotations");
                    int length3 = annotationArr2.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        Annotation annotation2 = annotationArr2[i4];
                        Class b2 = C16147a.m96968b(C16147a.m96967a(annotation2));
                        C16151b a = C14088d.m89397a(b2);
                        Method[] methodArr2 = declaredMethods;
                        C13706o.m87928e(annotation2, "annotation");
                        C14459q.C14460a b3 = b.mo73122b(i3, a, new C11991b(annotation2));
                        if (b3 != null) {
                            f58193a.m82399h(b3, annotation2, b2);
                        }
                        i4++;
                        declaredMethods = methodArr2;
                    }
                    Method[] methodArr3 = declaredMethods;
                }
                methodArr = declaredMethods;
                b.mo70772a();
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    /* renamed from: f */
    private final void m82397f(C14459q.C14462c cVar, Annotation annotation) {
        Class b = C16147a.m96968b(C16147a.m96967a(annotation));
        C14459q.C14460a c = cVar.mo70773c(C14088d.m89397a(b), new C11991b(annotation));
        if (c != null) {
            f58193a.m82399h(c, annotation, b);
        }
    }

    /* renamed from: g */
    private final void m82398g(C14459q.C14460a aVar, C16157f fVar, Object obj) {
        Class<?> cls = obj.getClass();
        if (C13706o.m87924a(cls, Class.class)) {
            C13706o.m87927d(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.mo70785e(fVar, m82393a((Class) obj));
        } else if (C11999i.f58200a.contains(cls)) {
            aVar.mo70784d(fVar, obj);
        } else if (C14088d.m89404h(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            C13706o.m87928e(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            C16151b a = C14088d.m89397a(cls);
            C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            C16157f i = C16157f.m97019i(((Enum) obj).name());
            C13706o.m87928e(i, "identifier((value as Enum<*>).name)");
            aVar.mo70782b(fVar, a, i);
        } else if (Annotation.class.isAssignableFrom(cls)) {
            Class[] interfaces = cls.getInterfaces();
            C13706o.m87928e(interfaces, "clazz.interfaces");
            Class cls2 = (Class) C13596m.m87597V(interfaces);
            C13706o.m87928e(cls2, "annotationClass");
            C14459q.C14460a c = aVar.mo70783c(fVar, C14088d.m89397a(cls2));
            if (c != null) {
                C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Annotation");
                m82399h(c, (Annotation) obj, cls2);
            }
        } else if (cls.isArray()) {
            C14459q.C14461b f = aVar.mo70786f(fVar);
            if (f != null) {
                Class<?> componentType = cls.getComponentType();
                int i2 = 0;
                if (componentType.isEnum()) {
                    C13706o.m87928e(componentType, "componentType");
                    C16151b a2 = C14088d.m89397a(componentType);
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr = (Object[]) obj;
                    int length = objArr.length;
                    while (i2 < length) {
                        Object obj2 = objArr[i2];
                        C13706o.m87927d(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                        C16157f i3 = C16157f.m97019i(((Enum) obj2).name());
                        C13706o.m87928e(i3, "identifier((element as Enum<*>).name)");
                        f.mo70777c(a2, i3);
                        i2++;
                    }
                } else if (C13706o.m87924a(componentType, Class.class)) {
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr2 = (Object[]) obj;
                    int length2 = objArr2.length;
                    while (i2 < length2) {
                        Object obj3 = objArr2[i2];
                        C13706o.m87927d(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                        f.mo70779e(m82393a((Class) obj3));
                        i2++;
                    }
                } else if (Annotation.class.isAssignableFrom(componentType)) {
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr3 = (Object[]) obj;
                    int length3 = objArr3.length;
                    while (i2 < length3) {
                        Object obj4 = objArr3[i2];
                        C13706o.m87928e(componentType, "componentType");
                        C14459q.C14460a b = f.mo70776b(C14088d.m89397a(componentType));
                        if (b != null) {
                            C13706o.m87927d(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                            m82399h(b, (Annotation) obj4, componentType);
                        }
                        i2++;
                    }
                } else {
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr4 = (Object[]) obj;
                    int length4 = objArr4.length;
                    while (i2 < length4) {
                        f.mo70778d(objArr4[i2]);
                        i2++;
                    }
                }
                f.mo70775a();
            }
        } else {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        }
    }

    /* renamed from: h */
    private final void m82399h(C14459q.C14460a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        C13706o.m87928e(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                C13706o.m87926c(invoke);
                C16157f i = C16157f.m97019i(method.getName());
                C13706o.m87928e(i, "identifier(method.name)");
                m82398g(aVar, i, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo70781a();
    }

    /* renamed from: b */
    public final void mo67421b(Class<?> cls, C14459q.C14462c cVar) {
        C13706o.m87929f(cls, "klass");
        C13706o.m87929f(cVar, "visitor");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        C13706o.m87928e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            C13706o.m87928e(annotation, "annotation");
            m82397f(cVar, annotation);
        }
        cVar.mo70772a();
    }

    /* renamed from: i */
    public final void mo67422i(Class<?> cls, C14459q.C14463d dVar) {
        C13706o.m87929f(cls, "klass");
        C13706o.m87929f(dVar, "memberVisitor");
        m82396e(cls, dVar);
        m82394c(cls, dVar);
        m82395d(cls, dVar);
    }
}
