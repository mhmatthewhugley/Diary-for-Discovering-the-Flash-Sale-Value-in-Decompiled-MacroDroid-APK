package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;
import p433xa.C16875d;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.s */
/* compiled from: ArrayMapOwner.kt */
public abstract class C15038s<K, V> {

    /* renamed from: a */
    private final ConcurrentHashMap<C16875d<? extends K>, Integer> f64215a = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f64216b = new AtomicInteger(0);

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.s$a */
    /* compiled from: ArrayMapOwner.kt */
    static final class C15039a extends C13708q implements C16265l<C16875d<? extends K>, Integer> {
        final /* synthetic */ C15038s<K, V> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15039a(C15038s<K, V> sVar) {
            super(1);
            this.this$0 = sVar;
        }

        /* renamed from: a */
        public final Integer invoke(C16875d<? extends K> dVar) {
            C13706o.m87929f(dVar, "it");
            return Integer.valueOf(this.this$0.f64216b.getAndIncrement());
        }
    }

    /* renamed from: b */
    public abstract <T extends K> int mo74049b(ConcurrentHashMap<C16875d<? extends K>, Integer> concurrentHashMap, C16875d<T> dVar, C16265l<? super C16875d<? extends K>, Integer> lVar);

    /* renamed from: c */
    public final <T extends V, KK extends K> C15023n<K, V, T> mo74293c(C16875d<KK> dVar) {
        C13706o.m87929f(dVar, "kClass");
        return new C15023n<>(dVar, mo74294d(dVar));
    }

    /* renamed from: d */
    public final <T extends K> int mo74294d(C16875d<T> dVar) {
        C13706o.m87929f(dVar, "kClass");
        return mo74049b(this.f64215a, dVar, new C15039a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Collection<Integer> mo74295e() {
        Collection<Integer> values = this.f64215a.values();
        C13706o.m87928e(values, "idPerType.values");
        return values;
    }
}
