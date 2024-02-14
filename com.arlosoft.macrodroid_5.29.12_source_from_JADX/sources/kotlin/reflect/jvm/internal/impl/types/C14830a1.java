package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.util.C14999c;
import kotlin.reflect.jvm.internal.impl.util.C15003e;
import kotlin.reflect.jvm.internal.impl.util.C15038s;
import p272gc.C12338a;
import p370qa.C16265l;
import p433xa.C16875d;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.a1 */
/* compiled from: TypeAttributes.kt */
public final class C14830a1 extends C15003e<C14991y0<?>, C14991y0<?>> {

    /* renamed from: c */
    public static final C14831a f63959c = new C14831a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C14830a1 f63960d = new C14830a1((List<? extends C14991y0<?>>) C13614t.m87748j());

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.a1$a */
    /* compiled from: TypeAttributes.kt */
    public static final class C14831a extends C15038s<C14991y0<?>, C14991y0<?>> {
        private C14831a() {
        }

        public /* synthetic */ C14831a(C13695i iVar) {
            this();
        }

        /* renamed from: b */
        public <T extends C14991y0<?>> int mo74049b(ConcurrentHashMap<C16875d<? extends C14991y0<?>>, Integer> concurrentHashMap, C16875d<T> dVar, C16265l<? super C16875d<? extends C14991y0<?>>, Integer> lVar) {
            int intValue;
            C13706o.m87929f(concurrentHashMap, "<this>");
            C13706o.m87929f(dVar, "kClass");
            C13706o.m87929f(lVar, "compute");
            Integer num = concurrentHashMap.get(dVar);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(dVar);
                if (num2 == null) {
                    Integer invoke = lVar.invoke(dVar);
                    concurrentHashMap.putIfAbsent(dVar, Integer.valueOf(invoke.intValue()));
                    num2 = invoke;
                }
                C13706o.m87928e(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                intValue = num2.intValue();
            }
            return intValue;
        }

        /* renamed from: g */
        public final C14830a1 mo74050g(List<? extends C14991y0<?>> list) {
            C13706o.m87929f(list, "attributes");
            if (list.isEmpty()) {
                return mo74051h();
            }
            return new C14830a1(list, (C13695i) null);
        }

        /* renamed from: h */
        public final C14830a1 mo74051h() {
            return C14830a1.f63960d;
        }
    }

    private C14830a1(List<? extends C14991y0<?>> list) {
        for (C14991y0 y0Var : list) {
            mo74264f(y0Var.mo74196b(), y0Var);
        }
    }

    public /* synthetic */ C14830a1(List list, C13695i iVar) {
        this((List<? extends C14991y0<?>>) list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C15038s<C14991y0<?>, C14991y0<?>> mo74043d() {
        return f63959c;
    }

    /* renamed from: i */
    public final C14830a1 mo74044i(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "other");
        if (isEmpty() && a1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number intValue : f63959c.mo74295e()) {
            int intValue2 = intValue.intValue();
            C14991y0 y0Var = (C14991y0) mo74254c().get(intValue2);
            C14991y0 y0Var2 = (C14991y0) a1Var.mo74254c().get(intValue2);
            C12338a.m83071a(arrayList, y0Var == null ? y0Var2 != null ? y0Var2.mo74195a(y0Var) : null : y0Var.mo74195a(y0Var2));
        }
        return f63959c.mo74050g(arrayList);
    }

    /* renamed from: j */
    public final boolean mo74045j(C14991y0<?> y0Var) {
        C13706o.m87929f(y0Var, "attribute");
        return mo74254c().get(f63959c.mo74294d(y0Var.mo74196b())) != null;
    }

    /* renamed from: k */
    public final C14830a1 mo74046k(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "other");
        if (isEmpty() && a1Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number intValue : f63959c.mo74295e()) {
            int intValue2 = intValue.intValue();
            C14991y0 y0Var = (C14991y0) mo74254c().get(intValue2);
            C14991y0 y0Var2 = (C14991y0) a1Var.mo74254c().get(intValue2);
            C12338a.m83071a(arrayList, y0Var == null ? y0Var2 != null ? y0Var2.mo74197c(y0Var) : null : y0Var.mo74197c(y0Var2));
        }
        return f63959c.mo74050g(arrayList);
    }

    /* renamed from: l */
    public final C14830a1 mo74047l(C14991y0<?> y0Var) {
        C13706o.m87929f(y0Var, "attribute");
        if (mo74045j(y0Var)) {
            return this;
        }
        if (isEmpty()) {
            return new C14830a1(y0Var);
        }
        return f63959c.mo74050g(C13566b0.m87443r0(C13566b0.m87402F0(this), y0Var));
    }

    /* renamed from: m */
    public final C14830a1 mo74048m(C14991y0<?> y0Var) {
        C13706o.m87929f(y0Var, "attribute");
        if (isEmpty()) {
            return this;
        }
        C14999c c = mo74254c();
        ArrayList arrayList = new ArrayList();
        for (Object next : c) {
            if (!C13706o.m87924a((C14991y0) next, y0Var)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == mo74254c().mo74260c()) {
            return this;
        }
        return f63959c.mo74050g(arrayList);
    }

    private C14830a1(C14991y0<?> y0Var) {
        this((List<? extends C14991y0<?>>) C13612s.m87736e(y0Var));
    }
}
