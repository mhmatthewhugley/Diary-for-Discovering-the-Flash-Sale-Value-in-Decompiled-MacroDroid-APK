package kotlinx.coroutines.channels;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15214c;
import kotlinx.coroutines.internal.C15429a0;
import kotlinx.coroutines.internal.C15466u;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, mo71668d2 = {"Lkotlinx/coroutines/channels/o;", "E", "Lkotlinx/coroutines/channels/a;", "element", "", "u", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/j;", "Lkotlinx/coroutines/channels/w;", "list", "Lkotlinx/coroutines/channels/m;", "closed", "Lja/u;", "J", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/m;)V", "", "F", "()Z", "isBufferAlwaysEmpty", "G", "isBufferEmpty", "r", "isBufferAlwaysFull", "s", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.o */
/* compiled from: LinkedListChannel.kt */
public class C15234o<E> extends C15205a<E> {
    public C15234o(C16265l<? super E, C13339u> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo74526F() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final boolean mo74527G() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo74530J(Object obj, C15232m<?> mVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                C15244w wVar = (C15244w) obj;
                if (wVar instanceof C15214c.C15215a) {
                    C16265l<E, C13339u> lVar = this.f64429a;
                    if (lVar != null) {
                        undeliveredElementException = C15466u.m94476c(lVar, ((C15214c.C15215a) wVar).f64431f, (UndeliveredElementException) null);
                    }
                } else {
                    wVar.mo74567F(mVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    UndeliveredElementException undeliveredElementException2 = null;
                    while (true) {
                        int i = size - 1;
                        C15244w wVar2 = (C15244w) arrayList.get(size);
                        if (wVar2 instanceof C15214c.C15215a) {
                            C16265l<E, C13339u> lVar2 = this.f64429a;
                            undeliveredElementException2 = lVar2 == null ? null : C15466u.m94476c(lVar2, ((C15214c.C15215a) wVar2).f64431f, undeliveredElementException2);
                        } else {
                            wVar2.mo74567F(mVar);
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                    undeliveredElementException = undeliveredElementException2;
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo74558r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo74559s() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Object mo74561u(E e) {
        C15242u<?> w;
        do {
            Object u = super.mo74561u(e);
            C15429a0 a0Var = C15213b.f64423b;
            if (u == a0Var) {
                return a0Var;
            }
            if (u == C15213b.f64424c) {
                w = mo74563w(e);
                if (w == null) {
                    return a0Var;
                }
            } else if (u instanceof C15232m) {
                return u;
            } else {
                throw new IllegalStateException(C13706o.m87936m("Invalid offerInternal result ", u).toString());
            }
        } while (!(w instanceof C15232m));
        return w;
    }
}
