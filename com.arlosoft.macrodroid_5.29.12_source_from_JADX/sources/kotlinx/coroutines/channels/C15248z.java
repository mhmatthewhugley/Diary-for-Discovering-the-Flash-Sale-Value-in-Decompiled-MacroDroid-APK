package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.internal.C15466u;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, mo71668d2 = {"Lkotlinx/coroutines/channels/z;", "E", "Lkotlinx/coroutines/channels/y;", "", "y", "Lja/u;", "H", "pollResult", "Lkotlinx/coroutines/n;", "cont", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/n;Lqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.z */
/* compiled from: AbstractChannel.kt */
public final class C15248z<E> extends C15247y<E> {

    /* renamed from: o */
    public final C16265l<E, C13339u> f64458o;

    public C15248z(E e, C15492n<? super C13339u> nVar, C16265l<? super E, C13339u> lVar) {
        super(e, nVar);
        this.f64458o = lVar;
    }

    /* renamed from: H */
    public void mo74593H() {
        C15466u.m94475b(this.f64458o, mo74566E(), this.f64457g.getContext());
    }

    /* renamed from: y */
    public boolean mo74594y() {
        if (!super.mo74594y()) {
            return false;
        }
        mo74593H();
        return true;
    }
}
