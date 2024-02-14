package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002J\u0014\u0010\u0014\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001a\u001a\u00020\u00198\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo71668d2 = {"Lkotlin/coroutines/h;", "Lkotlin/coroutines/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "Lkotlin/coroutines/g$b;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lqa/p;)Ljava/lang/Object;", "context", "plus", "minusKey", "", "hashCode", "", "toString", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.h */
/* compiled from: CoroutineContextImpl.kt */
public final class C13646h implements C13640g, Serializable {

    /* renamed from: a */
    public static final C13646h f61899a = new C13646h();
    private static final long serialVersionUID = 0;

    private C13646h() {
    }

    private final Object readResolve() {
        return f61899a;
    }

    public <R> R fold(R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
        C13706o.m87929f(pVar, "operation");
        return r;
    }

    public <E extends C13640g.C13643b> E get(C13640g.C13645c<E> cVar) {
        C13706o.m87929f(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C13640g minusKey(C13640g.C13645c<?> cVar) {
        C13706o.m87929f(cVar, "key");
        return this;
    }

    public C13640g plus(C13640g gVar) {
        C13706o.m87929f(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
