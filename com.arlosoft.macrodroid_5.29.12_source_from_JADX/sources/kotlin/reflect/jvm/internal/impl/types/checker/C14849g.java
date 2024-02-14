package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14931i;
import p218bc.C11134i;
import p362pb.C16151b;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.g */
/* compiled from: KotlinTypeRefiner.kt */
public abstract class C14849g extends C14931i {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.g$a */
    /* compiled from: KotlinTypeRefiner.kt */
    public static final class C14850a extends C14849g {

        /* renamed from: a */
        public static final C14850a f63969a = new C14850a();

        private C14850a() {
        }

        /* renamed from: b */
        public C13948e mo74064b(C16151b bVar) {
            C13706o.m87929f(bVar, "classId");
            return null;
        }

        /* renamed from: c */
        public <S extends C14692h> S mo74065c(C13948e eVar, C16254a<? extends S> aVar) {
            C13706o.m87929f(eVar, "classDescriptor");
            C13706o.m87929f(aVar, "compute");
            return (C14692h) aVar.invoke();
        }

        /* renamed from: d */
        public boolean mo74066d(C13958g0 g0Var) {
            C13706o.m87929f(g0Var, "moduleDescriptor");
            return false;
        }

        /* renamed from: e */
        public boolean mo74067e(C14901e1 e1Var) {
            C13706o.m87929f(e1Var, "typeConstructor");
            return false;
        }

        /* renamed from: g */
        public Collection<C14900e0> mo74069g(C13948e eVar) {
            C13706o.m87929f(eVar, "classDescriptor");
            Collection<C14900e0> l = eVar.mo62171j().mo72370l();
            C13706o.m87928e(l, "classDescriptor.typeConstructor.supertypes");
            return l;
        }

        /* renamed from: h */
        public C14900e0 mo74071a(C11134i iVar) {
            C13706o.m87929f(iVar, "type");
            return (C14900e0) iVar;
        }

        /* renamed from: i */
        public C13948e mo74068f(C14064m mVar) {
            C13706o.m87929f(mVar, "descriptor");
            return null;
        }
    }

    /* renamed from: b */
    public abstract C13948e mo74064b(C16151b bVar);

    /* renamed from: c */
    public abstract <S extends C14692h> S mo74065c(C13948e eVar, C16254a<? extends S> aVar);

    /* renamed from: d */
    public abstract boolean mo74066d(C13958g0 g0Var);

    /* renamed from: e */
    public abstract boolean mo74067e(C14901e1 e1Var);

    /* renamed from: f */
    public abstract C13961h mo74068f(C14064m mVar);

    /* renamed from: g */
    public abstract Collection<C14900e0> mo74069g(C13948e eVar);

    /* renamed from: h */
    public abstract C14900e0 mo74070h(C11134i iVar);
}
