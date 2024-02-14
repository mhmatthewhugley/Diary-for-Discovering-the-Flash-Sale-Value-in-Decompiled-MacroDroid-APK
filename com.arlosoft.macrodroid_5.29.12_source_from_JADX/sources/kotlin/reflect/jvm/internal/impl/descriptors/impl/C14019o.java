package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14145w;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13914b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.o */
/* compiled from: FieldDescriptorImpl.kt */
public final class C14019o extends C13914b implements C14145w {

    /* renamed from: c */
    private final C14140t0 f62566c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14019o(C13921g gVar, C14140t0 t0Var) {
        super(gVar);
        C13706o.m87929f(gVar, "annotations");
        C13706o.m87929f(t0Var, "correspondingProperty");
        this.f62566c = t0Var;
    }
}
