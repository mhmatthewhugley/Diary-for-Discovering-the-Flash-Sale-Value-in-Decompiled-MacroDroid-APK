package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p288ib.C12498m;
import p362pb.C16151b;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class C14113q extends C14092f implements C12498m {

    /* renamed from: c */
    private final Enum<?> f62740c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14113q(C16157f fVar, Enum<?> enumR) {
        super(fVar, (C13695i) null);
        C13706o.m87929f(enumR, "value");
        this.f62740c = enumR;
    }

    /* renamed from: c */
    public C16151b mo68989c() {
        Class<?> cls = this.f62740c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C13706o.m87928e(cls, "enumClass");
        return C14088d.m89397a(cls);
    }

    /* renamed from: d */
    public C16157f mo68990d() {
        return C16157f.m97019i(this.f62740c.name());
    }
}
