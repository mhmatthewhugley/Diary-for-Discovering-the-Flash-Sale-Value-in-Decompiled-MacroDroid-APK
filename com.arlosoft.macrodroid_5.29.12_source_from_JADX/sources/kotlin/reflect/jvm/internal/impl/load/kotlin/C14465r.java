package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13911a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14261h;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.r */
/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
public final class C14465r implements C14158z0 {

    /* renamed from: b */
    private final C14261h f63306b;

    public C14465r(C14261h hVar) {
        C13706o.m87929f(hVar, "packageFragment");
        this.f63306b = hVar;
    }

    /* renamed from: b */
    public C13911a1 mo67419b() {
        C13911a1 a1Var = C13911a1.f62310a;
        C13706o.m87928e(a1Var, "NO_SOURCE_FILE");
        return a1Var;
    }

    public String toString() {
        return this.f63306b + ": " + this.f63306b.mo72855M0().keySet();
    }
}
