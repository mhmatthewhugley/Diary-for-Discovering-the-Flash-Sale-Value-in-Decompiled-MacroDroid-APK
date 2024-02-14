package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u000b\u0010\u0019¨\u0006\u001d"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/j0;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ClassLoader;", "a", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "ref", "b", "I", "getIdentityHashCode", "()I", "identityHashCode", "c", "Ljava/lang/ClassLoader;", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "temporaryStrongRef", "classLoader", "<init>", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.j0 */
/* compiled from: moduleByClassLoader.kt */
final class C15051j0 {

    /* renamed from: a */
    private final WeakReference<ClassLoader> f64232a;

    /* renamed from: b */
    private final int f64233b;

    /* renamed from: c */
    private ClassLoader f64234c;

    public C15051j0(ClassLoader classLoader) {
        C13706o.m87929f(classLoader, "classLoader");
        this.f64232a = new WeakReference<>(classLoader);
        this.f64233b = System.identityHashCode(classLoader);
        this.f64234c = classLoader;
    }

    /* renamed from: a */
    public final void mo74307a(ClassLoader classLoader) {
        this.f64234c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15051j0) && this.f64232a.get() == ((C15051j0) obj).f64232a.get();
    }

    public int hashCode() {
        return this.f64233b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r1 = this;
            java.lang.ref.WeakReference<java.lang.ClassLoader> r0 = r1.f64232a
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = "<null>"
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C15051j0.toString():java.lang.String");
    }
}
