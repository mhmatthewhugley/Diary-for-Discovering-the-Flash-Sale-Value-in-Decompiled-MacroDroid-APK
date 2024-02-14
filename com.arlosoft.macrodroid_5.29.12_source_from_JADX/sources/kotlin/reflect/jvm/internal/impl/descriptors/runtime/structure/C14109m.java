package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p288ib.C12493h;
import p288ib.C12510x;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.m */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class C14109m extends C14092f implements C12493h {

    /* renamed from: c */
    private final Class<?> f62736c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14109m(C16157f fVar, Class<?> cls) {
        super(fVar, (C13695i) null);
        C13706o.m87929f(cls, "klass");
        this.f62736c = cls;
    }

    /* renamed from: b */
    public C12510x mo68982b() {
        return C14123z.f62749a.mo72656a(this.f62736c);
    }
}
