package p449za;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.load.java.C14163a0;
import kotlin.reflect.jvm.internal.impl.load.java.C14409z;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import p362pb.C16151b;
import p362pb.C16152c;

/* renamed from: za.a */
/* compiled from: SpecialJvmAnnotations.kt */
public final class C17075a {

    /* renamed from: a */
    public static final C17075a f68516a = new C17075a();

    /* renamed from: b */
    private static final Set<C16151b> f68517b;

    /* renamed from: c */
    private static final C16151b f68518c;

    /* renamed from: za.a$a */
    /* compiled from: SpecialJvmAnnotations.kt */
    public static final class C17076a implements C14459q.C14462c {

        /* renamed from: a */
        final /* synthetic */ C13678a0 f68519a;

        C17076a(C13678a0 a0Var) {
            this.f68519a = a0Var;
        }

        /* renamed from: a */
        public void mo70772a() {
        }

        /* renamed from: c */
        public C14459q.C14460a mo70773c(C16151b bVar, C14158z0 z0Var) {
            C13706o.m87929f(bVar, "classId");
            C13706o.m87929f(z0Var, "source");
            if (!C13706o.m87924a(bVar, C14409z.f63195a.mo73108a())) {
                return null;
            }
            this.f68519a.element = true;
            return null;
        }
    }

    static {
        List<C16152c> m = C13614t.m87751m(C14163a0.f62784a, C14163a0.f62794k, C14163a0.f62795l, C14163a0.f62787d, C14163a0.f62789f, C14163a0.f62792i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C16152c m2 : m) {
            linkedHashSet.add(C16151b.m96975m(m2));
        }
        f68517b = linkedHashSet;
        C16151b m3 = C16151b.m96975m(C14163a0.f62793j);
        C13706o.m87928e(m3, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f68518c = m3;
    }

    private C17075a() {
    }

    /* renamed from: a */
    public final C16151b mo80342a() {
        return f68518c;
    }

    /* renamed from: b */
    public final Set<C16151b> mo80343b() {
        return f68517b;
    }

    /* renamed from: c */
    public final boolean mo80344c(C14459q qVar) {
        C13706o.m87929f(qVar, "klass");
        C13678a0 a0Var = new C13678a0();
        qVar.mo67428c(new C17076a(a0Var), (byte[]) null);
        return a0Var.element;
    }
}
