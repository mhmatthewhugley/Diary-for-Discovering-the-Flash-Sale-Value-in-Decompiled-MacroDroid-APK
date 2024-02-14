package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p288ib.C12479a;
import p288ib.C12484c;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class C14094g extends C14092f implements C12484c {

    /* renamed from: c */
    private final Annotation f62722c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14094g(C16157f fVar, Annotation annotation) {
        super(fVar, (C13695i) null);
        C13706o.m87929f(annotation, "annotation");
        this.f62722c = annotation;
    }

    /* renamed from: a */
    public C12479a mo68958a() {
        return new C14091e(this.f62722c);
    }
}
