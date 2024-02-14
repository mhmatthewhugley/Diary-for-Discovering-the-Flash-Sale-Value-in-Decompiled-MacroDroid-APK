package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13699k;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, mo71668d2 = {"Lkotlin/coroutines/jvm/internal/k;", "Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/jvm/internal/k;", "", "", "toString", "", "arity", "I", "getArity", "()I", "Lkotlin/coroutines/d;", "completion", "<init>", "(ILkotlin/coroutines/d;)V", "(I)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.jvm.internal.k */
/* compiled from: ContinuationImpl.kt */
public abstract class C13664k extends C13663j implements C13699k<Object> {
    private final int arity;

    public C13664k(int i, C13635d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h = C13687e0.m87874h(this);
        C13706o.m87928e(h, "renderLambdaToString(this)");
        return h;
    }

    public C13664k(int i) {
        this(i, (C13635d<Object>) null);
    }
}
