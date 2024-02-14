package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14068m1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14095h;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14118v;
import p288ib.C12483b0;
import p288ib.C12502q;
import p362pb.C16152c;
import p362pb.C16157f;
import p362pb.C16159h;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t */
/* compiled from: ReflectJavaMember.kt */
public abstract class C14116t extends C14112p implements C14095h, C14118v, C12502q {
    /* renamed from: I */
    public boolean mo68962I() {
        return C14095h.C14096a.m89418c(this);
    }

    /* renamed from: N */
    public C14091e mo68961H(C16152c cVar) {
        return C14095h.C14096a.m89416a(this, cVar);
    }

    /* renamed from: O */
    public List<C14091e> getAnnotations() {
        return C14095h.C14096a.m89417b(this);
    }

    /* renamed from: P */
    public C14100l mo68995M() {
        Class<?> declaringClass = mo72635Q().getDeclaringClass();
        C13706o.m87928e(declaringClass, "member.declaringClass");
        return new C14100l(declaringClass);
    }

    /* renamed from: Q */
    public abstract Member mo72635Q();

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final List<C12483b0> mo72642R(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        String str;
        C13706o.m87929f(typeArr, "parameterTypes");
        C13706o.m87929f(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> b = C14085c.f62706a.mo72600b(mo72635Q());
        int size = b != null ? b.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            C14123z a = C14123z.f62749a.mo72656a(typeArr[i]);
            if (b != null) {
                str = (String) C13566b0.m87425Z(b, i + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + a + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new C14084b0(a, annotationArr[i], str, z && i == C13596m.m87581F(typeArr)));
            i++;
        }
        return arrayList;
    }

    /* renamed from: b */
    public AnnotatedElement mo72583b() {
        Member Q = mo72635Q();
        C13706o.m87927d(Q, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) Q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14116t) && C13706o.m87924a(mo72635Q(), ((C14116t) obj).mo72635Q());
    }

    public int getModifiers() {
        return mo72635Q().getModifiers();
    }

    public C16157f getName() {
        String name = mo72635Q().getName();
        C16157f i = name != null ? C16157f.m97019i(name) : null;
        return i == null ? C16159h.f66303b : i;
    }

    public C14068m1 getVisibility() {
        return C14118v.C14119a.m89496a(this);
    }

    /* renamed from: h */
    public boolean mo69001h() {
        return C14118v.C14119a.m89499d(this);
    }

    public int hashCode() {
        return mo72635Q().hashCode();
    }

    public boolean isAbstract() {
        return C14118v.C14119a.m89497b(this);
    }

    public boolean isFinal() {
        return C14118v.C14119a.m89498c(this);
    }

    public String toString() {
        return getClass().getName() + ": " + mo72635Q();
    }
}
