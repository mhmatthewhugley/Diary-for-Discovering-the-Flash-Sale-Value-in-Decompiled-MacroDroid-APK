package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14092f;
import p288ib.C12479a;
import p288ib.C12482b;
import p361pa.C16147a;
import p362pb.C16151b;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e */
/* compiled from: ReflectJavaAnnotation.kt */
public final class C14091e extends C14112p implements C12479a {

    /* renamed from: a */
    private final Annotation f62719a;

    public C14091e(Annotation annotation) {
        C13706o.m87929f(annotation, "annotation");
        this.f62719a = annotation;
    }

    /* renamed from: C */
    public boolean mo68949C() {
        return C12479a.C12480a.m83567a(this);
    }

    /* renamed from: N */
    public final Annotation mo72608N() {
        return this.f62719a;
    }

    /* renamed from: O */
    public C14100l mo68953s() {
        return new C14100l(C16147a.m96968b(C16147a.m96967a(this.f62719a)));
    }

    /* renamed from: d */
    public C16151b mo68950d() {
        return C14088d.m89397a(C16147a.m96968b(C16147a.m96967a(this.f62719a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14091e) && this.f62719a == ((C14091e) obj).f62719a;
    }

    /* renamed from: f */
    public boolean mo68951f() {
        return C12479a.C12480a.m83568b(this);
    }

    public Collection<C12482b> getArguments() {
        Method[] declaredMethods = C16147a.m96968b(C16147a.m96967a(this.f62719a)).getDeclaredMethods();
        C13706o.m87928e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            C14092f.C14093a aVar = C14092f.f62720b;
            Object invoke = method.invoke(this.f62719a, new Object[0]);
            C13706o.m87928e(invoke, "method.invoke(annotation)");
            arrayList.add(aVar.mo72613a(invoke, C16157f.m97019i(method.getName())));
        }
        return arrayList;
    }

    public int hashCode() {
        return System.identityHashCode(this.f62719a);
    }

    public String toString() {
        return C14091e.class.getName() + ": " + this.f62719a;
    }
}
