package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo71668d2 = {"Lkotlin/coroutines/jvm/internal/c;", "Lkotlin/coroutines/d;", "", "Lja/n;", "result", "Lja/u;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.jvm.internal.c */
/* compiled from: ContinuationImpl.kt */
public final class C13655c implements C13635d<Object> {

    /* renamed from: a */
    public static final C13655c f61904a = new C13655c();

    private C13655c() {
    }

    public C13640g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
