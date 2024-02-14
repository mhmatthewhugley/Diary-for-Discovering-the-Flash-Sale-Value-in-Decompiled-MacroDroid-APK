package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0003R\u001a\u0010\t\u001a\u00020\u00038\u0010X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038PX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, mo71668d2 = {"Lkotlinx/coroutines/y1;", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/z;", "", "G0", "c", "Z", "W", "()Z", "handlesException", "X", "onCancelComplete", "Lkotlinx/coroutines/w1;", "parent", "<init>", "(Lkotlinx/coroutines/w1;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.y1 */
/* compiled from: JobSupport.kt */
public class C15571y1 extends C15252d2 implements C15573z {

    /* renamed from: c */
    private final boolean f64814c = m94749G0();

    public C15571y1(C15561w1 w1Var) {
        super(true);
        mo74610d0(w1Var);
    }

    /* renamed from: G0 */
    private final boolean m94749G0() {
        C15252d2 E;
        C15545t Z = mo74607Z();
        C15551u uVar = Z instanceof C15551u ? (C15551u) Z : null;
        C15252d2 E2 = uVar == null ? null : uVar.mo74519E();
        if (E2 == null) {
            return false;
        }
        while (!E2.mo74605W()) {
            C15545t Z2 = E2.mo74607Z();
            C15551u uVar2 = Z2 instanceof C15551u ? (C15551u) Z2 : null;
            if (uVar2 == null) {
                E = null;
                continue;
            } else {
                E = uVar2.mo74519E();
                continue;
            }
            if (E2 == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W */
    public boolean mo74605W() {
        return this.f64814c;
    }

    /* renamed from: X */
    public boolean mo74606X() {
        return true;
    }
}
