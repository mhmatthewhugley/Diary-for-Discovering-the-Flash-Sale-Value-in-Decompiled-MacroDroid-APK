package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0320a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo71668d2 = {"Lkotlinx/coroutines/internal/c;", "T", "Lkotlinx/coroutines/internal/v;", "", "decision", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "g", "failure", "Lja/u;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", "", "f", "()J", "opSequence", "a", "()Lkotlinx/coroutines/internal/c;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.c */
/* compiled from: Atomic.kt */
public abstract class C15432c<T> extends C15468v {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64638a = AtomicReferenceFieldUpdater.newUpdater(C15432c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C15430b.f64636a;

    /* renamed from: a */
    public C15432c<?> mo74755a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo74756c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C15430b.f64636a) {
            obj2 = mo74758e(mo74551g(obj));
        }
        mo74757d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo74757d(T t, Object obj);

    /* renamed from: e */
    public final Object mo74758e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C15430b.f64636a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (C0320a.m383a(f64638a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: f */
    public long mo74759f() {
        return 0;
    }

    /* renamed from: g */
    public abstract Object mo74551g(T t);
}
