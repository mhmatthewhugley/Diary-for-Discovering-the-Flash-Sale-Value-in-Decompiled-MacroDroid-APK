package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001\" \u0010\t\u001a\u00020\u00008\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006\" \u0010\f\u001a\u00020\u00008\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0005\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006*\n\u0010\r\"\u00020\u00002\u00020\u0000*\u001c\u0010\u000f\u001a\u0004\b\u0000\u0010\u000e\"\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0000*\f\b\u0002\u0010\u0010\"\u00020\u00012\u00020\u0001*\n\u0010\u0012\"\u00020\u00112\u00020\u0011*\u001c\u0010\u0013\u001a\u0004\b\u0000\u0010\u000e\"\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0000¨\u0006\u0014"}, mo71668d2 = {"", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/internal/Node;", "b", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "getCONDITION_FALSE$annotations", "()V", "CONDITION_FALSE", "getLIST_EMPTY", "getLIST_EMPTY$annotations", "LIST_EMPTY", "AbstractAtomicDesc", "T", "AddLastDesc", "Node", "Lkotlinx/coroutines/internal/o$b;", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.n */
/* compiled from: LockFreeLinkedList.kt */
public final class C15454n {

    /* renamed from: a */
    private static final Object f64672a = new C15429a0("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f64673b = new C15429a0("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m94421a() {
        return f64672a;
    }

    /* renamed from: b */
    public static final C15455o m94422b(Object obj) {
        C15455o oVar = null;
        C15469w wVar = obj instanceof C15469w ? (C15469w) obj : null;
        if (wVar != null) {
            oVar = wVar.f64695a;
        }
        return oVar == null ? (C15455o) obj : oVar;
    }
}
