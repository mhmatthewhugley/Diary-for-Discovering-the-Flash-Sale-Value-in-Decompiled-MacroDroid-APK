package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.internal.C15448i0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b&\u0010'J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR$\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@BX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\u000f\u0010\nR\u0011\u0010%\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, mo71668d2 = {"Lkotlinx/coroutines/internal/h0;", "Lkotlinx/coroutines/internal/i0;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "i", "Lja/u;", "l", "(I)V", "k", "", "f", "()[Lkotlinx/coroutines/internal/i0;", "j", "m", "(II)V", "e", "()Lkotlinx/coroutines/internal/i0;", "node", "", "g", "(Lkotlinx/coroutines/internal/i0;)Z", "b", "index", "h", "(I)Lkotlinx/coroutines/internal/i0;", "a", "(Lkotlinx/coroutines/internal/i0;)V", "[Lkotlinx/coroutines/internal/i0;", "value", "c", "()I", "size", "d", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.h0 */
/* compiled from: ThreadSafeHeap.kt */
public class C15446h0<T extends C15448i0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f64661a;

    /* renamed from: f */
    private final T[] m94389f() {
        T[] tArr = this.f64661a;
        if (tArr == null) {
            T[] tArr2 = new C15448i0[4];
            this.f64661a = tArr2;
            return tArr2;
        } else if (mo74785c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo74785c() * 2);
            C13706o.m87928e(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (C15448i0[]) copyOf;
            this.f64661a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m94390j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m94391k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo74785c()) {
                T[] tArr = this.f64661a;
                C13706o.m87926c(tArr);
                int i3 = i2 + 1;
                if (i3 < mo74785c()) {
                    T t = tArr[i3];
                    C13706o.m87926c(t);
                    T t2 = tArr[i2];
                    C13706o.m87926c(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                C13706o.m87926c(t3);
                T t4 = tArr[i2];
                C13706o.m87926c(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m94393m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m94392l(int i) {
        while (i > 0) {
            T[] tArr = this.f64661a;
            C13706o.m87926c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C13706o.m87926c(t);
            T t2 = tArr[i];
            C13706o.m87926c(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m94393m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m94393m(int i, int i2) {
        T[] tArr = this.f64661a;
        C13706o.m87926c(tArr);
        T t = tArr[i2];
        C13706o.m87926c(t);
        T t2 = tArr[i];
        C13706o.m87926c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo74743f(i);
        t2.mo74743f(i2);
    }

    /* renamed from: a */
    public final void mo74783a(T t) {
        t.mo74740b(this);
        C15448i0[] f = m94389f();
        int c = mo74785c();
        m94390j(c + 1);
        f[c] = t;
        t.mo74743f(c);
        m94392l(c);
    }

    /* renamed from: b */
    public final T mo74784b() {
        T[] tArr = this.f64661a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final int mo74785c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo74786d() {
        return mo74785c() == 0;
    }

    /* renamed from: e */
    public final T mo74787e() {
        T b;
        synchronized (this) {
            b = mo74784b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo74788g(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo74742e() == null) {
                z = false;
            } else {
                mo74789h(t.mo74745i());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo74789h(int i) {
        T[] tArr = this.f64661a;
        C13706o.m87926c(tArr);
        m94390j(mo74785c() - 1);
        if (i < mo74785c()) {
            m94393m(i, mo74785c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C13706o.m87926c(t);
                T t2 = tArr[i2];
                C13706o.m87926c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m94393m(i, i2);
                    m94392l(i2);
                }
            }
            m94391k(i);
        }
        T t3 = tArr[mo74785c()];
        C13706o.m87926c(t3);
        t3.mo74740b((C15446h0<?>) null);
        t3.mo74743f(-1);
        tArr[mo74785c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T mo74790i() {
        T h;
        synchronized (this) {
            h = mo74785c() > 0 ? mo74789h(0) : null;
        }
        return h;
    }
}
