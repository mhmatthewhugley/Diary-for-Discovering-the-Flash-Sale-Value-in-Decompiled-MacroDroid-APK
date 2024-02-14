package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15474j0;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, mo71668d2 = {"E", "Lkotlin/Function1;", "Lja/u;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "c", "(Lqa/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "Lkotlin/coroutines/g;", "context", "b", "(Lqa/l;Ljava/lang/Object;Lkotlin/coroutines/g;)V", "", "a", "(Lqa/l;Ljava/lang/Object;Lkotlin/coroutines/g;)Lqa/l;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.u */
/* compiled from: OnUndeliveredElement.kt */
public final class C15466u {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"E", "", "<anonymous parameter 0>", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.u$a */
    /* compiled from: OnUndeliveredElement.kt */
    static final class C15467a extends C13708q implements C16265l<Throwable, C13339u> {
        final /* synthetic */ C13640g $context;
        final /* synthetic */ E $element;
        final /* synthetic */ C16265l<E, C13339u> $this_bindCancellationFun;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15467a(C16265l<? super E, C13339u> lVar, E e, C13640g gVar) {
            super(1);
            this.$this_bindCancellationFun = lVar;
            this.$element = e;
            this.$context = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            C15466u.m94475b(this.$this_bindCancellationFun, this.$element, this.$context);
        }
    }

    /* renamed from: a */
    public static final <E> C16265l<Throwable, C13339u> m94474a(C16265l<? super E, C13339u> lVar, E e, C13640g gVar) {
        return new C15467a(lVar, e, gVar);
    }

    /* renamed from: b */
    public static final <E> void m94475b(C16265l<? super E, C13339u> lVar, E e, C13640g gVar) {
        UndeliveredElementException c = m94476c(lVar, e, (UndeliveredElementException) null);
        if (c != null) {
            C15474j0.m94494a(gVar, c);
        }
    }

    /* renamed from: c */
    public static final <E> UndeliveredElementException m94476c(C16265l<? super E, C13339u> lVar, E e, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(C13706o.m87936m("Exception in undelivered element handler for ", e), th);
            }
            C13315b.m85661a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    /* renamed from: d */
    public static /* synthetic */ UndeliveredElementException m94477d(C16265l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return m94476c(lVar, obj, undeliveredElementException);
    }
}
