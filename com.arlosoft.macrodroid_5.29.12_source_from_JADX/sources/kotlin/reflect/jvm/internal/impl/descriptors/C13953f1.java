package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.sequences.C15118h;
import p370qa.C16265l;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1 */
/* compiled from: typeParameterUtils.kt */
public final class C13953f1 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$a */
    /* compiled from: typeParameterUtils.kt */
    static final class C13954a extends C13708q implements C16265l<C14064m, Boolean> {

        /* renamed from: a */
        public static final C13954a f62430a = new C13954a();

        C13954a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C14064m mVar) {
            C13706o.m87929f(mVar, "it");
            return Boolean.valueOf(mVar instanceof C13908a);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$b */
    /* compiled from: typeParameterUtils.kt */
    static final class C13955b extends C13708q implements C16265l<C14064m, Boolean> {

        /* renamed from: a */
        public static final C13955b f62431a = new C13955b();

        C13955b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C14064m mVar) {
            C13706o.m87929f(mVar, "it");
            return Boolean.valueOf(!(mVar instanceof C14052l));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$c */
    /* compiled from: typeParameterUtils.kt */
    static final class C13956c extends C13708q implements C16265l<C14064m, C15118h<? extends C13950e1>> {

        /* renamed from: a */
        public static final C13956c f62432a = new C13956c();

        C13956c() {
            super(1);
        }

        /* renamed from: a */
        public final C15118h<C13950e1> invoke(C14064m mVar) {
            C13706o.m87929f(mVar, "it");
            List<C13950e1> typeParameters = ((C13908a) mVar).getTypeParameters();
            C13706o.m87928e(typeParameters, "it as CallableDescriptor).typeParameters");
            return C13566b0.m87412N(typeParameters);
        }
    }

    /* renamed from: a */
    public static final C14078r0 m88585a(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C13961h c = e0Var.mo73702N0().mo62183c();
        return m88586b(e0Var, c instanceof C13964i ? (C13964i) c : null, 0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final kotlin.reflect.jvm.internal.impl.descriptors.C14078r0 m88586b(kotlin.reflect.jvm.internal.impl.types.C14900e0 r5, kotlin.reflect.jvm.internal.impl.descriptors.C13964i r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x005a
            boolean r1 = p450zb.C17088k.m100541m(r6)
            if (r1 == 0) goto L_0x000a
            goto L_0x005a
        L_0x000a:
            java.util.List r1 = r6.mo62178q()
            int r1 = r1.size()
            int r1 = r1 + r7
            boolean r2 = r6.mo62182y()
            if (r2 != 0) goto L_0x003d
            java.util.List r2 = r5.mo73700L0()
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0027
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.C14650d.m91605E(r6)
        L_0x0027:
            kotlin.reflect.jvm.internal.impl.descriptors.r0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.r0
            java.util.List r2 = r5.mo73700L0()
            java.util.List r5 = r5.mo73700L0()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>(r6, r5, r0)
            return r1
        L_0x003d:
            java.util.List r2 = r5.mo73700L0()
            java.util.List r7 = r2.subList(r7, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.r0 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.r0
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = r6.mo62163b()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13964i
            if (r4 == 0) goto L_0x0052
            r0 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.i r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13964i) r0
        L_0x0052:
            kotlin.reflect.jvm.internal.impl.descriptors.r0 r5 = m88586b(r5, r0, r1)
            r2.<init>(r6, r7, r5)
            return r2
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C13953f1.m88586b(kotlin.reflect.jvm.internal.impl.types.e0, kotlin.reflect.jvm.internal.impl.descriptors.i, int):kotlin.reflect.jvm.internal.impl.descriptors.r0");
    }

    /* renamed from: c */
    private static final C13940c m88587c(C13950e1 e1Var, C14064m mVar, int i) {
        return new C13940c(e1Var, mVar, i);
    }

    /* renamed from: d */
    public static final List<C13950e1> m88588d(C13964i iVar) {
        List<C13950e1> list;
        C14064m mVar;
        C14901e1 j;
        C13706o.m87929f(iVar, "<this>");
        List<C13950e1> q = iVar.mo62178q();
        C13706o.m87928e(q, "declaredTypeParameters");
        if (!iVar.mo62182y() && !(iVar.mo62163b() instanceof C13908a)) {
            return q;
        }
        List D = C15132p.m93480D(C15132p.m93489r(C15132p.m93485n(C15132p.m93478B(C16519a.m98620m(iVar), C13954a.f62430a), C13955b.f62431a), C13956c.f62432a));
        Iterator<C14064m> it = C16519a.m98620m(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                mVar = null;
                break;
            }
            mVar = it.next();
            if (mVar instanceof C13948e) {
                break;
            }
        }
        C13948e eVar = (C13948e) mVar;
        if (!(eVar == null || (j = eVar.mo62171j()) == null)) {
            list = j.getParameters();
        }
        if (list == null) {
            list = C13614t.m87748j();
        }
        if (!D.isEmpty() || !list.isEmpty()) {
            List<C13950e1> q0 = C13566b0.m87442q0(D, list);
            ArrayList arrayList = new ArrayList(C13616u.m87774u(q0, 10));
            for (C13950e1 e1Var : q0) {
                C13706o.m87928e(e1Var, "it");
                arrayList.add(m88587c(e1Var, iVar, q.size()));
            }
            return C13566b0.m87442q0(q, arrayList);
        }
        List<C13950e1> q2 = iVar.mo62178q();
        C13706o.m87928e(q2, "declaredTypeParameters");
        return q2;
    }
}
