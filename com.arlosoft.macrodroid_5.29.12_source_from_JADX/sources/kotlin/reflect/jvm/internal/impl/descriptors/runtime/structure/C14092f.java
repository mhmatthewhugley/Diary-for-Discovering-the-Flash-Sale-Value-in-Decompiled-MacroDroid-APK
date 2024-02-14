package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p288ib.C12482b;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public abstract class C14092f implements C12482b {

    /* renamed from: b */
    public static final C14093a f62720b = new C14093a((C13695i) null);

    /* renamed from: a */
    private final C16157f f62721a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f$a */
    /* compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class C14093a {
        private C14093a() {
        }

        public /* synthetic */ C14093a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14092f mo72613a(Object obj, C16157f fVar) {
            C13706o.m87929f(obj, "value");
            if (C14088d.m89404h(obj.getClass())) {
                return new C14113q(fVar, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new C14094g(fVar, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new C14098j(fVar, (Object[]) obj);
            }
            if (obj instanceof Class) {
                return new C14109m(fVar, (Class) obj);
            }
            return new C14115s(fVar, obj);
        }
    }

    private C14092f(C16157f fVar) {
        this.f62721a = fVar;
    }

    public /* synthetic */ C14092f(C16157f fVar, C13695i iVar) {
        this(fVar);
    }

    public C16157f getName() {
        return this.f62721a;
    }
}
