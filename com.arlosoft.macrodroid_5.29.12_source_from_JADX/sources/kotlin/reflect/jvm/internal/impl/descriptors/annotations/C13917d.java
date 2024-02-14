package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16152c;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.d */
/* compiled from: AnnotationDescriptorImpl */
public class C13917d implements C13915c {

    /* renamed from: a */
    private final C14900e0 f62312a;

    /* renamed from: b */
    private final Map<C16157f, C14617g<?>> f62313b;

    /* renamed from: c */
    private final C14158z0 f62314c;

    public C13917d(C14900e0 e0Var, Map<C16157f, C14617g<?>> map, C14158z0 z0Var) {
        if (e0Var == null) {
            m88489b(0);
        }
        if (map == null) {
            m88489b(1);
        }
        if (z0Var == null) {
            m88489b(2);
        }
        this.f62312a = e0Var;
        this.f62313b = map;
        this.f62314c = z0Var;
    }

    /* renamed from: b */
    private static /* synthetic */ void m88489b(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public Map<C16157f, C14617g<?>> mo72240a() {
        Map<C16157f, C14617g<?>> map = this.f62313b;
        if (map == null) {
            m88489b(4);
        }
        return map;
    }

    /* renamed from: e */
    public C16152c mo72241e() {
        return C13915c.C13916a.m88488a(this);
    }

    public C14158z0 getSource() {
        C14158z0 z0Var = this.f62314c;
        if (z0Var == null) {
            m88489b(5);
        }
        return z0Var;
    }

    public C14900e0 getType() {
        C14900e0 e0Var = this.f62312a;
        if (e0Var == null) {
            m88489b(3);
        }
        return e0Var;
    }

    public String toString() {
        return C14552c.f63483g.mo73528r(this, (C13918e) null);
    }
}
