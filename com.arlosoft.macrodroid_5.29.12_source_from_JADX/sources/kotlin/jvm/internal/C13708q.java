package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo71668d2 = {"Lkotlin/jvm/internal/q;", "R", "Lkotlin/jvm/internal/k;", "Ljava/io/Serializable;", "", "toString", "", "arity", "I", "getArity", "()I", "<init>", "(I)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.jvm.internal.q */
/* compiled from: Lambda.kt */
public abstract class C13708q<R> implements C13699k<R>, Serializable {
    private final int arity;

    public C13708q(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String i = C13687e0.m87875i(this);
        C13706o.m87928e(i, "renderLambdaToString(this)");
        return i;
    }
}
