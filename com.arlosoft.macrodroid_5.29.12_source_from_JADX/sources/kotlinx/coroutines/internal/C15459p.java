package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0320a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo71668d2 = {"Lkotlinx/coroutines/internal/p;", "", "E", "Lja/u;", "b", "()V", "element", "", "a", "(Ljava/lang/Object;)Z", "d", "()Ljava/lang/Object;", "", "c", "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.p */
/* compiled from: LockFreeTaskQueue.kt */
public class C15459p<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64679a = AtomicReferenceFieldUpdater.newUpdater(C15459p.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C15459p(boolean z) {
        this._cur = new C15460q(8, z);
    }

    /* renamed from: a */
    public final boolean mo74809a(E e) {
        while (true) {
            C15460q qVar = (C15460q) this._cur;
            int a = qVar.mo74813a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C0320a.m383a(f64679a, this, qVar, qVar.mo74817i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo74810b() {
        while (true) {
            C15460q qVar = (C15460q) this._cur;
            if (!qVar.mo74814d()) {
                C0320a.m383a(f64679a, this, qVar, qVar.mo74817i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo74811c() {
        return ((C15460q) this._cur).mo74815f();
    }

    /* renamed from: d */
    public final E mo74812d() {
        while (true) {
            C15460q qVar = (C15460q) this._cur;
            E j = qVar.mo74818j();
            if (j != C15460q.f64683h) {
                return j;
            }
            C0320a.m383a(f64679a, this, qVar, qVar.mo74817i());
        }
    }
}
