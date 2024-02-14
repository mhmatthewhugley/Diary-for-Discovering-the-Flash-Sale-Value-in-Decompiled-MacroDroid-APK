package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p288ib.C12483b0;
import p362pb.C16152c;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b0 */
/* compiled from: ReflectJavaValueParameter.kt */
public final class C14084b0 extends C14112p implements C12483b0 {

    /* renamed from: a */
    private final C14123z f62702a;

    /* renamed from: b */
    private final Annotation[] f62703b;

    /* renamed from: c */
    private final String f62704c;

    /* renamed from: d */
    private final boolean f62705d;

    public C14084b0(C14123z zVar, Annotation[] annotationArr, String str, boolean z) {
        C13706o.m87929f(zVar, "type");
        C13706o.m87929f(annotationArr, "reflectAnnotations");
        this.f62702a = zVar;
        this.f62703b = annotationArr;
        this.f62704c = str;
        this.f62705d = z;
    }

    /* renamed from: I */
    public boolean mo68962I() {
        return false;
    }

    /* renamed from: N */
    public C14091e mo68961H(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return C14097i.m89419a(this.f62703b, cVar);
    }

    /* renamed from: O */
    public List<C14091e> getAnnotations() {
        return C14097i.m89420b(this.f62703b);
    }

    /* renamed from: P */
    public C14123z getType() {
        return this.f62702a;
    }

    /* renamed from: a */
    public boolean mo68955a() {
        return this.f62705d;
    }

    public C16157f getName() {
        String str = this.f62704c;
        if (str != null) {
            return C16157f.m97018g(str);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C14084b0.class.getName());
        sb.append(": ");
        sb.append(mo68955a() ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }
}
