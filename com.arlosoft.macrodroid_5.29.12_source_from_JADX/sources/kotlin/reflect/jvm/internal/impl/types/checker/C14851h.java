package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13952f0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.h */
/* compiled from: KotlinTypeRefiner.kt */
public final class C14851h {

    /* renamed from: a */
    private static final C13952f0<C14864p<C14880x>> f63970a = new C13952f0<>("KotlinTypeRefiner");

    /* renamed from: a */
    public static final C13952f0<C14864p<C14880x>> m92554a() {
        return f63970a;
    }

    /* renamed from: b */
    public static final List<C14900e0> m92555b(C14849g gVar, Iterable<? extends C14900e0> iterable) {
        C13706o.m87929f(gVar, "<this>");
        C13706o.m87929f(iterable, "types");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(iterable, 10));
        for (C14900e0 h : iterable) {
            arrayList.add(gVar.mo74070h(h));
        }
        return arrayList;
    }
}
