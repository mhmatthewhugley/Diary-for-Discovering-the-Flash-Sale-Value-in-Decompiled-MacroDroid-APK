package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import p288ib.C12479a;
import p288ib.C12508v;
import p398tb.C16610e;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x */
/* compiled from: ReflectJavaPrimitiveType.kt */
public final class C14121x extends C14123z implements C12508v {

    /* renamed from: b */
    private final Class<?> f62745b;

    /* renamed from: c */
    private final Collection<C12479a> f62746c = C13614t.m87748j();

    /* renamed from: d */
    private final boolean f62747d;

    public C14121x(Class<?> cls) {
        C13706o.m87929f(cls, "reflectType");
        this.f62745b = cls;
    }

    /* renamed from: I */
    public boolean mo68962I() {
        return this.f62747d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public Class<?> mo72603N() {
        return this.f62745b;
    }

    public Collection<C12479a> getAnnotations() {
        return this.f62746c;
    }

    public C13859i getType() {
        if (C13706o.m87924a(mo72603N(), Void.TYPE)) {
            return null;
        }
        return C16610e.m98934d(mo72603N().getName()).mo79464i();
    }
}
