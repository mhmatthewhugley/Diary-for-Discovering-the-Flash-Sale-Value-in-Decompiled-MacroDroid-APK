package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.t */
/* compiled from: ModuleAwareClassDescriptor.kt */
public abstract class C14032t implements C13948e {

    /* renamed from: a */
    public static final C14033a f62636a = new C14033a((C13695i) null);

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.t$a */
    /* compiled from: ModuleAwareClassDescriptor.kt */
    public static final class C14033a {
        private C14033a() {
        }

        public /* synthetic */ C14033a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14692h mo72530a(C13948e eVar, C14936j1 j1Var, C14849g gVar) {
            C14692h h0;
            C13706o.m87929f(eVar, "<this>");
            C13706o.m87929f(j1Var, "typeSubstitution");
            C13706o.m87929f(gVar, "kotlinTypeRefiner");
            C14032t tVar = eVar instanceof C14032t ? (C14032t) eVar : null;
            if (tVar != null && (h0 = tVar.mo72309h0(j1Var, gVar)) != null) {
                return h0;
            }
            C14692h q0 = eVar.mo72287q0(j1Var);
            C13706o.m87928e(q0, "this.getMemberScope(\n   …ubstitution\n            )");
            return q0;
        }

        /* renamed from: b */
        public final C14692h mo72531b(C13948e eVar, C14849g gVar) {
            C14692h k0;
            C13706o.m87929f(eVar, "<this>");
            C13706o.m87929f(gVar, "kotlinTypeRefiner");
            C14032t tVar = eVar instanceof C14032t ? (C14032t) eVar : null;
            if (tVar != null && (k0 = tVar.mo62174k0(gVar)) != null) {
                return k0;
            }
            C14692h X = eVar.mo72285X();
            C13706o.m87928e(X, "this.unsubstitutedMemberScope");
            return X;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public abstract C14692h mo72309h0(C14936j1 j1Var, C14849g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public abstract C14692h mo62174k0(C14849g gVar);
}
