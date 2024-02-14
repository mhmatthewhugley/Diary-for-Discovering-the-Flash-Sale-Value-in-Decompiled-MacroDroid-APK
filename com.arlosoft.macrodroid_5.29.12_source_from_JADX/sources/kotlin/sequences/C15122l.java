package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f*\f\b\u0002\u0010\u000e\"\u00020\r2\u00020\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo71668d2 = {"T", "Lkotlin/Function2;", "Lkotlin/sequences/j;", "Lkotlin/coroutines/d;", "Lja/u;", "", "block", "Lkotlin/sequences/h;", "b", "(Lqa/p;)Lkotlin/sequences/h;", "", "a", "(Lqa/p;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/sequences/SequencesKt")
/* renamed from: kotlin.sequences.l */
/* compiled from: SequenceBuilder.kt */
class C15122l {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo71668d2 = {"kotlin/sequences/l$a", "Lkotlin/sequences/h;", "", "iterator", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.l$a */
    /* compiled from: Sequences.kt */
    public static final class C15123a implements C15118h<T> {

        /* renamed from: a */
        final /* synthetic */ C16269p f64321a;

        public C15123a(C16269p pVar) {
            this.f64321a = pVar;
        }

        public Iterator<T> iterator() {
            return C15122l.m93466a(this.f64321a);
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m93466a(C16269p<? super C15120j<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(pVar, "block");
        C15119i iVar = new C15119i();
        iVar.mo74426i(C13649c.m87830a(pVar, iVar, iVar));
        return iVar;
    }

    /* renamed from: b */
    public static <T> C15118h<T> m93467b(C16269p<? super C15120j<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(pVar, "block");
        return new C15123a(pVar);
    }
}
