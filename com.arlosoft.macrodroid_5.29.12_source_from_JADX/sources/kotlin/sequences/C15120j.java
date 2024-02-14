package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo71668d2 = {"Lkotlin/sequences/j;", "T", "", "value", "Lja/u;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "iterator", "c", "(Ljava/util/Iterator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/sequences/h;", "sequence", "e", "(Lkotlin/sequences/h;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.j */
/* compiled from: SequenceBuilder.kt */
public abstract class C15120j<T> {
    /* renamed from: b */
    public abstract Object mo74423b(T t, C13635d<? super C13339u> dVar);

    /* renamed from: c */
    public abstract Object mo74424c(Iterator<? extends T> it, C13635d<? super C13339u> dVar);

    /* renamed from: e */
    public final Object mo74429e(C15118h<? extends T> hVar, C13635d<? super C13339u> dVar) {
        Object c = mo74424c(hVar.iterator(), dVar);
        return c == C13652d.m87832c() ? c : C13339u.f61331a;
    }
}
