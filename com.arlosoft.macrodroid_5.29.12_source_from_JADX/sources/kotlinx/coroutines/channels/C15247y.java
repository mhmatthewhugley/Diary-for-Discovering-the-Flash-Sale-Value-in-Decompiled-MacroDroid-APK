package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15498o0;
import kotlinx.coroutines.C15501p;
import kotlinx.coroutines.internal.C15429a0;
import kotlinx.coroutines.internal.C15455o;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0011\u001a\u00028\u0000\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0011\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0001\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo71668d2 = {"Lkotlinx/coroutines/channels/y;", "E", "Lkotlinx/coroutines/channels/w;", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/a0;", "G", "Lja/u;", "D", "Lkotlinx/coroutines/channels/m;", "closed", "F", "", "toString", "f", "Ljava/lang/Object;", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/n;", "g", "Lkotlinx/coroutines/n;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/n;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.y */
/* compiled from: AbstractChannel.kt */
public class C15247y<E> extends C15244w {

    /* renamed from: f */
    private final E f64456f;

    /* renamed from: g */
    public final C15492n<C13339u> f64457g;

    public C15247y(E e, C15492n<? super C13339u> nVar) {
        this.f64456f = e;
        this.f64457g = nVar;
    }

    /* renamed from: D */
    public void mo74565D() {
        this.f64457g.mo74841B(C15501p.f64720a);
    }

    /* renamed from: E */
    public E mo74566E() {
        return this.f64456f;
    }

    /* renamed from: F */
    public void mo74567F(C15232m<?> mVar) {
        C15492n<C13339u> nVar = this.f64457g;
        C13329n.C13330a aVar = C13329n.f61327a;
        nVar.resumeWith(C13329n.m85676a(C13332o.m85684a(mVar.mo74587L())));
    }

    /* renamed from: G */
    public C15429a0 mo74568G(C15455o.C15457b bVar) {
        if (this.f64457g.mo74842a(C13339u.f61331a, (Object) null) == null) {
            return null;
        }
        return C15501p.f64720a;
    }

    public String toString() {
        return C15498o0.m94571a(this) + '@' + C15498o0.m94572b(this) + '(' + mo74566E() + ')';
    }
}
