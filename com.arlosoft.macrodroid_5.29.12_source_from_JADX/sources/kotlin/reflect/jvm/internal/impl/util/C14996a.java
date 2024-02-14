package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;
import p433xa.C16875d;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.a */
/* compiled from: ArrayMapOwner.kt */
public abstract class C14996a<K, V> implements Iterable<V>, C16368a {

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.a$a */
    /* compiled from: ArrayMapOwner.kt */
    public static abstract class C14997a<K, V, T extends V> {

        /* renamed from: a */
        private final C16875d<? extends K> f64122a;

        /* renamed from: b */
        private final int f64123b;

        public C14997a(C16875d<? extends K> dVar, int i) {
            C13706o.m87929f(dVar, "key");
            this.f64122a = dVar;
            this.f64123b = i;
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.util.a<K, V>, java.lang.Object, kotlin.reflect.jvm.internal.impl.util.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T mo74257c(kotlin.reflect.jvm.internal.impl.util.C14996a<K, V> r2) {
            /*
                r1 = this;
                java.lang.String r0 = "thisRef"
                kotlin.jvm.internal.C13706o.m87929f(r2, r0)
                kotlin.reflect.jvm.internal.impl.util.c r2 = r2.mo74254c()
                int r0 = r1.f64123b
                java.lang.Object r2 = r2.get(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.C14996a.C14997a.mo74257c(kotlin.reflect.jvm.internal.impl.util.a):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C14999c<V> mo74254c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C15038s<K, V> mo74043d();

    public final boolean isEmpty() {
        return mo74254c().mo74260c() == 0;
    }

    public final Iterator<V> iterator() {
        return mo74254c().iterator();
    }
}
