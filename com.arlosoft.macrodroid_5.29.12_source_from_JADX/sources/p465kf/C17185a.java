package p465kf;

import java.util.concurrent.atomic.AtomicReference;
import p459ef.C17163i;

/* renamed from: kf.a */
/* compiled from: SequentialSubscription */
public final class C17185a extends AtomicReference<C17163i> implements C17163i {
    private static final long serialVersionUID = 995205034283130269L;

    /* renamed from: a */
    public boolean mo80463a(C17163i iVar) {
        C17163i iVar2;
        do {
            iVar2 = (C17163i) get();
            if (iVar2 == C17186b.INSTANCE) {
                if (iVar == null) {
                    return false;
                }
                iVar.mo80450d();
                return false;
            }
        } while (!compareAndSet(iVar2, iVar));
        if (iVar2 == null) {
            return true;
        }
        iVar2.mo80450d();
        return true;
    }

    /* renamed from: b */
    public boolean mo80449b() {
        return get() == C17186b.INSTANCE;
    }

    /* renamed from: d */
    public void mo80450d() {
        C17163i iVar;
        C17163i iVar2 = (C17163i) get();
        C17186b bVar = C17186b.INSTANCE;
        if (iVar2 != bVar && (iVar = (C17163i) getAndSet(bVar)) != null && iVar != bVar) {
            iVar.mo80450d();
        }
    }
}
