package kotlin.collections;

import java.lang.reflect.Array;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¨\u0006\n"}, mo71668d2 = {"T", "", "reference", "", "size", "a", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "toIndex", "Lja/u;", "b", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.j */
/* compiled from: ArraysJVM.kt */
class C13589j {
    /* renamed from: a */
    public static final <T> T[] m87550a(T[] tArr, int i) {
        C13706o.m87929f(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        C13706o.m87927d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    /* renamed from: b */
    public static final void m87551b(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }
}
