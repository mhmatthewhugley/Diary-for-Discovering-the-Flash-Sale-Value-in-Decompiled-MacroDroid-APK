package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13329n;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo71668d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "receiver", "completion", "Lja/u;", "a", "(Lqa/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.f */
/* compiled from: Continuation.kt */
public final class C13639f {
    /* renamed from: a */
    public static final <R, T> void m87819a(C16269p<? super R, ? super C13635d<? super T>, ? extends Object> pVar, R r, C13635d<? super T> dVar) {
        C13706o.m87929f(pVar, "<this>");
        C13706o.m87929f(dVar, "completion");
        C13635d b = C13649c.m87831b(C13649c.m87830a(pVar, r, dVar));
        C13329n.C13330a aVar = C13329n.f61327a;
        b.resumeWith(C13329n.m85676a(C13339u.f61331a));
    }
}
