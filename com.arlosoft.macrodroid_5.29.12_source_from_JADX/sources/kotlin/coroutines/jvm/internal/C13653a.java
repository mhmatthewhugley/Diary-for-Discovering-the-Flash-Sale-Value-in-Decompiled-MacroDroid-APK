package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo71668d2 = {"Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/io/Serializable;", "Lja/n;", "result", "Lja/u;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "completion", "create", "value", "", "toString", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/coroutines/d;", "getCompletion", "()Lkotlin/coroutines/d;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.jvm.internal.a */
/* compiled from: ContinuationImpl.kt */
public abstract class C13653a implements C13635d<Object>, C13657e, Serializable {
    private final C13635d<Object> completion;

    public C13653a(C13635d<Object> dVar) {
        this.completion = dVar;
    }

    public C13635d<C13339u> create(C13635d<?> dVar) {
        C13706o.m87929f(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C13657e getCallerFrame() {
        C13635d<Object> dVar = this.completion;
        if (dVar instanceof C13657e) {
            return (C13657e) dVar;
        }
        return null;
    }

    public final C13635d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return C13659g.m87844d(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C13635d dVar = this;
        while (true) {
            C13660h.m87846b(dVar);
            C13653a aVar = (C13653a) dVar;
            C13635d dVar2 = aVar.completion;
            C13706o.m87926c(dVar2);
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != C13652d.m87832c()) {
                    C13329n.C13330a aVar2 = C13329n.f61327a;
                    obj = C13329n.m85676a(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (dVar2 instanceof C13653a) {
                        dVar = dVar2;
                    } else {
                        dVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                obj = C13329n.m85676a(C13332o.m85684a(th));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        C13706o.m87929f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
