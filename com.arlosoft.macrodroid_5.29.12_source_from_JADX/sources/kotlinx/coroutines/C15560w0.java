package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.internal.C15443g;
import kotlinx.coroutines.internal.C15471y;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, mo71668d2 = {"Lkotlinx/coroutines/w0;", "T", "Lkotlinx/coroutines/internal/y;", "", "N0", "()Z", "M0", "", "state", "Lja/u;", "F", "(Ljava/lang/Object;)V", "G0", "L0", "()Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.w0 */
/* compiled from: Builders.common.kt */
public final class C15560w0<T> extends C15471y<T> {

    /* renamed from: f */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f64807f = AtomicIntegerFieldUpdater.newUpdater(C15560w0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C15560w0(C13640g gVar, C13635d<? super T> dVar) {
        super(gVar, dVar);
    }

    /* renamed from: M0 */
    private final boolean m94710M0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f64807f.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: N0 */
    private final boolean m94711N0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f64807f.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo74600F(Object obj) {
        mo74482G0(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public void mo74482G0(Object obj) {
        if (!m94710M0()) {
            C15443g.m94381c(C13649c.m87831b(this.f64696d), C15260e0.m94019a(obj, this.f64696d), (C16265l) null, 2, (Object) null);
        }
    }

    /* renamed from: L0 */
    public final Object mo74925L0() {
        if (m94711N0()) {
            return C13652d.m87832c();
        }
        Object h = C15262e2.m94031h(mo74608a0());
        if (!(h instanceof C15196b0)) {
            return h;
        }
        throw ((C15196b0) h).f64404a;
    }
}
