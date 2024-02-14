package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, mo71668d2 = {"Lkotlinx/coroutines/internal/a;", "", "T", "Lja/u;", "b", "element", "a", "(Ljava/lang/Object;)V", "d", "()Ljava/lang/Object;", "", "[Ljava/lang/Object;", "elements", "", "I", "head", "c", "tail", "", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.a */
/* compiled from: ArrayQueue.kt */
public class C15428a<T> {

    /* renamed from: a */
    private Object[] f64632a = new Object[16];

    /* renamed from: b */
    private int f64633b;

    /* renamed from: c */
    private int f64634c;

    /* renamed from: b */
    private final void m94335b() {
        Object[] objArr = this.f64632a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C13593l.m87561h(objArr, objArr3, 0, this.f64633b, 0, 10, (Object) null);
        Object[] objArr4 = this.f64632a;
        int length2 = objArr4.length;
        int i = this.f64633b;
        Object[] unused2 = C13593l.m87561h(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f64632a = objArr3;
        this.f64633b = 0;
        this.f64634c = length;
    }

    /* renamed from: a */
    public final void mo74751a(T t) {
        Object[] objArr = this.f64632a;
        int i = this.f64634c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f64634c = length;
        if (length == this.f64633b) {
            m94335b();
        }
    }

    /* renamed from: c */
    public final boolean mo74752c() {
        return this.f64633b == this.f64634c;
    }

    /* renamed from: d */
    public final T mo74753d() {
        int i = this.f64633b;
        if (i == this.f64634c) {
            return null;
        }
        T[] tArr = this.f64632a;
        T t = tArr[i];
        tArr[i] = null;
        this.f64633b = (i + 1) & (tArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
