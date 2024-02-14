package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import p242db.C12001k;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0006¨\u0006\b"}, mo71668d2 = {"Ljava/lang/Class;", "Ldb/k;", "a", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/j0;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.b0 */
/* compiled from: moduleByClassLoader.kt */
public final class C13721b0 {

    /* renamed from: a */
    private static final ConcurrentMap<C15051j0, WeakReference<C12001k>> f61938a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C12001k m87962a(Class<?> cls) {
        C13706o.m87929f(cls, "<this>");
        ClassLoader f = C14088d.m89402f(cls);
        C15051j0 j0Var = new C15051j0(f);
        ConcurrentMap<C15051j0, WeakReference<C12001k>> concurrentMap = f61938a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(j0Var);
        if (weakReference != null) {
            C12001k kVar = (C12001k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(j0Var, weakReference);
        }
        C12001k a = C12001k.f58202c.mo67444a(f);
        while (true) {
            try {
                ConcurrentMap<C15051j0, WeakReference<C12001k>> concurrentMap2 = f61938a;
                WeakReference putIfAbsent = concurrentMap2.putIfAbsent(j0Var, new WeakReference(a));
                if (putIfAbsent == null) {
                    j0Var.mo74307a((ClassLoader) null);
                    return a;
                }
                C12001k kVar2 = (C12001k) putIfAbsent.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(j0Var, putIfAbsent);
            } finally {
                j0Var.mo74307a((ClassLoader) null);
            }
        }
    }
}
