package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14095h;
import p288ib.C12512y;
import p362pb.C16152c;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a0 */
/* compiled from: ReflectJavaTypeParameter.kt */
public final class C14081a0 extends C14112p implements C14095h, C12512y {

    /* renamed from: a */
    private final TypeVariable<?> f62695a;

    public C14081a0(TypeVariable<?> typeVariable) {
        C13706o.m87929f(typeVariable, "typeVariable");
        this.f62695a = typeVariable;
    }

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
    public List<C14110n> getUpperBounds() {
        Type[] bounds = this.f62695a.getBounds();
        C13706o.m87928e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type nVar : bounds) {
            arrayList.add(new C14110n(nVar));
        }
        C14110n nVar2 = (C14110n) C13566b0.m87448w0(arrayList);
        return C13706o.m87924a(nVar2 != null ? nVar2.mo72603N() : null, Object.class) ? C13614t.m87748j() : arrayList;
    }

    /* renamed from: b */
    public AnnotatedElement mo72583b() {
        TypeVariable<?> typeVariable = this.f62695a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14081a0) && C13706o.m87924a(this.f62695a, ((C14081a0) obj).f62695a);
    }

    public C16157f getName() {
        C16157f i = C16157f.m97019i(this.f62695a.getName());
        C13706o.m87928e(i, "identifier(typeVariable.name)");
        return i;
    }

    public int hashCode() {
        return this.f62695a.hashCode();
    }

    public String toString() {
        return C14081a0.class.getName() + ": " + this.f62695a;
    }
}
