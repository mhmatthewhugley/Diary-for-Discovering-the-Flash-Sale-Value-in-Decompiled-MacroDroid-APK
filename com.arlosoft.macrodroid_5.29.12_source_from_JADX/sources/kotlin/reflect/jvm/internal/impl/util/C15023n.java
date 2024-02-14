package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.util.C14996a;
import p397ta.C16604c;
import p433xa.C16875d;
import p433xa.C16887m;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.n */
/* compiled from: ArrayMapOwner.kt */
public final class C15023n<K, V, T extends V> extends C14996a.C14997a<K, V, T> implements C16604c<C14996a<K, V>, V> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15023n(C16875d<? extends K> dVar, int i) {
        super(dVar, i);
        C13706o.m87929f(dVar, "key");
    }

    /* renamed from: d */
    public T mo32407a(C14996a<K, V> aVar, C16887m<?> mVar) {
        C13706o.m87929f(aVar, "thisRef");
        C13706o.m87929f(mVar, "property");
        return mo74257c(aVar);
    }
}
