package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.p */
/* compiled from: IntegerValueTypeConstructor.kt */
public final class C14635p implements C14901e1 {

    /* renamed from: a */
    private final long f63634a;

    /* renamed from: b */
    private final C13958g0 f63635b;

    /* renamed from: c */
    private final ArrayList<C14900e0> f63636c;

    /* renamed from: a */
    public C14901e1 mo72368a(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ C13961h mo62183c() {
        return (C13961h) mo73746e();
    }

    /* renamed from: d */
    public boolean mo62184d() {
        return false;
    }

    /* renamed from: e */
    public Void mo73746e() {
        return null;
    }

    public List<C13950e1> getParameters() {
        return C13614t.m87748j();
    }

    /* renamed from: l */
    public Collection<C14900e0> mo72370l() {
        return this.f63636c;
    }

    /* renamed from: m */
    public C13853h mo72371m() {
        return this.f63635b.mo72296m();
    }

    public String toString() {
        return "IntegerValueType(" + this.f63634a + ')';
    }
}
