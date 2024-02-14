package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13911a1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14810t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14749e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f;
import p349ob.C15834e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.s */
/* compiled from: KotlinJvmBinarySourceElement.kt */
public final class C14466s implements C14750f {

    /* renamed from: b */
    private final C14459q f63307b;

    /* renamed from: c */
    private final C14810t<C15834e> f63308c;

    /* renamed from: d */
    private final boolean f63309d;

    /* renamed from: e */
    private final C14749e f63310e;

    public C14466s(C14459q qVar, C14810t<C15834e> tVar, boolean z, C14749e eVar) {
        C13706o.m87929f(qVar, "binaryClass");
        C13706o.m87929f(eVar, "abiStability");
        this.f63307b = qVar;
        this.f63308c = tVar;
        this.f63309d = z;
        this.f63310e = eVar;
    }

    /* renamed from: a */
    public String mo73170a() {
        return "Class '" + this.f63307b.mo67429d().mo78544b().mo78556b() + '\'';
    }

    /* renamed from: b */
    public C13911a1 mo67419b() {
        C13911a1 a1Var = C13911a1.f62310a;
        C13706o.m87928e(a1Var, "NO_SOURCE_FILE");
        return a1Var;
    }

    /* renamed from: d */
    public final C14459q mo73205d() {
        return this.f63307b;
    }

    public String toString() {
        return C14466s.class.getSimpleName() + ": " + this.f63307b;
    }
}
