package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p288ib.C12500o;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class C14115s extends C14092f implements C12500o {

    /* renamed from: c */
    private final Object f62742c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14115s(C16157f fVar, Object obj) {
        super(fVar, (C13695i) null);
        C13706o.m87929f(obj, "value");
        this.f62742c = obj;
    }

    public Object getValue() {
        return this.f62742c;
    }
}
